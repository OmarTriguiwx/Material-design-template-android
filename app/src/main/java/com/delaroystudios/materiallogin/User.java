package com.delaroystudios.materiallogin;

/**
 * Created by omar on 12/12/16.
 */

public class User {
    //variable

    public  String name;
    public  String adress;
    public  String email;
    public  String mobile;
    public  String password;
    //constructeur vide
    public User() {
    }
    //constructeur
    public User( String name, String adress, String email, String mobile, String password) {

        this.name = name;
        this.adress = adress;
        this.email = email;
        this.mobile = mobile;
        this.password = password;
    }
    //getter & setter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }
    //setter
    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
