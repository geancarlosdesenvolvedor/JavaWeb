package br.com.banco.models;

public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private String endereco;
    private int id;

    public Usuario(String nome, String email, String senha, String endereco, int id) {
        this.nome = nome;
        this.senha = senha;
        this.email = email;
        this.endereco = endereco;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    


}
