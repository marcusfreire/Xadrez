package modelo.pecas;

//import general.movement.KingMovementStrategy;
import java.awt.Color;
import javax.swing.ImageIcon;


public class Rei extends PecaXadrez {
    
    public Rei (String type) {
        if (type.equals("Preto")) {
            this.setIcon(new ImageIcon("imagens/rei-P.gif"));
            this.setCor("Preto");
	}else{
            this.setIcon(new ImageIcon("imagens/rei-B.gif"));
            this.setCor("Branco");
        }        
        this.setBackground(new Color(255,255,255));
        this.setSize(50, 50);
        this.setMovimento("Rei");
        this.setTipo("Rei");
 //       movimento = new KingMovementStrategy();
    }

}
