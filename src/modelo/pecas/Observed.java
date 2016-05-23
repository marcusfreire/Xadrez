package modelo.pecas;

import Tabuleiro.Observer;


public interface Observed {
    
    public void addObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifica();

}
