package com.value.vector;
public class RAM {
     public int inputTOint(Double RAMM){
        int temp = 0;
        if((RAMM>0)&&(RAMM<=1))
            temp=1;
        else if((RAMM>1)&&(RAMM<=2))
            temp=2;
        else if((RAMM>2)&&(RAMM<=4))
            temp=3;
        else if((RAMM>4)&&(RAMM<=6))
            temp=4;
        else if((RAMM>6))
            temp=5;
        return temp;
    }
}
