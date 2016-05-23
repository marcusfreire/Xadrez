package xadrezfinal;

public class Xadrez extends GameAbstrato {
    
   
    private static Xadrez instancia;
    FramePrincipal fp;
	private Xadrez() {
            fp=getGameInstance("Xadrez");
            play(fp);
	}

	public static synchronized Xadrez getInstance() {
		if (instancia == null){
                    instancia = new Xadrez();                    
                }
		return instancia;
        }   
}
