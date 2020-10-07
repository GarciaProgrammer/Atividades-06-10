
package atividade2;


public class Dono {
    
    private String nome;
    private int idade;
    private Pet pet;
    
    Dono (){
        
    }

    public Dono(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }  

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
    
    
    
}
