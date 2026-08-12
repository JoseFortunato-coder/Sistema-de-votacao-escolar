import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Votacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("===============================\n    CADASTRO DE CANDIDATOS    \n===============================\n\n");
        System.out.print("Quantos candidatos deseja cadastrar? ");
        int escolha_quantia_candidatos = scanner.nextInt();
        scanner.nextLine();
//--------------------------------------------------------------------------------------------------------------

        List<String> candidatos = new ArrayList<>();


        for (int i = 1; i <= escolha_quantia_candidatos; i++) {
            System.out.print("Digite o nome do candidato " + i + ": ");
            String nome = scanner.nextLine();
            candidatos.add(nome);
        }

        System.out.println("\n=== CANDIDATOS CADASTRADOS ===");
        for (int i = 0; i < candidatos.size(); i++) {
            System.out.println(candidatos.get(i));
        }

        //String primeiroNome = candidatos.get(0); //isso aq é para puxar o primeiro elemento, é só trocar o "0" por outro núimero para puxar outro candidato.
        //System.out.println("Primeiro: " + primeiroNome);

        scanner.close();
    }
}
