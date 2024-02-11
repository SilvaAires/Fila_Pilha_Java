package Prova;

public class Fila {

    private Elemento inicio;
    boolean alternancia;

    public void enfileirar(Pessoa p) {

        if (this.inicio == null) {
            this.inicio = new Elemento(p);
        } else {

            if (p.getIdade() > this.inicio.getPessoa().getIdade()) {
                Elemento e = new Elemento(p);
                e.setProximo(this.inicio);
                this.inicio = e;
            } else {
                Elemento e = this.inicio;
                while (e.getProximo() != null && p.getIdade() <= e.getProximo().getPessoa().getIdade()) {
                    e = e.getProximo();
                }
                Elemento novoElemento = new Elemento(p);
                novoElemento.setProximo(e.getProximo());
                e.setProximo(novoElemento);
            }
        }
    }

    public Pessoa desenfileirar() {
        if (this.inicio == null) {
            return null;
        } else {
            this.alternancia = true;
            if (alternancia == true) {
                Elemento e = this.inicio;
                this.inicio = e.getProximo();
               // this.alternancia = false;
                while ((e.getProximo().getPessoa().getIdade() > 65) || (e.getPessoa().getIdade() > 65)) {
                    e = e.getProximo();
                }

                this.inicio = e.getProximo();
                this.alternancia = true;
                while ((e.getProximo().getPessoa().getIdade() < 65) || (e.getPessoa().getIdade() < 65)) {
                    e = e.getProximo();

                    return e.getPessoa();
                }
            }
        }
        return null;
    }

    public void listar() {
        if (this.inicio != null) {
            Elemento e = this.inicio;
            System.out.println(e);
            while (e.getProximo() != null) {
                e = e.getProximo();
                System.out.println(e.getPessoa());
            }
        } else {
            System.out.println("Vazio");
        }
    }
}
