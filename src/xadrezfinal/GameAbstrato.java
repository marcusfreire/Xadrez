/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xadrezfinal;

import Tabuleiro.FabricaTabuleiro;
import Tabuleiro.TabuleiroAbstrato;
import Tabuleiro.TabuleiroXadrez;
import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;
import javax.swing.JLabel;
import modelo.jogadores.Jogada;
import modelo.jogadores.Jogador;
import static xadrezfinal.FramePrincipal.getJogadorDaVez;
import static xadrezfinal.FramePrincipal.setJogadorDaVez;

/**
 *
 * @author marcus
 */
public class GameAbstrato extends FramePrincipal implements IGame {
    protected FramePrincipal frame;
    FramePrincipal fp;
    EstadoGame estadocronometro;
    
    public GameAbstrato(){
        super();
    }
    
    @Override
    public FramePrincipal getGameInstance(String game) {
        if(game.equals("Xadrez")){
            FramePrincipal frame = new FramePrincipal();
            fp=frame;
            frame.setVisible(true);
        }
        return fp;
    }

    @Override
    public void play(FramePrincipal game) {
        FabricaTabuleiro fabrica = new FabricaTabuleiro();
        tabuleiro = (TabuleiroXadrez) fabrica.CriarTabuleiro(game);
    }
    
    
}
