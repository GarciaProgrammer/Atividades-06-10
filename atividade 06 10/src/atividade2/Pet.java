
package atividade2;

public class Pet {
    
    private String nome;
    private String tipo;
    private String cor;
    private Dono dono;

    Pet(){
        
    }

    Pet (String nome, String cor, String tipo){
        this.nome = nome;
        this.cor = cor;
        this.tipo = tipo;
    }
    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Dono getDono() {
        return dono;
    }

    public void setDono(Dono dono) {
        this.dono = dono;
    }

   
    
    
    
}
