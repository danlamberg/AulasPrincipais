public class Tarefa {
    
    private String descricao;
    private String statusConclusao;
    private String categoria;

    public Tarefa(String descricao, String statusConclusao, String categoria) {
        this.descricao = descricao;
        this.statusConclusao = statusConclusao;
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getStatusConclusao() {
        return statusConclusao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setStatusConclusao(String statusConclusao) {
        this.statusConclusao = statusConclusao;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void marcarConcluida(){
        this.statusConclusao = "Concluída";
    }

    @Override
    public String toString() {
        return "Tarefa [Descricao: " + descricao + ", Status: " + statusConclusao + ", Categoria: " + categoria
                + "]";
    }

    

    

}
