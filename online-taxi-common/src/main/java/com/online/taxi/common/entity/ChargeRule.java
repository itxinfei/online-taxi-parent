package com.online.taxi.common.entity;

import java.math.BigDecimal;
import java.util.Date;

public class ChargeRule {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_charge_rule.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_charge_rule.city_code
     *
     * @mbggenerated
     */
    private String cityCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_charge_rule.service_type_id
     *
     * @mbggenerated
     */
    private Integer serviceTypeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_charge_rule.channel_id
     *
     * @mbggenerated
     */
    private Integer channelId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_charge_rule.car_level_id
     *
     * @mbggenerated
     */
    private Integer carLevelId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_charge_rule.lowest_price
     *
     * @mbggenerated
     */
    private BigDecimal lowestPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_charge_rule.base_price
     *
     * @mbggenerated
     */
    private BigDecimal basePrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_charge_rule.base_kilo
     *
     * @mbggenerated
     */
    private Double baseKilo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_charge_rule.base_minutes
     *
     * @mbggenerated
     */
    private Double baseMinutes;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_charge_rule.per_kilo_price
     *
     * @mbggenerated
     */
    private BigDecimal perKiloPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_charge_rule.per_minute_price
     *
     * @mbggenerated
     */
    private BigDecimal perMinutePrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_charge_rule.beyond_start_kilo
     *
     * @mbggenerated
     */
    private Double beyondStartKilo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_charge_rule.beyond_per_kilo_price
     *
     * @mbggenerated
     */
    private BigDecimal beyondPerKiloPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_charge_rule.night_start
     *
     * @mbggenerated
     */
    private Date nightStart;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_charge_rule.night_end
     *
     * @mbggenerated
     */
    private Date nightEnd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_charge_rule.night_per_kilo_price
     *
     * @mbggenerated
     */
    private BigDecimal nightPerKiloPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_charge_rule.night_per_minute_price
     *
     * @mbggenerated
     */
    private BigDecimal nightPerMinutePrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_charge_rule.effective_time
     *
     * @mbggenerated
     */
    private Date effectiveTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_charge_rule.active_status
     *
     * @mbggenerated
     */
    private Integer activeStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_charge_rule.is_unuse
     *
     * @mbggenerated
     */
    private Integer isUnuse;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_charge_rule.creator_id
     *
     * @mbggenerated
     */
    private Integer creatorId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_charge_rule.operator_id
     *
     * @mbggenerated
     */
    private Integer operatorId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_charge_rule.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_charge_rule.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_charge_rule.id
     *
     * @return the value of tbl_charge_rule.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_charge_rule.id
     *
     * @param id the value for tbl_charge_rule.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_charge_rule.city_code
     *
     * @return the value of tbl_charge_rule.city_code
     *
     * @mbggenerated
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_charge_rule.city_code
     *
     * @param cityCode the value for tbl_charge_rule.city_code
     *
     * @mbggenerated
     */
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_charge_rule.service_type_id
     *
     * @return the value of tbl_charge_rule.service_type_id
     *
     * @mbggenerated
     */
    public Integer getServiceTypeId() {
        return serviceTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_charge_rule.service_type_id
     *
     * @param serviceTypeId the value for tbl_charge_rule.service_type_id
     *
     * @mbggenerated
     */
    public void setServiceTypeId(Integer serviceTypeId) {
        this.serviceTypeId = serviceTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_charge_rule.channel_id
     *
     * @return the value of tbl_charge_rule.channel_id
     *
     * @mbggenerated
     */
    public Integer getChannelId() {
        return channelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_charge_rule.channel_id
     *
     * @param channelId the value for tbl_charge_rule.channel_id
     *
     * @mbggenerated
     */
    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_charge_rule.car_level_id
     *
     * @return the value of tbl_charge_rule.car_level_id
     *
     * @mbggenerated
     */
    public Integer getCarLevelId() {
        return carLevelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_charge_rule.car_level_id
     *
     * @param carLevelId the value for tbl_charge_rule.car_level_id
     *
     * @mbggenerated
     */
    public void setCarLevelId(Integer carLevelId) {
        this.carLevelId = carLevelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_charge_rule.lowest_price
     *
     * @return the value of tbl_charge_rule.lowest_price
     *
     * @mbggenerated
     */
    public BigDecimal getLowestPrice() {
        return lowestPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_charge_rule.lowest_price
     *
     * @param lowestPrice the value for tbl_charge_rule.lowest_price
     *
     * @mbggenerated
     */
    public void setLowestPrice(BigDecimal lowestPrice) {
        this.lowestPrice = lowestPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_charge_rule.base_price
     *
     * @return the value of tbl_charge_rule.base_price
     *
     * @mbggenerated
     */
    public BigDecimal getBasePrice() {
        return basePrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_charge_rule.base_price
     *
     * @param basePrice the value for tbl_charge_rule.base_price
     *
     * @mbggenerated
     */
    public void setBasePrice(BigDecimal basePrice) {
        this.basePrice = basePrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_charge_rule.base_kilo
     *
     * @return the value of tbl_charge_rule.base_kilo
     *
     * @mbggenerated
     */
    public Double getBaseKilo() {
        return baseKilo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_charge_rule.base_kilo
     *
     * @param baseKilo the value for tbl_charge_rule.base_kilo
     *
     * @mbggenerated
     */
    public void setBaseKilo(Double baseKilo) {
        this.baseKilo = baseKilo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_charge_rule.base_minutes
     *
     * @return the value of tbl_charge_rule.base_minutes
     *
     * @mbggenerated
     */
    public Double getBaseMinutes() {
        return baseMinutes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_charge_rule.base_minutes
     *
     * @param baseMinutes the value for tbl_charge_rule.base_minutes
     *
     * @mbggenerated
     */
    public void setBaseMinutes(Double baseMinutes) {
        this.baseMinutes = baseMinutes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_charge_rule.per_kilo_price
     *
     * @return the value of tbl_charge_rule.per_kilo_price
     *
     * @mbggenerated
     */
    public BigDecimal getPerKiloPrice() {
        return perKiloPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_charge_rule.per_kilo_price
     *
     * @param perKiloPrice the value for tbl_charge_rule.per_kilo_price
     *
     * @mbggenerated
     */
    public void setPerKiloPrice(BigDecimal perKiloPrice) {
        this.perKiloPrice = perKiloPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_charge_rule.per_minute_price
     *
     * @return the value of tbl_charge_rule.per_minute_price
     *
     * @mbggenerated
     */
    public BigDecimal getPerMinutePrice() {
        return perMinutePrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_charge_rule.per_minute_price
     *
     * @param perMinutePrice the value for tbl_charge_rule.per_minute_price
     *
     * @mbggenerated
     */
    public void setPerMinutePrice(BigDecimal perMinutePrice) {
        this.perMinutePrice = perMinutePrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_charge_rule.beyond_start_kilo
     *
     * @return the value of tbl_charge_rule.beyond_start_kilo
     *
     * @mbggenerated
     */
    public Double getBeyondStartKilo() {
        return beyondStartKilo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_charge_rule.beyond_start_kilo
     *
     * @param beyondStartKilo the value for tbl_charge_rule.beyond_start_kilo
     *
     * @mbggenerated
     */
    public void setBeyondStartKilo(Double beyondStartKilo) {
        this.beyondStartKilo = beyondStartKilo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_charge_rule.beyond_per_kilo_price
     *
     * @return the value of tbl_charge_rule.beyond_per_kilo_price
     *
     * @mbggenerated
     */
    public BigDecimal getBeyondPerKiloPrice() {
        return beyondPerKiloPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_charge_rule.beyond_per_kilo_price
     *
     * @param beyondPerKiloPrice the value for tbl_charge_rule.beyond_per_kilo_price
     *
     * @mbggenerated
     */
    public void setBeyondPerKiloPrice(BigDecimal beyondPerKiloPrice) {
        this.beyondPerKiloPrice = beyondPerKiloPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_charge_rule.night_start
     *
     * @return the value of tbl_charge_rule.night_start
     *
     * @mbggenerated
     */
    public Date getNightStart() {
        return nightStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_charge_rule.night_start
     *
     * @param nightStart the value for tbl_charge_rule.night_start
     *
     * @mbggenerated
     */
    public void setNightStart(Date nightStart) {
        this.nightStart = nightStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_charge_rule.night_end
     *
     * @return the value of tbl_charge_rule.night_end
     *
     * @mbggenerated
     */
    public Date getNightEnd() {
        return nightEnd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_charge_rule.night_end
     *
     * @param nightEnd the value for tbl_charge_rule.night_end
     *
     * @mbggenerated
     */
    public void setNightEnd(Date nightEnd) {
        this.nightEnd = nightEnd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_charge_rule.night_per_kilo_price
     *
     * @return the value of tbl_charge_rule.night_per_kilo_price
     *
     * @mbggenerated
     */
    public BigDecimal getNightPerKiloPrice() {
        return nightPerKiloPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_charge_rule.night_per_kilo_price
     *
     * @param nightPerKiloPrice the value for tbl_charge_rule.night_per_kilo_price
     *
     * @mbggenerated
     */
    public void setNightPerKiloPrice(BigDecimal nightPerKiloPrice) {
        this.nightPerKiloPrice = nightPerKiloPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_charge_rule.night_per_minute_price
     *
     * @return the value of tbl_charge_rule.night_per_minute_price
     *
     * @mbggenerated
     */
    public BigDecimal getNightPerMinutePrice() {
        return nightPerMinutePrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_charge_rule.night_per_minute_price
     *
     * @param nightPerMinutePrice the value for tbl_charge_rule.night_per_minute_price
     *
     * @mbggenerated
     */
    public void setNightPerMinutePrice(BigDecimal nightPerMinutePrice) {
        this.nightPerMinutePrice = nightPerMinutePrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_charge_rule.effective_time
     *
     * @return the value of tbl_charge_rule.effective_time
     *
     * @mbggenerated
     */
    public Date getEffectiveTime() {
        return effectiveTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_charge_rule.effective_time
     *
     * @param effectiveTime the value for tbl_charge_rule.effective_time
     *
     * @mbggenerated
     */
    public void setEffectiveTime(Date effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_charge_rule.active_status
     *
     * @return the value of tbl_charge_rule.active_status
     *
     * @mbggenerated
     */
    public Integer getActiveStatus() {
        return activeStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_charge_rule.active_status
     *
     * @param activeStatus the value for tbl_charge_rule.active_status
     *
     * @mbggenerated
     */
    public void setActiveStatus(Integer activeStatus) {
        this.activeStatus = activeStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_charge_rule.is_unuse
     *
     * @return the value of tbl_charge_rule.is_unuse
     *
     * @mbggenerated
     */
    public Integer getIsUnuse() {
        return isUnuse;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_charge_rule.is_unuse
     *
     * @param isUnuse the value for tbl_charge_rule.is_unuse
     *
     * @mbggenerated
     */
    public void setIsUnuse(Integer isUnuse) {
        this.isUnuse = isUnuse;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_charge_rule.creator_id
     *
     * @return the value of tbl_charge_rule.creator_id
     *
     * @mbggenerated
     */
    public Integer getCreatorId() {
        return creatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_charge_rule.creator_id
     *
     * @param creatorId the value for tbl_charge_rule.creator_id
     *
     * @mbggenerated
     */
    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_charge_rule.operator_id
     *
     * @return the value of tbl_charge_rule.operator_id
     *
     * @mbggenerated
     */
    public Integer getOperatorId() {
        return operatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_charge_rule.operator_id
     *
     * @param operatorId the value for tbl_charge_rule.operator_id
     *
     * @mbggenerated
     */
    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_charge_rule.create_time
     *
     * @return the value of tbl_charge_rule.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_charge_rule.create_time
     *
     * @param createTime the value for tbl_charge_rule.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_charge_rule.update_time
     *
     * @return the value of tbl_charge_rule.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_charge_rule.update_time
     *
     * @param updateTime the value for tbl_charge_rule.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}