package com.model;

public class Brand {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column brand.brand_id
     *
     * @mbggenerated
     */
    private Integer brandId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column brand.brand_name
     *
     * @mbggenerated
     */
    private String brandName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column brand.brand_id
     *
     * @return the value of brand.brand_id
     *
     * @mbggenerated
     */
    public Integer getBrandId() {
        return brandId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column brand.brand_id
     *
     * @param brandId the value for brand.brand_id
     *
     * @mbggenerated
     */
    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column brand.brand_name
     *
     * @return the value of brand.brand_name
     *
     * @mbggenerated
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column brand.brand_name
     *
     * @param brandName the value for brand.brand_name
     *
     * @mbggenerated
     */
    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }
}