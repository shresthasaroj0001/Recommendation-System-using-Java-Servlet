/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.value.vector;

/**
 *
 * @author Saroj
 */
public class price {
    public int inputTOint(Double pric){
        int temp = 0;
        if((pric>0)&&(pric<10000))
            temp=1;
        else if((pric>=10000)&&(pric<20000))
            temp=2;
        else if((pric>=20000)&&(pric<30000))
            temp=3;
        else if((pric>=30000)&&(pric<50000))
            temp=4;
        else if(pric>=50000)
            temp=5;
        return temp;
    }
}
