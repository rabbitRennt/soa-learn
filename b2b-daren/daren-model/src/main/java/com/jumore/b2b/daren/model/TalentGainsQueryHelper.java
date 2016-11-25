package com.jumore.b2b.daren.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TalentGainsQueryHelper {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TalentGainsQueryHelper() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("ORDER_NO is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("ORDER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(Long value) {
            addCriterion("ORDER_NO =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(Long value) {
            addCriterion("ORDER_NO <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(Long value) {
            addCriterion("ORDER_NO >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(Long value) {
            addCriterion("ORDER_NO >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(Long value) {
            addCriterion("ORDER_NO <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(Long value) {
            addCriterion("ORDER_NO <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<Long> values) {
            addCriterion("ORDER_NO in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<Long> values) {
            addCriterion("ORDER_NO not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(Long value1, Long value2) {
            addCriterion("ORDER_NO between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(Long value1, Long value2) {
            addCriterion("ORDER_NO not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("GOODS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("GOODS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(Long value) {
            addCriterion("GOODS_NAME =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(Long value) {
            addCriterion("GOODS_NAME <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(Long value) {
            addCriterion("GOODS_NAME >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(Long value) {
            addCriterion("GOODS_NAME >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(Long value) {
            addCriterion("GOODS_NAME <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(Long value) {
            addCriterion("GOODS_NAME <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<Long> values) {
            addCriterion("GOODS_NAME in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<Long> values) {
            addCriterion("GOODS_NAME not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(Long value1, Long value2) {
            addCriterion("GOODS_NAME between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(Long value1, Long value2) {
            addCriterion("GOODS_NAME not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andReferralCodeIsNull() {
            addCriterion("REFERRAL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andReferralCodeIsNotNull() {
            addCriterion("REFERRAL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andReferralCodeEqualTo(String value) {
            addCriterion("REFERRAL_CODE =", value, "referralCode");
            return (Criteria) this;
        }

        public Criteria andReferralCodeNotEqualTo(String value) {
            addCriterion("REFERRAL_CODE <>", value, "referralCode");
            return (Criteria) this;
        }

        public Criteria andReferralCodeGreaterThan(String value) {
            addCriterion("REFERRAL_CODE >", value, "referralCode");
            return (Criteria) this;
        }

        public Criteria andReferralCodeGreaterThanOrEqualTo(String value) {
            addCriterion("REFERRAL_CODE >=", value, "referralCode");
            return (Criteria) this;
        }

        public Criteria andReferralCodeLessThan(String value) {
            addCriterion("REFERRAL_CODE <", value, "referralCode");
            return (Criteria) this;
        }

        public Criteria andReferralCodeLessThanOrEqualTo(String value) {
            addCriterion("REFERRAL_CODE <=", value, "referralCode");
            return (Criteria) this;
        }

        public Criteria andReferralCodeLike(String value) {
            addCriterion("REFERRAL_CODE like", value, "referralCode");
            return (Criteria) this;
        }

        public Criteria andReferralCodeNotLike(String value) {
            addCriterion("REFERRAL_CODE not like", value, "referralCode");
            return (Criteria) this;
        }

        public Criteria andReferralCodeIn(List<String> values) {
            addCriterion("REFERRAL_CODE in", values, "referralCode");
            return (Criteria) this;
        }

        public Criteria andReferralCodeNotIn(List<String> values) {
            addCriterion("REFERRAL_CODE not in", values, "referralCode");
            return (Criteria) this;
        }

        public Criteria andReferralCodeBetween(String value1, String value2) {
            addCriterion("REFERRAL_CODE between", value1, value2, "referralCode");
            return (Criteria) this;
        }

        public Criteria andReferralCodeNotBetween(String value1, String value2) {
            addCriterion("REFERRAL_CODE not between", value1, value2, "referralCode");
            return (Criteria) this;
        }

        public Criteria andTalentUserIdIsNull() {
            addCriterion("TALENT_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andTalentUserIdIsNotNull() {
            addCriterion("TALENT_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTalentUserIdEqualTo(Long value) {
            addCriterion("TALENT_USER_ID =", value, "talentUserId");
            return (Criteria) this;
        }

        public Criteria andTalentUserIdNotEqualTo(Long value) {
            addCriterion("TALENT_USER_ID <>", value, "talentUserId");
            return (Criteria) this;
        }

        public Criteria andTalentUserIdGreaterThan(Long value) {
            addCriterion("TALENT_USER_ID >", value, "talentUserId");
            return (Criteria) this;
        }

        public Criteria andTalentUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("TALENT_USER_ID >=", value, "talentUserId");
            return (Criteria) this;
        }

        public Criteria andTalentUserIdLessThan(Long value) {
            addCriterion("TALENT_USER_ID <", value, "talentUserId");
            return (Criteria) this;
        }

        public Criteria andTalentUserIdLessThanOrEqualTo(Long value) {
            addCriterion("TALENT_USER_ID <=", value, "talentUserId");
            return (Criteria) this;
        }

        public Criteria andTalentUserIdIn(List<Long> values) {
            addCriterion("TALENT_USER_ID in", values, "talentUserId");
            return (Criteria) this;
        }

        public Criteria andTalentUserIdNotIn(List<Long> values) {
            addCriterion("TALENT_USER_ID not in", values, "talentUserId");
            return (Criteria) this;
        }

        public Criteria andTalentUserIdBetween(Long value1, Long value2) {
            addCriterion("TALENT_USER_ID between", value1, value2, "talentUserId");
            return (Criteria) this;
        }

        public Criteria andTalentUserIdNotBetween(Long value1, Long value2) {
            addCriterion("TALENT_USER_ID not between", value1, value2, "talentUserId");
            return (Criteria) this;
        }

        public Criteria andBuyerNameIsNull() {
            addCriterion("BUYER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBuyerNameIsNotNull() {
            addCriterion("BUYER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerNameEqualTo(String value) {
            addCriterion("BUYER_NAME =", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameNotEqualTo(String value) {
            addCriterion("BUYER_NAME <>", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameGreaterThan(String value) {
            addCriterion("BUYER_NAME >", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameGreaterThanOrEqualTo(String value) {
            addCriterion("BUYER_NAME >=", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameLessThan(String value) {
            addCriterion("BUYER_NAME <", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameLessThanOrEqualTo(String value) {
            addCriterion("BUYER_NAME <=", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameLike(String value) {
            addCriterion("BUYER_NAME like", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameNotLike(String value) {
            addCriterion("BUYER_NAME not like", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameIn(List<String> values) {
            addCriterion("BUYER_NAME in", values, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameNotIn(List<String> values) {
            addCriterion("BUYER_NAME not in", values, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameBetween(String value1, String value2) {
            addCriterion("BUYER_NAME between", value1, value2, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameNotBetween(String value1, String value2) {
            addCriterion("BUYER_NAME not between", value1, value2, "buyerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameIsNull() {
            addCriterion("SELLER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSellerNameIsNotNull() {
            addCriterion("SELLER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSellerNameEqualTo(String value) {
            addCriterion("SELLER_NAME =", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotEqualTo(String value) {
            addCriterion("SELLER_NAME <>", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameGreaterThan(String value) {
            addCriterion("SELLER_NAME >", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameGreaterThanOrEqualTo(String value) {
            addCriterion("SELLER_NAME >=", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameLessThan(String value) {
            addCriterion("SELLER_NAME <", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameLessThanOrEqualTo(String value) {
            addCriterion("SELLER_NAME <=", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameLike(String value) {
            addCriterion("SELLER_NAME like", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotLike(String value) {
            addCriterion("SELLER_NAME not like", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameIn(List<String> values) {
            addCriterion("SELLER_NAME in", values, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotIn(List<String> values) {
            addCriterion("SELLER_NAME not in", values, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameBetween(String value1, String value2) {
            addCriterion("SELLER_NAME between", value1, value2, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotBetween(String value1, String value2) {
            addCriterion("SELLER_NAME not between", value1, value2, "sellerName");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNull() {
            addCriterion("ORDER_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNotNull() {
            addCriterion("ORDER_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeEqualTo(Date value) {
            addCriterion("ORDER_TIME =", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotEqualTo(Date value) {
            addCriterion("ORDER_TIME <>", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThan(Date value) {
            addCriterion("ORDER_TIME >", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ORDER_TIME >=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThan(Date value) {
            addCriterion("ORDER_TIME <", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThanOrEqualTo(Date value) {
            addCriterion("ORDER_TIME <=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIn(List<Date> values) {
            addCriterion("ORDER_TIME in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotIn(List<Date> values) {
            addCriterion("ORDER_TIME not in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeBetween(Date value1, Date value2) {
            addCriterion("ORDER_TIME between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotBetween(Date value1, Date value2) {
            addCriterion("ORDER_TIME not between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderUnitIsNull() {
            addCriterion("ORDER_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andOrderUnitIsNotNull() {
            addCriterion("ORDER_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andOrderUnitEqualTo(Integer value) {
            addCriterion("ORDER_UNIT =", value, "orderUnit");
            return (Criteria) this;
        }

        public Criteria andOrderUnitNotEqualTo(Integer value) {
            addCriterion("ORDER_UNIT <>", value, "orderUnit");
            return (Criteria) this;
        }

        public Criteria andOrderUnitGreaterThan(Integer value) {
            addCriterion("ORDER_UNIT >", value, "orderUnit");
            return (Criteria) this;
        }

        public Criteria andOrderUnitGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORDER_UNIT >=", value, "orderUnit");
            return (Criteria) this;
        }

        public Criteria andOrderUnitLessThan(Integer value) {
            addCriterion("ORDER_UNIT <", value, "orderUnit");
            return (Criteria) this;
        }

        public Criteria andOrderUnitLessThanOrEqualTo(Integer value) {
            addCriterion("ORDER_UNIT <=", value, "orderUnit");
            return (Criteria) this;
        }

        public Criteria andOrderUnitIn(List<Integer> values) {
            addCriterion("ORDER_UNIT in", values, "orderUnit");
            return (Criteria) this;
        }

        public Criteria andOrderUnitNotIn(List<Integer> values) {
            addCriterion("ORDER_UNIT not in", values, "orderUnit");
            return (Criteria) this;
        }

        public Criteria andOrderUnitBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_UNIT between", value1, value2, "orderUnit");
            return (Criteria) this;
        }

        public Criteria andOrderUnitNotBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_UNIT not between", value1, value2, "orderUnit");
            return (Criteria) this;
        }

        public Criteria andScaleTotalIsNull() {
            addCriterion("SCALE_TOTAL is null");
            return (Criteria) this;
        }

        public Criteria andScaleTotalIsNotNull() {
            addCriterion("SCALE_TOTAL is not null");
            return (Criteria) this;
        }

        public Criteria andScaleTotalEqualTo(Integer value) {
            addCriterion("SCALE_TOTAL =", value, "scaleTotal");
            return (Criteria) this;
        }

        public Criteria andScaleTotalNotEqualTo(Integer value) {
            addCriterion("SCALE_TOTAL <>", value, "scaleTotal");
            return (Criteria) this;
        }

        public Criteria andScaleTotalGreaterThan(Integer value) {
            addCriterion("SCALE_TOTAL >", value, "scaleTotal");
            return (Criteria) this;
        }

        public Criteria andScaleTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("SCALE_TOTAL >=", value, "scaleTotal");
            return (Criteria) this;
        }

        public Criteria andScaleTotalLessThan(Integer value) {
            addCriterion("SCALE_TOTAL <", value, "scaleTotal");
            return (Criteria) this;
        }

        public Criteria andScaleTotalLessThanOrEqualTo(Integer value) {
            addCriterion("SCALE_TOTAL <=", value, "scaleTotal");
            return (Criteria) this;
        }

        public Criteria andScaleTotalIn(List<Integer> values) {
            addCriterion("SCALE_TOTAL in", values, "scaleTotal");
            return (Criteria) this;
        }

        public Criteria andScaleTotalNotIn(List<Integer> values) {
            addCriterion("SCALE_TOTAL not in", values, "scaleTotal");
            return (Criteria) this;
        }

        public Criteria andScaleTotalBetween(Integer value1, Integer value2) {
            addCriterion("SCALE_TOTAL between", value1, value2, "scaleTotal");
            return (Criteria) this;
        }

        public Criteria andScaleTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("SCALE_TOTAL not between", value1, value2, "scaleTotal");
            return (Criteria) this;
        }

        public Criteria andScaleBalanceIsNull() {
            addCriterion("SCALE_BALANCE is null");
            return (Criteria) this;
        }

        public Criteria andScaleBalanceIsNotNull() {
            addCriterion("SCALE_BALANCE is not null");
            return (Criteria) this;
        }

        public Criteria andScaleBalanceEqualTo(Long value) {
            addCriterion("SCALE_BALANCE =", value, "scaleBalance");
            return (Criteria) this;
        }

        public Criteria andScaleBalanceNotEqualTo(Long value) {
            addCriterion("SCALE_BALANCE <>", value, "scaleBalance");
            return (Criteria) this;
        }

        public Criteria andScaleBalanceGreaterThan(Long value) {
            addCriterion("SCALE_BALANCE >", value, "scaleBalance");
            return (Criteria) this;
        }

        public Criteria andScaleBalanceGreaterThanOrEqualTo(Long value) {
            addCriterion("SCALE_BALANCE >=", value, "scaleBalance");
            return (Criteria) this;
        }

        public Criteria andScaleBalanceLessThan(Long value) {
            addCriterion("SCALE_BALANCE <", value, "scaleBalance");
            return (Criteria) this;
        }

        public Criteria andScaleBalanceLessThanOrEqualTo(Long value) {
            addCriterion("SCALE_BALANCE <=", value, "scaleBalance");
            return (Criteria) this;
        }

        public Criteria andScaleBalanceIn(List<Long> values) {
            addCriterion("SCALE_BALANCE in", values, "scaleBalance");
            return (Criteria) this;
        }

        public Criteria andScaleBalanceNotIn(List<Long> values) {
            addCriterion("SCALE_BALANCE not in", values, "scaleBalance");
            return (Criteria) this;
        }

        public Criteria andScaleBalanceBetween(Long value1, Long value2) {
            addCriterion("SCALE_BALANCE between", value1, value2, "scaleBalance");
            return (Criteria) this;
        }

        public Criteria andScaleBalanceNotBetween(Long value1, Long value2) {
            addCriterion("SCALE_BALANCE not between", value1, value2, "scaleBalance");
            return (Criteria) this;
        }

        public Criteria andGainsBalanceIsNull() {
            addCriterion("GAINS_BALANCE is null");
            return (Criteria) this;
        }

        public Criteria andGainsBalanceIsNotNull() {
            addCriterion("GAINS_BALANCE is not null");
            return (Criteria) this;
        }

        public Criteria andGainsBalanceEqualTo(Long value) {
            addCriterion("GAINS_BALANCE =", value, "gainsBalance");
            return (Criteria) this;
        }

        public Criteria andGainsBalanceNotEqualTo(Long value) {
            addCriterion("GAINS_BALANCE <>", value, "gainsBalance");
            return (Criteria) this;
        }

        public Criteria andGainsBalanceGreaterThan(Long value) {
            addCriterion("GAINS_BALANCE >", value, "gainsBalance");
            return (Criteria) this;
        }

        public Criteria andGainsBalanceGreaterThanOrEqualTo(Long value) {
            addCriterion("GAINS_BALANCE >=", value, "gainsBalance");
            return (Criteria) this;
        }

        public Criteria andGainsBalanceLessThan(Long value) {
            addCriterion("GAINS_BALANCE <", value, "gainsBalance");
            return (Criteria) this;
        }

        public Criteria andGainsBalanceLessThanOrEqualTo(Long value) {
            addCriterion("GAINS_BALANCE <=", value, "gainsBalance");
            return (Criteria) this;
        }

        public Criteria andGainsBalanceIn(List<Long> values) {
            addCriterion("GAINS_BALANCE in", values, "gainsBalance");
            return (Criteria) this;
        }

        public Criteria andGainsBalanceNotIn(List<Long> values) {
            addCriterion("GAINS_BALANCE not in", values, "gainsBalance");
            return (Criteria) this;
        }

        public Criteria andGainsBalanceBetween(Long value1, Long value2) {
            addCriterion("GAINS_BALANCE between", value1, value2, "gainsBalance");
            return (Criteria) this;
        }

        public Criteria andGainsBalanceNotBetween(Long value1, Long value2) {
            addCriterion("GAINS_BALANCE not between", value1, value2, "gainsBalance");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andReferralCodeLikeInsensitive(String value) {
            addCriterion("upper(REFERRAL_CODE) like", value.toUpperCase(), "referralCode");
            return (Criteria) this;
        }

        public Criteria andBuyerNameLikeInsensitive(String value) {
            addCriterion("upper(BUYER_NAME) like", value.toUpperCase(), "buyerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameLikeInsensitive(String value) {
            addCriterion("upper(SELLER_NAME) like", value.toUpperCase(), "sellerName");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}