import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDate;


public class SistemaFinanceiro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Conta> contas = new ArrayList<>();

        System.out.println("Bem-vindo ao Gerenciador de Finanças Pessoais");

        while (true) {
            System.out.println("Selecione uma opção:");
            System.out.println("1. Criar Conta");
            System.out.println("2. Acessar Conta");
            System.out.println("3. Sair");
            int opcaoPrincipal = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do scanner

            if (opcaoPrincipal == 1) {
                System.out.println("Selecione o tipo de conta:");
                System.out.println("1. Conta Corrente");
                System.out.println("2. Conta Poupança");
                int tipoConta = scanner.nextInt();
                scanner.nextLine(); // Limpa o buffer do scanner

                System.out.println("Digite o CPF do titular:");
                String cpf = scanner.nextLine();

                System.out.println("Digite o nome do titular:");
                String nomeTitular = scanner.nextLine();

                System.out.println("Digite o número da conta:");
                int numeroConta = scanner.nextInt();

                System.out.println("Digite o número da agência:");
                int numeroAgencia = scanner.nextInt();

                System.out.println("Digite o código da operação:");
                int codigoOperacao = scanner.nextInt();

                System.out.println("Digite o saldo inicial: R$ ");
                double saldo = scanner.nextDouble();

                if (tipoConta == 1) {
                    System.out.println("Digite a taxa de juros:");
                    double taxaJuros = scanner.nextDouble();
                    System.out.println("Digite o limite do cheque especial:");
                    double limiteChequeEspecial = scanner.nextDouble();
                    contas.add(new ContaCorrente(cpf, nomeTitular, numeroConta, numeroAgencia, codigoOperacao, saldo, taxaJuros, limiteChequeEspecial));
                } else if (tipoConta == 2) {
                    System.out.println("Digite a taxa de rendimento mensal (em %):");
                    double taxaRendimento = scanner.nextDouble();
                    System.out.println("Digite a data de aniversário (formato: AAAA-MM-DD):");
                    scanner.nextLine(); // Limpa o buffer do scanner
                    String dataAniversarioStr = scanner.nextLine();
                    LocalDate dataAniversario = LocalDate.parse(dataAniversarioStr);
                    contas.add(new ContaPoupanca(cpf, nomeTitular, numeroConta, numeroAgencia, codigoOperacao, saldo, taxaRendimento, dataAniversario));
                } else {
                    System.out.println("Opção inválida.");
                    continue;
                }

                System.out.println("Conta criada com sucesso!");

            } else if (opcaoPrincipal == 2) {
                if (contas.isEmpty()) {
                    System.out.println("Nenhuma conta cadastrada.");
                    continue;
                }

                System.out.println("Digite o número da conta:");
                int numeroConta = scanner.nextInt();
                Conta conta = null;
                for (Conta c : contas) {
                    if (c.getNumeroConta() == numeroConta) {
                        conta = c;
                        break;
                    }
                }

                if (conta == null) {
                    System.out.println("Conta não encontrada.");
                    continue;
                }

                RelatorioFinanceiro relatorio = new RelatorioFinanceiro(contas);

                boolean acessandoConta = true;
                while (acessandoConta) {
                    System.out.println("Selecione uma opção:");
                    System.out.println("1. Depositar");
                    System.out.println("2. Sacar");
                    System.out.println("3. Consultar Saldo");
                    System.out.println("4. Gerar Relatório de Transações");
                    System.out.println("5. Aplicar Rendimento (somente para Conta Poupança)");
                    System.out.println("6. Voltar ao menu principal");

                    int opcao = scanner.nextInt();
                    switch (opcao) {
                        case 1:
                            System.out.println("Digite o valor a ser depositado: R$");
                            double valorDeposito = scanner.nextDouble();
                            conta.depositar(valorDeposito);
                            break;
                        case 2:
                            System.out.println("Digite o valor a ser sacado: R$ ");
                            double valorSaque = scanner.nextDouble();
                            conta.sacar(valorSaque);
                            break;
                        case 3:
                            conta.consultarSaldo();
                            break;
                        case 4:
                            relatorio.gerarRelatorio();
                            break;
                        case 5:
                            if (conta instanceof ContaPoupanca) {
                                ((ContaPoupanca) conta).aplicarRendimento();
                            } else {
                                System.out.println("Esta opção é válida apenas para Conta Poupança.");
                            }
                            break;
                        case 6:
                            acessandoConta = false;
                            System.out.println("Voltando ao menu principal...");
                            break;
                        default:
                            System.out.println("Opção inválida. Tente novamente.");
                    }
                }
            } else if (opcaoPrincipal == 3) {
                System.out.println("Saindo...");
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
