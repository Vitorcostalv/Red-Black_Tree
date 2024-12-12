import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SearchEngine searchEngine = new SearchEngine();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Adicionar número");
            System.out.println("2. Buscar número");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Digite o número para adicionar: ");
                    int numToAdd = scanner.nextInt();
                    searchEngine.add(numToAdd);
                    System.out.println("Número adicionado!");
                    break;
                case 2:
                    System.out.print("Digite o número para buscar: ");
                    int numToSearch = scanner.nextInt();
                    boolean found = searchEngine.find(numToSearch);
                    System.out.println(found ? "Número encontrado!" : "Número não encontrado!");
                    break;
                case 3:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
