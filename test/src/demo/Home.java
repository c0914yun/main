package demo;






import java.io.IOException;
import java.lang.String;

/**
* Home class
* @author Administrator
 *
* */
public class Home {

/**
 * void 代表该方法没有返回值
 * 单引号引的是char类型的单个字符
 * 双引号引的是string类的字符串，可以是单个字符，也可以是多个字符
 * char是字符类型，属于基本数据类型，另外如果对字符串使用单引号，程序在编译的时候会报错
 * string是类类型，属于引用类型
 * */

    private static String TEXT="别开玩笑了";// 类变量
    public static void main(String[] args)throws IOException  //throws IOException声明可能抛出的异常
    {
        /** for (int i = 0; i < 150 ; i++) {
          Integer a=i;
          Integer b=i;
          System.out.println(i+""+(a==b));
          }
       **/
        // 显示单个字符串
        System.out.println(TEXT);
        //变量声明
        String s="呵呵呵";
        //方法调用
        printTextMoreTimes(s,3*8);

    }                  //方法名，可自定义                  //方法参数
    public static void printTextMoreTimes(String s,int count)//方法签名
    {
        //循环
        for (int i = 0; i <count ; i++) {
        //循环体
            System.out.println(s);
        }
            System.out.println("总共输出了："+count);
    }
 /**
  *int或者long,double,boolean,等等类类型，需要有返回值
 * */
    public static double pi()
    {
        return 3.14;
    }


}
