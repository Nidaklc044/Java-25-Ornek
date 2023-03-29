
package ornek11negatifpozitifolmadurumu;
import java.util.Scanner;
public class Ornek11NegatifPozitifOlmaDurumu {


    public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
System.out.println("bir sayı giriniz");
int sayı=scanner.nextInt();
 if(sayı<0){
     System.out.println("Negatif");
 }
 else if(sayı==0){
     System.out.println("Sayı 0 dır");
 }
 else
     System.out.println("Sayı pozitiftir");
    }
    
}
