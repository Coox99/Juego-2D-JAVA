package Script;

import Esena.LluviaEsteroides1;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Enemigo extends Personaje {
     
    private Colicion colision;
    private boolean activo = true;
    private JPanel esenario;
    private JLabel lbl_enemigo;
    private ImageIcon explosion;
    
    public Enemigo(JPanel esenario, int x) {
        super(x, (int) (Math.random() * (esenario.getHeight() - 100) + 20));
        this.esenario = esenario;
        this.setVelocidad(3);
        colision = new Colicion();
        explosion = new ImageIcon(getClass().getResource("/Imagen/explosion.gif"));
    }
    
    public void creaEnemigo(int ancho, int alto, int resistemcia) {
        lbl_enemigo = new JLabel();
        lbl_enemigo.setLocation(getX() + 80, (int) (Math.random() * (esenario.getHeight() - 150) + 40));
        lbl_enemigo.setSize(ancho, alto);
        lbl_enemigo.setVisible(true);
        setImg(escalarImg(img, ancho, alto));
        lbl_enemigo.setIcon(getImg());
        colision.creaColicionObjeto(esenario, lbl_enemigo, "disparo");
        this.esenario.add(lbl_enemigo);
        colision.start();
        
        new Thread() {
            @Override
            public void run() {
                
                while (activo) {
                    lbl_enemigo.setLocation(lbl_enemigo.getX() - velocidad, lbl_enemigo.getY());
                    pausar(100);
                    if (colision.isColision()) {
                        eliminar(resistencia);
                    }
                }
            }
        }.start();
    }
    
    public void eliminar(int resistemcia) {
        new Thread() {
            @Override
            public void run() {
                colision.setColision(false);
                colision.setActive(false);
                activo = false;
                LluviaEsteroides1.puntos = LluviaEsteroides1.puntos + resistemcia;
                LluviaEsteroides1.lbl_cantidadM.setText("" + LluviaEsteroides1.puntos);
                lbl_enemigo.setSize(lbl_enemigo.getWidth()+40, lbl_enemigo.getHeight()+40);
                lbl_enemigo.setIcon(escalarImg(explosion,  lbl_enemigo.getWidth(), lbl_enemigo.getHeight()));
                pausar(500);
                esenario.remove(lbl_enemigo);
                
            }
        }.start();
    }
}
