/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo.jogadores;

/**
 *
 * @author Pedro
 */
public class Jogador {

    private String nome;
    private String peca;

    public Jogador() {
    }

    public Jogador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPeca() {
        return peca;
    }

    public void setPeca(String peca) {
        this.peca = peca;
    }
    
    
    
}
