package cn.cqu.day04.demo05;

import java.util.ArrayList;
import java.util.Random;

/*
* 生成6个1-33之间的随机整数，添加到集合，并遍历集合
* */
public class Demo01ArrayListRandom {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 6; i++) {
            list.add(r.nextInt(33) + 1);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}
