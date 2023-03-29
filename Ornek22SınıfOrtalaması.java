
package ornek22sınıfortalaması;

import java.util.Scanner;

public class Ornek22SınıfOrtalaması {

  
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

System.out.println("ögr sayısı giriniz");
int ogrSayısı=scanner.nextInt();

double ortYeni=0;
 for(int i=1; i<=ogrSayısı;i++){
     System.out.println("vize notunu giriniz");
int vize=scanner.nextInt();
System.out.println("final nounu giriniz");
int final1=scanner.nextInt();

     double ort=vize*0.4+final1*0.6;
     ortYeni=ortYeni+ort;
 }
 
System.out.println(ogrSayısı + " kişinin ortalaması " +ortYeni/ogrSayısı );
    }
    
}
