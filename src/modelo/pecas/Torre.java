package modelo.pecas;

//import general.movement.RookMovementStrategy;
import java.awt.Color;
import javax.swing.ImageIcon;


public class Torre extends PecaXadrez {
    
    public Torre(String type) {
        if (type.equals("Preto")) {
           this.setIcon(new ImageIcon("imagens/torre-P.gif"));
           this.setCor("Preto");
	}else{
            this.setIcon(new ImageIcon("imagens/torre-B.gif"));
            this.setCor("Branco");
        }        
        this.setBackground(new Color(255,255,255));
        this.setSize(50, 50);
  //      movimento = new RookMovementStrategy();
    }

}
