package com.zhaohong.dao_bean;

import java.util.Date;

public class PopCloseHandleDetail {
    private Long id;

    private Long baseId;

    private Integer riskType;

    private Integer riskScene;

    private Integer riskFeature;

    private Date caseStartTime;

    private String goodFeature;

    private Date createdTime;

    private Date modifiedTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBaseId() {
        return baseId;
    }

    public void setBaseId(Long baseId) {
        this.baseId = baseId;
    }

    public Integer getRiskType() {
        return riskType;
    }

    public void setRiskType(Integer riskType) {
        this.riskType = riskType;
    }

    public Integer getRiskScene() {
        return riskScene;
    }

    public void setRiskScene(Integer riskScene) {
        this.riskScene = riskScene;
    }

    public Integer getRiskFeature() {
        return riskFeature;
    }

    public void setRiskFeature(Integer riskFeature) {
        this.riskFeature = riskFeature;
    }

    public Date getCaseStartTime() {
        return caseStartTime;
    }

    public void setCaseStartTime(Date caseStartTime) {
        this.caseStartTime = caseStartTime;
    }

    public String getGoodFeature() {
        return goodFeature;
    }

    public void setGoodFeature(String goodFeature) {
        this.goodFeature = goodFeature == null ? null : goodFeature.trim();
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