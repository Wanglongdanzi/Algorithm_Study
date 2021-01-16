package com.athome.sortalgorithm.sort3select;

/**
 * @author 32341
 * @version 1.0
 * @description: TODO
 * @date 21-1-16 19:53
 */
public class Selection {

    public void selection(){
    }

    public static void sort(Comparable[] o){
        for (int i = o.length-1; i >0 ; i--) {
            Comparable max=o[i];
            for (int j = 0; j < i; j++) {
                if (greater(o[j],max)){
                    max=o[j];
                }

            }
            if(max!=o[i]){
                exch(o,i，);
            }
        }
    }
    public static boolean greater(Comparable v,Comparable w){
        return v.compareTo(w)>0;
    }
    public static void exch(Comparable[] o,int i,int j){
        Comparable temp;
        temp=o[i];
        o[i]=o[j];
        o[j]=temp;
    }
}
