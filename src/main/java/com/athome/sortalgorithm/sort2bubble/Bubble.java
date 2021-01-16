package com.athome.sortalgorithm.sort2bubble;

/**
 * @author 32341
 * @version 1.0
 * @description: 冒泡排序
 * 构造方法 Bubble()：创建Bubble对象
 * 成员方法
 * 1.public static void sort(Comparable[] a)：对数组内的元素进行排序
 * 2.private static boolean greater(Comparable v,Comparable w):判断v是否大于w
 * 3.private static void exch(Comparable[] a,int i,int j)：交换a数组中，索引i和索引j处的值
 * @date 21-1-14 22:56
 */
public class Bubble {
    /**
     * @description: 对数组元素进行排序
     * @param: * @param: o
     * @return: void
     * @author wldz
     * @date: 21-1-14 23:00
     */
    public static void sort(Comparable[] o){
        //前i个元素参加冒泡
        for (int i = o.length-1; i > 0; i--) {
            //从索引0的元素比到索引i的元素
            for (int j = 0; j < i; j++) {
                //最坏情况（逆序）T（n)=比较次数+交换次数=n*(n-1)/2+n*(n-1)/2=Math.pow(n,2)-n =>时间复杂度O(n)=n^2
                //比较索引j和j+1的值
                if(greater(o[j],o[j+1])) {
                    exch(o,j,j+1);
                }
            }
        }

    }
    /**
     * @description: 判断v是否大于w
     * @param: * @param: v /* @param: w
     * @return: boolean
     * @author wldz
     * @date: 21-1-14 23:03
     */

    private static boolean greater(Comparable v,Comparable w){
        return v.compareTo(w)>0;
    }
    /**
     * @description: 交换数组o中，索引i和j处的值
     * @param: * @param: o
               * @param: i
               * @param: j
     * @return: void
     * @author wldz
     * @date: 21-1-14 23:05
     */
    private static void exch(Comparable[] o,int i,int j){
        Comparable temp;
        temp=i;
        o[i]=o[j];
        o[j]=temp;
    }

}
