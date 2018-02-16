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
public class Brand {
    public int Brandtoint(String name){
        int temp=0;
        if(name.equals("samsung"))
            temp=1;
        else if(name.equals("apple"))
            temp=2;
        else if(name.equals("blackberry"))
            temp=3;
        else if(name.equals("Huwai"))
            temp=4;
        else if(name.equals("Nokia"))
            temp=5;
        else if(name.equals("Other"))
            temp=6;
        return temp;
    }
    public String intTObrand(int val){
        String name="";
        if(val==1)
            name="Samsung";
        else if(val==2)
            name="Apple";
        else if(val==3)
            name="Black Berry";
        else if(val==4)
            name="Huwai";
        else if(val==5)
            name="Nokia";
        else if(val==6)
            name="Others";
        return name;
    }
}
