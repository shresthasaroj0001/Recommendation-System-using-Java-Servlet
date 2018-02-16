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
public class Platform {
    public int Brandtoint(String name){
        int temp=0;
        if(name.equals("android"))
            temp=1;
        else if(name.equals("ios"))
            temp=2;
        else if(name.equals("bb"))
            temp=3;
        else if(name.equals("windows"))
            temp=4;
        else if(name.equals("others"))
            temp=5;
        return temp;
    }
    public String intTObrand(int val){
        String name="Other";
        if(val==1)
            name="Android";
        else if(val==2)
            name="IOS";
        else if(val==3)
            name="bb";
        else if(val==4)
            name="Windows";
        return name;
    }
}
