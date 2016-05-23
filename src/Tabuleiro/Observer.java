package Tabuleiro;

import modelo.pecas.PecaAbstrata;

public interface Observer {
    public void update(PecaAbstrata peca);
}
