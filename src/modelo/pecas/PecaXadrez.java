
package modelo.pecas;

import Tabuleiro.Observer;
import Tabuleiro.TabuleiroAbstrato;
import Tabuleiro.TabuleiroXadrez;
import javax.swing.JButton;
import modelo.movimentos.*;

/**
 *
 * @author marcus
 */
public class PecaXadrez extends PecaAbstrata{
    
    public void setMovimento(String type) {
            switch (type) {
                case "Peao":
                    movimento = new MovimentoPeao();
                    break;
                case "Bispo":
                    movimento = new MovimentoBispo();
                    break;
                case "Rei":
                    movimento = new MovimentoRei();
                    break;
                case "Rainha":
                    movimento = new MovimentoRainha();
                    break;
                case "Cavalo":
                    movimento = new MovimentoCavalo();
                    break;
                case "Torre":
                    movimento = new MovimentoTorre();
                    break;
                case "PecaVazia":
                    movimento = new MovimentoPecaVazia();
                    break;
            }
    }
    
    public void getMovimento(PecaAbstrata peca,TabuleiroAbstrato tab) {
        movimento.verificaTrajetoria(peca, (TabuleiroXadrez) tab);
    }
         
}
