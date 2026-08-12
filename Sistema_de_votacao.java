import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

class Votacao {

    static int escolha_voto;

    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            int escolha_quantia_candidatos;
            System.out.print("===============================\n    CADASTRO DE CANDIDATOS    \n===============================\n\n");
            System.out.print("Quantos candidatos deseja cadastrar? ");

            escolha_quantia_candidatos = scanner.nextInt();
            scanner.nextLine();


            List<String> candidatos = new ArrayList<>();


            for (int i = 1; i <= escolha_quantia_candidatos; i++) {
                System.out.print("Digite o nome do candidato " + i + ": ");
                String nome = scanner.nextLine();
                candidatos.add(nome);
            }

            System.out.println("\n=== CANDIDATOS REGISTRADOS ===");
            for (int i = 0; i < candidatos.size(); i++) {
                System.out.print("\n");
                System.out.print("Nome: " + candidatos.get(i));
            }

//---------------------------------------------------------------------------------------------------------------

            System.out.println("\n\n=== INICIAR VOTAÇÃO ===");
            for (int i = 0; i < candidatos.size(); i++) {
                System.out.println("\nCandidato: " + i);
                System.out.print("Nome: " + candidatos.get(i));
            }


            System.out.println("\n\nDigite 0 para sair e 1 para continuar a votação");
            double continuar = scanner.nextDouble();
            scanner.nextLine();

            if (continuar == 1) {
                for (int i = 0; i < candidatos.size(); i++) {
                    System.out.println("\nFaça o seu voto de 0 a " + escolha_quantia_candidatos + ":");
                    escolha_voto = Integer.parseInt(scanner.nextLine());

                }
            } else {
                System.out.println("Saindo...");
            }

                scanner.close();


        }catch (Exception e) {
            System.out.println("Faça uma digitação valida, sem números quando se usa só texto.");

        }
    }
}
