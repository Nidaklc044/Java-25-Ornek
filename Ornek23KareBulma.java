
package ornek23karebulma;

import java.util.Scanner;
public class Ornek23KareBulma {

 
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
System.out.println("bir sayı giriniz");
int sayı=scanner.nextInt();
int karesi=1;
for(int i=1; i<=sayı;i++){
karesi=sayı*sayı;}
System.out.println(karesi);
    }
    
}
