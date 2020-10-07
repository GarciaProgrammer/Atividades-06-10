package atividade2;

public class Pet {

    private String nome;
    private String tipo;
    private String cor;

    /**
     * Construtor vazio
     */
    Pet() {

    }
    Pet (String nome){
        this.nome = nome;
    }
    
    /**
     * Construtor completo
     *
     * @param nome
     * @param tipo
     * @param cor
     * @param dono
     */
    Pet(String nome, String tipo, String cor) {
        this.nome = nome;
        this.tipo = tipo;
        this.cor = cor;
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

}
