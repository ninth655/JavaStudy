package cn.cqu.day04.demo02;

//匿名对象只能使用唯一一次，下次用不得不在创建一个新对象
//使用建议：如果确定有一个对象只需要用一次，就可以使用匿名对象
public class Demo01Anonymous {
    public static void main(String[] args) {
        Person one = new Person();

        one.name = "高圆圆";
        one.showNme();
        //匿名对象
        new Person().name = "赵又廷";
        new Person().showNme();

    }
}
