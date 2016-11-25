package com.jumore.b2b.daren.model;

import java.io.Serializable;
import java.util.Date;

public class TalentGains implements Serializable {
    private Long id;

    private Long orderNo;

    private Long goodsName;

    private String referralCode;

    private Long talentUserId;

    private String buyerName;

    private String sellerName;

    private Date orderTime;

    private Integer orderUnit;

    private Integer scaleTotal;

    private Long scaleBalance;

    private Long gainsBalance;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Long orderNo) {
        this.orderNo = orderNo;
    }

    public Long getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(Long goodsName) {
        this.goodsName = goodsName;
    }

    public String getReferralCode() {
        return referralCode;
    }

    public void setReferralCode(String referralCode) {
        this.referralCode = referralCode == null ? null : referralCode.trim();
    }

    public Long getTalentUserId() {
        return talentUserId;
    }

    public void setTalentUserId(Long talentUserId) {
        this.talentUserId = talentUserId;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName == null ? null : buyerName.trim();
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName == null ? null : sellerName.trim();
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Integer getOrderUnit() {
        return orderUnit;
    }

    public void setOrderUnit(Integer orderUnit) {
        this.orderUnit = orderUnit;
    }

    public Integer getScaleTotal() {
        return scaleTotal;
    }

    public void setScaleTotal(Integer scaleTotal) {
        this.scaleTotal = scaleTotal;
    }

    public Long getScaleBalance() {
        return scaleBalance;
    }

    public void setScaleBalance(Long scaleBalance) {
        this.scaleBalance = scaleBalance;
    }

    public Long getGainsBalance() {
        return gainsBalance;
    }

    public void setGainsBalance(Long gainsBalance) {
        this.gainsBalance = gainsBalance;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TalentGains other = (TalentGains) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrderNo() == null ? other.getOrderNo() == null : this.getOrderNo().equals(other.getOrderNo()))
            && (this.getGoodsName() == null ? other.getGoodsName() == null : this.getGoodsName().equals(other.getGoodsName()))
            && (this.getReferralCode() == null ? other.getReferralCode() == null : this.getReferralCode().equals(other.getReferralCode()))
            && (this.getTalentUserId() == null ? other.getTalentUserId() == null : this.getTalentUserId().equals(other.getTalentUserId()))
            && (this.getBuyerName() == null ? other.getBuyerName() == null : this.getBuyerName().equals(other.getBuyerName()))
            && (this.getSellerName() == null ? other.getSellerName() == null : this.getSellerName().equals(other.getSellerName()))
            && (this.getOrderTime() == null ? other.getOrderTime() == null : this.getOrderTime().equals(other.getOrderTime()))
            && (this.getOrderUnit() == null ? other.getOrderUnit() == null : this.getOrderUnit().equals(other.getOrderUnit()))
            && (this.getScaleTotal() == null ? other.getScaleTotal() == null : this.getScaleTotal().equals(other.getScaleTotal()))
            && (this.getScaleBalance() == null ? other.getScaleBalance() == null : this.getScaleBalance().equals(other.getScaleBalance()))
            && (this.getGainsBalance() == null ? other.getGainsBalance() == null : this.getGainsBalance().equals(other.getGainsBalance()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrderNo() == null) ? 0 : getOrderNo().hashCode());
        result = prime * result + ((getGoodsName() == null) ? 0 : getGoodsName().hashCode());
        result = prime * result + ((getReferralCode() == null) ? 0 : getReferralCode().hashCode());
        result = prime * result + ((getTalentUserId() == null) ? 0 : getTalentUserId().hashCode());
        result = prime * result + ((getBuyerName() == null) ? 0 : getBuyerName().hashCode());
        result = prime * result + ((getSellerName() == null) ? 0 : getSellerName().hashCode());
        result = prime * result + ((getOrderTime() == null) ? 0 : getOrderTime().hashCode());
        result = prime * result + ((getOrderUnit() == null) ? 0 : getOrderUnit().hashCode());
        result = prime * result + ((getScaleTotal() == null) ? 0 : getScaleTotal().hashCode());
        result = prime * result + ((getScaleBalance() == null) ? 0 : getScaleBalance().hashCode());
        result = prime * result + ((getGainsBalance() == null) ? 0 : getGainsBalance().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}