/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller.userLogin;

import com.connectionFIles.ConnectionString_db;
import com.connectionFIles.ConnectionString_user;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Saroj
 */
public class loginDAO {

    public User_Model validUser(User_Model sstaf) {
        try {
            Connection con = ConnectionString_db.connectme();
            String sql = "select * from userlogin where staff_id  =? AND staff_pwd =?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, sstaf.getStaff_id());
            pst.setString(2, sstaf.getStaff_pwd());
            ResultSet rs = pst.executeQuery();
            User_Model staff = new User_Model();
            while (rs.next()) {
                staff.setId(rs.getInt(1));
                staff.setStaff_id(rs.getString(2));
                staff.setStaff_first_name(rs.getString(4));
                staff.setStaff_last_name(rs.getString(5));
                staff.setStaff_middle_name(rs.getString(6));
                staff.setRegistered_date(rs.getDate(7));
                staff.setTable_name(rs.getString(8));
                return staff;
            }
            con.close();
        } catch (Exception e) {
            System.out.println("query error" + e);
        }
        return null;
    }

    public int get_autoincrement_value_of_memberdata() { //colz_db
        String temp = null;
        try {    //geta autoincrement value
            String viewStudentsQuery = "SELECT AUTO_INCREMENT FROM information_schema.TABLES WHERE TABLE_SCHEMA = ? AND TABLE_NAME = ?";
            Connection conn = ConnectionString_db.connectme();
            PreparedStatement stmt = conn.prepareStatement(viewStudentsQuery);
            stmt.setString(1, "colz_db");
            stmt.setString(2, "userlogin");
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

    public Boolean add_user(User_Model new_member) {
        Boolean isSubmit = false;
        try {
            Connection conn = ConnectionString_db.connectme();
            String query = "INSERT into userlogin (staff_id,staff_pwd,staff_first_name,staff_last_name,staff_middle_name,Registered_date,table_name) values(?,?,?,?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, new_member.getStaff_first_name().toLowerCase());
            stmt.setString(2, new_member.getStaff_pwd());
            stmt.setString(3, new_member.getStaff_first_name());
            stmt.setString(4, new_member.getStaff_last_name());
            stmt.setString(5, new_member.getStaff_middle_name());
            Date date = new Date();
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            stmt.setDate(6, java.sql.Date.valueOf(df.format(date)));
            stmt.setString(7, new_member.getTable_name());
            int executeUpdate = stmt.executeUpdate();
            if (executeUpdate >= 1) {
                isSubmit = !isSubmit;
            }
            conn.close();
            return isSubmit;
        } catch (SQLException e) {
            System.out.println("SWL error " + e);
        }
        return isSubmit;
    }// 

    public Boolean CreateTable4user(String tablename) {
        Boolean isSucess = false;
        try {
            String query = "CREATE TABLE ";
            query = query.concat(tablename);
            query = query.concat(" (id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,mobile_id INT NOT NULL,rating  INT NOT NULL)");
//                System.out.println(query);

            Connection conn2 = ConnectionString_user.connectme();
            PreparedStatement stmt1 = conn2.prepareStatement(query);
            int executeUpdate = stmt1.executeUpdate();
            if (executeUpdate >= 0) {
                isSucess = !isSucess;
            }
            return isSucess;
        } catch (SQLException e) {
            System.out.println("create sql error " + e);
        }
        return isSucess;
    }

}
