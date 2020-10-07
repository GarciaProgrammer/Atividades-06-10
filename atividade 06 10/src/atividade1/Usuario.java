package atividade1;

public class Usuario {

    private int idade;
    private String nome;
    private String sexo;
    private Carro carro;
    
    /**
     * Constutor vazio
     */
    Usuario (){
        
    }
    
    /**
     * Construtor com nome apenas
     * @param nome 
     */
    Usuario (String nome){
        this.nome = nome;
    }
    
    /**
     * Construtor com idade apenas
     * @param idade 
     */
    Usuario (int idade){
        this.idade = idade;
    }
    
    /**
     * Construtor com idade e nome
     * @param nome
     * @param idade 
     */
    Usuario (String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
        
    }
    
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    
    public String getSexo(){
        return this.sexo;
    }
    
    public void setCarro(Carro carro){
        this.carro = carro;
    }
    
    public Carro getCarro(){
        return this.carro;
    }
}
