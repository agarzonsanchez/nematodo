/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegonematodo;

import java.awt.Color;
import java.awt.event.MouseEvent;
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
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class Ahorcado extends javax.swing.JFrame {
    JLabel[][] Letra;
    String[] words = {"COLERA","DISENTERIA","HEPATITIS A","FIEBRE TIFOIDEA","DERMATITIS","CONTAMINACION POR PLOMO","DENGUE","METAHEMOGLOBINEMIA","MALARIA","TOXINAS CIANOBACTERIANAS","GIARDIASIS"};
    int cuenta=-1,error=0;
    JLabel[] Palabra;
    ImageIcon error1;
    int a=0,tamaño,malas=0,buenas=0;
     public Clip clip;
    public String ruta="/sonidos/";

    
    /**
     * Creates new form Ahorcado
     */
    public Ahorcado() {
        initComponents();
        llenarLetras();
        muñeco.setVisible(false);
        setLocationRelativeTo(null);
        this.setResizable(false);
        setTitle("AHORCADO");
        ImageIcon img = new ImageIcon("icono/gusano2.png");
        this.setIconImage(img.getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PLetras = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        muñeco = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PLetras.setLayout(new java.awt.GridLayout(6, 5));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("INICIAR");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setLayout(new java.awt.GridLayout(1, 10));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setText("REGRESAR");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
                        .addGap(40, 40, 40)
                        .addComponent(PLetras, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(muñeco, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(muñeco, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(PLetras, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addGap(54, 54, 54))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        
       siguiente();
       
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        Menu menu = new Menu();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
    public void siguiente()
    {
    limpiar();
    
    a=0;
        cuenta++;
        if(cuenta>10)
        {
             JOptionPane.showMessageDialog(null, "Palabras correctas: "+buenas+"  Palabras incorrectas: "+malas, "FIN" , JOptionPane.INFORMATION_MESSAGE);
             Menu menu = new Menu();
             menu.setVisible(true);
             dispose();
        }
        jPanel1.removeAll();
        muñeco.setIcon(null);
        error=0;
        jButton1.setText("SIGUIENTE");
        
       
        if(cuenta<11)
        {
             tamaño=words[cuenta].length();
            int cantidad=words[cuenta].length();
            
            Palabra = new JLabel[cantidad];
            String[] elegida=words[cuenta].split("");
            for (int j=0;j<cantidad;j++) {
         
               Palabra[j]=new JLabel("",javax.swing.SwingConstants.CENTER);
               Palabra[j].setName(elegida[j]);
               Palabra[j].setText("");
               if(elegida[j].equals(" "))
               {
                   Palabra[j].setBackground(Color.WHITE);
                   a++;
               }
               else
               Palabra[j].setBackground(Color.GREEN);
               Palabra[j].setFont(new java.awt.Font("Segoe UI Symbol", 1, 20));
               Palabra[j].setForeground(new java.awt.Color(0,5,2));
               Palabra[j].setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
               Palabra[j].setOpaque(true);//esto es para que se pueda ver el color de la casilla o cajonsito donde va la letra
               Palabra[j].setBorder(new javax.swing.border.LineBorder(Color.BLACK, 1));
               jPanel1.add(Palabra[j]);
               jLabel1.setText(elegida[j]);
               jLabel1.setVisible(false);
               
            }
            
        }
    }
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
            java.util.logging.Logger.getLogger(Ahorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ahorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ahorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ahorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ahorcado().setVisible(true);
            }
        });
    }
public void llenarLetras(){

    String[][] abecedario={{"A","B","C","D","E"},
                        {"F","G","H","I","J"},
                        {"K","L","M","N","O"},
                        {"P","Q","R","S","T"},
                        {"U","V","W","X","Y"},
                        {"","","Z","",""}};

    Letra = new JLabel[6][5];
    
         for (int i=0;i<6;i++) {
           for (int j=0;j<5;j++) {
         
               Letra[i][j]=new JLabel("",javax.swing.SwingConstants.CENTER);
               Letra[i][j].setName(abecedario[i][j]);
               Letra[i][j].setText(abecedario[i][j]);
               Letra[i][j].setBackground(Color.WHITE);
               Letra[i][j].setFont(new java.awt.Font("Segoe UI Symbol", 1, 20));
               Letra[i][j].setForeground(new java.awt.Color(0,5,2));
               Letra[i][j].setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
               Letra[i][j].setOpaque(true);//esto es para que se pueda ver el color de la casilla o cajonsito donde va la letra
               Letra[i][j].setBorder(new javax.swing.border.LineBorder(Color.BLACK, 1));//pone a la casiilla en borde con una linea negra
               Letra[i][j].addMouseListener(new java.awt.event.MouseAdapter() {//pone a la casilla a la escucha del mouse para saber cuando se esta dando clic
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        presioneClic(evt);//llama al metodo que debe ejecutarse cuando se da clic
                    }

                 
                });
                
                PLetras.add(Letra[i][j]);//coloca la pasilla en el panel Sopa_de_letra
               
       }
       }
         
    
}

  public void presioneClic(java.awt.event.MouseEvent evt) {
            if (evt.getComponent().getBackground().equals(Color.WHITE) && cuenta>=0)//verifica si la casilla esta de color blanco 
            {
                
               String[] elegida=words[cuenta].split("");
               String seleccionada=evt.getComponent().getName();
               int correcto=0;
               
               for(int i=0; i<elegida.length;i++)
               {
                   if(seleccionada.equals(elegida[i]))
                   {
                     Palabra[i].setText(seleccionada);
                      evt.getComponent().setBackground(Color.GREEN);
                      correcto++;
                      a++;
                   }
                   
               }
               if(a==tamaño)
               {
                   try {
                        sonido("aplausos");
                        } catch (LineUnavailableException ex) {
                            Logger.getLogger(RuletaPreguntas.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (IOException ex) {
                            Logger.getLogger(RuletaPreguntas.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (UnsupportedAudioFileException ex) {
                            Logger.getLogger(RuletaPreguntas.class.getName()).log(Level.SEVERE, null, ex);
                        }
                   JOptionPane.showMessageDialog(null, "Bien", "Correcto" , JOptionPane.INFORMATION_MESSAGE);
                     siguiente();
                     
                     error=0;
                     muñeco.setIcon(null);
                     buenas++;
               }
               if(correcto==0)
               {
                 evt.getComponent().setBackground(Color.RED);//si esta de color blanco la pone de color azul
                 try {
                        sonido("error");
                        } catch (LineUnavailableException ex) {
                            Logger.getLogger(RuletaPreguntas.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (IOException ex) {
                            Logger.getLogger(RuletaPreguntas.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (UnsupportedAudioFileException ex) {
                            Logger.getLogger(RuletaPreguntas.class.getName()).log(Level.SEVERE, null, ex);
                        }
                 error1=new ImageIcon("ahorcado/error"+error+".png");
                 muñeco.setIcon(error1);
                 muñeco.setVisible(true);
                 error++;
                 if(error>4)
                 {
                     
                    JOptionPane.showMessageDialog(null, "Juego terminado la palabra era "+words[cuenta], "Perdiste" , JOptionPane.INFORMATION_MESSAGE);
                     siguiente();
                     error=0;
                     muñeco.setIcon(null);
                     malas++;
                 }
               }
                
            }else if(evt.getComponent().getBackground().equals(Color.RED))//pregunta si la casilla no tiene una letra de alguna palabra
            {
               
            }
 }
  public void limpiar(){
        for (int i=0;i<6;i++) {
           for (int j=0;j<5;j++) {
           
               Letra[i][j].setBackground(Color.WHITE);
           
           
           }}
  
  
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
    private javax.swing.JPanel PLetras;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel muñeco;
    // End of variables declaration//GEN-END:variables
}
