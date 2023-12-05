/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Treino;


public class Categoria {
    private int id_categoria;
    private String nome;

    public Categoria(int id_categoria, String nome) {
        this.id_categoria = id_categoria;
        this.nome = nome;
    }

    
    //Getters
       /* 1.b. Os dados da categoria e do autor devem ser consultados, 
          mas não alterados */
    public int getId_categoria() {
        return id_categoria;
    }

    public String getNome() {
        return nome;
    }
    
    
    
}
