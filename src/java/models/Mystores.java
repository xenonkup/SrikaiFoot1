/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author xenonkup
 */
public class Mystores {

    String fname;
    String lname;
    String shirt;
    String trousers;
    String hat;
    String price;
    String address;

    public Mystores() {
    }

    public Mystores(String fname, String lname, String shirt,String trousers,String hat,String price,String address) {
        this.fname = fname;
        this.lname = lname;
        this.shirt= shirt;
        this.trousers = trousers;
        this.hat = hat;
        this.price = price;
        this.address = address;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getShirt() {
        return shirt;
    }

    public void setShirt(String shirt) {
        this.shirt = shirt;
    }

    public String getTrousers() {
        return trousers;
    }

    public void setTrousers(String trousers) {
        this.trousers = trousers;
    }

    public String getHat() {
        return hat;
    }

    public void setHat(String hat) {
        this.hat = hat;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
