import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int NPA;
        int NP3;
        int NFA;

        System.out.println("Entre com a NPA: ");
        NPA = entrada.nextInt();

        if (NPA < 60 && NPA >= 30) {
            System.out.println("Ficou de NP3");
            System.out.println("Entre com a nota da NP3");
            NP3 = entrada.nextInt();
            NFA = (NPA + NP3)/2;
                if (NFA >=50) {
                    System.out.println("Nota da NFA: " + NFA);
                    System.out.println("Aluno aprovado");
                }else {
                    System.out.println("Nota da NFA: " + NFA);
                    System.out.println("Aluno reprovado");
                }
        }else if (NPA < 30){
            System.out.println("Aluno reprovou direto");
        }else {
            System.out.println("Aluno passou direto");
        }
    }
}
