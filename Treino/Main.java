
package Treino;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        Usuario listaUsuario[];
        
        listaUsuario = new Usuario[3];
        int i;
        
        for(i = 0; i < listaUsuario.length; i++){
        
        System.out.println("Insira o nome do Professor");
        String nomeUsuario = entrada.nextLine();
        System.out.println("Insira o e-mail do Professor");
        String emailUsuario = entrada.nextLine();
        System.out.println("Insira o endereço do Professor");
        String enderecoUsuario = entrada.nextLine();
        
        listaUsuario[i] = new Professor(1, nomeUsuario, emailUsuario, enderecoUsuario);
        
       
        }
        
        
        for(i = 0; i < listaUsuario.length; i++){
             System.out.println(listaUsuario[i].toString());
        }
       
        
        
        
        
        
        
        
        
    }
}
