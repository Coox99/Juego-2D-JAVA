package Script;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class GeneraEnemigo extends Thread {
    private Tiempo t;
    ImageIcon[] sprite;
    JPanel esenario;
    int x;

    public GeneraEnemigo(JPanel esenario, int x) {
        this.esenario = esenario;
        this.x = x;
    }

    public void setT(Tiempo t) {
        this.t = t;
    }

    public Tiempo getT() {
        return t;
    }

    
    
    @Override
    public void run() {
        while (getT().isActivo()) {
            Enemigo enemigo = new Enemigo(esenario, x);
            enemigo.setImg(sprite[(int) (Math.random()  * sprite.length-1) ]);
            enemigo.setResistencia((int) (Math.random()*3)+1);
            enemigo.creaEnemigo((int) (Math.random() * 40) + 30, (int) (Math.random() * 40) + 20, (int) (Math.random() * 4)+1 );
            enemigo.pausar(1500);
        }
    }

    public void crearSprite(String nombImg, String formato, int numeroSprites) {
        sprite = new ImageIcon[numeroSprites];
        for (int index = 1; index <= sprite.length; index++) {
            sprite[index-1] = new ImageIcon(getClass().getResource("/Imagen/" + nombImg + (index) + "." + formato));
        }
    }
}
