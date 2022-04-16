package com.bezkoder.spring.login.payload.response;

import java.sql.Blob;

public class AddProductResponse {
    private int pro_id;
    private String pro_name;
    private String short_line;
    private String detail_des;
    private Blob img_1;
    private Blob img_2;
    private Blob img_3;
    private Blob img_4;
    private String size;
    private Double actual_price;
    private Double discount_price;
    private Double selling_price;
    private String item_stock;
    private String categ;
    
    public AddProductResponse(int pro_id,String pro_name,String short_line,String detail_des, Blob img_1,Blob img_2,Blob img_3,Blob img_4,String size,Double actual_price, Double discount_price,Double selling_price,String item_stock,String categ){
        this.pro_id=pro_id;
        this.pro_name=pro_name;
        this.short_line=short_line;
        this.detail_des=detail_des;
        this.img_1=img_1;
        this.img_2=img_2;
        this.img_3=img_3;
        this.img_4=img_4;
        this.size=size;
        this.actual_price=actual_price;
        this.discount_price=discount_price;
        this.selling_price=selling_price;
        this.item_stock=item_stock;
        this.categ=categ;
    }
    

    /**
     * @return int return the pro_id
     */
    public int getProid() {
        return pro_id;
    }

    /**
     * @param pro_id the pro_id to set
     */
    public void setProid(int pro_id) {
        this.pro_id = pro_id;
    }

    /**
     * @return String return the pro_name
     */
    public String getProname() {
        return pro_name;
    }

    /**
     * @param pro_name the pro_name to set
     */
    public void setProname(String pro_name) {
        this.pro_name = pro_name;
    }

    /**
     * @return String return the short_line
     */
    public String getShort_line() {
        return short_line;
    }

    /**
     * @param short_line the short_line to set
     */
    public void setShort_line(String short_line) {
        this.short_line = short_line;
    }

    /**
     * @return String return the detail_des
     */
    public String getDetail_des() {
        return detail_des;
    }

    /**
     * @param detail_des the detail_des to set
     */
    public void setDetail_des(String detail_des) {
        this.detail_des = detail_des;
    }

    /**
     * @return Blob return the img_1
     */
    public Blob getImg_1() {
        return img_1;
    }

    /**
     * @param img_1 the img_1 to set
     */
    public void setImg_1(Blob img_1) {
        this.img_1 = img_1;
    }

    /**
     * @return Blob return the img_2
     */
    public Blob getImg_2() {
        return img_2;
    }

    /**
     * @param img_2 the img_2 to set
     */
    public void setImg_2(Blob img_2) {
        this.img_2 = img_2;
    }

    /**
     * @return Blob return the img_3
     */
    public Blob getImg_3() {
        return img_3;
    }

    /**
     * @param img_3 the img_3 to set
     */
    public void setImg_3(Blob img_3) {
        this.img_3 = img_3;
    }

    /**
     * @return Blob return the img_4
     */
    public Blob getImg_4() {
        return img_4;
    }

    /**
     * @param img_4 the img_4 to set
     */
    public void setImg_4(Blob img_4) {
        this.img_4 = img_4;
    }

    /**
     * @return String return the size
     */
    public String getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * @return Double return the actual_price
     */
    public Double getActual() {
        return actual_price;
    }

    /**
     * @param actual_price the actual_price to set
     */
    public void setActual(Double actual_price) {
        this.actual_price = actual_price;
    }

    /**
     * @return Double return the discount_price
     */
    public Double getDiscount() {
        return discount_price;
    }

    /**
     * @param discount_price the discount_price to set
     */
    public void setDiscount(Double discount_price) {
        this.discount_price = discount_price;
    }

    /**
     * @return Double return the selling_price
     */
    public Double getSell() {
        return selling_price;
    }

    /**
     * @param selling_price the selling_price to set
     */
    public void setSell(Double selling_price) {
        this.selling_price = selling_price;
    }

    /**
     * @return String return the item_stock
     */
    public String getItem_stock() {
        return item_stock;
    }

    /**
     * @param item_stock the item_stock to set
     */
    public void setItem_stock(String item_stock) {
        this.item_stock = item_stock;
    }

    /**
     * @return String return the categ
     */
    public String getCateg() {
        return categ;
    }

    /**
     * @param categ the categ to set
     */
    public void setCateg(String categ) {
        this.categ = categ;
    }

}
