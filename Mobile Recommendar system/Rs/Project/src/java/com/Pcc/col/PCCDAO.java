/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Pcc.col;

import com.connectionFIles.ConnectionString_db;
import com.model.details.mobileDetailsModel;
import com.model.details.vector_detailsModel;
import com.rating.coln.MObileRated_UserModel;
import com.rating.coln.ViewDAO;
import com.search.col.searchddAo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Saroj
 */
public class PCCDAO {

    public HashMap<Integer, double[]> ratingTabletoAllmobileRatingConversion() {
        HashMap<Integer, String> userid_tablename = new HashMap<Integer, String>();
        try {
            Connection con = ConnectionString_db.connectme();
            String sql = "select id,table_name from userlogin";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                int id = (rs.getInt("id"));
                String tableName = (rs.getString("table_name"));
                userid_tablename.put(id, tableName);
            }
            con.close();
            rs.close();
        } catch (Exception e) {
            System.out.println("query error" + e);
        }
        //hashMap userid_tablename contails all username and their tablename

        System.out.println("from db total users");
        for (Map.Entry m : userid_tablename.entrySet())
        {
            System.out.print(m.getKey()+" ");
            System.out.println(m.getValue());
        }
        System.out.println();
        
        
        HashMap<Integer, Integer[]> userID_ratingOFallmob = new HashMap<Integer, Integer[]>();
        ViewDAO mobileRatedDAO = new ViewDAO();
        searchddAo allmobileid = new searchddAo();
        ArrayList<vector_detailsModel> allvector_data = allmobileid.getallvector_data();
        List<Integer> mobileIDonly = new ArrayList<Integer>();
        for (vector_detailsModel v : allvector_data) {
            mobileIDonly.add(v.getId());
        }

        //List<Integer> mobileIDonly  ma all mobile id's only
//        System.out.println("Total Number of Mobile.. "+mobileIDonly.size());
//         System.out.print("id: ");
        for (Integer id : userid_tablename.keySet()) {  // user id ra tablename
//             System.out.print(id+" ");
//             System.out.println(userid_tablename.get(id));

            ArrayList<MObileRated_UserModel> mobileRated = mobileRatedDAO.mobileRated(userid_tablename.get(id));
//           // mobileRated... user id lai rate gareko mobile ko arraylist
            Integer[] x = new Integer[mobileIDonly.size()];
            int index = 0;

            for (Integer AllMobileID : mobileIDonly) {
                int temp = 0;
                for (MObileRated_UserModel ratedMobileData : mobileRated) {
                    if (ratedMobileData.getMobile_id() == AllMobileID) {
                        temp = ratedMobileData.getRateing();
                        break;
                    }
                }
                x[index] = temp;
                index++;
            } // yaha sakyo
            userID_ratingOFallmob.put(id, x);
        }

        //printing values
        for (Map.Entry m : userID_ratingOFallmob.entrySet()) {
            System.out.print("User" + m.getKey() + ": ");
            Integer[] value = (Integer[]) m.getValue();
            for (Integer value1 : value) {
                System.out.print(value1 + ",");
            }
            System.out.println(" ");
        }

        System.out.println("i am here");
        
