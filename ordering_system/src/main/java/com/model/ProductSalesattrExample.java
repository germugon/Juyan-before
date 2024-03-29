package com.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductSalesattrExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table product_salesattr
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table product_salesattr
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table product_salesattr
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_salesattr
     *
     * @mbggenerated
     */
    public ProductSalesattrExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_salesattr
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_salesattr
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_salesattr
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_salesattr
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_salesattr
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_salesattr
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_salesattr
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_salesattr
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_salesattr
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_salesattr
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table product_salesattr
     *
     * @mbggenerated
     */
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

        public Criteria andSkuIsNull() {
            addCriterion("sku is null");
            return (Criteria) this;
        }

        public Criteria andSkuIsNotNull() {
            addCriterion("sku is not null");
            return (Criteria) this;
        }

        public Criteria andSkuEqualTo(String value) {
            addCriterion("sku =", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuNotEqualTo(String value) {
            addCriterion("sku <>", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuGreaterThan(String value) {
            addCriterion("sku >", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuGreaterThanOrEqualTo(String value) {
            addCriterion("sku >=", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuLessThan(String value) {
            addCriterion("sku <", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuLessThanOrEqualTo(String value) {
            addCriterion("sku <=", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuLike(String value) {
            addCriterion("sku like", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuNotLike(String value) {
            addCriterion("sku not like", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuIn(List<String> values) {
            addCriterion("sku in", values, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuNotIn(List<String> values) {
            addCriterion("sku not in", values, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuBetween(String value1, String value2) {
            addCriterion("sku between", value1, value2, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuNotBetween(String value1, String value2) {
            addCriterion("sku not between", value1, value2, "sku");
            return (Criteria) this;
        }

        public Criteria andProdNoIsNull() {
            addCriterion("prod_no is null");
            return (Criteria) this;
        }

        public Criteria andProdNoIsNotNull() {
            addCriterion("prod_no is not null");
            return (Criteria) this;
        }

        public Criteria andProdNoEqualTo(String value) {
            addCriterion("prod_no =", value, "prodNo");
            return (Criteria) this;
        }

        public Criteria andProdNoNotEqualTo(String value) {
            addCriterion("prod_no <>", value, "prodNo");
            return (Criteria) this;
        }

        public Criteria andProdNoGreaterThan(String value) {
            addCriterion("prod_no >", value, "prodNo");
            return (Criteria) this;
        }

        public Criteria andProdNoGreaterThanOrEqualTo(String value) {
            addCriterion("prod_no >=", value, "prodNo");
            return (Criteria) this;
        }

        public Criteria andProdNoLessThan(String value) {
            addCriterion("prod_no <", value, "prodNo");
            return (Criteria) this;
        }

        public Criteria andProdNoLessThanOrEqualTo(String value) {
            addCriterion("prod_no <=", value, "prodNo");
            return (Criteria) this;
        }

        public Criteria andProdNoLike(String value) {
            addCriterion("prod_no like", value, "prodNo");
            return (Criteria) this;
        }

        public Criteria andProdNoNotLike(String value) {
            addCriterion("prod_no not like", value, "prodNo");
            return (Criteria) this;
        }

        public Criteria andProdNoIn(List<String> values) {
            addCriterion("prod_no in", values, "prodNo");
            return (Criteria) this;
        }

        public Criteria andProdNoNotIn(List<String> values) {
            addCriterion("prod_no not in", values, "prodNo");
            return (Criteria) this;
        }

        public Criteria andProdNoBetween(String value1, String value2) {
            addCriterion("prod_no between", value1, value2, "prodNo");
            return (Criteria) this;
        }

        public Criteria andProdNoNotBetween(String value1, String value2) {
            addCriterion("prod_no not between", value1, value2, "prodNo");
            return (Criteria) this;
        }

        public Criteria andAttrNameIsNull() {
            addCriterion("attr_name is null");
            return (Criteria) this;
        }

        public Criteria andAttrNameIsNotNull() {
            addCriterion("attr_name is not null");
            return (Criteria) this;
        }

        public Criteria andAttrNameEqualTo(String value) {
            addCriterion("attr_name =", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameNotEqualTo(String value) {
            addCriterion("attr_name <>", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameGreaterThan(String value) {
            addCriterion("attr_name >", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameGreaterThanOrEqualTo(String value) {
            addCriterion("attr_name >=", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameLessThan(String value) {
            addCriterion("attr_name <", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameLessThanOrEqualTo(String value) {
            addCriterion("attr_name <=", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameLike(String value) {
            addCriterion("attr_name like", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameNotLike(String value) {
            addCriterion("attr_name not like", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameIn(List<String> values) {
            addCriterion("attr_name in", values, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameNotIn(List<String> values) {
            addCriterion("attr_name not in", values, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameBetween(String value1, String value2) {
            addCriterion("attr_name between", value1, value2, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameNotBetween(String value1, String value2) {
            addCriterion("attr_name not between", value1, value2, "attrName");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andImageIsNull() {
            addCriterion("image is null");
            return (Criteria) this;
        }

        public Criteria andImageIsNotNull() {
            addCriterion("image is not null");
            return (Criteria) this;
        }

        public Criteria andImageEqualTo(String value) {
            addCriterion("image =", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotEqualTo(String value) {
            addCriterion("image <>", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThan(String value) {
            addCriterion("image >", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThanOrEqualTo(String value) {
            addCriterion("image >=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThan(String value) {
            addCriterion("image <", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThanOrEqualTo(String value) {
            addCriterion("image <=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLike(String value) {
            addCriterion("image like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotLike(String value) {
            addCriterion("image not like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageIn(List<String> values) {
            addCriterion("image in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotIn(List<String> values) {
            addCriterion("image not in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageBetween(String value1, String value2) {
            addCriterion("image between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotBetween(String value1, String value2) {
            addCriterion("image not between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andStockIsNull() {
            addCriterion("stock is null");
            return (Criteria) this;
        }

        public Criteria andStockIsNotNull() {
            addCriterion("stock is not null");
            return (Criteria) this;
        }

        public Criteria andStockEqualTo(Integer value) {
            addCriterion("stock =", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotEqualTo(Integer value) {
            addCriterion("stock <>", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThan(Integer value) {
            addCriterion("stock >", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("stock >=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThan(Integer value) {
            addCriterion("stock <", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThanOrEqualTo(Integer value) {
            addCriterion("stock <=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockIn(List<Integer> values) {
            addCriterion("stock in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotIn(List<Integer> values) {
            addCriterion("stock not in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockBetween(Integer value1, Integer value2) {
            addCriterion("stock between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotBetween(Integer value1, Integer value2) {
            addCriterion("stock not between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andStockWarnIsNull() {
            addCriterion("stock_warn is null");
            return (Criteria) this;
        }

        public Criteria andStockWarnIsNotNull() {
            addCriterion("stock_warn is not null");
            return (Criteria) this;
        }

        public Criteria andStockWarnEqualTo(Integer value) {
            addCriterion("stock_warn =", value, "stockWarn");
            return (Criteria) this;
        }

        public Criteria andStockWarnNotEqualTo(Integer value) {
            addCriterion("stock_warn <>", value, "stockWarn");
            return (Criteria) this;
        }

        public Criteria andStockWarnGreaterThan(Integer value) {
            addCriterion("stock_warn >", value, "stockWarn");
            return (Criteria) this;
        }

        public Criteria andStockWarnGreaterThanOrEqualTo(Integer value) {
            addCriterion("stock_warn >=", value, "stockWarn");
            return (Criteria) this;
        }

        public Criteria andStockWarnLessThan(Integer value) {
            addCriterion("stock_warn <", value, "stockWarn");
            return (Criteria) this;
        }

        public Criteria andStockWarnLessThanOrEqualTo(Integer value) {
            addCriterion("stock_warn <=", value, "stockWarn");
            return (Criteria) this;
        }

        public Criteria andStockWarnIn(List<Integer> values) {
            addCriterion("stock_warn in", values, "stockWarn");
            return (Criteria) this;
        }

        public Criteria andStockWarnNotIn(List<Integer> values) {
            addCriterion("stock_warn not in", values, "stockWarn");
            return (Criteria) this;
        }

        public Criteria andStockWarnBetween(Integer value1, Integer value2) {
            addCriterion("stock_warn between", value1, value2, "stockWarn");
            return (Criteria) this;
        }

        public Criteria andStockWarnNotBetween(Integer value1, Integer value2) {
            addCriterion("stock_warn not between", value1, value2, "stockWarn");
            return (Criteria) this;
        }

        public Criteria andIsInspectIsNull() {
            addCriterion("is_inspect is null");
            return (Criteria) this;
        }

        public Criteria andIsInspectIsNotNull() {
            addCriterion("is_inspect is not null");
            return (Criteria) this;
        }

        public Criteria andIsInspectEqualTo(String value) {
            addCriterion("is_inspect =", value, "isInspect");
            return (Criteria) this;
        }

        public Criteria andIsInspectNotEqualTo(String value) {
            addCriterion("is_inspect <>", value, "isInspect");
            return (Criteria) this;
        }

        public Criteria andIsInspectGreaterThan(String value) {
            addCriterion("is_inspect >", value, "isInspect");
            return (Criteria) this;
        }

        public Criteria andIsInspectGreaterThanOrEqualTo(String value) {
            addCriterion("is_inspect >=", value, "isInspect");
            return (Criteria) this;
        }

        public Criteria andIsInspectLessThan(String value) {
            addCriterion("is_inspect <", value, "isInspect");
            return (Criteria) this;
        }

        public Criteria andIsInspectLessThanOrEqualTo(String value) {
            addCriterion("is_inspect <=", value, "isInspect");
            return (Criteria) this;
        }

        public Criteria andIsInspectLike(String value) {
            addCriterion("is_inspect like", value, "isInspect");
            return (Criteria) this;
        }

        public Criteria andIsInspectNotLike(String value) {
            addCriterion("is_inspect not like", value, "isInspect");
            return (Criteria) this;
        }

        public Criteria andIsInspectIn(List<String> values) {
            addCriterion("is_inspect in", values, "isInspect");
            return (Criteria) this;
        }

        public Criteria andIsInspectNotIn(List<String> values) {
            addCriterion("is_inspect not in", values, "isInspect");
            return (Criteria) this;
        }

        public Criteria andIsInspectBetween(String value1, String value2) {
            addCriterion("is_inspect between", value1, value2, "isInspect");
            return (Criteria) this;
        }

        public Criteria andIsInspectNotBetween(String value1, String value2) {
            addCriterion("is_inspect not between", value1, value2, "isInspect");
            return (Criteria) this;
        }

        public Criteria andOnsaleTimeIsNull() {
            addCriterion("onsale_time is null");
            return (Criteria) this;
        }

        public Criteria andOnsaleTimeIsNotNull() {
            addCriterion("onsale_time is not null");
            return (Criteria) this;
        }

        public Criteria andOnsaleTimeEqualTo(Date value) {
            addCriterion("onsale_time =", value, "onsaleTime");
            return (Criteria) this;
        }

        public Criteria andOnsaleTimeNotEqualTo(Date value) {
            addCriterion("onsale_time <>", value, "onsaleTime");
            return (Criteria) this;
        }

        public Criteria andOnsaleTimeGreaterThan(Date value) {
            addCriterion("onsale_time >", value, "onsaleTime");
            return (Criteria) this;
        }

        public Criteria andOnsaleTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("onsale_time >=", value, "onsaleTime");
            return (Criteria) this;
        }

        public Criteria andOnsaleTimeLessThan(Date value) {
            addCriterion("onsale_time <", value, "onsaleTime");
            return (Criteria) this;
        }

        public Criteria andOnsaleTimeLessThanOrEqualTo(Date value) {
            addCriterion("onsale_time <=", value, "onsaleTime");
            return (Criteria) this;
        }

        public Criteria andOnsaleTimeIn(List<Date> values) {
            addCriterion("onsale_time in", values, "onsaleTime");
            return (Criteria) this;
        }

        public Criteria andOnsaleTimeNotIn(List<Date> values) {
            addCriterion("onsale_time not in", values, "onsaleTime");
            return (Criteria) this;
        }

        public Criteria andOnsaleTimeBetween(Date value1, Date value2) {
            addCriterion("onsale_time between", value1, value2, "onsaleTime");
            return (Criteria) this;
        }

        public Criteria andOnsaleTimeNotBetween(Date value1, Date value2) {
            addCriterion("onsale_time not between", value1, value2, "onsaleTime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table product_salesattr
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table product_salesattr
     *
     * @mbggenerated
     */
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