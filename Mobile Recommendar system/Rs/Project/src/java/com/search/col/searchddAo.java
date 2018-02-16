/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.search.col;

import com.connectionFIles.ConnectionString_db;
import com.model.details.mobileDetailsModel;
import com.model.details.vector_detailsModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Saroj
 */
public class searchddAo {
     public ArrayList<vector_detailsModel> getallvector_data(){
         try {
            Connection con = ConnectionString_db.connectme();
            String sql = "select * from vector_details";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
             ArrayList<vector_detailsModel> vectorlis = new ArrayList<vector_detailsModel>();
            while (rs.next()) {
               vector_detailsModel v = new vector_detailsModel();
             v.setId(rs.getInt(1));
             v.setBattery(rs.getInt(2));
             v.setBrand(rs.getInt(3));
             v.setDisplay(rs.getInt(4));
             v.setPlatform(rs.getInt(5));
             v.setPrice(rs.getInt(6));
             v.setRam(rs.getInt(7));
             vectorlis.add(v);
            }
            con.close();
            return vectorlis;
        } catch (Exception e) {
            System.out.println("query error" + e);
        }
        return null;
    }
//     public ArrayList<mobileDetailsModel> getallmobileDetailsData(int id){
     public mobileDetailsModel getallmobileDetailsData(int id){
         try {
            Connection con = ConnectionString_db.connectme();
            String sql = "select * from mobile_details where id=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
               mobileDetailsModel v = new mobileDetailsModel();
             while (rs.next()) {
             v.setId(rs.getInt(1));
             v.setName(rs.getString(2));
             v.setBattery(rs.getInt(3));
             v.setBrand(rs.getString(4));
             v.setDisplay(rs.getDouble(5));
             v.setPlatform(rs.getString(6));
             v.setPrice(rs.getDouble(7));
             v.setRam(rs.getDouble(8));
             v.setPhotoid(rs.getString(9));
             v.setDescription(rs.getString(10));
            }
            con.close();
            rs.close();
            return v;
        } catch (Exception e) {
            System.out.println("query error" + e);
        }
        return null;
    }
}
