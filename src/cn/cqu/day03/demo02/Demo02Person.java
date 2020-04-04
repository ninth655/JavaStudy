package cn.cqu.day03.demo02;

public class Demo02Person {
    public static void main(String[] args) {
        Person person = new Person();
        person.show();

        person.name = "周杰伦";
//        person.age = 0; //直接访问pricate内容是错误额
        person.setAge(-20);

        person.show();
    }
}
