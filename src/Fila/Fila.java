package Fila;

public class Fila {
    private Elemento inicio;
    
    public void enfileirar(Paciente p){
        if(this.inicio == null){
            this.inicio = new Elemento(p);
        }else{
            Elemento e = this.inicio;
            while (e.getProximo() != null){
                e = e.getProximo();
            }
            e.setProximo(new Elemento(p));
        }
    }
    
    public Paciente desenfileirar(){
        if (this.inicio == null){
            return null;
        }else{
            Elemento e = this.inicio;
            this.inicio = e.getProximo();
            return e.getP();
        }
    }
    
    public Paciente inicio(){
        if(this.inicio == null){
            return null;
        }else{
            Elemento e = this.inicio;
            return e.getP();
        }
    }
    
    public int verificaPos(String nome){
        Elemento e = this.inicio;
        if (this.inicio == null){
            System.out.println("Lista vazia!");
            return 0;
        }else{
            int cont = 1;
            //(e.getProximo().getP().getNome().toLowerCase() != (nome.toLowerCase()))
            
            while (e.getProximo() != null && !e.getP().getNome().equalsIgnoreCase(nome)){
                e = e.getProximo();
                cont ++;
            }
            return cont;
        }
    }
    
    public int tamanho(){
        if (this.inicio == null){
            return 0;
        }else{
            int cont = 1;
            Elemento e = this.inicio;
            while(e.getProximo() != null){
                cont ++;
                e = e.getProximo();
            }
            return cont;
        }
    }
    
    public boolean vazia(){
        if (this.inicio == null){
            return true;
        }else{
            return false;
        }
    }
    
}
