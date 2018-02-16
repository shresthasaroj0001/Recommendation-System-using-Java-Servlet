package com.rating.coln;

import com.connectionFIles.ConnectionString_user;
import com.model.details.mobileDetailsModel;
import com.model.details.vector_detailsModel;
import com.search.col.searchddAo;
import com.upload.controler.UploadDAo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ViewDAO {

    public ArrayList<MObileRated_UserModel> mobileRated(String tableName_Customer) {
        ArrayList<MObileRated_UserModel> Lis = new ArrayList<MObileRated_UserModel>();
        try {
            Connection con = ConnectionString_user.connectme();
            String sql = "select * from ";//
            sql = sql.concat(tableName_Customer);
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                MObileRated_UserModel mobb = new MObileRated_UserModel();
                mobb.setId(rs.getInt(1));
                mobb.setMobile_id(rs.getInt(2));
                mobb.setRateing(rs.getInt(3));
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

    public ArrayList<mobileDetailsModel> findthoseMObileThatAreNotRated(String tablename_of_customer) {
        searchddAo dd = new searchddAo();
        ArrayList<vector_detailsModel> allMobileId = dd.getallvector_data(); //extract registered Mobile Id only..
        ViewDAO viewDAO = new ViewDAO();
        ArrayList<MObileRated_UserModel> mobileRated = viewDAO.mobileRated(tablename_of_customer);
        List<Integer> x = new ArrayList<Integer>();
        for (vector_detailsModel v : allMobileId) {
            Boolean found = false;
            for (MObileRated_UserModel m : mobileRated) {
                if (m.getMobile_id()== v.getId()) {
                    found = !found;
                    break;
                }
            }
            if (!found) {
                x.add(v.getId());
            }
        } // for closng
        // x contains all mobile id that arenot rated

        //find mobile details of those not rated items
        UploadDAo up = new UploadDAo();
        ArrayList<mobileDetailsModel> NotRatedMObileDetailsFromID = new ArrayList<mobileDetailsModel>();
        for (Integer id : x) {
            mobileDetailsModel IndividualMobileDetails = up.IndividualMobileDetails(id);
            NotRatedMObileDetailsFromID.add(IndividualMobileDetails);
        }
        return NotRatedMObileDetailsFromID;
    }

    public Boolean upDateRatingValue(ArrayList<MObileRated_UserModel> list, String tableName) {
        Boolean isSuccess = false;
        int sucessCount = 0;
        int Counter = 0;
        for (MObileRated_UserModel FreshRated : list) {
                Counter++;
                try {
                    Connection con = ConnectionString_user.connectme();
                    String sql = "insert into ";
                    sql = sql.concat(tableName);
                    sql = sql + "(mobile_id,rating) values(?,?)";
                    PreparedStatement pst = con.prepareStatement(sql);
                    pst.setInt(1, FreshRated.getMobile_id());
                    pst.setInt(2, FreshRated.getRateing());
                    int executeQuery = pst.executeUpdate();
                    if (executeQuery >= 1) {
                        sucessCount++;
                    }
                    con.close();
                } catch (SQLException e) {
                    System.out.println("sql error view dao 3rd error" + e);
                }
            
        }
        if (sucessCount == Counter) {
                isSuccess = !isSuccess;
            }
        return isSuccess;
    }

}
