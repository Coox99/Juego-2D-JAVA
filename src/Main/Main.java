package Main;

import Esena.Menu;
import Esenario.Frm_Tablero;

public class Main {

    public static void main(String[] args) {
        Frm_Tablero frm = new Frm_Tablero();
        Menu esena = new Menu(frm);
        frm.setSize(esena.getWidth(), esena.getHeight());
        esena.setVisible(true);
        frm.setResizable(false);
        frm.add(esena);
        frm.setVisible(true);
        frm.setLocationRelativeTo(null);
    }

}
