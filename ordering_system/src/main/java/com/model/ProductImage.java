package com.model;

public class ProductImage {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_image.prod_no
     *
     * @mbggenerated
     */
    private String prodNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_image.image
     *
     * @mbggenerated
     */
    private String image;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_image.prod_no
     *
     * @return the value of product_image.prod_no
     *
     * @mbggenerated
     */
    public String getProdNo() {
        return prodNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_image.prod_no
     *
     * @param prodNo the value for product_image.prod_no
     *
     * @mbggenerated
     */
    public void setProdNo(String prodNo) {
        this.prodNo = prodNo == null ? null : prodNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_image.image
     *
     * @return the value of product_image.image
     *
     * @mbggenerated
     */
    public String getImage() {
        return image;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_image.image
     *
     * @param image the value for product_image.image
     *
     * @mbggenerated
     */
    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }
}