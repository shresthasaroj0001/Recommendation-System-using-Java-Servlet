/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.registerFone.coln;

import com.connectionFIles.ConnectionString_db;
import com.model.details.mobileDetailsModel;
import com.model.details.vector_detailsModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Saroj
 */
public class RegistErDAO {
    public Boolean InsertIntoMobileDetails(mobileDetailsModel model){
        Boolean success = false;
        try{
            Connection con = ConnectionString_db.connectme();
            String sql = "insert into mobile_details(Name,battery,brand,displaysize,platform,price,ram,Description,date,photoid) values(?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, model.getName());
            pst.setInt(2,model.getBattery());
            pst.setString(3, model.getBrand());
            pst.setDouble(4, model.getDisplay());
            pst.setString(5, model.getPlatform());
            pst.setDouble(6, model.getPrice());
            pst.setDouble(7, model.getRam());
            pst.setString(8, model.getDescription());
//            pst.setDate(9, (java.sql.Date) model.getDate());
//            pst.setDate(2, java.sql.Date.valueOf(df.format(date)));
              SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            pst.setDate(9, java.sql.Date.valueOf(df.format(model.getDate())));
            pst.setString(10, "a");
            int executeQuery = pst.executeUpdate();
            if(executeQuery>=1)
                success=!success;
            con.close();
            return success;
        }catch(SQLException e){
            System.out.println("sql error"+e);
        }
        return success;
    } 
    public Boolean InsertIntoVectorDetails(vector_detailsModel model){
        Boolean success = false;
        try{
            Connection con = ConnectionString_db.connectme();
            String sql = "insert into vector_details(id,battery,brand,displaysize,platform,price,ram) values(?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, model.getId());
            pst.setInt(2,model.getBattery());
           pst.setInt(3, model.getBrand());
           pst.setInt(4, model.getDisplay());
           pst.setInt(5, model.getPlatform());
           pst.setInt(6, model.getPrice());
           pst.setInt(7, model.getRam());
            int executeQuery = pst.executeUpdate();
            if(executeQuery>=1)
                success=!success;
            con.close();
            return success;
        }catch(SQLException e){
            System.out.println("sql error"+e);
        }
        return success;
    }
    public int get_autoincrement_value_of_memberdata() {
        String temp = null;
        try {    //geta autoincrement value
            String viewStudentsQuery = "SELECT AUTO_INCREMENT FROM information_schema.TABLES WHERE TABLE_SCHEMA = ? AND TABLE_NAME = ?";
            Connection conn = ConnectionString_db.connectme();
            PreparedStatement stmt = conn.prepareStatement(viewStudentsQuery);
            stmt.setString(1,"colz_db");
            stmt.setString(2,"mobile_details");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                temp = rs.getString("AUTO_INCREMENT");
            }
            rs.close();
            conn.close();
            return Integer.parseInt(temp);
//            System.out.println(temp);
        } catch (SQLException e) {
            System.out.println("SWL error " + e);
        }
        return 0;
    }
}
