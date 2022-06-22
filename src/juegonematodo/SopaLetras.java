/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegonematodo;

//import static com.sun.management.jmx.Trace.isSelected;
//import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
import java.awt.Color;
import java.awt.Component;
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
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus
 */
public class SopaLetras extends javax.swing.JFrame {
    
String sopa[][]={{"A","N","E","M","A","T","O","D","O","D","N","C","I","A"}
        ,{"X","L","A","F","R","L","A","L","P","U","C","R","N","M"}
        ,{"A","R","O","D","E","E","L","I","C","O","B","I","V","B"}
        ,{"N","P","E","D","O","I","O","O","I","D","M","L","E","I"}
        ,{"T","E","O","E","Q","I","O","A","L","Q","M","A","S","E"}
        ,{"R","M","A","S","A","O","P","R","T","F","I","R","T","N"}
        ,{"B","A","C","T","E","R","I","A","S","C","Y","V","I","T"}
        ,{"L","A","R","P","D","C","N","V","N","C","T","A","G","E"}
        ,{"H","U","E","V","O","S","E","E","R","T","C","S","A","I"}
        ,{"L","I","C","O","L","V","I","N","E","E","M","V","C","M"}
        ,{"O","O","I","D","D","C","S","R","Y","S","O","E","I","Y"}
        ,{"G","U","S","A","N","O","E","O","D","T","L","R","O","O"}
        ,{"C","I","C","L","O","D","E","V","I","D","A","E","N","P"}};

String sopa1[][]={{"","1","1","1","1","1","1","1","1","","","","1","1"}
        ,{"","","","","","1","","","","","","","1","1"}
        ,{"","","","","1","","","","","","","","1","1"}
        ,{"","","","1","","","","","","","","1","1","1"}
        ,{"","","1","","","","","","","","","1","1","1"}
        ,{"","1","","","","","","","","","1","1","1","1"}
        ,{"1","1","1","1","1","1","1","1","1","1","","1","1","1"}
        ,{"","","","","","","","","1","","","1","1","1"}
        ,{"1","1","1","1","1","1","","1","","","","1","1",""}
        ,{"","","","","","","1","","","","","","1",""}
        ,{"","","","","","1","","","","","","","1",""}
        ,{"1","1","1","1","1","1","","","","","","","1",""}
        ,{"1","1","1","1","1","1","1","1","1","1","1","","1",""}};

String  nombreColumnas[]={"0","1","2","3","4","5","6","7","8","9","10","11","12","13"};
JLabel[][] Letra;
JLabel palabra[];
int cuenta=0;
public Clip clip;
    public String ruta="/sonidos/";
boolean gano,uno=false,dos=false,tres=false,cuatro=false,cinco=false,seis=false,siete=false,ocho=false,nueve=false,diez=false;
    /**
     * Creates new form SopaLetras
     */
    public SopaLetras() {
          
          initComponents();
          crear(); 
          this.setLocationRelativeTo(null);
           this.setResizable(false);
           setTitle("¿QUIÉN ES C.ELEGANS?");
             ImageIcon img = new ImageIcon("src/icono/gusano2.png");
        this.setIconImage(img.getImage());
           this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
   public void crear(){
       
     Letra = new JLabel[13][14];
       for (int i=0;i<13;i++) {
           for (int j=0;j<14;j++) {
         
               Letra[i][j]=new JLabel("",javax.swing.SwingConstants.CENTER);
               Letra[i][j].setName(sopa1[i][j]);
               Letra[i][j].setText(sopa[i][j]);
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
                
                panel.add(Letra[i][j]);//coloca la pasilla en el panel Sopa_de_letra
               
       }
       
           
       }
       
   }
   
     public void presioneClic(java.awt.event.MouseEvent evt) {
        
            if (evt.getComponent().getBackground().equals(Color.WHITE))//verifica si la casilla esta de color blanco 
            {
                if(evt.getComponent().getName().equals("1"))
                 {
                     evt.getComponent().setBackground(new java.awt.Color(51, 204, 255));//si esta de color blanco la pone de color azul
                 }
                
                
            }else if(evt.getComponent().getName().equals(""))//pregunta si la casilla no tiene una letra de alguna palabra
            {
                evt.getComponent().setBackground(Color.WHITE);//pone la casilla de color blanco
            }
        
        verficar();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp1 = new javax.swing.JLabel();
        jp2 = new javax.swing.JLabel();
        jp3 = new javax.swing.JLabel();
        jp7 = new javax.swing.JLabel();
        jp5 = new javax.swing.JLabel();
        jp6 = new javax.swing.JLabel();
        jp9 = new javax.swing.JLabel();
        jp4 = new javax.swing.JLabel();
        jp10 = new javax.swing.JLabel();
        jp8 = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jp1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jp1.setText("    Nematodo");

        jp2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jp2.setText("    Gusano");

        jp3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jp3.setText("    Ambiente");

        jp7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jp7.setText("    Investigacion");

        jp5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jp5.setText("    Ciencia");

        jp6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jp6.setText("    Modelo");

        jp9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jp9.setText("    Huevos");

        jp4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jp4.setText("    Bacterias");

        jp10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jp10.setText("    Larvas");

        jp8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jp8.setText("    Ciclo de Vida");

        panel.setBackground(new java.awt.Color(51, 0, 255));
        panel.setLayout(new java.awt.GridLayout(13, 14));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("Regresar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jp7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(jp6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jp5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jp4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jp3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jp8, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                            .addComponent(jp9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jp10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(jp1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jp2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 1135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jp1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jp2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jp4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 273, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(53, 53, 53))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        Menu menu = new Menu();
        menu.setVisible(true);
        dispose(); 
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(SopaLetras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SopaLetras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SopaLetras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SopaLetras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SopaLetras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jp1;
    private javax.swing.JLabel jp10;
    private javax.swing.JLabel jp2;
    private javax.swing.JLabel jp3;
    private javax.swing.JLabel jp4;
    private javax.swing.JLabel jp5;
    private javax.swing.JLabel jp6;
    private javax.swing.JLabel jp7;
    private javax.swing.JLabel jp8;
    private javax.swing.JLabel jp9;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables

    private void verficar() {
        JFrame mensaje = new JFrame();
       if(!Letra[0][1].getBackground().equals(Color.WHITE)&&
               !Letra[0][2].getBackground().equals(Color.WHITE)&&
               !Letra[0][3].getBackground().equals(Color.WHITE)&&
               !Letra[0][4].getBackground().equals(Color.WHITE)&&
               !Letra[0][5].getBackground().equals(Color.WHITE)&&
               !Letra[0][6].getBackground().equals(Color.WHITE)&&
               !Letra[0][7].getBackground().equals(Color.WHITE)&&
               !Letra[0][8].getBackground().equals(Color.WHITE)&&!uno)
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
           jp1.setText("<html><body><s>"+jp1.getText()+"</s></body></html>");
           uno=true;
           cuenta++;
          
           JOptionPane.showMessageDialog(mensaje, "Nematodo: Conocidos  como “gusanos redondos” o “gusanos cilíndricos”, son un grupo de animales\n"
                                                 + "            pequeños extremadamente numerosos quienes poseen una estructura corporal  sencilla que \n"
                                                 + "            les hace capaces de acceder a los sitios más recónditos y aprovechar los recursos más\n"
                                                 + "            inaccesibles. ");
       }
         if(!Letra[11][0].getBackground().equals(Color.WHITE)&&
               !Letra[11][1].getBackground().equals(Color.WHITE)&&
               !Letra[11][2].getBackground().equals(Color.WHITE)&&
               !Letra[11][3].getBackground().equals(Color.WHITE)&&
               !Letra[11][4].getBackground().equals(Color.WHITE)&&
               !Letra[11][5].getBackground().equals(Color.WHITE)&&!dos)
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
           jp2.setText("<html><body><s>"+jp2.getText()+"</s></body></html>");
           dos=true;
           cuenta++;
          
           JOptionPane.showMessageDialog(mensaje,"Gusano: Son pequeños animales conocidos científicamente como nematodos\n"
                                               + "          quienes se alimentan de materia orgánica en descomposición y permiten\n"
                                               + "          la continuidad de los ciclos biogeoquímicos ");
       }
         
           if(!Letra[0][13].getBackground().equals(Color.WHITE)&&
               !Letra[1][13].getBackground().equals(Color.WHITE)&&
               !Letra[2][13].getBackground().equals(Color.WHITE)&&
               !Letra[3][13].getBackground().equals(Color.WHITE)&&
               !Letra[4][13].getBackground().equals(Color.WHITE)&&
               !Letra[5][13].getBackground().equals(Color.WHITE)&&
               !Letra[6][13].getBackground().equals(Color.WHITE)&&
               !Letra[7][13].getBackground().equals(Color.WHITE)&&!tres)
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
           jp3.setText("<html><body><s>"+jp3.getText()+"</s></body></html>");
           tres=true;
           cuenta++;
          
           JOptionPane.showMessageDialog(mensaje,"Ambiente: Es el conjunto de factores externos (atmosféricos, climáticos,\n"
                                               + "             hidrológicos, geológicos y biológicos) que actúan sobre un\n"
                                               + "             organismo, una población o una comunidad para formar el entorno\n"
                                               + "             que poseen los seres vivos y condiciona sus circunstancias vitales\n"
                                               + "             de un lugar un grupo y una especie");
       }
       if(!Letra[6][0].getBackground().equals(Color.WHITE)&&
               !Letra[6][1].getBackground().equals(Color.WHITE)&&
               !Letra[6][2].getBackground().equals(Color.WHITE)&&
               !Letra[6][3].getBackground().equals(Color.WHITE)&&
               !Letra[6][4].getBackground().equals(Color.WHITE)&&
               !Letra[6][5].getBackground().equals(Color.WHITE)&&
               !Letra[6][6].getBackground().equals(Color.WHITE)&&
               !Letra[6][7].getBackground().equals(Color.WHITE)&&
                 !Letra[6][8].getBackground().equals(Color.WHITE)&&!cuatro)
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
           jp4.setText("<html><body><s>"+jp4.getText()+"</s></body></html>");
           cuatro=true;
           cuenta++;
        
           JOptionPane.showMessageDialog(mensaje,"Bacterias: Son microorganismos procariotas unicelulares, que se encuentran\n"
                                               + "              en casi todas las partes de la Tierra. Son vitales para los ecosistemas del\n"
                                               + "              planeta y algunas especies pueden ser patógenas para el ser humano.");
       }
       if(!Letra[10][5].getBackground().equals(Color.WHITE)&&
               !Letra[9][6].getBackground().equals(Color.WHITE)&&
               !Letra[8][7].getBackground().equals(Color.WHITE)&&
               !Letra[7][8].getBackground().equals(Color.WHITE)&&
               !Letra[6][9].getBackground().equals(Color.WHITE)&&
               !Letra[5][10].getBackground().equals(Color.WHITE)&&
               !Letra[4][11].getBackground().equals(Color.WHITE)&&!cinco)
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
           jp5.setText("<html><body><s>"+jp5.getText()+"</s></body></html>");
           cinco=true;
           cuenta++;
       
           JOptionPane.showMessageDialog(mensaje,"Ciencia: Conjunto de conocimientos obtenidos mediante la observación\n"
                                               + "            y el razonamiento , sistemáticamente estructurados y de los que se\n"
                                               + "            deducen principios y leyes generales con capacidad predictiva y\n"
                                               + "            comprobables experimentalmente.");
       }
        if(!Letra[5][1].getBackground().equals(Color.WHITE)&&
               !Letra[4][2].getBackground().equals(Color.WHITE)&&
               !Letra[3][3].getBackground().equals(Color.WHITE)&&
               !Letra[2][4].getBackground().equals(Color.WHITE)&&
               !Letra[1][5].getBackground().equals(Color.WHITE)&&
               !Letra[0][6].getBackground().equals(Color.WHITE)&&!seis)
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
           jp6.setText("<html><body><s>"+jp6.getText()+"</s></body></html>");
           seis=true;
           cuenta++;
        
