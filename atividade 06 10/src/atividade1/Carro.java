
package atividade1;

public class Carro {
    private String nome;
    private int anoCarro;
    /**
     * Construtor Vazio
     */
    Carro (){
        
    }
    
    /**
     * Contrutor nome
     * @param nome 
     */
    Carro (String nome){
        this.nome = nome;
    }
    
    /**
     * Construtor com ano
     * @param anoCarro 
     */
    Carro (int anoCarro){
        this.anoCarro = anoCarro;
    }
    
    /**
     * Construtor com nome e ano
     * @param nome
     * @param ano 
     */
    Carro (String nome, int ano){
        this.anoCarro = ano;
        this.nome = nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }

    public int getAnoCarro() {
        return this.anoCarro;
    }

    public void setAnoCarro(int anoCarro) {
        this.anoCarro = anoCarro;
    }
    
    
}
