package modelo.movimentos;

import modelo.pecas.PecaAbstrata;

public class MovimentoRainha extends MovimentoEstrategicoXadrez {

    public void verificaTrajetoria(PecaAbstrata piece, int i) {
        System.out.println("ME movimento como Rainha");
    }

}
