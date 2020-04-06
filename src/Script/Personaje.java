package Script;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Personaje{

    String nombre;
    int x;
    int y;
    int maxY;
    int maxX;
    int resistencia;
    ImageIcon img;
    int velocidad;
    int velocidadAtaq;

    public Personaje() {
    }

    public Personaje(int x, int y) {
        
        this.x = x;
        this.y = y;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public ImageIcon getImg() {
        return img;
    }

    public void setImg(ImageIcon img) {
        this.img = img;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getMaxY() {
        return maxY;
    }

    public void setMaxY(int maxY) {
        this.maxY = maxY;
    }

    public int getVelocidadAtaq() {
        return velocidadAtaq;
    }

    public void setImagen(String nombImg, String formato, int ancho, int alto) {
        ImageIcon img = new ImageIcon(getClass().getResource("/Imagen/" + nombImg + "." + formato));
        setImg(escalarImg(img, ancho, alto));
    }

    public ImageIcon escalarImg(ImageIcon img, int ancho, int alto){
        return   new ImageIcon(img.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
    }
    
    public void pausar(int tiempo) {
        try {
            Thread.sleep(tiempo);
        } catch (InterruptedException ex) {
        }
    }
}
