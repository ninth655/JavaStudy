package cn.cqu.day04.demo04;

import java.util.ArrayList;

/*
* ArrayList当中的常用方法有：
* public boolean add(E e):向集合当中添加元素，参数的类型和泛型一致。返回值代表添加是否成功。
* 对于ArrayList集合来说，add添加动作一定是成功的,所以返回值可用可不用。
* 但对于其他集合来说，add添加动作不一定成功。
* public E ger(int index):从集合当中获取元素，参数是索引编号，返回值就是对应位置的元素
* public E remove(int index):从集合当中删除元素，参数是索引编号，返回值就是被删除掉的元素。
* public int size(): 获取集合的尺寸长度，返回值是集合中包含的元素个数。
* */
public class Demo03ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list); // []
        //向集合中添加元素：add
        boolean success = list.add("迪丽热巴");
        System.out.println(list); // []
        System.out.println("添加是否成功：" + success);
        list.add("高圆圆");
        list.add("赵又廷");
        list.add("李小龙");
        list.add("贾乃亮");
        System.out.println(list);
        //从集合中获取元素：get,索引值从0开始
        String name = list.get(2);
        System.out.println("第二号索引位置：" + name);

        //从集合中删除元素：remove。索引值从0开始。
        String whoRemoved = list.remove(3);
        System.out.println("被删除的人是：" + whoRemoved); //李小龙
        System.out.println(list);

        //获取集合的尺寸长度
        int size = list.size();
        System.out.println("集合的长度是 ：" + size);
    }

}