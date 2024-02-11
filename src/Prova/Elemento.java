package Prova;

public class Elemento {

    private Elemento proximo;
    private Pessoa pessoa;

    public Elemento(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Elemento() {
    }

    public Elemento getProximo() {
        return proximo;
    }

    public void setProximo(Elemento proximo) {
        this.proximo = proximo;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String toString() {
        return "" + this.pessoa;
    }
}
