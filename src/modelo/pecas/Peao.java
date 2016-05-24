package modelo.pecas;

//import general.movement.PawnMovementStrategy;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import modelo.movimentos.MovimentoPeao;

public class Peao extends PecaXadrez {
    
    public Peao ( String type) {
        if (type.equals("Preto")) {           
            this.setIcon(new ImageIcon("imagens/peao-P.gif"));
            this.setCor("Preto");
	}else{
            this.setIcon(new ImageIcon("imagens/peao-B.gif"));
            this.setCor("Branco");
        }        
        this.setBackground(new Color(255,255,255));
        this.setSize(50, 50);
        this.setMovimento("Peao");
        this.setTipo("Peao");
        //movimento = new MovimentoPeao();
    }
   
   
    

}
