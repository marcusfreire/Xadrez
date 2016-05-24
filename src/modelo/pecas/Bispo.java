package modelo.pecas;

//import general.movement.BishopMovementStrategy;
import java.awt.Color;
import javax.swing.ImageIcon;
import modelo.movimentos.MovimentoBispo;


public class Bispo extends PecaXadrez {

    public Bispo(String type) {
        if (type.equals("Preto")) {
            this.setIcon(new ImageIcon("imagens/bispo-P.gif"));
            this.setCor("Preto");
	}else{
            this.setIcon(new ImageIcon("imagens/bispo-B.gif"));
            this.setCor("Branco");
        }        
        this.setBackground(new Color(255,255,255));
        this.setSize(50, 50);
        this.setMovimento("Bispo");
        //movimento = new MovimentoBispo();
    }

}
