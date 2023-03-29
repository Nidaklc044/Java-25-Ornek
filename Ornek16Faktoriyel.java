
package ornek16faktoriyel;

import java.util.Scanner;
public class Ornek16Faktoriyel {

  
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
int fakt = 1;
System.out.println("bir sayı giriniz");


int sayı =scanner.nextInt();
for(int i = 1; i <= sayı; i++){
fakt = fakt *i;
}

System.out.println("fak="+fakt);
  
    }
    
}
