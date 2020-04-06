package Script;

import javax.swing.JLabel;

public class Tiempo extends Thread {

    private int seg;
    private int min;
    private JLabel lbl_tiempo;
    private int tiempoRequesito;
    private String fracccion_tiempo;
    private boolean  activo;

    public Tiempo(JLabel lbl_tiempo, int tiempoRequesito, String fracccion_tiempo) {
        this.lbl_tiempo = lbl_tiempo;
        this.tiempoRequesito = tiempoRequesito;
        this.fracccion_tiempo = fracccion_tiempo;
        if ("s".equals(fracccion_tiempo)) {
            this.seg = tiempoRequesito;
        } else {
            if ("m".equals(fracccion_tiempo)) {
                this.min = tiempoRequesito;
                this.seg = 1;
            }
        }
    }

    public Tiempo(int tiempoRequesito, String fracccion_tiempo) {
        this.tiempoRequesito = tiempoRequesito;
        this.fracccion_tiempo = fracccion_tiempo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    
    @Override
    public void run() { 
        setActivo(true);
        if (fracccion_tiempo.equals("s")) {
            while (seg != 0) {
                tiempo();
            }
            setActivo(false);
        } else {
            if (fracccion_tiempo.equals("m")) {
                do {
                    tiempo();
                    
                } while (!(min==0 && seg==0));
                setActivo(false);
            }
        }
    }

    private void pausar(int tiempo) {
        try {
            Thread.sleep(tiempo);
        } catch (InterruptedException ex) {
        }
    }

    private void tiempo() {
        seg--;
        pausar(1000);
        if (seg == 0) {
            if(min>0 ){
            min = min - 1;
              seg = 60;
            }
   
        }
        String s = seg > 9 ? ": " + seg : ": 0" + seg;
        String m = min > 9 ? "" + min : "0" + min;
        lbl_tiempo.setText("");
        lbl_tiempo.setText(m + s);

    }

}
