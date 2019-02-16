package Exercicio2;
import java.util.Scanner;

public class Lata {

    public static void main(String[] args) {



        double volume,raio,altura;

        Scanner s = new Scanner(System.in);

        System.out.println("Digite o Raio da lata :");
        raio = s.nextDouble();

        System.out.println("Digite o Altura da lata :");
        altura = s.nextDouble();


        volume = 3.14 * (raio * raio) * altura;

        System.out.println("O volume da lata é: " + volume);

    }
}



