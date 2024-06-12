import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Digite quantos alunos estão matriculados: ");
        Scanner entrada = new Scanner(System.in);
        int alunos = entrada.nextInt();

        switch(alunos)
        {
            case 10:
            case 20:
                System.out.println("Sala I-16");
            break;
            case 30:
                System.out.println("Sala I-22");
            default:
                System.out.println("Não tem sala");

    }

    entrada.close();
    }
}