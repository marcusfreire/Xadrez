package xadrezfinal;

import Tabuleiro.TabuleiroXadrez;
import java.awt.Point;
import static xadrezfinal.FramePrincipal.setJogadorDaVez;

public class Xadrez extends GameAbstrato {
    
   
    private static Xadrez instancia;
    
	private Xadrez() {
            frame=getGameInstance("Xadrez");
            play(frame);
	}

	public static synchronized Xadrez getInstance() {
		if (instancia == null){
                    instancia = new Xadrez();                    
                }
		return instancia;
        }
}
