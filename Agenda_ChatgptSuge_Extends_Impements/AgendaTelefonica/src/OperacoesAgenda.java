public interface OperacoesAgenda {
    void adicionarContato(Contato contato);
    void removerContato(String nome);
    void listarContatos();
    Contato buscarContato(String nome);
}
