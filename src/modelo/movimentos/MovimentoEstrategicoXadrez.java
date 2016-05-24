package modelo.movimentos;

import Tabuleiro.TabuleiroXadrez;
import modelo.pecas.PecaAbstrata;

public abstract class MovimentoEstrategicoXadrez {
    
    public abstract void verificaTrajetoria(PecaAbstrata piece, TabuleiroXadrez tab);    
    
}
