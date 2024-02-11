package Pilha;

public class Paciente {
    private String nome;
    private int idade;
    private String CPF;
    private String endereco;
    private Paciente proximo;

    public Paciente() {
    }

    public Paciente(String nome, int idade, String CPF, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.CPF = CPF;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Paciente getProximo() {
        return proximo;
    }

    public void setProximo(Paciente proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "Paciente{" + "nome=" + nome + ", idade=" + idade + ", CPF=" + CPF + ", endereco=" + endereco + '}';
    }
    
}

