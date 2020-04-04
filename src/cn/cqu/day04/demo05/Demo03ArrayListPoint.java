package cn.cqu.day04.demo05;

import java.util.ArrayList;

/*
* 题目：
* 定义以指定格式打印集合的方法(ArrayList类型作为参数)，使用{}扩起集合，使用@分隔每个元素
* 格式参照 {元素@元素@元素}。
*
* System.out.println(list);    [10,20,30]
* printArrayList(list);        {10@20@30}
* */
public class Demo03ArrayListPoint {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("宋远桥");
        list.add("张翠山");
        list.add("张三丰");
        System.out.println(list);

        printArrayList(list);
    }

    public static void printArrayList(ArrayList<String> list){
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            if( i == list.size() -1 ) {
                System.out.println(name + "}");
            } else {
                System.out.print(name + "@");
            }
        }

    }
}
