package Questao1;

public class Livro {
    private int codigo;
    private String nome;
    private short qtdExemplares;

    public Livro (int codigo, String nome, short qtdExemplares) {
        this.setCodigo(codigo);
        this.setNome(nome);
        this.setQtdExemplares(qtdExemplares);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public short getQtdExemplares() {
        return qtdExemplares;
    }

    public void setQtdExemplares(short qtdExemplares) {
        this.qtdExemplares = qtdExemplares;
    }
}
