
package ornek5scanner;

import java.util.Scanner;

public class Ornek5Scanner {

 
    public static void main(String[] args) {


 Scanner scanner=new Scanner(System.in);
System.out.println("Lütfen yaşınızı giriniz?");
int yaş=scanner.nextInt();
System.out.println("yaşınız:" + yaş);
System.out.println("dogum yılınızı giriniz:");
int dogum= scanner.nextInt();
System.out.println("dogum yılınız:" + dogum);

System.out.println("ondalıklı bir sayı giriniz");
double sayı=scanner.nextDouble();
System.out.println("sayınız:" + sayı);

System.out.println("adınızı giriniz");
String isim =scanner.nextLine();
System.out.println("isminiz;" + isim);
    }
    
}
