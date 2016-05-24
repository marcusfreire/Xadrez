package xadrezfinal;

import javax.swing.Timer;

public class Paused implements EstadoGame {

    javax.swing.JToggleButton botao;
    Timer time;
    FramePrincipal frame;
    @Override
    public void contador(GameAbstrato estado) {
        this.botao = frame.getBotao();
        this.time = frame.gettimer();
        botao.setText("Pause");
        botao.setEnabled(true);
        time.restart();
        frame.setBotao(botao);
        frame.settimer(time);
        estado.setEstado(new InProgress());
    }

}
