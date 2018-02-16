/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller.userLogin;

import java.util.Date;

/**
 *
 * @author Saroj
 */
public class User_Model {
 private int id;
 private String staff_id;
 private String staff_pwd;
 private String table_name;
 private String staff_first_name;
 private String staff_last_name;
 private String staff_middle_name;
 private Date Registered_date;
 
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
     * @return the staff_id
     */
    public String getStaff_id() {
        return staff_id;
    }

    /**
     * @param staff_id the staff_id to set
     */
    public void setStaff_id(String staff_id) {
        this.staff_id = staff_id;
    }

    /**
     * @return the staff_pwd
     */
    public String getStaff_pwd() {
        return staff_pwd;
    }

    /**
     * @param staff_pwd the staff_pwd to set
     */
    public void setStaff_pwd(String staff_pwd) {
        this.staff_pwd = staff_pwd;
    }

    /**
     * @return the staff_first_name
     */
    public String getStaff_first_name() {
        return staff_first_name;
    }

    /**
     * @param staff_first_name the staff_first_name to set
     */
    public void setStaff_first_name(String staff_first_name) {
        this.staff_first_name = staff_first_name;
    }

    /**
     * @return the staff_last_name
     */
    public String getStaff_last_name() {
        return staff_last_name;
    }

    /**
     * @param staff_last_name the staff_last_name to set
     */
    public void setStaff_last_name(String staff_last_name) {
        this.staff_last_name = staff_last_name;
    }

    /**
     * @return the staff_middle_name
     */
    public String getStaff_middle_name() {
        return staff_middle_name;
    }

    /**
     * @param staff_middle_name the staff_middle_name to set
     */
    public void setStaff_middle_name(String staff_middle_name) {
        this.staff_middle_name = staff_middle_name;
    }

    /**
     * @return the Registered_date
     */
    public Date getRegistered_date() {
        return Registered_date;
    }

    /**
     * @param Registered_date the Registered_date to set
     */
    public void setRegistered_date(Date Registered_date) {
        this.Registered_date = Registered_date;
    }

    /**
     * @return the table_name
     */
    public String getTable_name() {
        return table_name;
    }

    /**
     * @param table_name the table_name to set
     */
    public void setTable_name(String table_name) {
        this.table_name = table_name;
    }

 
}
