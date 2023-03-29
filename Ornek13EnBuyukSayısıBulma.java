
package ornek13enbuyuksayısıbulma;
import java.util.Scanner;
public class Ornek13EnBuyukSayısıBulma {

    public static void main(String[] args) {
     Scanner scanner=new Scanner(System.in);
System.out.println("1. sayıyı giriniz");
int a=scanner.nextInt();
System.out.println("2. sayıyı giriniz");
int b=scanner.nextInt();
System.out.println("3. sayıyı giriniz");
int c=scanner.nextInt();

int max=7;
if(a>=b && a>=c){
max=a;
}
else if (b>=a && b>=c){
   max=b;
}
else {
    max=c;}

System.out.println("max sayımız"+max);
    }
    
}
