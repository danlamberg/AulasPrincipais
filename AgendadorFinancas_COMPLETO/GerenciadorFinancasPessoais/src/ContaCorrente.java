public class ContaCorrente extends Conta {
    private double taxaJuros;
    private double limiteChequeEspecial;

    public ContaCorrente(String cpf, String nomeTitular, int numeroConta, int numeroAgencia, int codigoOperacao,
                         double saldo, double taxaJuros, double limiteChequeEspecial) {
        super(cpf, nomeTitular, numeroConta, numeroAgencia, codigoOperacao, saldo);
        this.taxaJuros = taxaJuros;
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Saldo atual: R$ " + getSaldo());
        System.out.println("Limite do cheque especial disponível: R$ " + limiteChequeEspecial);
    }

    @Override
    public void sacar(double valor) {
        double saldoAtual = getSaldo();
        if (valor <= saldoAtual) {
            super.sacar(valor);
        } else {
            double valorNecessario = valor - saldoAtual;
            if (valorNecessario <= limiteChequeEspecial) {
                setSaldo(0);
                limiteChequeEspecial -= valorNecessario;
                System.out.println("Saque realizado usando o limite do cheque especial. Novo limite disponível: R$ " + limiteChequeEspecial);
                registrarTransacao("Saque com uso do cheque especial", valor, 2);
            } else {
                System.out.println("Saldo insuficiente, mesmo com o limite do cheque especial.");
            }
        }
    }
}
