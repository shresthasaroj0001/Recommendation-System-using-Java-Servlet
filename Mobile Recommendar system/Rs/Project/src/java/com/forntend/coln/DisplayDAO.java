/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.forntend.coln;

import com.connectionFIles.ConnectionString_db;
import com.model.details.mobileDetailsModel;
import com.value.vector.dayscalculator;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Saroj
 */
public class DisplayDAO {

    public ArrayList<mobileDetailsModel> GetALLMobileDetails() {
        ArrayList<mobileDetailsModel> Lis = new ArrayList<mobileDetailsModel>();
        try {
            Connection con = ConnectionString_db.connectme();
            String sql = "select * from mobile_details";//
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                mobileDetailsModel mobb = new mobileDetailsModel();
                mobb.setId(rs.getInt(1));
                mobb.setName(rs.getString(2));
                mobb.setBattery(rs.getInt(3));
                mobb.setBrand(rs.getString(4));
                mobb.setDisplay(rs.getDouble(5));
                mobb.setPlatform(rs.getString(6));
                mobb.setPrice(rs.getDouble(7));
                mobb.setRam(rs.getDouble(8));
                mobb.setPhotoid(rs.getString(9));
                mobb.setDescription(rs.getString(10));
                mobb.setDate(rs.getDate(11));
                Lis.add(mobb);
            }
            con.close();
            rs.close();
            return Lis;
        } catch (Exception e) {
            System.out.println("query error" + e);
        }
        return Lis;
    }

    public ArrayList<mobileDetailsModel> NewArrival() {
        DisplayDAO d = new DisplayDAO();
        dayscalculator dayscalc = new dayscalculator();
        ArrayList<mobileDetailsModel> GetALLMobileDetails = d.GetALLMobileDetails();
        ArrayList<NewModel> Testing = new ArrayList<NewModel>();

        for (mobileDetailsModel m : GetALLMobileDetails) {
            NewModel n = new NewModel();
            n.setId(m.getId());
            n.setDay(dayscalc.dayscalc(m.getDate()));
            Testing.add(n);
        }

        Collections.sort(Testing, new Comparator<NewModel>() {
            @Override
            public int compare(NewModel o1, NewModel o2) {
                return Integer.valueOf(o1.day).compareTo(o2.day);
            }
        });

        int counter = 0;
        ArrayList<mobileDetailsModel> NewArrivalssss = new ArrayList<mobileDetailsModel>();

        for (NewModel n : Testing) {
            int id = n.getId();
            if (counter != 10) {
                for (mobileDetailsModel m : GetALLMobileDetails) {
                    if (id == m.getId()) {
                        mobileDetailsModel newSorted = new mobileDetailsModel();
                        newSorted.setId(m.getId());
                        newSorted.setBattery(m.getBattery());
                        newSorted.setBrand(m.getBrand());
                        newSorted.setDate(m.getDate());
                        newSorted.setDescription(m.getDescription());
                        newSorted.setDisplay(m.getDisplay());
                        newSorted.setRam(m.getPrice());
                        newSorted.setPrice(m.getPrice());
                        newSorted.setPlatform(m.getPlatform());
                        newSorted.setPhotoid(m.getPhotoid());
                        newSorted.setName(m.getName());
                        NewArrivalssss.add(newSorted);
                        break;
                    } //if  

                }
                counter++;

            }
        }//while loop

        return NewArrivalssss;
    }
    
    public class NewModel {

        private int id;
        private int day;

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
         * @return the day
         */
        public int getDay() {
            return day;
        }

        /**
         * @param day the day to set
         */
        public void setDay(int day) {
            this.day = day;
        }
    }
}
