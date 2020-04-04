package cn.cqu.day01.demo02;
/*
方法好似一个工厂
蒙牛工厂  原料：奶牛饲料水
         产出物：奶制品
参数（原料）:就是进入方法的数据
返回值（产出物）：就是从方法出来的数据

定义方法的完整格式
修饰符 返回值类型 方法名称(参数类型 参数名称，...){
    方法体
    return 返回值;
}

修饰符 现阶段的固定写法： public static
返回值类型：也就是方法最终产生的数据是什么类型
方法名称：方法的名称，规则和变量一样，小驼峰
参数类型：进入方法的数据是什么类型
参数名称：进入方法的数据对应的变量名称
PS：参数如有多个，用逗号分割
方法体：方法需要做的事


方法调用和格式
1.单独调用：方法名（参数）;
2.打印调用：System.out.println（方法名（参数））;
3.赋值调用：数据类型 变量名称 = 方法名（参数）;
*/
public class Demo02MethodDefine {
    public static int sum(int a, int b) {

        int result = a + b;
        return result;
    }
    public static void main(String[] args) {
        //单独运行
        System.out.println(sum(5,6));
    }
}
