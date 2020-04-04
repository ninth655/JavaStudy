package cn.cqu.day03.demo01;

/*    //定义成员变量
    String brand; //品牌
    double price; //价格
    String color; //颜色
    //成员方法
    public void call(String who) {} //打电话
    public void sendMessage() {}  //   群发短信
*/
public class phone {
    //成员变量
    String brand; //品牌
    double price; //价格
    String color; //颜色

    //成员方法
    public void call (String who) {
        System.out.println("给" + who + "打电话");
    }
    public void sendMeesage () {
        System.out.println("群发短信");
    }
}
