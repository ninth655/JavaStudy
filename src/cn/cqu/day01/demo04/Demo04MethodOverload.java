package cn.cqu.day01.demo04;

/*
*   方法重载与以下因素有关：
*   1.参数个数不同
*   2.参数类型不同
*   3.参数的多类型顺序不同
*
*   方法重载与以下因素无关：
*   1.与参数的名称无关
*   2.与方法的返回值类型无关
* */
public class Demo04MethodOverload {
    public static void main(String[] args) {
        System.out.println(sum(10,20));
        System.out.println(sum(10,20,5));
        System.out.println(sum(10,20,343,3));
    }
    public static int sum(int a, int b) {
        System.out.println("2:");
        return a + b;
    }
    public static int sum(int a, int b, int c) {
        System.out.println("3:");
        return a + b +c;
    }
    public static int sum(int a, int b, int c, int d) {
        System.out.println("4:");
        return a + b + c + d;
    }
}
