package modelo.movimentos;

import modelo.pecas.PecaAbstrata;

public class MovimentoCavalo extends MovimentoEstrategicoXadrez {

    @Override
    public void verificaTrajetoria(PecaAbstrata piece, int i) {
        System.out.println("ME movimento como Cavalo");
    }

}
