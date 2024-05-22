import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    private static List<Tarefa> tarefas = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opcao;

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Remover Tarefa");
            System.out.println("3. Marcar Tarefa como Concluída");
            System.out.println("4. Listar Todas as Tarefas");
            System.out.println("5. Listar Tarefas por Categoria");
            System.out.println("6. Sair");
            opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    adicionarTarefa(scanner);
                    break;

                case "2":
                    removerTarefa(scanner);
                    break;

                case "3":
                    marcarTarefaConcluida(scanner);
                    break;

                case "4":
                    listarTarefas();
                    break;

                case "5":
                    listarTarefasPorCategoria(scanner);
                    break;

                case "6":
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (!opcao.equals("6"));

        scanner.close();
    }

    private static void adicionarTarefa(Scanner scanner) {
        System.out.println("Digite a descrição da tarefa:");
        String descricao = scanner.nextLine();
        System.out.println("Digite a categoria da tarefa:");
        String categoria = scanner.nextLine();
        Tarefa novaTarefa = new Tarefa(descricao, "Pendente", categoria);
        tarefas.add(novaTarefa);
    }

    private static void removerTarefa(Scanner scanner) {
        System.out.println("Digite a descrição da tarefa a ser removida:");
        String descricao = scanner.nextLine();
        Tarefa tarefaRemover = tarefas.stream()
                .filter(tarefa -> tarefa.getDescricao().equalsIgnoreCase(descricao))
                .findFirst()
                .orElse(null);
        if (tarefaRemover != null) {
            tarefas.remove(tarefaRemover);
            System.out.println("Tarefa removida com sucesso.");
        } else {
            System.out.println("Tarefa não encontrada.");
        }
    }

    private static void marcarTarefaConcluida(Scanner scanner) {
        System.out.println("Digite a descrição da tarefa a ser marcada como concluída:");
        String descricao = scanner.nextLine();
        Tarefa tarefaConcluir = tarefas.stream()
                .filter(tarefa -> tarefa.getDescricao().equalsIgnoreCase(descricao))
                .findFirst()
                .orElse(null);
        if (tarefaConcluir != null) {
            tarefaConcluir.marcarConcluida();
            System.out.println("Tarefa marcada como concluída.");
        } else {
            System.out.println("Tarefa não encontrada.");
        }
    }

    private static void listarTarefas() {
        System.out.println("Listando todas as tarefas:");
        for (Tarefa tarefa : tarefas) {
            System.out.println(tarefa);
        }
    }

    private static void listarTarefasPorCategoria(Scanner scanner) {
        System.out.println("Digite a categoria:");
        String categoria = scanner.nextLine();
        List<Tarefa> tarefasFiltradas = tarefas.stream()
                .filter(tarefa -> tarefa.getCategoria().equalsIgnoreCase(categoria))
                .collect(Collectors.toList());
        System.out.println("Listando tarefas da categoria " + categoria + ":");
        for (Tarefa tarefa : tarefasFiltradas) {
            System.out.println(tarefa);
        }
    }
}
