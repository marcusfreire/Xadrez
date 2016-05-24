package xadrezfinal;

import Tabuleiro.TabuleiroXadrez;
import java.awt.Point;
import static xadrezfinal.FramePrincipal.setJogadorDaVez;

public class Xadrez extends GameAbstrato {
    
    
    private static Xadrez instancia;
    EstadoGame estadocronometro ;
	private Xadrez() {
            super(new InProgress());
            frame=getGameInstance("Xadrez");
            play(frame);
	}

	public static synchronized Xadrez getInstance() {
		if (instancia == null){
                    instancia = new Xadrez();                    
                }
		return instancia;
        }
        
        private void jToggleButtonPauseActionPerformed(java.awt.event.ActionEvent evt) {
            //estadocronometro.contador(this);
       
    }
}
