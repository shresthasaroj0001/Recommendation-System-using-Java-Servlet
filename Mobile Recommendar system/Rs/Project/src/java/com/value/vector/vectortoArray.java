/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.value.vector;

import com.model.details.VectorRepresentation;

/**
 *
 * @author Saroj
 */
public class vectortoArray {
    public int[] vecctorTOarrayconvert(VectorRepresentation searchQueryvectorModelRepresentation){
        int[] x = new int[29];
            x[0]=searchQueryvectorModelRepresentation.getBattery1();
            x[1]=searchQueryvectorModelRepresentation.getBattery2();
            x[2]=searchQueryvectorModelRepresentation.getBattery3();
            x[3]=searchQueryvectorModelRepresentation.getBattery4();
            x[4]=searchQueryvectorModelRepresentation.getBrand1();
            x[5]=searchQueryvectorModelRepresentation.getBrand2();
            x[6]=searchQueryvectorModelRepresentation.getBrand3();
            x[7]=searchQueryvectorModelRepresentation.getBrand4();
            x[8]=searchQueryvectorModelRepresentation.getBrand5();
            x[9]=searchQueryvectorModelRepresentation.getBrand6();
            x[10]=searchQueryvectorModelRepresentation.getDisplay1();
            x[11]=searchQueryvectorModelRepresentation.getDisplay2();
            x[12]=searchQueryvectorModelRepresentation.getDisplay3();
            x[13]=searchQueryvectorModelRepresentation.getDisplay4();
            x[14]=searchQueryvectorModelRepresentation.getDisplay5();
            x[15]=searchQueryvectorModelRepresentation.getPlatform1();
            x[16]=searchQueryvectorModelRepresentation.getPlatform2();
            x[17]=searchQueryvectorModelRepresentation.getPlatform3();
            x[18]=searchQueryvectorModelRepresentation.getPlatform4();
            x[19]=searchQueryvectorModelRepresentation.getPlatform5();
            x[20]=searchQueryvectorModelRepresentation.getPrice1();
            x[21]=searchQueryvectorModelRepresentation.getPrice2();
            x[22]=searchQueryvectorModelRepresentation.getPrice3();
            x[23]=searchQueryvectorModelRepresentation.getPrice4();
            x[24]=searchQueryvectorModelRepresentation.getPrice5();
            x[25]=searchQueryvectorModelRepresentation.getRAM1();
            x[26]=searchQueryvectorModelRepresentation.getRAM2();
            x[27]=searchQueryvectorModelRepresentation.getRAM3();
            x[28]=searchQueryvectorModelRepresentation.getRAM4();
            return x;
    }
}
