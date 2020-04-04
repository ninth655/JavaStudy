package cn.cqu.day03.demo01;

public class Demo02PhoneSame {
    public static void main(String[] args) {
        //根据phone类创建一个名为one 的对象
        //格式： 类名称 对象名 = new 类名称();
        phone one = new phone();
        System.out.println(one.brand); //null
        System.out.println(one.color); //null
        System.out.println(one.price); //0.0
        System.out.println("===================");

        one.brand= "华为";
        one.color = "黑色";
        one.price = 3456;
        System.out.println(one.brand); //华为
        System.out.println(one.color); //黑色
        System.out.println(one.price); //3456
        one.call("普京");
        one.sendMeesage();
        System.out.println("===================");

        phone two = one;
        System.out.println(two.brand); //华为
        System.out.println(two.color); //黑色
        System.out.println(two.price); //3456
        System.out.println("===================");

        two.brand= "苹果";
        two.color = "白色";
        two.price = 5678;

        System.out.println(two.brand); //苹果
        System.out.println(two.color); //白色
        System.out.println(two.price); //5678
        two.call("特朗普");
        two.sendMeesage();
        System.out.println("===================");

    }
}
