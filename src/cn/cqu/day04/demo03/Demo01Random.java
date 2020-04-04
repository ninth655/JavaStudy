package cn.cqu.day04.demo03;

import java.util.Random;

public class Demo01Random {
    public static void main(String[] args) {
        Random r = new Random();
//        int num = r.nextInt();
//        System.out.println("随机数是" + num);

        for (int i = 0; i < 10; i++) {
            int num = r.nextInt(10);
            System.out.print(num + " ");
        }
    }
}
