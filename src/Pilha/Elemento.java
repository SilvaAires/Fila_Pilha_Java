package Pilha;

public class Elemento {
    private Elemento proximo;
    private String info;
    public char c;
    private Paciente p;

    public Paciente getP() {
        return p;
    }

    public void setP(Paciente p) {
        this.p = p;
    }

    public Elemento(Paciente p) {
        this.p = p;
    }

    public Elemento(String info) {
        this.info = info;
    }

    public Elemento(char c) {
        this.c = c;
    }

    public Elemento() {
    }

    public Elemento getProximo() {
        return proximo;
    }

    public void setProximo(Elemento proximo) {
        this.proximo = proximo;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public char getC() {
        return c;
    }

    public void setC(char c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Elemento{" + "proximp=" + proximo + ", info=" + info + ", c=" + c + '}';
    }
}
