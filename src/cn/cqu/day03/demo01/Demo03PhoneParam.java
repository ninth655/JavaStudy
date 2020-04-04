package cn.cqu.day03.demo01;

public class Demo03PhoneParam {
    public static void main(String[] args) {
        phone one = new phone();
        one.price = 7875.0;
        one.color = "土豪金";
        one.brand = "苹果";

        method(one);  //传递进去的参数也是地址值
    }

    public static void method(phone param) {
        System.out.println(param.brand);
        System.out.println(param.price);
        System.out.println(param.color);
    }
}

