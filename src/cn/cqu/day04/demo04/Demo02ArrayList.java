package cn.cqu.day04.demo04;

import java.util.ArrayList;

/*
数组的长度不可以发送改变
但是ArrayList集合的是、长度是可以随意变化的

Notice:泛型只能是引用类型，不能是基本类型
        对于ArrayList来说直接打印的不是地址值，得到的是空括号：[]
* */
public class Demo02ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        //向集合中添加一些数据
        list.add("赵丽颖");
        list.add("古力娜扎");
        list.add("迪丽热巴");
        System.out.println(list);
    }
}
