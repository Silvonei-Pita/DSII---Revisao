
package Treino;


public abstract class Usuario {
    private int idNome;
    private String nome;
    private String email;
    private String endereco;

    public Usuario(int idNome, String nome, String email, String endereco) {
        this.idNome = idNome;
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
    }
    
    public void realizarEmprestimo(){
        
    };
    
    public void devolverLivro(){
        
    };

   //toString//toString
    @Override
    public String toString() {
        return "Usuario " + 
                "\n idNome = " + idNome + 
                "\n nome =" + nome +  
                "\n email = " + email + 
                "\n endereco = " + endereco;
    }

    //Setters
    // 1.a. Apenas email e endereço podem ser alterados.
    public void setEmail(String email) {
        this.email = email;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    // Getters
    public int getIdNome() {
        return idNome;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getEndereco() {
        return endereco;
    }

    
    
    
}
