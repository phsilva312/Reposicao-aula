import java.util.Random;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random rand = new Random();
        int x = rand.nextInt(10) + 1;
        int num = 0;

        for (x = x; x != num; x = x){
            System.out.println("Entre com um valor entre 1 e 10: ");
            num = entrada.nextInt();
            if (num > x) {
                System.out.println("Ops, um pouco menos");
            }else if (num < x){
                System.out.println("Ops, um pouco mais");
            }
        }
    }
}
