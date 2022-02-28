import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner quantidade = new Scanner(System.in);
        int rodada1 = quantidade.nextInt();
        int rodada2 = quantidade.nextInt();
        int rodada3 = quantidade.nextInt();

        int soma = rodada1+rodada2+rodada3;
        int media = soma/3;

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);


    }
}
