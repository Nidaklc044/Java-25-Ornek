
package ornek21bolunebilme;


import java.util.Scanner;
public class Ornek21Bolunebilme {

   
    public static void main(String[] args) {
 Scanner scanner=new Scanner(System.in);
System.out.println("bir sayı giriniz");
int sayı=scanner.nextInt();
int bolen=scanner.nextInt();
int deger=sayı;

if(bolen<=sayı && sayı%bolen==0){
    
    System.out.println(deger+" sayısı"+bolen+" e bolunur");
}
else
    System.out.println(deger + "sayısı  "+  bolen + "sayısına bölünmez.");

bolen++;
    }
    
}
