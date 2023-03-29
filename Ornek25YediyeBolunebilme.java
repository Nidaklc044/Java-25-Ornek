
package ornek25yediyebolunebilme;


import java.util.Scanner;
public class Ornek25YediyeBolunebilme {

   
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
System.out.println("bir sayı giriniz");
int sayı=scanner.nextInt();
int deger=sayı;
int bolen=7;
if(bolen<=sayı && sayı%bolen==0){
    
    System.out.println(deger+" sayısı"+bolen+" e bolunur");
}
else
    System.out.println(deger + "sayısı  "+  bolen + "sayısına bölünmez.");

bolen++;
    }
    
}
