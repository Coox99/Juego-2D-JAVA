package Esena;

import Script.GeneraEnemigo;
import Script.Heroe;
import Script.Sonido;
import Script.Tiempo;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class LluviaEsteroides1 extends javax.swing.JPanel implements KeyListener {

    private Heroe heroe;
    private GeneraEnemigo enemigo;
    private ImageIcon fondo;
    private ImageIcon moneda;
    private Tiempo t;
    private Sonido s;
    public static int puntos = 0;
    private JFrame frm;

    public LluviaEsteroides1(JFrame frm, String nave) {
        initComponents();
        this.frm = frm;
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.Imagen("fondo1", "jpg");
        this.lbl_personaje.setSize(121, 126);
        this.lbl_personaje.setLocation(40, 50);
        this.p_espacio.setSize(WIDTH, (int) (screenSize.getHeight() - 150));
        this.heroe = new Heroe(p_espacio, lbl_personaje, lbl_personaje.getX(), lbl_personaje.getY());
        this.heroe.setImagen(nave, "png");
        this.heroe.setFrm(frm);
        this.lbl_personaje.addKeyListener(this);
        this.btn_evento.addKeyListener(this);
        this.addMouseWheelListener(new mouse());
        this.btn_evento.setSelected(true);

        run((int) screenSize.getWidth());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p_cabecera = new javax.swing.JPanel();
        lbl_tiempo = new javax.swing.JLabel();
        lbl_moneda = new javax.swing.JLabel();
        lbl_cantidadM = new javax.swing.JLabel();
        p_espacio = new javax.swing.JPanel();
        lbl_personaje = new javax.swing.JLabel();
        btn_evento = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        p_cabecera.setOpaque(false);

        lbl_tiempo.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lbl_tiempo.setForeground(new java.awt.Color(255, 255, 255));

        lbl_moneda.setName("jhgk"); // NOI18N

        lbl_cantidadM.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lbl_cantidadM.setForeground(new java.awt.Color(255, 255, 255));
        lbl_cantidadM.setText("0");

        javax.swing.GroupLayout p_cabeceraLayout = new javax.swing.GroupLayout(p_cabecera);
        p_cabecera.setLayout(p_cabeceraLayout);
        p_cabeceraLayout.setHorizontalGroup(
            p_cabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_cabeceraLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lbl_moneda, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_cantidadM, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        p_cabeceraLayout.setVerticalGroup(
            p_cabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_cabeceraLayout.createSequentialGroup()
                .addGroup(p_cabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_cabeceraLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(p_cabeceraLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(p_cabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_moneda, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_cantidadM))))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        p_espacio.setBorder(new javax.swing.border.MatteBorder(null));
        p_espacio.setOpaque(false);
        p_espacio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p_espacioMouseClicked(evt);
            }
        });
        p_espacio.setLayout(null);

        lbl_personaje.setName("HEROE"); // NOI18N
        p_espacio.add(lbl_personaje);
        lbl_personaje.setBounds(40, 70, 121, 126);

        btn_evento.setBorder(null);
        btn_evento.setContentAreaFilled(false);
        btn_evento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eventoActionPerformed(evt);
            }
        });
        p_espacio.add(btn_evento);
        btn_evento.setBounds(0, 200, 0, 0);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p_cabecera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p_espacio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(p_cabecera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(p_espacio, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void p_espacioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_espacioMouseClicked
        heroe.MouseClicked(evt);
    }//GEN-LAST:event_p_espacioMouseClicked

    private void btn_eventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eventoActionPerformed

    }//GEN-LAST:event_btn_eventoActionPerformed

    public JFrame getFrm() {
        return frm;
    }

    @Override
    public void keyTyped(KeyEvent ke) {
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        heroe.keyPressed(ke);
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        heroe.keyPressed(ke);

    }

    public void Imagen(String nombreImg, String formato) {
        fondo = new ImageIcon(getClass().getResource("/Imagen/" + nombreImg + "." + formato));
    }

    public ImageIcon getFondo() {
        return fondo;
    }

    @Override
    public void paint(Graphics grphcs) {
        grphcs.drawImage(getFondo().getImage(), 0, 0, getWidth(), getHeight(), null);
        setOpaque(false);
        super.paint(grphcs); //To change body of generated methods, choose Tools | Templates.
    }

    private class mouse implements MouseWheelListener {

        @Override
        public void mouseWheelMoved(MouseWheelEvent mwe) {
            heroe.MouseWheelMoved(mwe);
        }
    }

    private void run(int ancho) {
        new Thread() {
            @Override
            public void run() {
                moneda = new ImageIcon(getClass().getResource("/Imagen/moneda.png"));
                lbl_moneda.setIcon(heroe.escalarImg(moneda, 30, 30));
                lbl_tiempo.setSize(110, 32);
                s = new Sonido("/Sonido/lluviaEsteroides1.mp3");
                t = new Tiempo(lbl_tiempo, 3, "m");
                t.start();
                s.start();
                enemigo = new GeneraEnemigo(p_espacio, ancho + 100);
                enemigo.setT(t);
                enemigo.crearSprite("asteroide", "png", 6);
                enemigo.start();
            }
        }.start();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_evento;
    public static javax.swing.JLabel lbl_cantidadM;
    private javax.swing.JLabel lbl_moneda;
    private javax.swing.JLabel lbl_personaje;
    private javax.swing.JLabel lbl_tiempo;
    private javax.swing.JPanel p_cabecera;
    private javax.swing.JPanel p_espacio;
    // End of variables declaration//GEN-END:variables

}
