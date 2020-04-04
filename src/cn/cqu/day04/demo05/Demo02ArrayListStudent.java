package cn.cqu.day04.demo05;

import java.util.ArrayList;

public class Demo02ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student one = new Student("张三",19);
        Student two = new Student("李四",23);
        Student three = new Student("王五",20);
        Student four = new Student("马六",21);

        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println("姓名：" + stu.getName() + ",年龄：" + stu.getAge() );
        }
    }
}
