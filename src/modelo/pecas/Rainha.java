package modelo.pecas;

//import general.movement.QueenMovementStrategy;
import java.awt.Color;
import javax.swing.ImageIcon;


public class Rainha extends PecaXadrez {
    
    public Rainha (String type) {
        if (type.equals("Preto")) {
            this.setIcon(new ImageIcon("imagens/rainha-P.gif"));
            this.setCor("Preto");
	}else{
            this.setIcon(new ImageIcon("imagens/rainha-B.gif"));
            this.setCor("Branco");
        }        
        this.setBackground(new Color(255,255,255));
        this.setSize(50, 50);
   //     movimento = new QueenMovementStrategy();
    }

}