           JOptionPane.showMessageDialog(mensaje,"Modelo: Representación en pequeño de algún proceso humano con el fin de comprender\n"
                                               + "           y explicar la realidad a fin de poder hacer predicciones científicas.");
       }
        if(!Letra[0][12].getBackground().equals(Color.WHITE)&&
               !Letra[1][12].getBackground().equals(Color.WHITE)&&
               !Letra[2][12].getBackground().equals(Color.WHITE)&&
               !Letra[3][12].getBackground().equals(Color.WHITE)&&
               !Letra[4][12].getBackground().equals(Color.WHITE)&&
               !Letra[5][12].getBackground().equals(Color.WHITE)&&
               !Letra[6][12].getBackground().equals(Color.WHITE)&&
                !Letra[7][12].getBackground().equals(Color.WHITE)&&
                !Letra[8][12].getBackground().equals(Color.WHITE)&&
                !Letra[9][12].getBackground().equals(Color.WHITE)&&
                !Letra[10][12].getBackground().equals(Color.WHITE)&&
                !Letra[11][12].getBackground().equals(Color.WHITE)&&
                !Letra[12][12].getBackground().equals(Color.WHITE)&&!siete)
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
           jp7.setText("<html><body><s>"+jp7.getText()+"</s></body></html>");
           siete=true;
           cuenta++;
        
           JOptionPane.showMessageDialog(mensaje,"Investigación:  Es un proceso intelectual y experimental que comprende un conjunto\n"
                                               + "                   de métodos aplicados de modo sistemático, con la finalidad de indagar\n"
                                               + "                   sobre un asunto o tema, así como de ampliar o desarrollar su conocimiento.");
       }
         if(!Letra[12][0].getBackground().equals(Color.WHITE)&&
               !Letra[12][1].getBackground().equals(Color.WHITE)&&
               !Letra[12][2].getBackground().equals(Color.WHITE)&&
               !Letra[12][3].getBackground().equals(Color.WHITE)&&
               !Letra[12][4].getBackground().equals(Color.WHITE)&&
               !Letra[12][5].getBackground().equals(Color.WHITE)&&
               !Letra[12][6].getBackground().equals(Color.WHITE)&&
                !Letra[12][7].getBackground().equals(Color.WHITE)&&
                !Letra[12][8].getBackground().equals(Color.WHITE)&&
                !Letra[12][9].getBackground().equals(Color.WHITE)&&
                !Letra[12][10].getBackground().equals(Color.WHITE)&&!ocho)
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
           jp8.setText("<html><body><s>"+jp8.getText()+"</s></body></html>");
           ocho=true;
           cuenta++;
       
           JOptionPane.showMessageDialog(mensaje,"Ciclo de vida: \n "
                                                + "Es el proceso vital de un organismo desde "
                                                + "su nacimiento hasta su muerte"
                                               );
       }
          if(!Letra[8][0].getBackground().equals(Color.WHITE)&&
               !Letra[8][1].getBackground().equals(Color.WHITE)&&
               !Letra[8][2].getBackground().equals(Color.WHITE)&&
               !Letra[8][3].getBackground().equals(Color.WHITE)&&
               !Letra[8][4].getBackground().equals(Color.WHITE)&&
               !Letra[8][5].getBackground().equals(Color.WHITE)&&!nueve)
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
           jp9.setText("<html><body><s>"+jp9.getText()+"</s></body></html>");
           nueve=true;
           cuenta++;
           
            JOptionPane.showMessageDialog(mensaje,"Huevos: Cuerpo redondo u ovalado, con una membrana o cáscara exterior, que ponen las hembras\n"
                                               + "           de algunos animales y que contiene en su interior el embrión de un nuevo ser y el\n"
                                               + "           alimento necesario para que crezca.");
       }
        if(!Letra[3][11].getBackground().equals(Color.WHITE)&&
               !Letra[4][11].getBackground().equals(Color.WHITE)&&
               !Letra[5][11].getBackground().equals(Color.WHITE)&&
               !Letra[6][11].getBackground().equals(Color.WHITE)&&
               !Letra[7][11].getBackground().equals(Color.WHITE)&&
               !Letra[8][11].getBackground().equals(Color.WHITE)&&!diez)
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
           jp10.setText("<html><body><s>"+jp10.getText()+"</s></body></html>");
           diez=true;
           cuenta++;
          
           JOptionPane.showMessageDialog(mensaje,"Larvas: Son las fases juveniles de los animales con desarrollo indirecto y que tienen una anatomía,\n"
                                                +"           fisiología y ecología diferente del adulto");
       }
        if(cuenta==10)
        {
            JOptionPane.showMessageDialog(null, "Juego terminado  ", "Felicidades" , JOptionPane.INFORMATION_MESSAGE);
           
           
        }
    }
  public void sonido(String archivo)throws LineUnavailableException , IOException , UnsupportedAudioFileException{
     
        BufferedInputStream bis = new BufferedInputStream(getClass().getResourceAsStream(ruta + archivo + ".wav"));
        AudioInputStream ais = AudioSystem.getAudioInputStream(bis);
        Clip sonido=AudioSystem.getClip();
        sonido.open(ais);
        sonido.start();
        clip=sonido;
        
    
 }
}


