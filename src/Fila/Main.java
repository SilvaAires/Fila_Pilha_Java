package Fila;

public class Main {
    public static void main(String [] args){
        Fila fila = new Fila();
        Paciente p = new Paciente();
        p.setCPF("023.123.321-00");
        p.setEndereco("Rua Sete");
        p.setIdade(23);
        p.setNome("Thiago");
        Paciente g = new Paciente("Pedro", 23, "456.654.789-63","Rua Nove");
        fila.enfileirar(p);
        fila.enfileirar(g);
        int a = fila.tamanho();
        Paciente vetor [] = new Paciente[fila.tamanho()];
        
        System.out.println(fila.inicio());
        System.out.println(a);
        System.out.println(fila.verificaPos("Thiago"));
        System.out.println(fila.desenfileirar());
        System.out.println(fila.vazia());
        System.out.println(fila.desenfileirar());
        
        System.out.println(fila.inicio());
        
    }
}
