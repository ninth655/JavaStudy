package cn.cqu.day03.demo02;
/*
*  封装性旨在Java当中的体现：
* 1.方法就是一种封装
* 2.关键字private也是一种封装
* */
//封装就是将一些细节信息隐藏起来，对于外界不可见
public class Demo01Method {
    public static void main(String[] args) {
        int[] array = { 5,57,8,83,2 };
        int max = getMax(array);
        System.out.println("最大值" + max);
    }

    public static int getMax(int[] array){
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max ){
                max = array[i];
            }
        }
        return max;
    }
}

