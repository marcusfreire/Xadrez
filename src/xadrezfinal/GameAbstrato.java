/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xadrezfinal;

import Tabuleiro.FabricaTabuleiro;
import javax.swing.JLabel;

/**
 *
 * @author marcus
 */
public class GameAbstrato extends FramePrincipal implements IGame {
    FramePrincipal frame;
    EstadoGame estadocronometro;
    @Override
    public FramePrincipal getGameInstance(String game) {
        if(game.equals("Xadrez")){
            FramePrincipal fp = new FramePrincipal();
            frame=fp;
            fp.setVisible(true);
        }
        return frame;
    }

    @Override
    public void play(FramePrincipal game) {
        FabricaTabuleiro fabrica = new FabricaTabuleiro();
        fabrica.CriarTabuleiro(game);
    }
    
    
}
