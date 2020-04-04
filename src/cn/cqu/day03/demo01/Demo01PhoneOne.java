package cn.cqu.day03.demo01;

public class Demo01PhoneOne {
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
        System.out.println("===================");
        one.call("普京");
        one.sendMeesage();
    }
}
