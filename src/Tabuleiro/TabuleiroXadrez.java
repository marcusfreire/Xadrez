/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tabuleiro;

import modelo.pecas.PecaAbstrata;
import xadrezfinal.FramePrincipal;

/**
 *
 * @author marcus
 */
public class TabuleiroXadrez extends TabuleiroAbstrato{
   
    public TabuleiroXadrez(FramePrincipal fp) {
        super(fp);
    }

    @Override
    public void update(PecaAbstrata peca) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
 
}
