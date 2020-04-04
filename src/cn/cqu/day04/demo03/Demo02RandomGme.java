package cn.cqu.day04.demo03;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.Random;
import java.util.Scanner;

public class Demo02RandomGme {
    public static void main(String[] args) {

        int num = new Random().nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请输入你所猜的数字：");
            int guessNum = sc.nextInt();
            if (guessNum > num) {
                System.out.println("大了,请重试");
            } else if (guessNum < num) {
                System.out.println("小了，请重试");
            } else {
                System.out.println("恭喜你，猜中了");
                break;
            }
        }
        System.out.println("游戏结束");
    }
}
