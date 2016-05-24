package modelo.movimentos;

import Tabuleiro.TabuleiroXadrez;
import modelo.pecas.PecaAbstrata;
import modelo.pecas.PecaVazia;

public class MovimentoRainha extends MovimentoEstrategicoXadrez {

    public void verificaTrajetoria(PecaAbstrata rainha, TabuleiroXadrez tab) {
    	int temp=0;
        PecaAbstrata bt=null;
        boolean flag=true;
        int x=rainha.getX();
        int y=rainha.getY();
        String cor= rainha.getCor();
        
        for(int i=0;i<8;i++){
            while(flag){
                if(i==0){
                    y+=50;
                }else if(i==1){
                    y-=50;
                }else if(i==2){
                    x+=50;
                }else if(i==3){
                    x-=50;
                }else if(i==4){
                    y+=50;
                    x+=50;
                }else if(i==5){
                    y-=50;
                    x-=50;
                }else if(i==6){
                    y-=50;
                    x+=50;
                }else{
                    y+=50;
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
            x=rainha.getX();
            y=rainha.getY();
            flag=true;
        }
    }

}
