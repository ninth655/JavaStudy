package cn.cqu.day01.demo02;

public class Demo1Method {
    public static void printMethod(){
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 20; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
       printMethod();
    }
}
