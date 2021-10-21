package demo;

import java.io.FileNotFoundException;
import java.io.FileReader;


/** 我们编译运行程序出错的时候，编译器就会抛出异常。抛出异常要比终止程序灵活许多，这是因为

    的Java提供了一个“捕获”异常的的处理器（处理器）对异常情况进行处理。

    如果没有提供处理器机制，程序就会终止，并在控制台上打印一条信息，给出异常的类型.L

    比如：使用了NULL引用或者是数组越界等。

    异常有两种类型：未检查异常和已检查异常对于已检查异常，处理器器将会检查是否提供了处理器。

    然而有许多の异常，如：访问null引用，都属于未检查异常。编译器不会查看是否为这些错误提供了

    处理器。毕竟，应该用严谨的态度来对待写代码，依次避免这些错误的发生，而不是将精力花在编写

    异常处理器上。

 **/

        /** 废话少说，show coder：
        try catch：自己处理异常
        * try {
        *可能出现异常的代码
        *} catch（异常类名A e）{
        *如果出现了异常类A类型的异常，那么执行该代码
        *} ...（catch可以有多个）
        * finally {
        *最终肯定必须要执行的代码（例如释放资源的代码）
        *}
        *代码执行的顺序：
        * 1.try内的代码从出现异常的那一行开始，中断执行
        * 2.执行对应的catch块内的代码
        * 3.继续执行try catch结构之后的代码
        *注意点：
        * 1.如果catch内的异常类存在子父类的关系，那么子类应该在前，父类在后
        * 2。如果最后中有返回语句，那么最后返回的结果肯定以最终中的返回值为准
        * 3。如果最后语句中有回报，那么没有被处理的异常将会被吞掉
        *重写的注意点：
        * 1.儿子不能比父亲的本事大
        * 2.儿子要比父亲开放
        * 3.儿子不能比父亲惹更大的麻烦（子类的异常的类型不能是父类的异常的父类型）
        *异常类Api：
        * 1。的getMessage（）：获取异常描述信息字符串
        * 2。的toString（）：返回异常类的包路径和类
        名和异常描述信息字符串  * 3。的printStackTrace（）：除了打印的toString的信息外，还要打印堆栈信息
        * /


/**
 * @author Administrator
 */
public class TestYc {

    public static void main(String[] args) {
      try {
          FileReader fr=new FileReader("C:\\Users\\Administrator\\Desktop\\abc.txt");
      } catch (FileNotFoundException e) {
         //打印输出异常
          e.printStackTrace();
      }
     Mother mother=new Mother();
      mother.bbb();
      //打印输出异常
      //读取该路径"C:\Users\Administrator\Desktop\abc.txt"下的文件
        int [] arr=new int[]{1,2,3};
        System.out.println(arr[1]);

    }
}
    /**可以没有public，不是必须的*/
    class Mother{
      private Boy b=null;
      //构造器
      public Mother(){
           b=new Boy();

      }
      public void bbb(){
          //调用带有异常的方法
          try{
            b.aaa();
      } catch (FileNotFoundException e) {
              e.printStackTrace();
          }
      }
}
      class Boy{
      //throws 把异常抛给上层的调用者
          public void aaa () throws FileNotFoundException{
              FileReader fr=new FileReader("C:\\Users\\Administrator\\Desktop\\abc.txt");
          }

      }





