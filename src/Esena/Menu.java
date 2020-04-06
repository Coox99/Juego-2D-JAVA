package Esena;

import Esenario.Frm_Tablero;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Menu extends javax.swing.JPanel {

    private ImageIcon fondo;
    private ImageIcon esena;
    private JFrame frm;
    private ImageIcon[] nave;
    private String strnave = "nave0";

    public Menu(JFrame frm) {
        initComponents();
        this.frm = frm;
        nave = new ImageIcon[4];
        JLabel[] lbl = {lbl_nave, lbl_nave1, lbl_nave2, lbl_nave3};
        nave(lbl);
        setSize(543, 600);
        fondo = new ImageIcon(getClass().getResource("/Imagen/fondo.png"));
        lbl_visor.setIcon(new ImageIcon(nave[0].getImage().getScaledInstance(290, 304, Image.SCALE_DEFAULT)));
        esena = new ImageIcon(getClass().getResource("/Imagen/lluviAsteroide1.png"));
        lbl_esena1.setIcon(new ImageIcon(esena.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        lbl_visor = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbl_nave = new javax.swing.JLabel();
        lbl_nave1 = new javax.swing.JLabel();
        lbl_nave3 = new javax.swing.JLabel();
        lbl_nave2 = new javax.swing.JLabel();
        lbl_esena1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(" Asteroides");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Creador");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        lbl_nave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_nave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_naveMouseClicked(evt);
            }
        });

        lbl_nave1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_nave1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_nave1MouseClicked(evt);
            }
        });

        lbl_nave3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_nave3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_nave3MouseClicked(evt);
            }
        });

        lbl_nave2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_nave2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_nave2MouseClicked(evt);
            }
        });

        lbl_esena1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_esena1MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("JUGAR");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_esena1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(lbl_visor, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_nave, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_nave1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_nave3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_nave2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
            .addGroup(layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lbl_nave, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(lbl_nave1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_nave2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(lbl_nave3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lbl_visor, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbl_esena1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_naveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_naveMouseClicked
        lbl_visor.setIcon(new ImageIcon(nave[0].getImage().getScaledInstance(290, 304, Image.SCALE_DEFAULT)));
        strnave = "nave0";
    }//GEN-LAST:event_lbl_naveMouseClicked

    private void lbl_nave1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_nave1MouseClicked
        lbl_visor.setIcon(new ImageIcon(nave[1].getImage().getScaledInstance(290, 304, Image.SCALE_DEFAULT)));
        strnave = "nave1";
    }//GEN-LAST:event_lbl_nave1MouseClicked

    private void lbl_nave2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_nave2MouseClicked
        lbl_visor.setIcon(new ImageIcon(nave[2].getImage().getScaledInstance(290, 304, Image.SCALE_DEFAULT)));
        strnave = "nave2";
    }//GEN-LAST:event_lbl_nave2MouseClicked

    private void lbl_nave3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_nave3MouseClicked
        lbl_visor.setIcon(new ImageIcon(nave[3].getImage().getScaledInstance(290, 304, Image.SCALE_DEFAULT)));
        strnave = "nave3";
    }//GEN-LAST:event_lbl_nave3MouseClicked

    private void lbl_esena1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_esena1MouseClicked
        lbl_visor.setIcon(new ImageIcon(esena.getImage().getScaledInstance(290, 304, Image.SCALE_DEFAULT)));
    }//GEN-LAST:event_lbl_esena1MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        frm.dispose();
        Frm_Tablero frm2 = new Frm_Tablero();
        frm2.pantallaMax();
        frm2.setVisible(true);
        LluviaEsteroides1 esena = new LluviaEsteroides1(frm2, strnave);
        frm2.add(esena);
        esena.setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        jLabel3.setForeground(Color.white);
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        jLabel3.setForeground(new Color(51, 51, 51));
    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        JOptionPane.showMessageDialog(this, "Cooxito");
    }//GEN-LAST:event_jLabel1MouseClicked

    private void nave(JLabel lbl[]) {
        for (int i = 0; i < lbl.length; i++) {
            nave[i] = new ImageIcon(getClass().getResource("/Imagen/nave" + i + ".png"));
            lbl[i].setIcon(new ImageIcon(nave[i].getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbl_esena1;
    private javax.swing.JLabel lbl_nave;
    private javax.swing.JLabel lbl_nave1;
    private javax.swing.JLabel lbl_nave2;
    private javax.swing.JLabel lbl_nave3;
    private javax.swing.JLabel lbl_visor;
    // End of variables declaration//GEN-END:variables
}
