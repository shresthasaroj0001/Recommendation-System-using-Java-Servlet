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
public class Battery {
    public int BatteryyinputTOint(Double pric){
        int temp = 0;
        if((pric>0)&&(pric<2000))
            temp=1;
        else if((pric>=2000)&&(pric<3000))
            temp=2;
        else if((pric>=3000)&&(pric<4000))
            temp=3;
        else if(pric>=4000)
            temp=4;
        return temp;
    }
}
