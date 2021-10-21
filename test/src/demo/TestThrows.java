package demo;




/**
 * @author Administrator
 */
public class TestThrows {
        public static void function() throws NumberFormatException {
            String s = "abc";
            System.out.println(Double.parseDouble(s));
        }

        public static void main(String[] args) {
            //try catch：自己处理异常
            try {
                //可能出现异常的代码
                function();
                     //异常类名A类型，可自定义其他类型
            } catch (NumberFormatException e) {  //catch可以有多个
                  //如果出现了异常类A类型的异常，那么执行该代码
               System.err.println("非数据类型不能强制类型转换。");
                //e.printStackTrace();
            }

        }
    }