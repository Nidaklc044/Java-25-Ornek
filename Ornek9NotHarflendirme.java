
package ornek9notharflendirme;

import java.util.Scanner;
public class Ornek9NotHarflendirme {

    public static void main(String[] args) {
   Scanner scanner=new Scanner(System.in);
System.out.println("Bir not giriniz");
int not=scanner.nextInt();
 if( not>90) {
     System.out.println("AA");
 }
 
 else if (not> 70){
        System.out.println("BB");
    }
 else
     System.out.println("kaldı");
    }
    
}
