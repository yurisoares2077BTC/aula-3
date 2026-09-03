// yuri soares da silva

import java.util.Scanner;

public class exercicio12 {
public static void main ( String[] args) {
Scanner scanner = new Scanner(System.in);

int AN;
int AA;



System.out.println("Digite seu ano de Nascimento");
AN = scanner.nextInt();

System.out.println("Digite o ano atual");
AA = scanner.nextInt();

int I = AA-AN;
int I2030 = 2030-AN;

System.out.println("Sua idade é " + I);
System.out.println("Sua idade em 2030 é " + I2030);

scanner.close();






}
    
}
