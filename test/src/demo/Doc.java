package demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * @author Administrator
 */
public class Doc {
    public static void readTxtFile(String filepath) {
   try{
         String encoding="UTF-8";
         File file=new File(filepath);
       //判断文件是否存在
         if(file.isFile()&&file.exists()){
             //考虑到编码格式
             InputStreamReader read=new InputStreamReader(new FileInputStream(file),encoding);
             BufferedReader bufferedReader=new BufferedReader(read);
             String lineTxt=null;
             while ((lineTxt=bufferedReader.readLine())!=null){
                 System.out.println(lineTxt);
             }
             read.close();
         }else {
                 System.out.println("找不到指定的文件");
         }
   } catch (Exception e) {
                 System.out.println("读取文件内容出错");
                 e.printStackTrace();
   }
    }

    public static void main(String[] args) {
        String filePath="C:\\Users\\Administrator\\Desktop\\abc.txt";
        readTxtFile(filePath);
    }
}
