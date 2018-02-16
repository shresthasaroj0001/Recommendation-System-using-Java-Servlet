/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Pcc.col;

/**
 *
 * @author Saroj
 */
public class PCCC {
        public double correlation1(double x[],double y[]){
    double x_sum,y_sum;
        double x_sq,y_sq;
        double n = x.length;
        int i;
        double temp=0,temp1=0;
        for(i=0;i<n;i++)
        {
            temp = temp+x[i];
            temp1=temp1+y[i];
                    }
        x_sum=temp;  //summation x
//            System.out.println("x sum " +x_sum);
        y_sum= temp1; //summation y
//         System.out.println("y sum " +y_sum);
        temp=0;temp1=0;
        for(i=0;i<n;i++)
        {
            temp = temp+Math.pow(x[i], 2);
            temp1=temp1+Math.pow(y[i], 2);
                    }
        x_sq=temp;  //summation x square
//            System.out.println("x_sq " +x_sq);
        y_sq= temp1; //summation y square
//         System.out.println("y_sq " +y_sq);
        temp=0;
        double xy=0;
        for(i=0;i<n;i++)
        {
            temp=temp+(x[i]*y[i]);
        }
        xy=temp;
//            System.out.println("xy "+xy);
        temp=0;temp1=0;
        double correlation=0;
        correlation = Math.sqrt( ( (n*x_sq)- (x_sum*x_sum) )*( (n*y_sq)- (y_sum*y_sum) )  );
        correlation=  ( (n*xy)-(x_sum*y_sum ) ) / correlation ;
//        System.out.println("Total Numbers:" + n + "\nCorrelation Coefficient:" + correlation);
        correlation = (correlation*1000)/1000D; 
//        System.out.println(Math.round(n.correlation1(x, y)*1000)/1000D);
        return correlation;
    }

}
