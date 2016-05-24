package xadrezfinal;

import javax.swing.Timer;

public class Finished implements EstadoGame{

   javax.swing.JToggleButton botao;
    Timer time;
    FramePrincipal frame;
    public void contador(GameAbstrato estado) {
        this.botao = frame.getBotao();
        this.time = frame.gettimer();
        botao.setText("Cabou");
        botao.setEnabled(true);
        time.stop();
        frame.setBotao(botao);
        frame.settimer(time);
        //acabar
    }

}
