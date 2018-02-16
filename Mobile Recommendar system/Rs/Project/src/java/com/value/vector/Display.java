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
public class Display {
            public int inputTOint(Double pric){
        int temp = 0;
        if((pric>0)&&(pric<4.5))
            temp=1;
        else if((pric>=4.5)&&(pric<5))
            temp=2;
        else if((pric>=5)&&(pric<5.5))
            temp=3;
         else if((pric>=5.5)&&(pric<6))
            temp=4;
        else if(pric>=6)
            temp=5;
        return temp;
    }
}
