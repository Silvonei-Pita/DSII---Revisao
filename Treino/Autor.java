/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Treino;


public class Autor {
    private int id_autor;
    private String nome;

    public Autor(int id_autor, String nome) {
        this.id_autor = id_autor;
        this.nome = nome;
    }

    
    //Getters
       /* 1.b. Os dados da categoria e do autor devem ser consultados, 
          mas não alterados */
    public int getId_autor() {
        return id_autor;
    }

    public String getNome() {
        return nome;
    }
    
    
    
}
