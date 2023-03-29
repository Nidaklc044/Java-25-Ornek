
package ornek14switchcase2;

import java.util.Scanner;

public class Ornek14SwitchCase2 {

 
    public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
String ıslemler ="1. toplama işlemi\n"
               + "2.cıkarma işlemi\n"
               + "3. carpma işlemi\n"
               + "4. bolme işlemi\n"
        +"5.islem kalan bulma";
                System.out.println(ıslemler);
                System.out.println("işlem seçiniz");
                String ıslem=scanner.nextLine();
                
  switch (ıslem)  {       
case"1":
System.out.println("1. sayı");
int a=scanner.nextInt();
System.out.println("2. sayı");
int b=scanner.nextInt();
System.out.println("toplam:" + (a+b));

  case"2":
System.out.println("1. sayı");
int c=scanner.nextInt();
System.out.println("2. sayı");
int d=scanner.nextInt();
System.out.println("cıkarma:" + (c-d));
  
  case"3":
System.out.println("1. sayı");
int e=scanner.nextInt();
System.out.println("2. sayı");
int f=scanner.nextInt();
System.out.println("carpma:" + (e*f));
  
  case"4":
System.out.println("1. sayı");
double g=scanner.nextDouble();
System.out.println("2. sayı");
double h=scanner.nextDouble();
System.out.println("bolme:" + (g/h));
  
  case"5":
System.out.println("1. sayı");
double l=scanner.nextDouble();
System.out.println("2. sayı");
double k =scanner.nextDouble();
System.out.println("kalan" + (l%k));
  }
    }
    
}
