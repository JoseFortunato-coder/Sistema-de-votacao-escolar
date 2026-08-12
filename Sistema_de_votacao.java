import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class SistemaVotacao {

    static int escolha_voto;

    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            int escolha_quantia_candidatos;
            int eleitores = 30;
                System.out.print("===============================\n    CADASTRO DE CANDIDATOS    \n===============================\n\n");
                System.out.print("Quantos candidatos deseja cadastrar? Só são permitidos 5. ");

                escolha_quantia_candidatos = scanner.nextInt();
                scanner.nextLine();

            if (escolha_quantia_candidatos < 6) {
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
                int[] votos = new int[eleitores];
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
                        int diferenca = votos[i] - votos[i + 1];
                    }
//-------------------------------------------------------------------------------------------------------
                    int maiorQtdVotos = -1;
                    String nomeVencedor = "";

                    for (int i = 0; i < candidatos.size(); i++) {
                        int votosDoCandidato = votos[i];

                        if (votosDoCandidato > maiorQtdVotos) {
                            maiorQtdVotos = votosDoCandidato;
                            nomeVencedor = candidatos.get(i);
                        }
                    }

                    System.out.println("\nO candidato vencedor foi: " + nomeVencedor);

                } else {
                    System.out.println("Saindo...");
                }

                scanner.close();
            } else if (escolha_quantia_candidatos > 5) {
                System.out.println("Só são permitidos 5 candidatos");
            }

        }catch(Exception e){
                System.out.println("Faça uma digitação valida, sem números quando se usa só texto.");

            }

    }
}
