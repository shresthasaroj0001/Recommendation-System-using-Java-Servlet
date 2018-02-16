package com.connectionFIles;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Saroj
 */
public class ConnectionString_user {

    public static Connection connectme() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/colz_user", "root", "");
            return cn;
        } catch (ClassNotFoundException a) {
            System.out.println("Load Driver  " + a);
        } catch (SQLException a) {
            System.out.println("SQL error " + a);
        }
        return null;
    }
}
