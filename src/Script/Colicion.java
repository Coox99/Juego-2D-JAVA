package Script;

import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Colicion extends Thread {

    private JPanel esenario;
    private String objeto;
    private int cantAnterior=0;
    private boolean colision;
    private JLabel dueño;
    private ArrayList<JLabel> lbl_objetos;
    private boolean  active=true;

    public Colicion() {
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void creaColicionObjeto(JPanel esenario, JLabel lbl_dueño, String objeto) {
        this.esenario = esenario;
        this.objeto = objeto;
        this.lbl_objetos = new ArrayList<>();
        this.dueño = lbl_dueño;
    }

    public void setColision(boolean colision) {
        this.colision = colision;
    }

    public boolean isColision() {
        return colision;
    }

    @Override
    public void run() {
        while (active) {
            if (cantAnterior != esenario.getComponentCount()) {
                recojerObjetos();
                cantAnterior = esenario.getComponentCount();
            }
            colisionCuadro();
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
            }
        }
    }

    public void recojerObjetos() {
          lbl_objetos.clear();
        for (int i = 0; i < esenario.getComponentCount(); i++) {
            String nombre = esenario.getComponent(i).getName();
            if (nombre!=null) {
                if(nombre.equals(objeto)){
                lbl_objetos.add((JLabel) esenario.getComponent(i));
                }
            }
        }
    }

    public boolean colicion(int x, int xf1, int y, int yf1, int x2, int xf2, int y2, int yf2) {
        return !(x > x2 + xf2 || x + xf1 < xf2 || y > y2 + yf2 || y + yf1 < y2);
    }

    private void colisionCuadro() {
        for (JLabel a : lbl_objetos) {
            colision = colicion(dueño.getX(), dueño.getWidth(), dueño.getY(), dueño.getHeight(), a.getX(), a.getWidth(), a.getY(), a.getHeight());
        }
    }
    

}
