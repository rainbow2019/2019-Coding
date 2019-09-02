package com.zhaohong.dao_bean;

import java.util.Date;

public class PopBaseInfo {
    private Long id;

    private String merchantNo;

    private Integer problemType;

    private String creater;

    private String createrDepartment;

    private Integer createWay;

    private String createReason;

    private String triggerRule;

    private String handler;

    private String handlerDepartment;

    private Integer handleStatus;

    private String handleReason;

    private Date handleTime;

    private Integer handleResult;

    private String orderNos;

    private Date createdTime;

    private Date modifiedTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo == null ? null : merchantNo.trim();
    }

    public Integer getProblemType() {
        return problemType;
    }

    public void setProblemType(Integer problemType) {
        this.problemType = problemType;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    public String getCreaterDepartment() {
        return createrDepartment;
    }

    public void setCreaterDepartment(String createrDepartment) {
        this.createrDepartment = createrDepartment == null ? null : createrDepartment.trim();
    }

    public Integer getCreateWay() {
        return createWay;
    }

    public void setCreateWay(Integer createWay) {
        this.createWay = createWay;
    }

    public String getCreateReason() {
        return createReason;
    }

    public void setCreateReason(String createReason) {
        this.createReason = createReason == null ? null : createReason.trim();
    }

    public String getTriggerRule() {
        return triggerRule;
    }

    public void setTriggerRule(String triggerRule) {
        this.triggerRule = triggerRule == null ? null : triggerRule.trim();
    }

    public String getHandler() {
        return handler;
    }

    public void setHandler(String handler) {
        this.handler = handler == null ? null : handler.trim();
    }

    public String getHandlerDepartment() {
        return handlerDepartment;
    }

    public void setHandlerDepartment(String handlerDepartment) {
        this.handlerDepartment = handlerDepartment == null ? null : handlerDepartment.trim();
    }

    public Integer getHandleStatus() {
        return handleStatus;
    }

    public void setHandleStatus(Integer handleStatus) {
        this.handleStatus = handleStatus;
    }

    public String getHandleReason() {
        return handleReason;
    }

    public void setHandleReason(String handleReason) {
        this.handleReason = handleReason == null ? null : handleReason.trim();
    }

    public Date getHandleTime() {
        return handleTime;
    }

    public void setHandleTime(Date handleTime) {
        this.handleTime = handleTime;
    }

    public Integer getHandleResult() {
        return handleResult;
    }

    public void setHandleResult(Integer handleResult) {
        this.handleResult = handleResult;
    }

    public String getOrderNos() {
        return orderNos;
    }

    public void setOrderNos(String orderNos) {
        this.orderNos = orderNos == null ? null : orderNos.trim();
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }
}