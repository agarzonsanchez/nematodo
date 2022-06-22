/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegonematodo;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class Comparacion extends javax.swing.JFrame {
    
    ImageIcon gusano = new ImageIcon("sistemas/completo.png");
    ImageIcon imagen12 = new ImageIcon("sistemas/digestivo2.png");
    ImageIcon imagen13 = new ImageIcon("sistemas/digestivo-3.png");
    ImageIcon imagen14 = new ImageIcon("sistemas/nervioso2.png");
    ImageIcon imagen15 = new ImageIcon("sistemas/reproductor2.png");
    ImageIcon imagen1 = new ImageIcon("sistemas/circulatorio.png");
    ImageIcon imagen2 = new ImageIcon("sistemas/digestivo.png");
    ImageIcon imagen3 = new ImageIcon("sistemas/hormonal.png");
    ImageIcon imagen4 = new ImageIcon("sistemas/linfatico.png");
    ImageIcon imagen5 = new ImageIcon("sistemas/muscular.png");
    ImageIcon imagen6 = new ImageIcon("sistemas/nervioso.png");
    ImageIcon imagen7 = new ImageIcon("sistemas/oseo.png");
    ImageIcon imagen8 = new ImageIcon("sistemas/reproductor.png");
    ImageIcon imagen9 = new ImageIcon("sistemas/respiratorio.png");
    ImageIcon imagen10 = new ImageIcon("sistemas/urinario.png");
    ImageIcon primero = new ImageIcon("sistemas/primero.png");
    ImageIcon segundo = new ImageIcon("sistemas/segundo.png");
    ImageIcon tercero = new ImageIcon("sistemas/tercero.png");
    
    int sistemaHombre=0,sistemaGusano=0,accion=0;
    JFrame mensaje = new JFrame();
    public Clip clip;
    public String ruta="/sonidos/";
    /**
     * Creates new form Comparacion
     */
    public Comparacion() {
        initComponents();
        completo.setIcon(gusano);
        muestra.setVisible(false);
        //sistemaGu.setVisible(false);
        panel12.setVisible(false);
        this.setResizable(false);
        setTitle("¿EN QUE NOS PARECEMOS? ");
        gu2.setVisible(false);
        gu3.setVisible(false);
          ImageIcon img = new ImageIcon("icono/gusano2.png");
        this.setIconImage(img.getImage());
        setLocationRelativeTo(null);
        
        //completo.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        completo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        B1 = new javax.swing.JButton();
        B10 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        B7 = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        B9 = new javax.swing.JButton();
        muestra = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        gu1 = new javax.swing.JButton();
        gu2 = new javax.swing.JButton();
        gu3 = new javax.swing.JButton();
        panel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton5.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jButton5.setText("Comparar");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jButton1.setText("Regresar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        B1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        B1.setText("Circulatorio");
        B1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B1MouseClicked(evt);
            }
        });

        B10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        B10.setText("Urinario");
        B10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B10MouseClicked(evt);
            }
        });

        B2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        B2.setText("Digestivo");
        B2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B2MouseClicked(evt);
            }
        });

        B3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        B3.setText("Hormonal");
        B3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B3MouseClicked(evt);
            }
        });

        B4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        B4.setText("Linfático ");
        B4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B4MouseClicked(evt);
            }
        });

        B5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        B5.setText("Muscular");
        B5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B5MouseClicked(evt);
            }
        });

        B6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        B6.setText("Nervioso");
        B6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B6MouseClicked(evt);
            }
        });

        B7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        B7.setText("Óseo");
        B7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B7MouseClicked(evt);
            }
        });

        B8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        B8.setText("Reproductor");
        B8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B8MouseClicked(evt);
            }
        });

        B9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        B9.setText("Respiratorio");
        B9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(muestra, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(B10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(muestra, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(B10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(176, 176, 176))
        );

        gu1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        gu1.setText("Sistema 1");
        gu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gu1MouseClicked(evt);
            }
        });

        gu2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        gu2.setText("Sistema 2");
        gu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gu2MouseClicked(evt);
            }
        });

        gu3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        gu3.setText("Sistema 3");
        gu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gu3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panel12, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(gu2)
                            .addComponent(gu3)
                            .addComponent(gu1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(104, Short.MAX_VALUE)
                .addComponent(gu1)
                .addGap(18, 18, 18)
                .addComponent(gu2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(gu3)
                .addGap(18, 18, 18)
                .addComponent(panel12, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(completo, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jButton1)
                        .addGap(274, 274, 274)
                        .addComponent(jButton5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(completo, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(22, 33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B1MouseClicked
         muestra.setVisible(true);
         muestra.setIcon(imagen1);
         sistemaHombre=1;
         
    }//GEN-LAST:event_B1MouseClicked

    private void B2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B2MouseClicked
        muestra.setVisible(true);
         muestra.setIcon(imagen2);
         sistemaHombre=2;
    }//GEN-LAST:event_B2MouseClicked

    private void B3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B3MouseClicked
                muestra.setVisible(true);
                 muestra.setIcon(imagen3);
                 sistemaHombre=3;
    }//GEN-LAST:event_B3MouseClicked

    private void B4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B4MouseClicked
        muestra.setVisible(true);
                 muestra.setIcon(imagen4);
                 sistemaHombre=4;
    }//GEN-LAST:event_B4MouseClicked

    private void B5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B5MouseClicked
        muestra.setVisible(true);
                 muestra.setIcon(imagen5);
                 sistemaHombre=5;
    }//GEN-LAST:event_B5MouseClicked

    private void B6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B6MouseClicked
        muestra.setVisible(true);
                 muestra.setIcon(imagen6);
                 sistemaHombre=6;
    }//GEN-LAST:event_B6MouseClicked

    private void B7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B7MouseClicked
        muestra.setVisible(true);
                 muestra.setIcon(imagen7);
                 sistemaHombre=7;
    }//GEN-LAST:event_B7MouseClicked

    private void B8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B8MouseClicked
        muestra.setVisible(true);
                 muestra.setIcon(imagen8);
                 sistemaHombre=8;
    }//GEN-LAST:event_B8MouseClicked

    private void B9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B9MouseClicked
       muestra.setVisible(true);
                 muestra.setIcon(imagen9);
                 sistemaHombre=9;
    }//GEN-LAST:event_B9MouseClicked

    private void B10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B10MouseClicked
        muestra.setVisible(true);
                 muestra.setIcon(imagen10);
                 sistemaHombre=10;
    }//GEN-LAST:event_B10MouseClicked

    private void gu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gu1MouseClicked
        //sistemaGu.setVisible(false);
        panel12.setVisible(true);
       // completo.setVisible(false);
        
        panel12.setIcon(imagen13);
        sistemaGusano=1;
    }//GEN-LAST:event_gu1MouseClicked

    private void gu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gu2MouseClicked
        panel12.setVisible(true);
       // panel12.setVisible(false);
      //  completo.setVisible(false);
        panel12.setIcon(imagen14);
       sistemaGusano=2;
    }//GEN-LAST:event_gu2MouseClicked

    private void gu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gu3MouseClicked
         panel12.setVisible(true);
        //panel12.setVisible(false);
        //completo.setVisible(false);
        panel12.setIcon(imagen15);
        sistemaGusano=3;
    }//GEN-LAST:event_gu3MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        Menu menu= new Menu();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        if(accion==0)
        {
            if(sistemaHombre==2)
            {
                completo.setIcon(primero);
                accion++;
                gu1.setVisible(false);
                gu2.setVisible(true);
                gu3.setVisible(false);
                B2.setVisible(false);
                panel12.setVisible(false);
                try {
                        sonido("aplausos");
                        } catch (LineUnavailableException ex) {
                            Logger.getLogger(RuletaPreguntas.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (IOException ex) {
                            Logger.getLogger(RuletaPreguntas.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (UnsupportedAudioFileException ex) {
                            Logger.getLogger(RuletaPreguntas.class.getName()).log(Level.SEVERE, null, ex);
                        }
            }
            else
            {
                try {
                        sonido("error");
                        } catch (LineUnavailableException ex) {
                            Logger.getLogger(RuletaPreguntas.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (IOException ex) {
                            Logger.getLogger(RuletaPreguntas.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (UnsupportedAudioFileException ex) {
                            Logger.getLogger(RuletaPreguntas.class.getName()).log(Level.SEVERE, null, ex);
                        }
                JOptionPane.showMessageDialog(mensaje,"Error, Sistema no coincide");
            }
        }
        else if(accion==1)
        {
            if(sistemaHombre==6)
            {
                completo.setIcon(segundo);
                accion++;
                gu1.setVisible(false);
                gu3.setVisible(true);
                gu2.setVisible(false);
                B6.setVisible(false);
                panel12.setVisible(false);
                try {
                        sonido("aplausos");
                        } catch (LineUnavailableException ex) {
                            Logger.getLogger(RuletaPreguntas.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (IOException ex) {
                            Logger.getLogger(RuletaPreguntas.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (UnsupportedAudioFileException ex) {
                            Logger.getLogger(RuletaPreguntas.class.getName()).log(Level.SEVERE, null, ex);
                        }
            }
            else
            {
                try {
                        sonido("error");
                        } catch (LineUnavailableException ex) {
                            Logger.getLogger(RuletaPreguntas.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (IOException ex) {
                            Logger.getLogger(RuletaPreguntas.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (UnsupportedAudioFileException ex) {
                            Logger.getLogger(RuletaPreguntas.class.getName()).log(Level.SEVERE, null, ex);
                        }
                JOptionPane.showMessageDialog(mensaje,"Error, Sistema no coincide");
            }
        }
        else if(accion==2)
        {
            if(sistemaHombre==8)
            {
                completo.setIcon(tercero);
                
                gu1.setVisible(false);
                gu2.setVisible(false);
                gu3.setVisible(false);
                B8.setVisible(false);
                panel12.setVisible(false);
                JOptionPane.showMessageDialog(mensaje,"Felicidades, has completado el juego");
                try {
                        sonido("aplausos");
                        } catch (LineUnavailableException ex) {
                            Logger.getLogger(RuletaPreguntas.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (IOException ex) {
                            Logger.getLogger(RuletaPreguntas.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (UnsupportedAudioFileException ex) {
                            Logger.getLogger(RuletaPreguntas.class.getName()).log(Level.SEVERE, null, ex);
                        }
            }
            else
            {
                try {
                        sonido("error");
                        } catch (LineUnavailableException ex) {
                            Logger.getLogger(RuletaPreguntas.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (IOException ex) {
                            Logger.getLogger(RuletaPreguntas.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (UnsupportedAudioFileException ex) {
                            Logger.getLogger(RuletaPreguntas.class.getName()).log(Level.SEVERE, null, ex);
                        }
                JOptionPane.showMessageDialog(mensaje,"Error, Sistema no coincide");
            }
        }
    }//GEN-LAST:event_jButton5MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Comparacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Comparacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Comparacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Comparacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Comparacion().setVisible(true);
            }
        });
    }
public void sonido(String archivo)throws LineUnavailableException , IOException , UnsupportedAudioFileException{
     
        BufferedInputStream bis = new BufferedInputStream(getClass().getResourceAsStream(ruta + archivo + ".wav"));
        AudioInputStream ais = AudioSystem.getAudioInputStream(bis);
        Clip sonido=AudioSystem.getClip();
        sonido.open(ais);
        sonido.start();
        clip=sonido;
        
    
 }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B1;
    private javax.swing.JButton B10;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton B7;
    private javax.swing.JButton B8;
    private javax.swing.JButton B9;
    private javax.swing.JLabel completo;
    private javax.swing.JButton gu1;
    private javax.swing.JButton gu2;
    private javax.swing.JButton gu3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel muestra;
    private javax.swing.JLabel panel12;
    // End of variables declaration//GEN-END:variables
}