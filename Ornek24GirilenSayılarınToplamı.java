
package ornek24girilensayılarıntoplamı;


import java.util.Scanner;
public class Ornek24GirilenSayılarınToplamı {

   
    public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
System.out.println("bir sayı giriniz");
int sayi=scanner.nextInt();
int toplam=0;
for(int i=1;i<=sayi;i++){
  toplam=toplam+i;  
}
System.out.println(toplam);


    }
    
}
