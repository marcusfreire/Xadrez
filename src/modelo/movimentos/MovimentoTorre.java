package modelo.movimentos;

import Tabuleiro.TabuleiroXadrez;
import modelo.pecas.PecaAbstrata;
import modelo.pecas.PecaVazia;

public class MovimentoTorre extends MovimentoEstrategicoXadrez {

    public void verificaTrajetoria(PecaAbstrata torre, TabuleiroXadrez tab) {
    	int temp=0;
        PecaAbstrata bt=null;
        boolean flag=true;
        int x=torre.getX();
        int y=torre.getY();
        String cor= torre.getCor();
        
        for(int i=0;i<4;i++){
            while(flag){
                if(i==0){
                    y+=50;
                }else if(i==1){
                    y-=50;
                }else if(i==2){
                    x+=50;
                }else{
                    x-=50;
                }
                temp=tab.getPeca(x, y);
                if(temp!=-1){
                    bt=tab.pecas.get(temp);
                        if(bt instanceof PecaVazia){
                        	tab.iluminar(temp);
                        }else if (cor.equals("Branco")) {
                            if(bt.getCor().contains("Preto")){
                                flag=false;
                                tab.iluminar(temp);
                            }else{
                                flag=false;
                            }
                   }else{
                            if(bt.getCor().contains("Branco")){
                                flag=false;
                                tab.iluminar(temp);
                            }else{
                                flag=false;
                            }
                        
                    }
                }else{
                    flag=false;
                }
            }
            x=torre.getX();
            y=torre.getY();
            flag=true;
        }
     }

}
