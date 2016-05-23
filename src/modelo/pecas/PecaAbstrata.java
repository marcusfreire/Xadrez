package modelo.pecas;

import Tabuleiro.Observer;
import java.util.HashSet;
import javax.swing.JButton;
import modelo.movimentos.MovimentoEstrategicoXadrez;
import modelo.movimentos.*;

public abstract class PecaAbstrata extends JButton implements Observed {
    protected HashSet observers;
    protected PecaXadrez peca;
    protected String cor="b";
    protected MovimentoEstrategicoXadrez movimento;
    
    //.getClass().contains();
    public void setMovimento(String type) {
        System.out.println("Esta add movimento: "+type);
            switch (type) {
                case "Peao":
                    movimento = new MovimentoPeao();
                    break;
                case "Bispo":
                    movimento = new MovimentoBispo();
                    break;
                case "Rei":
                    movimento = new MovimentoRei();
                    break;
                case "Rainha":
                    movimento = new MovimentoRainha();
                    break;
                case "Cavalo":
                    movimento = new MovimentoCavalo();
                    break;
                case "Torre":
                    movimento = new MovimentoTorre();
                    break;
                case "PecaVazia":
                    movimento = new MovimentoPecaVazia();
                    break;
            }
    }
    int i;
    public void getMovimento() {
        movimento.verificaTrajetoria(peca, i);
    }
    
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
