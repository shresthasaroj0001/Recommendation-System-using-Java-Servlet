/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.search.col;

import com.model.details.VectorRepresentation;
import com.model.details.vector_detailsModel;

/**
 *
 * @author Saroj
 */
public class db2vectorModelRepresentation {
    public VectorRepresentation db2vectorModelRepresentation1(vector_detailsModel v){
        VectorRepresentation vmodel = new VectorRepresentation();
                vmodel.setId(v.getId());

                int temp = v.getBattery();
                vmodel.setBattery1(0);
                vmodel.setBattery2(0);
                vmodel.setBattery3(0);
                vmodel.setBattery4(0);
                if (temp != 0) {
                    if (temp == 1) {
                        vmodel.setBattery1(1);
                    } else if (temp == 2) {
                        vmodel.setBattery2(1);
                    } else if (temp == 3) {
                        vmodel.setBattery3(1);
                    } else if (temp == 4) {
                        vmodel.setBattery4(1);
                    } 
                }
                temp = 0;
                temp = v.getBrand();
                vmodel.setBrand1(0);
                vmodel.setBrand2(0);
                vmodel.setBrand3(0);
                vmodel.setBrand4(0);
                vmodel.setBrand5(0);
                vmodel.setBrand6(0);
                if (temp != 0) {
                    if (temp == 6) {
                        vmodel.setBrand6(1);
                    } else if (temp == 5) {
                        vmodel.setBrand5(1);
                    } else if (temp == 4) {
                        vmodel.setBrand4(1);
                    } else if (temp == 3) {
                        vmodel.setBrand3(1);
                    } else if (temp == 2) {
                        vmodel.setBrand2(1);
                    } else if (temp == 1) {
                        vmodel.setBrand1(1);
                    }
                }
                temp = 0;
                temp = v.getDisplay();
                vmodel.setDisplay1(0);
                vmodel.setDisplay2(0);
                vmodel.setDisplay3(0);
                vmodel.setDisplay4(0);
                if (temp != 0) {
                    if (temp == 1) {
                        vmodel.setDisplay1(1);
                    } else if (temp == 2) {
                        vmodel.setDisplay2(1);
                    } else if (temp == 3) {
                        vmodel.setDisplay3(1);
                    } else if (temp == 4) {
                        vmodel.setDisplay4(1);
                    }   else if (temp == 5) {
                        vmodel.setDisplay5(1);
                    }
                }//temp closing
                temp = 0;
                temp = v.getPlatform();
                vmodel.setPlatform1(0);
                vmodel.setPlatform2(0);
                vmodel.setPlatform3(0);
                vmodel.setPlatform4(0);
                vmodel.setPlatform5(0);
                if (temp != 0) {
                    if (temp == 1) {
                        vmodel.setPlatform1(1);
                    } else if (temp == 2) {
                        vmodel.setPlatform2(1);
                    } else if (temp == 3) {
                        vmodel.setPlatform3(1);
                    } else if (temp == 4) {
                        vmodel.setPlatform4(1);
                    } else if (temp == 5) {
                        vmodel.setPlatform5(1);
                    }
                }//temp clos
                temp = 0;
                temp = v.getPrice();
                vmodel.setPrice1(0);
                vmodel.setPrice2(0);
                vmodel.setPrice3(0);
                vmodel.setPrice4(0);
                vmodel.setPrice5(0);
                if (temp != 0) {
                    if (temp == 1) {
                        vmodel.setPrice1(1);
                    } else if (temp == 2) {
                        vmodel.setPrice2(1);
                    } else if (temp == 3) {
                        vmodel.setPrice3(1);
                    } else if (temp == 4) {
                        vmodel.setPrice4(1);
                    } else if (temp == 5) {
                        vmodel.setPrice5(1);
                    }
                }//temp closng
                temp = v.getRam();
                vmodel.setRAM1(0);
                vmodel.setRAM2(0);
                vmodel.setRAM3(0);
                vmodel.setRAM4(0);
                if (temp != 0) {
                    if (temp == 1) {
                        vmodel.setRAM1(1);
                    } else if (temp == 2) {
                        vmodel.setRAM2(1);
                    } else if (temp == 3) {
                        vmodel.setRAM3(1);
                    } else if (temp == 4) {
                        vmodel.setRAM4(1);
                    }
                }//temp closing
                return vmodel;
    }
}
