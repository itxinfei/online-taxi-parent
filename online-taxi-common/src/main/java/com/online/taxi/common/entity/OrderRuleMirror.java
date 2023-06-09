package com.online.taxi.common.entity;

import java.util.Date;

public class OrderRuleMirror {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_order_rule_mirror.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_order_rule_mirror.order_id
     *
     * @mbggenerated
     */
    private Integer orderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_order_rule_mirror.rule_id
     *
     * @mbggenerated
     */
    private Integer ruleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_order_rule_mirror.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_order_rule_mirror.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_order_rule_mirror.rule
     *
     * @mbggenerated
     */
    private String rule;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_order_rule_mirror.id
     *
     * @return the value of tbl_order_rule_mirror.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_order_rule_mirror.id
     *
     * @param id the value for tbl_order_rule_mirror.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_order_rule_mirror.order_id
     *
     * @return the value of tbl_order_rule_mirror.order_id
     *
     * @mbggenerated
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_order_rule_mirror.order_id
     *
     * @param orderId the value for tbl_order_rule_mirror.order_id
     *
     * @mbggenerated
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_order_rule_mirror.rule_id
     *
     * @return the value of tbl_order_rule_mirror.rule_id
     *
     * @mbggenerated
     */
    public Integer getRuleId() {
        return ruleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_order_rule_mirror.rule_id
     *
     * @param ruleId the value for tbl_order_rule_mirror.rule_id
     *
     * @mbggenerated
     */
    public void setRuleId(Integer ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_order_rule_mirror.create_time
     *
     * @return the value of tbl_order_rule_mirror.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_order_rule_mirror.create_time
     *
     * @param createTime the value for tbl_order_rule_mirror.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_order_rule_mirror.update_time
     *
     * @return the value of tbl_order_rule_mirror.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_order_rule_mirror.update_time
     *
     * @param updateTime the value for tbl_order_rule_mirror.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_order_rule_mirror.rule
     *
     * @return the value of tbl_order_rule_mirror.rule
     *
     * @mbggenerated
     */
    public String getRule() {
        return rule;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_order_rule_mirror.rule
     *
     * @param rule the value for tbl_order_rule_mirror.rule
     *
     * @mbggenerated
     */
    public void setRule(String rule) {
        this.rule = rule == null ? null : rule.trim();
    }
}