
import java.util.Scanner;
public class nachoele {
    public static void main(String[] args) {
        System.out.println("Vamos a sumar");
        int n1=0, n2=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el numero uno");
        n1=sc.nextInt();
        System.out.println("ingrese el numero dos");
        n2=sc.nextInt();
        System.out.println(suma(n1, n2));


    }
    
  public static int suma (int n1 , int n2){
    return n1+n2;
  }
}
