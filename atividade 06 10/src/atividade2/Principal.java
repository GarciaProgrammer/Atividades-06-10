package atividade2;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String nome, nomePet, cor, tipo;
        int idade;
        Dono dono = new Dono();
        Pet pet = new Pet();
        
        System.out.println("Digite sua idade:");
        idade = teclado.nextInt();
        dono.setIdade(idade);
        
        System.out.println("Digite seu nome:");
        nome = teclado.nextLine();
        dono.setNome(nome);
        
        System.out.println("Digite o nome do seu pet:");s
        nomePet = teclado.nextLine();
        pet.setNome(nomePet);
        
        System.out.println("Digite a cor do seu pet");
        cor = teclado.nextLine();
        pet.setCor(cor);
        
        System.out.println("Digite o tipo do seu pet:");
        tipo = teclado.nextLine();
        
    }

}
