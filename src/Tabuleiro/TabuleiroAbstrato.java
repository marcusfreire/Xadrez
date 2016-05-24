/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tabuleiro;

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;
import java.util.HashSet;
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
public abstract class TabuleiroAbstrato extends Jpanel implements Observer {
    protected FramePrincipal fp;
    public ArrayList<PecaAbstrata> pecas;
    protected PecaAbstrata peca=null;
    protected int contador;
    protected int contadorCorTabuleiro;
    protected int x;
    protected int y;
    protected TabuleiroXadrez tab;
    //private Observed observer;
    
    
    public TabuleiroAbstrato(FramePrincipal fp) {
        super();
        contador=1;
        contadorCorTabuleiro=1;
        x=0;
        y=0;
        pecas=new ArrayList<PecaAbstrata>();
        this.construirTabuleiro();
        this.fp=fp;
        
    }        
     
    public abstract void construirTabuleiro();
    
    public void pintarTabuleiro(){
        int i=0;
        int j=0;
        int incremento=0;
        while(i<8){
            while(j<8){
                if(i%2==0){
                    if(j%2==0){
                        this.pecas.get(i+(j+incremento)).setBackground(new Color(238,238,238));
                    }else{
                        this.pecas.get(i+(j+incremento)).setBackground(new Color(255,255,255));
                    }
                }else{
                    if(j%2==0){
                        this.pecas.get(i+(j+incremento)).setBackground(new Color(255,255,255));                        
                    }else{
                        this.pecas.get(i+(j+incremento)).setBackground(new Color(238,238,238));
                    }
                }
                j++;
            }
            j=0;
            i++;
            incremento+=7;
        }
        this.repaint();
    }
    
    
    public void adicionarAoTabuleiro(final PecaAbstrata peca){
        peca.setLocation(new Point(x,y));
        peca.addObserver(this);
        peca.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
                peca.ActionPerformed(evt);
            }
        });
        
        if(contador%8!=0){
            x+=50;
        }else{ 
            x=0;
            y+=50;
        }
        contadorCorTabuleiro++;
        this.add(peca);
        pecas.add(peca);
        contador++;
    }
    
    
    public void update(PecaXadrez pecaClicada) {
        String cor = pecaClicada.getCor();
        //System.out.println("Clicou "+pecaClicada.getClass()+" cor: "+cor+" Cor do Jogador: "+fp.getJogadores().get(fp.getJogadorDaVez()).getPeca());
        //System.out.println("Cor da peça: "+pecaClicada.getCor().contains("Branco"));
        //pecaClicada.getMovimento();
        if(fp.getJogada().getJogadaRecente()==-1){
            if(cor.contains(fp.getJogadores().get(fp.getJogadorDaVez()).getPeca())){
                this.iluminaCaminho(pecaClicada);
            }
        }else{
            this.movePeca(pecaClicada);
            fp.getJogada().setJogadaRecente(-1);
            if(this.jogoTerminou(peca)){
                fp.terminarJogo();
            }
        }
    }
     
   
    
    public void movePeca(PecaAbstrata posicao){
        String cor = posicao.getCor();
        //System.out.println("movePeca "+cor);
        if(posicao.getBackground().equals(new Color(0,180,0))){
            PecaAbstrata vazio=new PecaVazia();
            //adicionaMovimento(vazio);
            vazio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peca.ActionPerformed(evt);
                }
            });
            
            if(this.peca instanceof Peao){
                ((Peao)this.peca).setMexeu(true);
            }
            
                     
            vazio.setLocation(this.peca.getLocation());
            this.peca.setLocation(posicao.getLocation());
            
            int i=this.pecas.indexOf(posicao);
            int j=this.pecas.indexOf(this.peca);
            //System.out.println("Esta peça"+this.pecas.get(j).getTipo());
            //System.out.println("Matou "+this.pecas.get(i).getTipo()+" "+this.pecas.get(i).getCor());
            if (fp.getEstrategico()){
                if (!(this.pecas.get(i).getTipo().equals("PecaVazia"))){
                this.pecas.get(j).setMovimento(this.pecas.get(i).getTipo());
                this.pecas.get(j).setMexeu(true);
                
                }
            }
            this.pecas.remove(i);
            this.pecas.add(i,this.peca);
            this.pecas.remove(j);
            this.pecas.add(j, vazio);
            
            
            this.remove(this.peca);
            this.remove(posicao);
            
            //this.peca.setLocation(posicao.getLocation());
            this.add(this.peca);
            this.add(vazio);
            
            this.repaint();
            
            if(fp.getJogadorDaVez()==0){
                fp.setJogadorDaVez(1);
            }else{
                fp.setJogadorDaVez(0);
            }
            
            fp.getJogada().setJogador(fp.getJogadores().get(fp.getJogadorDaVez()));
            fp.trocaJogador();
        }
        this.limparIluminados();
        this.pintarTabuleiro();
    }
    
   
    public void iluminaCaminho(PecaAbstrata pecaEmMovimento){
        String cor = pecaEmMovimento.getCor();
        //System.out.println("Ilumina "+cor);
        limparIluminados();
        
        this.verificaTrajetoria(pecaEmMovimento);
        
        this.peca=pecaEmMovimento;
        fp.getJogada().setJogadaRecente(0);
        this.repaint();
    }
    
    public abstract void verificaTrajetoria(PecaAbstrata peca);
    
    public void iluminar(int indice){
        this.pecas.get(indice).setBackground(new Color(0,180,0));
    }
    
    public void limparIluminados(){
        
        for(int i=0;i<this.pecas.size();i++){
            if(this.pecas.get(i).getBackground().equals(new Color(0,180,0))){
                this.pecas.get(i).setBackground(new Color(255,255,255));
            }
        }
    }

    public int getPeca(int x,int y){
        int temp=-1;
        for(int i=0;i<this.pecas.size();i++){
            if(this.pecas.get(i).getX()==x&&this.pecas.get(i).getY()==y){
                temp=i;
            }
        }
        return temp;
    }
    // Rever função, pois os rei que morrer primeiro perde lkkkkkkkkkk
    public abstract boolean jogoTerminou(PecaAbstrata peca);
    
    public void desabilitaPecas(){
        for(int i=0;i<this.pecas.size();i++){
            this.pecas.get(i).setEnabled(false);
        }
    }
    public void habilitaPecas(){
        for(int i=0;i<this.pecas.size();i++){
            this.pecas.get(i).setEnabled(true);
        }
    }
    
    
}
