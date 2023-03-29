
package ornek2hesapmakinesi;

import java.util.Scanner;


public class Ornek2HesapMakinesi {

    public static void main(String[] args) {
  
     int a;
        a = 12;
     int b ;
     b= 6;
     int toplam= a+b;
     int carpma=a*b;
     int bolme=a/b;
     int cıkarma=a-b;
     System.out.println("toplamları=" +toplam);
    System.out.println("carpmaları=" +carpma);
    System.out.println("bolme="+bolme);
    System.out.println("cıkarma="+cıkarma);
      Scanner scan =new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayi1=scan.nextInt();
        
     System.out.println("2. sayıyı giriniz");
     int sayi2=scan.nextInt();
     
     System.out.println("yapmak istediğiniz işlem nedir?");
     System.out.println("1.toplama");
     System.out.println("2. işlem çıkarma");
     System.out.println("3. işlem çarpma");
     System.out.println("4.işlem bolme");
     
     
     System.out.println("işleminizi giriniz");
     int secim=scan.nextInt();
     
if(secim==1){
System.out.println("toplama işleminin sonucu= " +(sayi1 + sayi2));}

else if(secim==2){
    System.out.println("cıkarma işleminin sonucu= " + (sayi1- sayi2));
}
else if (secim==3){
    System.out.println("carpma işleminin sonucu="+(sayi1*sayi2));
}
else
    System.out.println("bolme işleminin sonucu=" +(sayi1/sayi2));
    }
 
}
    
    

