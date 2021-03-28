package com.online.taxi.common.entity;

import java.util.Date;

public class City {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_city.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_city.city_name
     *
     * @mbggenerated
     */
    private String cityName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_city.city_code
     *
     * @mbggenerated
     */
    private String cityCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_city.city_longitude_latitude
     *
     * @mbggenerated
     */
    private String cityLongitudeLatitude;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_city.order_risk_top
     *
     * @mbggenerated
     */
    private Integer orderRiskTop;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_city.city_status
     *
     * @mbggenerated
     */
    private Integer cityStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_city.operator_id
     *
     * @mbggenerated
     */
    private Integer operatorId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_city.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_city.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_city.id
     *
     * @return the value of tbl_city.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_city.id
     *
     * @param id the value for tbl_city.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_city.city_name
     *
     * @return the value of tbl_city.city_name
     *
     * @mbggenerated
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_city.city_name
     *
     * @param cityName the value for tbl_city.city_name
     *
     * @mbggenerated
     */
    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_city.city_code
     *
     * @return the value of tbl_city.city_code
     *
     * @mbggenerated
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_city.city_code
     *
     * @param cityCode the value for tbl_city.city_code
     *
     * @mbggenerated
     */
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_city.city_longitude_latitude
     *
     * @return the value of tbl_city.city_longitude_latitude
     *
     * @mbggenerated
     */
    public String getCityLongitudeLatitude() {
        return cityLongitudeLatitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_city.city_longitude_latitude
     *
     * @param cityLongitudeLatitude the value for tbl_city.city_longitude_latitude
     *
     * @mbggenerated
     */
    public void setCityLongitudeLatitude(String cityLongitudeLatitude) {
        this.cityLongitudeLatitude = cityLongitudeLatitude == null ? null : cityLongitudeLatitude.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_city.order_risk_top
     *
     * @return the value of tbl_city.order_risk_top
     *
     * @mbggenerated
     */
    public Integer getOrderRiskTop() {
        return orderRiskTop;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_city.order_risk_top
     *
     * @param orderRiskTop the value for tbl_city.order_risk_top
     *
     * @mbggenerated
     */
    public void setOrderRiskTop(Integer orderRiskTop) {
        this.orderRiskTop = orderRiskTop;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_city.city_status
     *
     * @return the value of tbl_city.city_status
     *
     * @mbggenerated
     */
    public Integer getCityStatus() {
        return cityStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_city.city_status
     *
     * @param cityStatus the value for tbl_city.city_status
     *
     * @mbggenerated
     */
    public void setCityStatus(Integer cityStatus) {
        this.cityStatus = cityStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_city.operator_id
     *
     * @return the value of tbl_city.operator_id
     *
     * @mbggenerated
     */
    public Integer getOperatorId() {
        return operatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_city.operator_id
     *
     * @param operatorId the value for tbl_city.operator_id
     *
     * @mbggenerated
     */
    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_city.create_time
     *
     * @return the value of tbl_city.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_city.create_time
     *
     * @param createTime the value for tbl_city.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_city.update_time
     *
     * @return the value of tbl_city.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_city.update_time
     *
     * @param updateTime the value for tbl_city.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}