package Pilha;

public class Main {
    public static void main (String [] args){
        Pilha p = new Pilha();
        Paciente pac = new Paciente("Thiago", 22, "01", "Rua");
        Paciente pac1 = new Paciente("Ryan", 23, "02", "Casa");
        Paciente pac2 = new Paciente("Silva", 24, "03", "Numero");
        Paciente pac3 = new Paciente("Aires", 25, "04","Bairo");
        p.empilharPac(pac);
        p.empilharPac(pac1);
        p.empilharPac(pac2);
        p.empilharPac(pac3);
        p.listarPac();
        System.out.println(p.topoPac());
        System.out.println(p.tamanho());
        System.out.println(p.vazia());
        System.out.println("");
        Paciente vetor[] = new Paciente[p.tamanho()];
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = p.desempilharPac();
        }
        for (int i = 3; i>-1; i --){
            System.out.println(vetor[i]);
        }
        System.out.println(p.tamanho());
        System.out.println(p.vazia());
        
        
        /*Scanner e = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String frase = e.nextLine();
        
        for (int i = 0; i < frase.length(); i++){
            p.empilharChar(frase.charAt(i));
        }
        
        String inv = "";
        while (!p.vazia()) {
            inv += p.desempilharChar();
        }
        if (frase.equals(inv)) {
            System.out.println("Palíndromo");
        } else {
            System.out.println("Não Palíndromo");
        }*/

    }
}
