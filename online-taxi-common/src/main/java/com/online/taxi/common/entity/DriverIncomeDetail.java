package com.online.taxi.common.entity;

import java.math.BigDecimal;
import java.util.Date;

public class DriverIncomeDetail {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_driver_income_detail.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_driver_income_detail.driver_id
     *
     * @mbggenerated
     */
    private Integer driverId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_driver_income_detail.order_id
     *
     * @mbggenerated
     */
    private String orderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_driver_income_detail.order_total_money
     *
     * @mbggenerated
     */
    private BigDecimal orderTotalMoney;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_driver_income_detail.trade_time
     *
     * @mbggenerated
     */
    private Date tradeTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_driver_income_detail.money
     *
     * @mbggenerated
     */
    private BigDecimal money;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_driver_income_detail.driver_ratio
     *
     * @mbggenerated
     */
    private BigDecimal driverRatio;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_driver_income_detail.id
     *
     * @return the value of tbl_driver_income_detail.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_driver_income_detail.id
     *
     * @param id the value for tbl_driver_income_detail.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_driver_income_detail.driver_id
     *
     * @return the value of tbl_driver_income_detail.driver_id
     *
     * @mbggenerated
     */
    public Integer getDriverId() {
        return driverId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_driver_income_detail.driver_id
     *
     * @param driverId the value for tbl_driver_income_detail.driver_id
     *
     * @mbggenerated
     */
    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_driver_income_detail.order_id
     *
     * @return the value of tbl_driver_income_detail.order_id
     *
     * @mbggenerated
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_driver_income_detail.order_id
     *
     * @param orderId the value for tbl_driver_income_detail.order_id
     *
     * @mbggenerated
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_driver_income_detail.order_total_money
     *
     * @return the value of tbl_driver_income_detail.order_total_money
     *
     * @mbggenerated
     */
    public BigDecimal getOrderTotalMoney() {
        return orderTotalMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_driver_income_detail.order_total_money
     *
     * @param orderTotalMoney the value for tbl_driver_income_detail.order_total_money
     *
     * @mbggenerated
     */
    public void setOrderTotalMoney(BigDecimal orderTotalMoney) {
        this.orderTotalMoney = orderTotalMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_driver_income_detail.trade_time
     *
     * @return the value of tbl_driver_income_detail.trade_time
     *
     * @mbggenerated
     */
    public Date getTradeTime() {
        return tradeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_driver_income_detail.trade_time
     *
     * @param tradeTime the value for tbl_driver_income_detail.trade_time
     *
     * @mbggenerated
     */
    public void setTradeTime(Date tradeTime) {
        this.tradeTime = tradeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_driver_income_detail.money
     *
     * @return the value of tbl_driver_income_detail.money
     *
     * @mbggenerated
     */
    public BigDecimal getMoney() {
        return money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_driver_income_detail.money
     *
     * @param money the value for tbl_driver_income_detail.money
     *
     * @mbggenerated
     */
    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_driver_income_detail.driver_ratio
     *
     * @return the value of tbl_driver_income_detail.driver_ratio
     *
     * @mbggenerated
     */
    public BigDecimal getDriverRatio() {
        return driverRatio;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_driver_income_detail.driver_ratio
     *
     * @param driverRatio the value for tbl_driver_income_detail.driver_ratio
     *
     * @mbggenerated
     */
    public void setDriverRatio(BigDecimal driverRatio) {
        this.driverRatio = driverRatio;
    }
}
