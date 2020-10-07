package atividade2;

public class Dono {

    private String nome;
    private int idade;
    private Pet pet;

    /** -- não esta sendo usado
     * construtor Vazio
     */
    public Dono() {

    }

    /**
     * Construtor COmpleto // não esta sendo usado
     *
     * @param nome
     * @param idade
     * @param pet
     */
    public Dono(String nome, int idade, Pet pet) {
        this.nome = nome;
        this.idade = idade;
        this.pet = pet;
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
        return this.pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

}
