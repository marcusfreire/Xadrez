package xadrezfinal;

public interface IGame {

	public abstract FramePrincipal getGameInstance(String game);

	public abstract void play(FramePrincipal game);

}
