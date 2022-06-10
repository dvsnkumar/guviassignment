import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
       
        Scanner obj = new Scanner(System.in);
        String num1 = ""+obj.next();
        int index1=0;
        int index2=0;
        String strEven="";
        String strOdd="";
        
        try{
            Integer.parseInt(""+num1);
        }catch(Exception e){
            System.out.println("Error");
        }
        
        List<String> lstEven = new ArrayList();
        List<String> lstOdd = new ArrayList();
        
        for(int index=0; index<num1.length(); index++){
            
            if((Integer.parseInt(""+num1.charAt(index)))%2==0){
                lstEven.add(""+Integer.parseInt(""+num1.charAt(index)));
            }else{
                lstOdd.add(""+Integer.parseInt(""+num1.charAt(index)));
            }
        }
        
        Collections.sort(lstEven);
        Collections.sort(lstOdd);
        
        for(String str:lstEven){
            
            if(index1==0){
                 strEven = strEven+str;
                 index1++;
            }else{
                 strEven = strEven+" "+str;
            }
        }
         index1=0;
         for(String str:lstOdd){
            
            if(index1==0){
                 strOdd = strOdd+str;
                 index1++;
            }else{
                 strOdd = strOdd+" "+str;
            }
        }
        
        
        System.out.println(strEven.trim());
        System.out.println(strOdd.trim());
    }
}