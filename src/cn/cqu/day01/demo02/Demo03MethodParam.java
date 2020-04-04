package cn.cqu.day01.demo02;
//有参数
//无参数
//求出1-100数字和
public class Demo03MethodParam {
    public static int sum100(){
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        return  sum;
    }
    public static void main(String[] args) {
        System.out.println("结果是:" + sum100());
    }
}
