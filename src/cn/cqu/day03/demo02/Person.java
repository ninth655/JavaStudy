package cn.cqu.day03.demo02;

/*
* 问题描述：定义Person的年龄时，无法阻止不合理的数据被设置进来
* 解决方案：用Private关键字将需要保护的成员变量进行修饰
*
* 一旦使用了Private进行修饰，呢么本类当中仍可随意访问。
* 但是，超出本类范围之外就不能再直接访问了
* */
public class Person {

    String name;
    private int age;

    public void show(){
        System.out.println("我叫：" + name + "年龄：" + age);
    }

    public void setAge(int num) {
        if (num < 100 && num >=9) {
            age = num;
        } else {
            System.out.println("数据不合理");
        }
    }
    public int getAge(){
        return age;
    }
}
