
package atividade1;

import java.awt.BorderLayout;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Usuario aluno;
        Carro carroUsuario;
        Scanner teclado = new Scanner(System.in);
        String nome, nomeCarro;
        Integer idade;
        int anoCarro;
        String sexoUsuario, possuiCarro;

        System.out.println("Digite seu nome e idade");
        System.out.println("informe o nome:");
        nome = teclado.nextLine();

        System.out.println("Informe a idade: ");
        idade = teclado.nextInt();

        if (!"".equals(nome) && idade != null) {
            aluno = new Usuario(nome, idade);
        } else if (!"".equals(nome)) {
            aluno = new Usuario(nome);
        } else if (idade != null) {
            aluno = new Usuario(idade);
        } else {
            aluno = new Usuario();
        }

        System.out.println("Informe o sexo: ");
        sexoUsuario = teclado.next();

        aluno.setSexo(sexoUsuario);

        System.out.println("Nome:" + aluno.getNome());
        System.out.println("Idade: " + aluno.getIdade());
        System.out.println("Sexo:" + aluno.getSexo());

        System.out.println("Você possui carro?");
        possuiCarro = teclado.next();

        if ("S".equalsIgnoreCase(possuiCarro)) {

            System.out.println("Informe o nome de seu carro:");
            nomeCarro = teclado.next();

            System.out.println("Informe o ano do seu carro:");
            anoCarro = teclado.nextInt();
            
            if (!"".equals(nomeCarro) && anoCarro > 0){
                carroUsuario = new Carro(nomeCarro, anoCarro);
            }else if (!"".equals(nomeCarro)){
                carroUsuario = new Carro(nomeCarro);
            }else if (anoCarro > 0){
                carroUsuario = new Carro(anoCarro);
            }else{
                carroUsuario = new Carro();
            }
        }

    }
}
