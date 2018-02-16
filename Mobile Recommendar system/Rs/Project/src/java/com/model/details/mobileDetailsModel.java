package com.model.details;

import java.util.Date;
public class mobileDetailsModel {
    private int id;
    private String photoid;
    public Date date;
    private String Description;
    private String name;
    private Double price;
    private String brand;
    private int battery;
    private Double display;
    private Double ram;
    private String platform;
    

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the battery
     */
    public int getBattery() {
        return battery;
    }

    /**
     * @param battery the battery to set
     */
    public void setBattery(int battery) {
        this.battery = battery;
    }

    
    
    /**
     * @return the ram
     */
    public Double getRam() {
        return ram;
    }

    /**
     * @param ram the ram to set
     */
    public void setRam(Double ram) {
        this.ram = ram;
    }

    /**
     * @return the platform
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * @param platform the platform to set
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * @return the photoid
     */
    public String getPhotoid() {
        return photoid;
    }

    /**
     * @param photoid the photoid to set
     */
    public void setPhotoid(String photoid) {
        this.photoid = photoid;
    }

    /**
     * @return the Description
     */
    public String getDescription() {
        return Description;
    }

    /**
     * @param Description the Description to set
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the display
     */
    public Double getDisplay() {
        return display;
    }

    /**
     * @param display the display to set
     */
    public void setDisplay(Double display) {
        this.display = display;
    }
}
