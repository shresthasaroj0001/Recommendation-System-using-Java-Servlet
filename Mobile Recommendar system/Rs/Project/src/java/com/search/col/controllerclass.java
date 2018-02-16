/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.search.col;

import com.model.details.VectorRepresentation;
import com.model.details.mobileDetailsModel;
import com.model.details.resultModel;
import com.model.details.vector_detailsModel;
import com.value.vector.Cosim;
import com.value.vector.vectortoArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Saroj
 */
public class controllerclass {

    public ArrayList<mobileDetailsModel> initiate(vector_detailsModel searchQuery) {
        searchddAo searc = new searchddAo();
        ArrayList<vector_detailsModel> vectorMobileList = searc.getallvector_data();

        ArrayList<VectorRepresentation> finalVectorList = new ArrayList<VectorRepresentation>();
        db2vectorModelRepresentation d = new db2vectorModelRepresentation();
        for (vector_detailsModel v : vectorMobileList) {
            VectorRepresentation db2vectorModelRepresentation1 = d.db2vectorModelRepresentation1(v);
            finalVectorList.add(db2vectorModelRepresentation1);
        }//for loop closing

        VectorRepresentation searchQueryvectorModelRepresentation = d.db2vectorModelRepresentation1(searchQuery);
        vectortoArray vect2Aray = new vectortoArray();
        int[] x = vect2Aray.vecctorTOarrayconvert(searchQueryvectorModelRepresentation);

        System.out.println("");
        System.out.println(" User Query vector");
        for (int i = 0; i < x.length; i++) {
            System.out.print(" " + x[i]);
        }
        ArrayList<resultModel> result = new ArrayList<resultModel>();
        //out.println(result.size());
        Cosim cosine = new Cosim();
        System.out.println("");
        System.out.println(" Mobile Vector");
        for (VectorRepresentation v : finalVectorList) {
            resultModel mod = new resultModel();
            mod.setMobbileId(v.getId());
            int[] y = vect2Aray.vecctorTOarrayconvert(v);
            mod.setCosInevalue(cosine.CosineSimilarity(x, y));
            result.add(mod);
            System.out.print("id:" + mod.getMobbileId() + " ");
            for (int i = 0; i < y.length; i++) {
                System.out.print(" " + y[i]);
            }
            System.out.print(" cos:" + mod.getCosInevalue() + ":");
            System.out.println(" ");
        }

        //sorting according to cosine value to result
        Collections.sort(result, new Comparator<resultModel>() {
            @Override
            public int compare(resultModel o1, resultModel o2) {
                return Double.valueOf(o2.cosInevalue).compareTo(o1.cosInevalue);
            }
        });

        //final result
        ArrayList<mobileDetailsModel> mod = new ArrayList<mobileDetailsModel>();
        System.out.println("output total");
        
        int count = 0;
        for (resultModel r : result) {
            System.out.print(" " + r.getMobbileId());
            int mobbileId = r.getMobbileId();
            mobileDetailsModel allmobileDetailsData = searc.getallmobileDetailsData(mobbileId);
            mod.add(allmobileDetailsData);
            if (count== 4) {
                break;
            }
            count++;
        }
        return mod;
    }
}
