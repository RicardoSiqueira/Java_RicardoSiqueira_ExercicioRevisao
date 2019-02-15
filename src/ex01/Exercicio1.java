package ex01;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {


    double consumo, gorgeta, totalconta;
    Scanner s = new Scanner(System.in);
        System.out.println("Digite o consumo :");
    consumo = s.nextDouble();

    gorgeta = consumo * 0.1;
    totalconta = gorgeta + consumo;

        System.out.println("O total da conta é: " + totalconta);

}

}





