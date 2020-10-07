package atividade2;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Dono dono = new Dono();
        
        dono.setPet(new Pet());
        
        System.out.println("Digite seu nome:");
        dono.setNome(teclado.nextLine());
        
        System.out.println("Digite sua idade:");
        dono.setIdade(Integer.parseInt(teclado.nextLine()));
        
        System.out.println("Digite o nome do seu pet");
        dono.getPet().setNome(teclado.nextLine());
        
        System.out.println("Digite o tipo do pet");
        dono.getPet().setTipo(teclado.nextLine());
        
        System.out.println("Digite a cor do seu pet");
        dono.getPet().setCor(teclado.nextLine());
        
        System.out.println(dono.getNome());
        System.out.println(dono.getIdade());
        System.out.println(dono.getPet().getNome());
        System.out.println(dono.getPet().getCor());
        System.out.println(dono.getPet().getTipo());
        
    }
    
}
