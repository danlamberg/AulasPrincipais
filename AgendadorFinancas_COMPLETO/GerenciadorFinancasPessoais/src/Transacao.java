import java.time.LocalDate;

public class Transacao {
    private String descricao;
    private double valor;
    private int tipoTransacao; // 1 - Receita, 2 - Despesa
    private LocalDate data;

    public Transacao(String descricao, double valor, int tipoTransacao, LocalDate data) {
        this.descricao = descricao;
        this.valor = valor;
        this.tipoTransacao = tipoTransacao;
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public int getTipoTransacao() {
        return tipoTransacao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setTipoTransacao(int tipoTransacao) {
        this.tipoTransacao = tipoTransacao;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Transacao [Descrição: " + descricao + ", Valor: " + valor + ", Tipo: " + tipoTransacao + ", Data: " + data + "]";
    }
}
