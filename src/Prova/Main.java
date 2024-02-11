package Prova;

public class Main {

    public static void main(String[] args) {
        System.out.println("Fila de Pessoas:\n");

        Fila f = new Fila();
        f.enfileirar(new Pessoa("Lilica", 13));
        f.enfileirar(new Pessoa("Maria", 66));
        f.enfileirar(new Pessoa("Carlos", 72));
        f.enfileirar(new Pessoa("João", 56));
        f.enfileirar(new Pessoa("Eduardo", 42));
        f.enfileirar(new Pessoa("José", 30));
        f.enfileirar(new Pessoa("Elena", 68));
        f.enfileirar(new Pessoa("Júlio", 31));
        f.enfileirar(new Pessoa("Eduarda", 70));

        f.listar();
/*
        System.out.println("\nDesenfileirando...\n");
        System.out.println(f.desenfileirar());
        System.out.println(f.desenfileirar());
        System.out.println(f.desenfileirar());
        System.out.println(f.desenfileirar());
        System.out.println(f.desenfileirar());
        System.out.println(f.desenfileirar());
        System.out.println(f.desenfileirar());
        System.out.println(f.desenfileirar());
        System.out.println(f.desenfileirar());*/
    }
}
