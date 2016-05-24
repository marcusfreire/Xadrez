package modelo.movimentos;

import Tabuleiro.TabuleiroXadrez;
import modelo.pecas.Peao;
import modelo.pecas.PecaAbstrata;
import modelo.pecas.PecaVazia;
import modelo.pecas.PecaXadrez;

public class MovimentoPeao extends MovimentoEstrategicoXadrez {

	@Override
	public void verificaTrajetoria(PecaAbstrata peao, TabuleiroXadrez tab) {
	PecaXadrez peao2 = (PecaXadrez) peao;
		int temp=0;
        int jogadas=0;
        PecaAbstrata bt=null;
        boolean flag=true;
        int x=peao.getX();
        int y=peao.getY();
        String cor= peao.getCor();
        
        int qtdCasas = 2;
        if(peao2.isMexeu()){
            qtdCasas = 1;
        }
        
        while(flag && jogadas < qtdCasas){
            if (cor.contains("Branco")){
                y+=50;
            }else{
                y-=50;
            }
            
            temp=tab.getPeca(x, y);
            if(temp!=-1){
                bt=tab.pecas.get(temp);
                //("BT "+temp+" "+bt.getCor()+" "+ bt.getClass());
                    if(bt instanceof PecaVazia){
                        tab.iluminar(temp);
                        jogadas++;
                    }else if (cor.equals("Branco")) {
                            if(bt.getCor().contains("Preto")){
                                flag=false;
                        }else{
                            if(bt.getCor().contains("Branco")){
                                flag=false;
                            }
                        }
                    }else{
                        flag=false;
                    }
            }
        }
                
        for(int i=0;i<2;i++){
            
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
            
                
            temp = tab.getPeca(x, y);
                
            if(temp!=-1){
                
                bt=tab.pecas.get(temp);
                if (cor.equals("Branco")) {
                    if(bt.getCor().contains("Preto")){
                    	tab.iluminar(temp);
                    }
                }else{
                    if(bt.getCor().contains("Branco")){
                    	tab.iluminar(temp);
                        }                         
                    }               
            }
            
        }
		
	}

  

}
