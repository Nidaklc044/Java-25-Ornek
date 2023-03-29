
package ornek20tambolenler;

import java.util.Scanner;

public class Ornek20TamBolenler {

 
    public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
System.out.println("bir sayı giriniz");
int sayı=scanner.nextInt();
for( int i=1; i<=sayı;i++){


if( sayı%i==0){
    System.out.println(i + "");
}
}
    }
    
}