        HashMap<Integer, double[]> FinalUser_doubleratingArray = new HashMap<Integer, double[]>();
        for (Map.Entry m : userID_ratingOFallmob.entrySet()) {
            int key = (Integer) m.getKey();
            Integer[] value = (Integer[]) m.getValue();
            double[] x = new double[value.length];
            int i = 0;
            for (Integer value1 : value) {
                x[i] = (double) value1;
                i++;
            }
            FinalUser_doubleratingArray.put(key, x);
        }
        return FinalUser_doubleratingArray;
    }

    public int[] TotalNoofMobile(int ix) {
        int[] x = new int[ix];
        int i = 0;
        try {    //geta autoincrement value
            String viewStudentsQuery = "SELECT id from mobile_details";
            Connection conn = ConnectionString_db.connectme();
            PreparedStatement stmt = conn.prepareStatement(viewStudentsQuery);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                x[i] = rs.getInt("id");
                i++;
            }
            rs.close();
            conn.close();
            return x;
        } catch (SQLException e) {
            System.out.println("SWL error " + e);
        }
        return x;
    }

    public double MeanCalc(double[] x) {
        double temp = 0;
        for (int i = 0; i < x.length; i++) {
            temp = temp + x[i];
        }
        temp = temp / (x.length);
        return temp;
    }

    public int TableNameToUserID(String tablenam) {
        int tableName = 0;
        try {    //geta autoincrement value
            String viewStudentsQuery = "SELECT id from userlogin where table_name =?";
            Connection conn = ConnectionString_db.connectme();
            PreparedStatement stmt = conn.prepareStatement(viewStudentsQuery);
            stmt.setString(1, tablenam);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                tableName = rs.getInt("id");
            }
            rs.close();
            conn.close();
            return tableName;
        } catch (SQLException e) {
            System.out.println("SWL error " + e);
        }
        return tableName;
    }

    public ArrayList<mobileDetailsModel> FromJsp(String tablename) {
         PCCDAO pdo = new PCCDAO();
        int activeuserId = pdo.TableNameToUserID(tablename);
//        int userIDD = v.TableNameToUserID(Table_Name);
    
        searchddAo ssss = new searchddAo();
        ArrayList<vector_detailsModel> allvector_data11 = ssss.getallvector_data();
        System.out.print("Mob Id:");
        for (vector_detailsModel vvvvv : allvector_data11) {
            System.out.print(vvvvv.getId() + ",");
        }
        System.out.println(" ");

        PCCC pc = new PCCC();
       
        HashMap<Integer, double[]> FinalUser_doubleratingArray = pdo.ratingTabletoAllmobileRatingConversion();
        
        double[] activeUserRatingArray = FinalUser_doubleratingArray.get(activeuserId);
        FinalUser_doubleratingArray.remove(activeuserId);
        
        int[] TotalNoofMobile1 = pdo.TotalNoofMobile(activeUserRatingArray.length);
        int TotalNoofMobile = TotalNoofMobile1.length;
        double temp;
        if (TotalNoofMobile > 50) {
            temp = 1;
        } else {
            temp = TotalNoofMobile;
        }
        
        ArrayList<PCCModel> userIDpccWithactiveUser = new ArrayList<PCCModel>();
        for (Map.Entry<Integer, double[]> entry : FinalUser_doubleratingArray.entrySet()) {
            Integer key = entry.getKey();
            double[] value = entry.getValue();
            double correlation1 = pc.correlation1(activeUserRatingArray, value);
            PCCModel p = new PCCModel();
            p.setUserID(key);
            p.setPcc(correlation1);
            correlation1 = correlation1 * temp;
            p.setWau(correlation1);
            userIDpccWithactiveUser.add(p);
//            System.out.println(correlation1);
        }

        System.out.println("UserId " + " PCC " + " Weight");
        for (PCCModel p : userIDpccWithactiveUser) {
            System.out.println(p.getUserID() + " " + p.getPcc() + " " + p.getWau());
        }

        //active user rating mean
        double mean_activUser = pdo.MeanCalc(activeUserRatingArray);
//         System.out.println(mean_activUser);

        //Rating prediction
        int count = -1;
        searchddAo s = new searchddAo();
//        ArrayList<vector_detailsModel> allvector_data = s.getallvector_data();

        System.out.println("");
        System.out.println("");

        ArrayList<PCCModel> ReusltSet = new ArrayList<PCCModel>();

        for (double d : activeUserRatingArray) {
            count++;
            if (d == 0) {
                PCCModel p = new PCCModel();
                double up = 0.0;
                double down = 0.0;
                for (Map.Entry<Integer, double[]> entry : FinalUser_doubleratingArray.entrySet()) {
                    Integer userid = entry.getKey();
                    double[] ratingarray = entry.getValue();
                    double mean = pdo.MeanCalc(ratingarray);
                    double ri = ratingarray[count];
                    double wau = 1;
                    for (PCCModel ppppcccccccc : userIDpccWithactiveUser) {
                        if (ppppcccccccc.getUserID() == userid) {
                            wau = ppppcccccccc.getWau();
                            break;
                        }
                    }
                    up = up + wau * (ri - mean);
                    down = down + wau;
                }
                double ratingPRed = up / down;
                ratingPRed = ratingPRed + mean_activUser;
                int mobileIdnoumber = TotalNoofMobile1[count];
//                System.out.println(mobileIdnoumber + " " + ratingPRed);
                p.setUserID(mobileIdnoumber);
                p.setPcc(ratingPRed);
                ReusltSet.add(p);
            } //if closing
        } // for closing

        Collections.sort(ReusltSet, new Comparator<PCCModel>() {
            @Override
            public int compare(PCCModel o1, PCCModel o2
            ) {
                return Double.valueOf(o2.getPcc()).compareTo(o1.getPcc());
            }
        });
        System.out.println("Mobile Id;  Rating Predictions");

        ArrayList<mobileDetailsModel> ar = new ArrayList<mobileDetailsModel>();
        int top3 = 0;
        for (PCCModel p : ReusltSet) {
            mobileDetailsModel allmobileDetailsData = s.getallmobileDetailsData(p.getUserID());
            System.out.println(p.getUserID() + " " + p.getPcc());
            ar.add(allmobileDetailsData);
            if (top3 == 2) {
                break;
            }
            top3++;
        }
        return ar;
    }
}
