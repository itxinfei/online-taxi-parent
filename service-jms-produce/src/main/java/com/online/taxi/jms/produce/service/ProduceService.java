package com.online.taxi.jms.produce.service;

import javax.jms.Destination;

/**
 * @author oi
 */
public interface ProduceService {

    /**
     * 向指定队列发送消息
     */
    public void send(Destination destination, String message);
}
