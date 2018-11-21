/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto01;

/**
 *
 * @author 308092
 */
public class Pessoa {
    private String nome;
    private String fone;
    private String endereco;

    public Pessoa() {
    }

    public Pessoa(String nome, String fone, String endereco) {
        this.nome = nome;
        this.fone = fone;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getFone() {
        return fone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    
    
}
