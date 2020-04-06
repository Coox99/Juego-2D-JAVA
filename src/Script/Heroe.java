package Script;

import Esena.LluviaEsteroides1;
import Main.Main;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Heroe extends Personaje {

  private  JLabel lbl_personaje;
 private   JPanel esenario;
 private Sonido s;

    private boolean activo = true;
    private int arriba = 38;
    private int abajo = 40;
    private int espacio = 3;
    private int disparo = 32;
    private int vdisparo = 20;
    private JFrame frm;

    public Heroe(JPanel esenario, JLabel lbl_heroe, int x, int y) {
        super(x, y);
        this.lbl_personaje = lbl_heroe;
        this.esenario = esenario;
        this.setVelocidad(30);
        this.setMaxY(esenario.getHeight());
    }

    public void setFrm(JFrame frm) {
        this.frm = frm;
    }

    public JFrame getFrm() {
        return frm;
    }

    public void keyPressed(KeyEvent ke) {

        int dir = ke.getKeyCode();
        this.movimiento(dir);
        this.disparos(dir);
        if(dir == 27){
            getFrm().dispose();
            LluviaEsteroides1.puntos=0;
            Main.main(new String[10]);
        }
    }

    public void MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
        int muescas = evt.getWheelRotation();

        if (muescas < 0) {

            if (isAbajo(getY() + evt.getUnitsToScroll() + getVelocidad())) {
                setY(getY() + evt.getUnitsToScroll() + getVelocidad());
                lbl_personaje.setLocation(getX(), getY());
            }
        } else {
            if (isArriba((getY() + evt.getUnitsToScroll() - getVelocidad()))) {
                setY(getY() + evt.getUnitsToScroll() - getVelocidad());
                lbl_personaje.setLocation(getX(), getY());
            }
        }

    }

    private void movimiento(int dir) {

        new Thread() {
            @Override
            public void run() {
                if (dir == arriba || dir == abajo) {
                    int nuevaPosicionY;
                    if (dir == arriba) {
                        nuevaPosicionY = getY() - getVelocidad();
                        if (isArriba(nuevaPosicionY)) {
                            lbl_personaje.setLocation(getX(), nuevaPosicionY);
                            setY(nuevaPosicionY);
                        }
                    } else {
                        nuevaPosicionY = getY() + getVelocidad();
                        if (isAbajo(nuevaPosicionY + espacio)) {
                            lbl_personaje.setLocation(getX(), nuevaPosicionY);
                            setY(nuevaPosicionY);
                        }

                    }
                }
            }
        }.start();
    }

    private void disparos(int accion) {
        if (accion == disparo) {
            JLabel lbl_bola = new JLabel();
            lbl_bola.setLocation(getX() + lbl_personaje.getWidth() + 10, getY() + (lbl_personaje.getHeight() / 2) - 10);
            lbl_bola.setSize(30, 5);
            lbl_bola.setIcon(escalarImg(new ImageIcon(getClass().getResource("/Imagen/laser3.png")), 30, 5));
            lbl_bola.setName("disparo");
            lbl_bola.setVisible(true);
            esenario.add(lbl_bola);

            new Thread() {
                @Override
                public void run() {
                    lbl_personaje.setLocation(getX() - 4, getY());
                    pausar(300);
                    lbl_personaje.setLocation(getX() + 4, getY());
                     s = new Sonido("/Sonido/laser.mp3");
                     s.start();
                    while (activo) {
                        lbl_bola.setLocation(lbl_bola.getX() + vdisparo, lbl_bola.getY());
                        pausar(100);
                    }
                }
            }.start();
        }
    }

    public void setImagen(String nombImg, String formato) {
        setImagen(nombImg, formato, lbl_personaje.getWidth(), lbl_personaje.getHeight());
        lbl_personaje.setIcon(getImg());
    }

    public void MouseClicked(java.awt.event.MouseEvent evt) {

        if (evt.BUTTON1 == 1) {
            disparos(disparo);
        }

    }

    private boolean isArriba(int nuevaPocicion) {
        return nuevaPocicion > 0;
    }

    private boolean isAbajo(int nuevaPocicion) {
        return nuevaPocicion < getMaxY() -58;
    }
}
