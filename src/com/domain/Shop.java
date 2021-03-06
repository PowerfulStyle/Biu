package com.domain;
// default package

import java.util.HashSet;
import java.util.Set;


/**
 * Shop entity. @author MyEclipse Persistence Tools
 */

public class Shop  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Secondaddress secondaddress;
     private Firstaddress firstaddress;
     private String username;
     private String password;
     private String name;
     private String imgsrc;
     private String thirdaddress;
     private String detail;
     private String phone;
     private Set orders = new HashSet(0);
     private Set menus = new HashSet(0);


    // Constructors

    /** default constructor */
    public Shop() {
    }

	/** minimal constructor */
    public Shop(Secondaddress secondaddress, Firstaddress firstaddress, String username, String password, String name, String thirdaddress, String phone) {
        this.secondaddress = secondaddress;
        this.firstaddress = firstaddress;
        this.username = username;
        this.password = password;
        this.name = name;
        this.thirdaddress = thirdaddress;
        this.phone = phone;
    }
    
    /** full constructor */
    public Shop(Secondaddress secondaddress, Firstaddress firstaddress, String username, String password, String name, String imgsrc, String thirdaddress, String detail, String phone, Set orders, Set menus) {
        this.secondaddress = secondaddress;
        this.firstaddress = firstaddress;
        this.username = username;
        this.password = password;
        this.name = name;
        this.imgsrc = imgsrc;
        this.thirdaddress = thirdaddress;
        this.detail = detail;
        this.phone = phone;
        this.orders = orders;
        this.menus = menus;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Secondaddress getSecondaddress() {
        return this.secondaddress;
    }
    
    public void setSecondaddress(Secondaddress secondaddress) {
        this.secondaddress = secondaddress;
    }

    public Firstaddress getFirstaddress() {
        return this.firstaddress;
    }
    
    public void setFirstaddress(Firstaddress firstaddress) {
        this.firstaddress = firstaddress;
    }

    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getImgsrc() {
        return this.imgsrc;
    }
    
    public void setImgsrc(String imgsrc) {
        this.imgsrc = imgsrc;
    }

    public String getThirdaddress() {
        return this.thirdaddress;
    }
    
    public void setThirdaddress(String thirdaddress) {
        this.thirdaddress = thirdaddress;
    }

    public String getDetail() {
        return this.detail;
    }
    
    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Set getOrders() {
        return this.orders;
    }
    
    public void setOrders(Set orders) {
        this.orders = orders;
    }

    public Set getMenus() {
        return this.menus;
    }
    
    public void setMenus(Set menus) {
        this.menus = menus;
    }
   








}