import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner quantidadeAlunos = new Scanner(System.in);
        int alunos;

        System.out.println("Entre com a quantidade de alunos: ");
        alunos = quantidadeAlunos.nextInt();

        switch (alunos){
            case 10:
                System.out.println("Sala a ser utilizada: 1-15");
                break;
            case 20:
                System.out.println("Sala a ser utilizada: 1-15");
                break;
            case 30:
                System.out.println("Sala a ser utilizada: 1-22");
                break;
            default:
                System.out.println("Não foi possível encontrar uma sala compatível.");
                break;
        }
    }
}
