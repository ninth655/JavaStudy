package cn.cqu.day03.demo05;

public class Demo01Student {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setAge(21);
        stu1.setName("迪丽热巴");
        System.out.println("姓名：" + stu1.getName() + "年龄：" + stu1.getAge());
        System.out.println("============");

        Student stu2 = new Student("古力娜扎",32);
        System.out.println("姓名：" + stu2.getName() + "年龄：" + stu2.getAge());
        stu2.setAge(45);
        System.out.println("姓名：" + stu2.getName() + "年龄：" + stu2.getAge());

    }
}
