package modelo.movimentos;

import modelo.pecas.Peao;
import modelo.pecas.PecaAbstrata;
import modelo.pecas.PecaVazia;

public class MovimentoPeao extends MovimentoEstrategicoXadrez {

    public void verificaTrajetoria(PecaAbstrata peao, int i) {
        String cor= peao.getCor();
        int x=peao.getX();
        int y=peao.getY();
        Peao peao2 = (Peao) peao;
        int qtdCasas = 2;
        if(peao2.isMexeu()){
            qtdCasas = 1;
        }
        // como verificar o numero de casas?????
        if (cor.contains("Branco")){
                y+=50;
            }else{
                y-=50;
            }
        
        x=peao.getX();
        y=peao.getY();
        if (cor.contains("Branco")){
                if(i==0){
                    y+=50;
                    x+=50;
                }else{
                    y+=50;
                    x-=50;
                }
            }else{
                if(i==0){
                    y-=50;
                    x-=50;
                }else{
                    y-=50;
                    x+=50;
                }
            }
    }

}
