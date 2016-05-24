package modelo.pecas;

import Tabuleiro.Observer;
import Tabuleiro.TabuleiroAbstrato;
import Tabuleiro.TabuleiroXadrez;

import java.util.HashSet;
import javax.swing.JButton;
import modelo.movimentos.*;

public abstract class PecaAbstrata extends JButton implements Observed {
    protected HashSet observers;
    protected PecaXadrez peca;
    protected String cor="b";
    protected MovimentoEstrategicoXadrez movimento;
    TabuleiroXadrez tab;
    
    //.getClass().contains();
    public abstract void setMovimento(String type);
    
    public abstract void getMovimento(PecaAbstrata peca,TabuleiroAbstrato tab);
    
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
 
    public void addObserver(Observer o){
        this.observers.add(o);
    }


    public void removeObserver(Observer o) {
       this.observers.remove(o); 
    }


    @Override
    public void notifica() {
        Observer observer = (Observer)observers;
	observer.update(peca);
    }

    public PecaXadrez getPiece() { return peca; }
    
    public void setPiece(PecaXadrez peca) {
        this.peca=peca;
    }
        
}
