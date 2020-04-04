package cn.cqu.day02.demo01;
/*
*  两种常见的初始化方式
* 1.动态初始化（指定长度）
* 2.静态初始化（指定内容）
*
* 动态初始化数组的格式：
* 数据类型[] 数组名称 = new 数据类型[数组长度]
*
* 静态初始化基本格式：
* 数据类型[] 数组名称 = new 数据类型[] { 元素1, 元素2， ... };
* */
public class Demo01Array {
    public static void main(String[] args) {
        int[] arrayA = new int[300];

        double [] arrayB = new double[10];
    }
}
