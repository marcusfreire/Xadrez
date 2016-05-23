package modelo.pecas;

//import general.movement.KnightMovementStrategy;
import java.awt.Color;
import javax.swing.ImageIcon;
import modelo.movimentos.MovimentoCavalo;


public class Cavalo extends PecaXadrez {
    
    public Cavalo (String type) {
        if (type.equals("Preto")) {
            this.setIcon(new ImageIcon("imagens/cavalo-P.gif"));
            this.setCor("Preto");
	}else{
            this.setIcon(new ImageIcon("imagens/cavalo-B.gif"));
            this.setCor("Branco");
        }        
        this.setBackground(new Color(255,255,255));
        this.setSize(50, 50);
        //movimento = new MovimentoCavalo();
    }

}
