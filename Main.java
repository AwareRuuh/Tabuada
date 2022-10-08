import java.util.Scanner;

class Main {
  
 public static void main(String[] args) {
  Scanner sc1 = new Scanner(System.in);
  int valor;
  System.out.println("Digite a tabuada que deseja obter: ");
   valor = sc1.nextInt();
   for (int i = 1; i <= 10; i++) {
     System.out.println(valor + " x " + i + " = " + (valor*i));
   }
  }
}