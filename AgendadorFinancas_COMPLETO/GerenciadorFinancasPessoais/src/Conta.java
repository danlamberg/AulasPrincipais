import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Conta implements OperacoesConta {
    private String cpf;
    private String nomeTitular;
    private int numeroConta;
    private int numeroAgencia;
    private int codigoOperacao;
    private double saldo;
    private List<Transacao> transacoes;

    public Conta(String cpf, String nomeTitular, int numeroConta, int numeroAgencia, int codigoOperacao, double saldo) {
        this.cpf = cpf;
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.codigoOperacao = codigoOperacao;
        this.saldo = saldo;
        this.transacoes = new ArrayList<>();
    }

    public String getCpf() {
        return cpf;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public int getCodigoOperacao() {
        return codigoOperacao;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setNumeroAgencia(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public void setCodigoOperacao(int codigoOperacao) {
        this.codigoOperacao = codigoOperacao;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta [CPF: " + cpf + ", Titular da conta: " + nomeTitular + ", Número da Conta: " + numeroConta
                + ", Número da Agência: " + numeroAgencia + ", Cod.Operação: " + codigoOperacao + ", Saldo: " + saldo + "]";
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado com sucesso!");
        System.out.println("Saldo atual: " + saldo);
        registrarTransacao("Depósito", valor, 1);
    }

    @Override
    public void sacar(double valor) {
        if (valor > saldo) {
            System.err.println("Saldo insuficiente para saque");
        } else {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
            registrarTransacao("Saque", valor, 2);
        }
    }

    public void adicionarTransacao(Transacao transacao) {
        transacoes.add(transacao);
    }

    public List<Transacao> getTransacoes() {
        return transacoes;
    }

    protected void registrarTransacao(String descricao, double valor, int tipoTransacao) {
        Transacao transacao = new Transacao(descricao, valor, tipoTransacao, LocalDate.now());
        adicionarTransacao(transacao);
    }
}
