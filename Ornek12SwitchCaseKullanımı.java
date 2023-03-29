
package ornek11switchcasekullanımı;
import java.util.Scanner;
public class Ornek12SwitchCaseKullanımı {

   
    public static void main(String[] args) {
        
Scanner scanner=new Scanner(System.in);
System.out.println("işlem");
int işlem=scanner.nextInt();
switch(işlem){
    case 1:
        System.out.println("işlem 1");
        break;
    case 2:
        System.out.println("işlem 2");
        break;
    default:
        System.out.println("gecersiz işlem");
        break;
    
       
    }
    
}
