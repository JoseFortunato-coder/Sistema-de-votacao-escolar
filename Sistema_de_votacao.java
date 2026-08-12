import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Votacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("===============================\n    CADASTRO DE CANDIDATOS    \n===============================\n\n");

        System.out.print("Quantos candidatos deseja cadastrar?");
        int escolha_quantia_candidatos = scanner.nextInt();

        for (int i = 1; i <= escolha_quantia_candidatos; i++) {
            System.out.println("\nCandidato");


            scanner.close();
        }
    }
}
