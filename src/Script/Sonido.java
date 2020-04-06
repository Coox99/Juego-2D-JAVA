package Script;

import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class Sonido extends Thread {

    Player apl;

    private String direccion;

    public Sonido(String direccion) {
        try {
            apl = new Player(getClass().getResourceAsStream(direccion));
        } catch (Exception e) {
        }
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public void run() {
        try {
            apl.play();
        } catch (JavaLayerException ex) {

        }
    }
}
