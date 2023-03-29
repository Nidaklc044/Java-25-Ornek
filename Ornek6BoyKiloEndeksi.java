
package ornek6boykiloendeksi;
import java.util.Scanner;
public class Ornek6BoyKiloEndeksi {

  
    public static void main(String[] args) {
 Scanner scanner=new Scanner(System.in);
 System.out.println("kilonuzu giriniz");
 int kilo=scanner.nextInt();
 
 System.out.println("Boyunuzu giriniz");
 double boy=scanner.nextDouble();
 
 double bkı=kilo/(boy*boy);
 System.out.println("boy kilo endeksiniz:"+bkı);
    }
    
}
