import java.io.*;
import java.util.*;
import java.util.Scanner;


public class project02code {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("通訊概論期末報告\n\n請輸入資料數");
        int numb = sc.nextInt();
        System.out.println("請輸入變異數");
        int num = sc.nextInt();
        System.out.println("請輸入平均值");
        int ave = sc.nextInt();
        String count="";

        for(int k=1;k<=numb/100;k++){
            Random r = new Random();
            for(int i=1;i<=100;i++){
                count=count+"\n"+(int)(r.nextGaussian()*Math.sqrt(num)+ave);
             }

            try{
                PrintWriter writer = new PrintWriter(new File("project02.csv"));
            
            
                writer.println(count);
                writer.flush();
              Thread.sleep((int) (50));
              Date date = new Date();
              System.out.println(date+"  資料已更新  "+k);
            }catch(Exception e){
                System.out.println("error");
                System.out.println(e);
            }
            
            
        }
        
  
        
        
    
    }
}
