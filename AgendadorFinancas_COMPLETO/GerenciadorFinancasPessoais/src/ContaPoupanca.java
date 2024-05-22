import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ContaPoupanca extends Conta {
    private double taxaRendimento;
    private LocalDate dataAniversario;

    public ContaPoupanca(String cpf, String nomeTitular, int numeroConta, int numeroAgencia, int codigoOperacao,
                         double saldo, double taxaRendimento, LocalDate dataAniversario) {
        super(cpf, nomeTitular, numeroConta, numeroAgencia, codigoOperacao, saldo);
        this.taxaRendimento = taxaRendimento;
        this.dataAniversario = dataAniversario;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public LocalDate getDataAniversario() {
        return dataAniversario;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    public void setDataAniversario(LocalDate dataAniversario) {
        this.dataAniversario = dataAniversario;
    }

    @Override
    public void consultarSaldo() {
        super.consultarSaldo();
    }

    @Override
    public void depositar(double valor) {
        super.depositar(valor);
    }

    @Override
    public void sacar(double valor) {
        super.sacar(valor);
    }

    // Método para aplicar rendimento com base na data de aniversário e taxa de rendimento
    public void aplicarRendimento() {
        LocalDate hoje = LocalDate.now();
        long meses = ChronoUnit.MONTHS.between(dataAniversario, hoje);
        if (meses > 0) {
            double novoSaldo = getSaldo() * Math.pow((1 + taxaRendimento / 100), meses);
            setSaldo(novoSaldo);
            dataAniversario = dataAniversario.plusMonths(meses);
            System.out.println("Rendimento aplicado. Novo saldo: R$ " + novoSaldo);
        } else {
            System.out.println("Ainda não completou um mês desde a última aplicação de rendimento.");
        }
    }
}
