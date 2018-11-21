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
public class Projeto01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa ();
        System.out.println("Objeto p1"+p1.getNome());
        Pessoa p2 = new Pessoa("Hugo Chaves","9988-1234","Rua A");
        System.out.println("Objeto p2"+p2.getNome());

    }
    
}
