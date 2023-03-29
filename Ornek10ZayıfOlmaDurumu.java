
package ornek10zayıfolmadurumu;

import java.util.Scanner;
public class Ornek10ZayıfOlmaDurumu {

    
    public static void main(String[] args) {
    

Scanner scanner=new Scanner(System.in);
 System.out.println("kilonuzu giriniz");
 int kilo=scanner.nextInt();
 
 System.out.println("Boyunuzu giriniz");
 double boy=scanner.nextDouble();
 
 double bkı=kilo/(boy*boy);
 System.out.println("boy kilo endeksiniz:"+bkı);
 
 if (bkı<20){
     System.out.println("zayıf");
 }
 else if(bkı<22){
     System.out.println("orta kilolu");
 }
 else
     System.out.println("kilolu");
    }
    
}
