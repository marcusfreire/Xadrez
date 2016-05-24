package xadrezfinal;

import javax.swing.Timer;

public class InProgress implements EstadoGame {
    javax.swing.JToggleButton botao;
    Timer time;
    FramePrincipal frame;
    @Override
    public void contador(GameAbstrato estado) {
        this.botao = frame.getBotao();
        this.time = frame.gettimer();
        botao.setText("Play");
        botao.setEnabled(true);
        time.stop();
        frame.setBotao(botao);
        frame.settimer(time);
        estado.setEstado(new Paused());
        }
 }
