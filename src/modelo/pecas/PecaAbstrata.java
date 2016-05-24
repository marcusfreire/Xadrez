package modelo.pecas;

import Tabuleiro.Observer;
import Tabuleiro.TabuleiroAbstrato;
import Tabuleiro.TabuleiroXadrez;
import java.util.ArrayList;

import java.util.HashSet;
import java.util.Iterator;
import javax.swing.JButton;
import modelo.movimentos.*;

public abstract class PecaAbstrata extends JButton implements Observed {
    private ArrayList observers;
    protected PecaXadrez peca;
    protected String cor="b";
    protected String tipo="PecaVazia";
    protected MovimentoEstrategicoXadrez movimento;
    TabuleiroXadrez tab;
    boolean mexeu = false;
    
    public PecaAbstrata (){
        observers = new ArrayList();   
    }

    //.getClass().contains();
    public abstract void setMovimento(String type);
    
    public abstract void getMovimento(PecaAbstrata peca,TabuleiroAbstrato tab);
    
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
 
    public void addObserver(Observer o){
        observers.add(o);
    }


    public void removeObserver(Observer o) {
       int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
	} 
    }

    
    public void ActionPerformed(java.awt.event.ActionEvent evt) {
        peca= (PecaXadrez)evt.getSource();
        notifica();
       
    }
    
    public void notifica() {
        //System.out.println("Teste"+this.getTipo()+" "+this.getCor());
        for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(peca);
		}
    }
    
    public boolean isMexeu() {
        return mexeu;
    }

    public void setMexeu(boolean mexeu) {
        this.mexeu = mexeu;
    }
}
