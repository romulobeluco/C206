import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o número de lanches da primeira hora: ");
        int lanche1 = entrada.nextInt();
        System.out.println("Digite o número de lanches da segunda hora: ");
        int lanche2 = entrada.nextInt();
        System.out.println("Digite o número de lanches da terceira hora: ");
        int lanche3 = entrada.nextInt();

        int total = lanche2 + lanche1 + lanche3;
        float media = total / 3.0f;

        System.out.println("O total de lanches foi: " + total);
        System.out.println("A media de lanches foi: " + media);

        entrada.close();
    }
}
