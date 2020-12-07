package com.online.taxi.order.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.online.taxi.common.entity.OrderLock;
import com.online.taxi.order.dao.OrderLockMapper;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Service
@Data
public class MysqlLock implements Lock {

	@Autowired
	private OrderLockMapper mapper;
	
	private ThreadLocal<OrderLock> orderLockThreadLocal ;

	@Override
	public void lock() {
		// 1、尝试加锁
		if(tryLock()) {
			return;
		}
		// 2.休眠
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// 3.递归再次调用
		lock();
	}
	
	/**
	 * 	非阻塞式加锁，成功，就成功，失败就失败。直接返回
	 */
	@Override
	public boolean tryLock() {
		try {
			mapper.insertSelective(orderLockThreadLocal.get());
			System.out.println("加锁对象："+orderLockThreadLocal.get());
			return true;
		}catch (Exception e) {
			return false;
		}
		
		
	}
	
	@Override
	public void unlock() {
		mapper.deleteByPrimaryKey(orderLockThreadLocal.get().getOrderId());
		System.out.println("解锁对象："+orderLockThreadLocal.get());
		orderLockThreadLocal.remove();
	}

	@Override
	public void lockInterruptibly() throws InterruptedException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public Condition newCondition() {
		// TODO Auto-generated method stub
		return null;
	}

}
