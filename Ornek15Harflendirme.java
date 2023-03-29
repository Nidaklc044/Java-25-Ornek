
package ornek15harflendirme;
import java.util.Scanner;
public class Ornek15Harflendirme {

    public static void main(String[] args) {
     Scanner scanner=new Scanner(System.in);
System.out.println("vize notunu giriniz");
int vize =scanner.nextInt();
System.out.println("final notunu giriniz");
int fınal =scanner.nextInt();
double top =(vize*0.3 ) +(fınal*0.6);

if(top >=70) {
    System.out.println("AA");
}
else if (top>50)
 {
    System.out.println("BB");}
else
    System.out.println( "kaldı");  
    }
    
}
