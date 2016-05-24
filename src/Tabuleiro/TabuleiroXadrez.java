/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tabuleiro;

import java.awt.Color;
import modelo.pecas.Bispo;
import modelo.pecas.Cavalo;
import modelo.pecas.Observed;
import modelo.pecas.Peao;
import modelo.pecas.PecaAbstrata;
import modelo.pecas.PecaVazia;
import modelo.pecas.PecaXadrez;
import modelo.pecas.Rainha;
import modelo.pecas.Rei;
import modelo.pecas.Torre;
import xadrezfinal.FramePrincipal;

/**
 *
 * @author marcus
 */
public class TabuleiroXadrez extends TabuleiroAbstrato{
   
    
   public TabuleiroXadrez(FramePrincipal fp) {
        super(fp);
        
    }
    
    public void construirTabuleiro(){
        
       construirPrimeiraUltimaLinha("Branco");
       construirLinhaPeos("Branco");
       construirLinhasEmBranco();
       construirLinhaPeos("Preto");
       construirPrimeiraUltimaLinha("Preto");
       pintarTabuleiro();
       
    }
    
    
    public void construirPrimeiraUltimaLinha(String cor){

            adicionarAoTabuleiro(new Torre(cor));
            adicionarAoTabuleiro(new Cavalo(cor));
            adicionarAoTabuleiro(new Bispo(cor));
            adicionarAoTabuleiro(new Rei(cor));
            adicionarAoTabuleiro(new Rainha(cor));
            adicionarAoTabuleiro(new Bispo(cor));
            adicionarAoTabuleiro(new Cavalo(cor));
            adicionarAoTabuleiro(new Torre(cor));
    }
    
    private void construirLinhaPeos(String cor){
        
        for(int i=0;i<8;i++){
            adicionarAoTabuleiro(new Peao(cor));
        }
        
    }
    
    private void construirLinhasEmBranco(){
        for(int i=0;i<32;i++){
            adicionarAoTabuleiro(new PecaVazia());
        }
    }
    
    
    public void verificaTrajetoria(PecaAbstrata peca) {
        peca.getMovimento(peca,this);
    
    }

    public boolean jogoTerminou(PecaAbstrata peca){
        boolean flag=true;
        for(int i=0;i<this.pecas.size();i++){
            if(peca.getCor().contains("Branco")){
                if((this.pecas.get(i) instanceof Rei) && (this.pecas.get(i).getCor().contains("Preto"))){
                    flag=false;
                }
            }else{
                if(this.pecas.get(i) instanceof Rei && (this.pecas.get(i).getCor().contains("Branco")) ){
                    flag=false;
                }
            }
        }
        if(flag){
            desabilitaPecas();
        }
        return flag;
    }
         
}
