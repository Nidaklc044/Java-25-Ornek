
package ornek7aracınızkactlyaktı;

import java.util.Scanner;
public class Ornek7AracınızKacTlYaktı {

   
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in); ;
    System.out.println("Aracınız kac km gitti");
    double km=scanner.nextDouble();
     System.out.println("kilometre başı kac kurus yakıyor");
    double kurus=scanner.nextDouble();
    
    System.out.println("şu ana kadar kullanılan yakıt miktarı"+(km*kurus)+ "TL dir");
    }
    
}
