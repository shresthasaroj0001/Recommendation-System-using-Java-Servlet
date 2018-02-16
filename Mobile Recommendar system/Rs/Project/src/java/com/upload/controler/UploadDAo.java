package com.upload.controler;

import com.connectionFIles.ConnectionString_db;
import com.model.details.mobileDetailsModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class UploadDAo {
    public ArrayList<mobileDetailsModel> LeftForUpload(){
        ArrayList<mobileDetailsModel> mobileLIst= new ArrayList<mobileDetailsModel>();    
        try {
            Connection con = ConnectionString_db.connectme();
            String sql = "select id,Name from mobile_details where photoid=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, "a");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
              mobileDetailsModel mob = new mobileDetailsModel();
              mob.setId(rs.getInt("id"));
              mob.setName(rs.getString("Name"));
             mobileLIst.add(mob);
            }
            con.close();
            rs.close();
            return mobileLIst;
        } catch (Exception e) {
            System.out.println("query error" + e);
        }
       return mobileLIst;
    }
    public Boolean Uploadit(int id,String name){
        Boolean isSucess = false;
        try{
         Connection con = ConnectionString_db.connectme();
            String sql = "update mobile_details set photoid = ? where id=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, name);
            pst.setInt(2,id);
            int executeUpdate = pst.executeUpdate();
            if(executeUpdate>=1){
                isSucess = !isSucess;
            }
            con.close();
            return isSucess;
        }catch(Exception e){
            System.out.println("SQL "+e);
        }
        return isSucess;
    }
    public mobileDetailsModel IndividualMobileDetails(int id){
        mobileDetailsModel m = new mobileDetailsModel();
        try {
            Connection con = ConnectionString_db.connectme();
            String sql = "select * from mobile_details where  id=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                m.setId(rs.getInt(1));
                m.setName(rs.getString(2));
                m.setBattery(rs.getInt(3));
                m.setBrand(rs.getString(4));
                m.setDisplay(rs.getDouble(5));
                m.setPlatform(rs.getString(6));
                m.setPrice(rs.getDouble(7));
                m.setRam(rs.getDouble(8));
                m.setPhotoid(rs.getString(9));
                m.setDescription(rs.getString(10));
                m.setDate(rs.getDate(11));
            }
            con.close();
            rs.close();
            return m;
        } catch (Exception e) {
            System.out.println("query error" + e);
        }
       return m;
    }
}
