package com.value.vector;
public class Cosim {

    public Double CosineSimilarity(int[] x, int[] y) {
        int up=0;
        int left_side=0;
        int righ_side =0;
        for (int i = 0; i < x.length; i++) {
            up = up+x[i] * y[i];
            left_side = (int) (left_side + ((x[i])*(x[i])));
            righ_side = (int) (righ_side + ((y[i])*(y[i])));
        }
        Double result =.0;
        try{
            result=(up)/((Math.sqrt(left_side))*(Math.sqrt(righ_side)));
            result = ( Math.round(result*100)/100D);
        }catch(Exception e){
            result=.0;
        }
        return result;
    }
}
