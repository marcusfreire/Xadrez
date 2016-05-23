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
public abstract class TabuleiroAbstrato extends Jpanel implements Observer {
    
    public TabuleiroAbstrato(FramePrincipal fp) {
        super(fp);
    }
    
    
}
