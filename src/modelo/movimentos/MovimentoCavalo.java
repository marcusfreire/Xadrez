package modelo.movimentos;

import Tabuleiro.TabuleiroXadrez;
import modelo.pecas.PecaAbstrata;
import modelo.pecas.PecaVazia;

public class MovimentoCavalo extends MovimentoEstrategicoXadrez {

    @Override
    public void verificaTrajetoria(PecaAbstrata cavalo,TabuleiroXadrez tab) {
    	int temp=0;
        PecaAbstrata bt=null;
        boolean flag=true;
        int x=cavalo.getX();
        int y=cavalo.getY();
        String cor= cavalo.getCor();
        
        for(int i=0;i<8;i++){
                if(i==0){
                    y+=100;
                    x+=50;
                }else if(i==1){
                    y-=100;
                    x-=50;
                }else if(i==2){
                    y-=50;
                    x-=100;
                }else if(i==3){
                    y+=50;
                    x+=100;
                }else if(i==4){
                    y-=100;
                    x+=50;
                }else if(i==5){
                    y-=50;
                    x+=100;
                }else if(i==6){
                    x-=50;
                    y+=100;
                }else if(i==7){
                    x-=100;
                    y+=50;
                }
                temp=tab.getPeca(x, y);
                if(temp!=-1){
                    bt=tab.pecas.get(temp);
                    if (cor.equals("Branco")) {
                        if(bt instanceof PecaVazia||bt.getCor().contains("Preto")){
                        	tab.iluminar(temp);
                    }
                    }else{
                        if(bt instanceof PecaVazia||bt.getCor().contains("Branco")){
                        	tab.iluminar(temp);
                            }                         
                    }
                    
                }
            x=cavalo.getX();
            y=cavalo.getY();
        }
    }

}
