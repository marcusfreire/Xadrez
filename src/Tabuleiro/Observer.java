package Tabuleiro;

import modelo.pecas.PecaXadrez;

public interface Observer {
    public void update(PecaXadrez peca);
}
