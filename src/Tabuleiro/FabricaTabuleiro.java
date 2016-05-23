/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tabuleiro;

import xadrezfinal.FramePrincipal;

/**
 *
 * @author marcus
 */
public class FabricaTabuleiro {
    
    public Jpanel CriarTabuleiro(FramePrincipal fp) {
           
            Jpanel tabuleiro = new TabuleiroXadrez(fp);
            return tabuleiro;
	}
    
}
