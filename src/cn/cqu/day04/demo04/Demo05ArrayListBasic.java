package cn.cqu.day04.demo04;

import java.util.ArrayList;
/*
* 如果希望向集合ArrayList当中储存基本类型数据，必须使用基本类型对应的"包装类".
*
* 基本类型 包装类(引用类型，包装类都位于java.lang包下)
* byte      Byte
* short     Short
* int       Integer
* long      Long
* float     Float
* double    Double
* char      Character
* boolean   Boolean
* */
public class Demo05ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(200);
        System.out.println(list1);

        int num = list1.get(1);
        System.out.println("第一号元素是：" + num);
    }
}
