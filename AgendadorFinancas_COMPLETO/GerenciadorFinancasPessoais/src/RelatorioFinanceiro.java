import java.util.List;

public class RelatorioFinanceiro {
    private List<Conta> contas;

    public RelatorioFinanceiro(List<Conta> contas) {
        this.contas = contas;
    }

    public void gerarRelatorio() {
        for (Conta conta : contas) {
            System.out.println("Relatório para a conta: " + conta.getNumeroConta());
            System.out.println("Saldo atual: " + conta.getSaldo());
            List<Transacao> transacoes = conta.getTransacoes();
            if (transacoes.isEmpty()) {
                System.out.println("Nenhuma transação registrada.");
            } else {
                for (Transacao transacao : transacoes) {
                    System.out.println(transacao);
                }
            }
            System.out.println("======================================");
        }
    }
}
