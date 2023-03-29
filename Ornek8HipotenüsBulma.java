
package ornek8hipotenüsbulma;

import java.util.Scanner;
public class Ornek8HipotenüsBulma {

    public static void main(String[] args) {
      Scanner scanner=new Scanner((System.in));
System.out.println("üçgenin bir uzunluğunu giriniz");
int ılkkenar=scanner.nextInt();
System.out.println("üçgenin ikinci kenarını giriniz");
int ikincikenar=scanner.nextInt();
double h=Math.sqrt(ılkkenar*ılkkenar + ikincikenar*ikincikenar);
  System.out.println("hipotenüs uzunlugunuz="+ h);

    }
    
}
