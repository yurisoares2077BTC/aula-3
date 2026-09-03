// Fellipe Cera de Oliveira
import java.util.Scanner;
public class exercicio13 {
public static void main (String[] args){
Scanner scanner = new Scanner(System.in);

double Numero;

System.out.println("Digite um número");
Numero = scanner.nextDouble();

double Quadrado = Math.pow(Numero, 2);
double Cubo = Math.pow(Numero, 3);
double Raiz = Math.sqrt(Numero);
double Potencia =Math.pow(Numero, 10);

System.out.println("Resultado1 "+ Quadrado);
System.out.println("Resultado2 "+ Cubo);
System.out.println("Resultado3 "+ Raiz);
System.out.println("Resultado4 "+ Potencia);

scanner.close();








}
    
}
