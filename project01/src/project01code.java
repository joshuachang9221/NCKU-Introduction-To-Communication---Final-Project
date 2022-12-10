import java.io.*;
import java.util.*;
import java.util.Scanner;


public class project01code {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("通訊概論期末報告\n\n請輸入資料數");
        int count = sc.nextInt();
        System.out.println("請輸入變異數");
        int num = sc.nextInt();
        System.out.println("請輸入平均值");
        int num1 = sc.nextInt();
        int numb[] = new int[count+1];
        try{Thread.sleep((int) (2000)); 
            }catch(Exception e){}
        
        for(int i=0;i<count;i++){
            numb[i]=0;
            
        }
        for(int k=1;k<=(count/100);k++){
            Random r = new Random();
            for(int i=1;i<=100;i++){
                numb[((int)(r.nextGaussian()*Math.sqrt(num)+num1))]+=1;
             }

            try{
                PrintWriter writer = new PrintWriter(new File("project01.csv"));
              for(int i=1;i<=count;i++){
                if((numb[i]==0)){
                    continue;
                  }
                writer.println(i+","+numb[i]);

                  
              }
              
              
              
              writer.flush();
              Thread.sleep((int) (500)); 
            }catch(Exception e){
                System.out.println("error");
                System.out.println(e);
            }
            Date date = new Date();
            System.out.println(date+"  資料已更新  "+k);
        }
        
  
        
        
    
    }
}
