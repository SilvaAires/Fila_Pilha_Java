package Fila;

public class Elemento {
    private Paciente p;
    private Elemento proximo;

    public Elemento() {
    }

    public Elemento(Paciente p) {
        this.p = p;
    }

    public Paciente getP() {
        return p;
    }

    public void setP(Paciente p) {
        this.p = p;
    }

    public Elemento getProximo() {
        return proximo;
    }

    public void setProximo(Elemento proximo) {
        this.proximo = proximo;
    }

    public String toString() {
        return "Elemento{" + "p=" + p + '}';
    }
    
}
