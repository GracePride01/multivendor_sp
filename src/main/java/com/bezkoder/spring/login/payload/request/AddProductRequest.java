package com.bezkoder.spring.login.payload.request;

import java.sql.Blob;
import java.util.Set;

import javax.validation.constraints.*;
public class AddProductRequest {
    @NotBlank
    @Size(min = 3, max = 20)
    private String pro_name;
 
    @NotBlank
    @Size(max = 50)
    private String short_line;
        
    @NotBlank
    @Size(max = 80)
    private String detail_des;

    @NotBlank
    private Blob img_1;

    @NotBlank
    private Blob img_2;

    @NotBlank
    private Blob img_3;

    @NotBlank
    private Blob img_4;

    @NotBlank
    @Size(max =50)
    private String size;

    @NotBlank
    private Double actual_price;

    @NotBlank
    private Double discount_price;

    @NotBlank
    private Double selling_price;

    @NotBlank
    @Size(max =50)
    private String item_stock;

    @NotBlank
    @Size(max =50)
    private  String categ;

    public String getProname(){
        return pro_name;
    }
    public void setProname(String pro_name){
        this.pro_name=pro_name;
    }

    public String getShort_line(){
        return short_line;
    }
    public void setShort_line(String short_line){
        this.short_line=short_line;
    }

    
    public String getDetail_des(){
        return detail_des;
    }
    public void setDetail_des(String detail_des){
        this.detail_des=detail_des;
    }

    
    public Blob getImg_1(){
        return img_1;
    }
    public void setImg_1(Blob img_1){
        this.img_1=img_1;
    }
    
    public Blob getImg_2(){
        return img_2;
    }
    public void setImg_2(Blob img_2){
        this.img_2=img_2;
    }

    public Blob getImg_3(){
        return img_3;
    }
    public void setImg_3(Blob img_3){
        this.img_3=img_3;
    }

    public Blob getImg_4(){
        return img_4;
    }
    public void setImg_4(Blob img_4){
        this.img_4=img_4;
    }

    public String getSize(){
        return size;
    }
    public void setSize(String size){
        this.size=size;
    }

    public Double getActual(){
        return actual_price;
    }
    public void setActual(Double actual_price){
        this.actual_price=actual_price;
    }

    public Double getDiscount(){
        return discount_price;
    }
    public void setDiscount(Double discount_price){
        this.discount_price=discount_price;
    }

    public Double getSell(){
        return selling_price;
    }
    public void setSell(Double selling_price){
        this.selling_price=selling_price;
    }
    
    public String getStock(){
        return item_stock;
    }
    public void setStock(String item_stock){
        this.item_stock=item_stock;
    }
    
    public String getCateg(){
        return categ;
    }
    public void setCateg(String categ){
        this.categ=categ;
    }
}
