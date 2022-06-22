package juegonematodo;


import java.awt.Color;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andre
 */
public class CrosswordJF extends javax.swing.JFrame {

    /**
     * Creates new form CrosswordJF
     */
    
    boolean a=false;
    boolean b=false;
    boolean c=false;
    boolean d=false;
    boolean e=false;
    boolean f=false;
    boolean g=false;
    boolean h=false;
    boolean i=false;
    boolean j=false;
    boolean k=false;
    boolean l=false;
    ImageIcon imagen1 = new ImageIcon("crucigrama/preguntas.png");
     public Clip clip;
    public String ruta="/sonidos/";
    
    public CrosswordJF() {
        initComponents();
        pregun.setIcon(imagen1);
        setLocationRelativeTo(null);
        this.setResizable(false);
        setTitle("¿QUÉ APRENDIMOS DE RECICLAJE? ");
          ImageIcon img = new ImageIcon("icono/gusano2.png");
        this.setIconImage(img.getImage());
    }
    
    public void check(){
        
         // VERTICAL
        //VERDE
        String verdeV = jTextField69.getText().trim(); //V
        String verdeE = jTextField71.getText().trim(); //E
        String verdeR = jTextField70.getText().trim(); //R
        String verdeD = jTextField65.getText().trim(); //D
        String verdeW = jTextField68.getText().trim(); //E
        
        //QUEMAR
        String quemarQ = jTextField62.getText().trim(); 
        String quemarU = jTextField60.getText().trim(); 
        String quemarE = jTextField37.getText().trim(); 
        String quemarM = jTextField59.getText().trim(); 
        String quemarA = jTextField43.getText().trim(); 
        String quemarR = jTextField48.getText().trim(); 
       
        //NEGRO
        String negroN = jTextField33.getText().trim(); 
        String negroE = jTextField36.getText().trim(); 
        String negroG = jTextField30.getText().trim(); 
        String negroR = jTextField34.getText().trim(); 
        String negroO = jTextField35.getText().trim(); 
        
        //ACEITE
        String aceiteA = jTextField32.getText().trim(); 
        String aceiteC = jTextField29.getText().trim(); 
        String aceiteE = jTextField28.getText().trim(); 
        String aceiteI = jTextField31.getText().trim(); 
        String aceiteT = jTextField26.getText().trim(); 
        String aceiteW = jTextField76.getText().trim();
        
         //REDUCIR
        String reducirR = jTextField57.getText().trim(); 
        String reducirE = jTextField56.getText().trim(); 
        String reducirD = jTextField55.getText().trim(); 
        String reducirU = jTextField39.getText().trim(); 
        String reducirC = jTextField54.getText().trim(); 
        String reducirI = jTextField27.getText().trim();
        String reducirW = jTextField58.getText().trim();
        
        //BOTELLASPLASTICAS
        String bO = jTextField1.getText().trim(); 
        String bT = jTextField2.getText().trim(); 
        String bTr = jTextField3.getText().trim(); 
        String bF = jTextField4.getText().trim(); 
        String bFi = jTextField5.getText().trim(); 
        String bS = jTextField6.getText().trim();
        String bSe = jTextField7.getText().trim();
        String bE = jTextField8.getText().trim(); 
        String bN = jTextField9.getText().trim(); 
        String bTe = jTextField10.getText().trim(); 
        String bEl = jTextField11.getText().trim(); 
        String bTw = jTextField13.getText().trim(); 
        String bTh = jTextField41.getText().trim();
        String bFo = jTextField14.getText().trim();
        String bFiv = jTextField15.getText().trim(); 
        String bSix = jTextField16.getText().trim();
        String bSen = jTextField17.getText().trim();
        
        
        
        // HORIZONTAL
        //BLANCA
        String blancaB = jTextField52.getText().trim(); 
        String blancaL = jTextField53.getText().trim(); 
        String blancaA = jTextField43.getText().trim(); 
        String blancaN = jTextField44.getText().trim(); 
        String blancaC = jTextField42.getText().trim(); 
        String blancaW = jTextField61.getText().trim();
        
        //MATERAS
        
        String materasM = jTextField49.getText().trim(); 
        String materasA = jTextField51.getText().trim(); 
        String materasT = jTextField45.getText().trim(); 
        String materasE = jTextField47.getText().trim(); 
        String materasR = jTextField48.getText().trim(); 
        String materasW = jTextField46.getText().trim();
        String materasS = jTextField50.getText().trim();
        
        // RECICLAR
        String reciclarR = jTextField78.getText().trim(); 
        String reciclarE = jTextField37.getText().trim(); 
        String reciclarC = jTextField38.getText().trim(); 
        String reciclarI = jTextField27.getText().trim(); 
        String reciclarW = jTextField12.getText().trim(); 
        String reciclarL = jTextField10.getText().trim();
        String reciclarA = jTextField32.getText().trim();
        String reciclarX = jTextField34.getText().trim();
        
        // VERDE
        
        String verdeVE = jTextField75.getText().trim(); 
        String verdeEE = jTextField67.getText().trim(); 
        String verdeRE = jTextField66.getText().trim(); 
        String verdeDE = jTextField65.getText().trim(); 
        String verdeWE = jTextField64.getText().trim(); 
        
        
        //PAPEL
        String papelP = jTextField74.getText().trim(); 
        String papelA = jTextField73.getText().trim(); 
        String papelW = jTextField72.getText().trim(); 
        String papelE = jTextField71.getText().trim(); 
        String papelL = jTextField63.getText().trim(); 
        
        //REUTILIZAR
        String reuR = jTextField18.getText(); 
        String reuE = jTextField25.getText(); 
        String reuU = jTextField20.getText(); 
        String reuT = jTextField24.getText(); 
        String reuI = jTextField23.getText(); 
        String reuL = jTextField22.getText();
        String reuW = jTextField21.getText();
        String reuZ = jTextField19.getText();
        String reuA = jTextField16.getText();
        String reuX = jTextField77.getText();
        
         
       
        
        
        
        
        
        
       if(a==true && b==true && c==true && d==true && e==true && f==true && g==true && h==true && i==true && j==true && k==true && l==true){
           JOptionPane.showMessageDialog(null,"Felicitaciones Juego Completado");
                         try {
                        sonido("error");
                        } catch (LineUnavailableException ex) {
                            Logger.getLogger(RuletaPreguntas.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (IOException ex) {
                            Logger.getLogger(RuletaPreguntas.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (UnsupportedAudioFileException ex) {
                            Logger.getLogger(RuletaPreguntas.class.getName()).log(Level.SEVERE, null, ex);
                        }
            a=false;
            b=false;
            c=false;
            d=false;
            e=false;
            f=false;
            g=false;
            h=false;
            i=false;
            j=false;
            k=false;
            l=false;
           
       }
           else if (verdeV.toUpperCase().equals("V") && verdeE.toUpperCase().equals("E") && verdeR.toUpperCase().equals("R") && verdeD.toUpperCase().equals("D") && verdeW.toUpperCase().equals("E")){
            jTextField69.setBackground(Color.green);
            jTextField71.setBackground(Color.green);
            jTextField70.setBackground(Color.green);
            jTextField65.setBackground(Color.green);
            jTextField68.setBackground(Color.green);
            a=true;
        }else{
        }
        
        if (quemarU.toUpperCase().equals("U") && quemarQ.toUpperCase().equals("Q") && quemarE.toUpperCase().equals("E") && quemarM.toUpperCase().equals("M") && quemarA.toUpperCase().equals("A")  && quemarR.toUpperCase().equals("R")){
            jTextField62.setBackground(Color.green);
            jTextField60.setBackground(Color.green);
            jTextField37.setBackground(Color.green);
            jTextField59.setBackground(Color.green);
            jTextField43.setBackground(Color.green);
            jTextField48.setBackground(Color.green);
            b=true;
        }else{
        }
        
        if(negroN.toUpperCase().equals("N") && negroE.toUpperCase().equals("E") && negroG.toUpperCase().equals("G") && negroR.toUpperCase().equals("R") && negroO.toUpperCase().equals("O")){
            jTextField33.setBackground(Color.green);
            jTextField36.setBackground(Color.green);
            jTextField30.setBackground(Color.green);
            jTextField34.setBackground(Color.green);
            jTextField35.setBackground(Color.green);
            c=true;
           
        }else{
        }
       
        
        
        if(aceiteA.toUpperCase().equals("A") && aceiteC.toUpperCase().equals("C") && aceiteI.toUpperCase().equals("I") && aceiteE.toUpperCase().equals("E") && aceiteT.toUpperCase().equals("T")&& aceiteW.toUpperCase().equals("E")){
            jTextField32.setBackground(Color.green);
            jTextField29.setBackground(Color.green);
            jTextField28.setBackground(Color.green);
            jTextField31.setBackground(Color.green);
            jTextField26.setBackground(Color.green);
            jTextField76.setBackground(Color.green);
            d=true;
           
        }else{
        }
        
        
        
        if(reducirR.toUpperCase().equals("R") && reducirE.toUpperCase().equals("E") && reducirD.toUpperCase().equals("D") && reducirU.toUpperCase().equals("U") && reducirC.toUpperCase().equals("C")&& reducirI.toUpperCase().equals("I") && reducirW.toUpperCase().equals("R")){
            jTextField57.setBackground(Color.green);
            jTextField56.setBackground(Color.green);
            jTextField55.setBackground(Color.green);
            jTextField39.setBackground(Color.green);
            jTextField54.setBackground(Color.green);
            jTextField27.setBackground(Color.green);
            jTextField58.setBackground(Color.green);
            e=true;
        }else{
        }
        
        // HORIZONTAL
        
        
        
        if(blancaB.toUpperCase().equals("B") && blancaL.toUpperCase().equals("L") && blancaA.toUpperCase().equals("A") && blancaN.toUpperCase().equals("N") && blancaC.toUpperCase().equals("C")&& blancaW.toUpperCase().equals("A")){
            jTextField52.setBackground(Color.green);
            jTextField53.setBackground(Color.green);
            jTextField43.setBackground(Color.green);
            jTextField44.setBackground(Color.green);
            jTextField42.setBackground(Color.green);
            jTextField61.setBackground(Color.green);
            f=true;
           
        }else{
        }
        
        
        
        if(materasM.toUpperCase().equals("M") && materasA.toUpperCase().equals("A") && materasT.toUpperCase().equals("T") && materasE.toUpperCase().equals("E") && materasR.toUpperCase().equals("R")&& materasW.toUpperCase().equals("A")&& materasS.toUpperCase().equals("S")){
            jTextField49.setBackground(Color.green);
            jTextField51.setBackground(Color.green);
            jTextField45.setBackground(Color.green);
            jTextField47.setBackground(Color.green);
            jTextField48.setBackground(Color.green);
            jTextField46.setBackground(Color.green);
            jTextField50.setBackground(Color.green);
            g=true;
           
        }else{
        }
        
        
       
        
        if(reciclarR.toUpperCase().equals("R") && reciclarE.toUpperCase().equals("E") && reciclarC.toUpperCase().equals("C") && reciclarI.toUpperCase().equals("I") && reciclarW.toUpperCase().equals("C")&& reciclarL.toUpperCase().equals("L")&& reciclarA.toUpperCase().equals("A")  && reciclarX.toUpperCase().equals("R")){
            jTextField78.setBackground(Color.green);
            jTextField37.setBackground(Color.green);
            jTextField38.setBackground(Color.green);
            jTextField27.setBackground(Color.green);
            jTextField12.setBackground(Color.green);
            jTextField10.setBackground(Color.green);
            jTextField32.setBackground(Color.green);
            jTextField34.setBackground(Color.green);
            h=true;
           
        }else{
        }
       
        
        if (verdeVE.toUpperCase().equals("V") && verdeEE.toUpperCase().equals("E") && verdeRE.toUpperCase().equals("R") && verdeDE.toUpperCase().equals("D") && verdeWE.toUpperCase().equals("E")){
            jTextField75.setBackground(Color.green);
            jTextField67.setBackground(Color.green);
            jTextField66.setBackground(Color.green);
            jTextField65.setBackground(Color.green);
            jTextField64.setBackground(Color.green);
            i=true;
            
           
        }else{
        }
        
        
        if (papelP.toUpperCase().equals("P") && papelA.toUpperCase().equals("A") && papelW.toUpperCase().equals("P") && papelE.toUpperCase().equals("E") && papelL.toUpperCase().equals("L")){
            jTextField74.setBackground(Color.green);
            jTextField73.setBackground(Color.green);
            jTextField72.setBackground(Color.green);
            jTextField71.setBackground(Color.green);
            jTextField63.setBackground(Color.green);
            j=true;
            
           
        }else{
        }
        
  
        
        if (reuR.toUpperCase().equals("R") && reuE.toUpperCase().equals("E") && reuU.toUpperCase().equals("U") && reuT.toUpperCase().equals("T") && reuI.toUpperCase().equals("I")&& reuL.toUpperCase().equals("L") && reuW.toUpperCase().equals("I") && reuZ.toUpperCase().equals("Z") && reuA.toUpperCase().equals("A") && reuX.toUpperCase().equals("R")){
            jTextField18.setBackground(Color.green);
            jTextField25.setBackground(Color.green);
            jTextField20.setBackground(Color.green);
            jTextField24.setBackground(Color.green);
            jTextField23.setBackground(Color.green);
            jTextField22.setBackground(Color.green);
            jTextField21.setBackground(Color.green);
            jTextField19.setBackground(Color.green);
            jTextField16.setBackground(Color.green);
            jTextField77.setBackground(Color.green);
            k=true;
            
           
        }else{
        }
        if (bO.toUpperCase().equals("B") && bT.toUpperCase().equals("O") && bTr.toUpperCase().equals("T") && bF.toUpperCase().equals("E") && bFi.toUpperCase().equals("L")&& bS.toUpperCase().equals("L") && bSe.toUpperCase().equals("A") && bE.toUpperCase().equals("S") && bN.toUpperCase().equals("P") && bTe.toUpperCase().equals("L") && bEl.toUpperCase().equals("A")&& bTw.toUpperCase().equals("S") && bTh.toUpperCase().equals("T") && bFo.toUpperCase().equals("I") && bFiv.toUpperCase().equals("C") && bSix.toUpperCase().equals("A")&& bSen.toUpperCase().equals("S")){
            jTextField1.setBackground(Color.green);
            jTextField2.setBackground(Color.green);
            jTextField3.setBackground(Color.green);
            jTextField4.setBackground(Color.green);
            jTextField5.setBackground(Color.green);
            jTextField6.setBackground(Color.green);
            jTextField7.setBackground(Color.green);
            jTextField8.setBackground(Color.green);
            jTextField9.setBackground(Color.green);
            jTextField10.setBackground(Color.green);
            jTextField11.setBackground(Color.green);
            jTextField13.setBackground(Color.green);
            jTextField41.setBackground(Color.green);
            jTextField14.setBackground(Color.green);
            jTextField15.setBackground(Color.green);
            jTextField16.setBackground(Color.green);
            jTextField17.setBackground(Color.green);
            l=true;
           
        }else{
        } 
    
       
    }
    
    public void limpiar(){
        jTextField69.setText(""); //V
        jTextField71.setText(""); //E
        jTextField70.setText(""); //R
        jTextField65.setText(""); //D
        jTextField68.setText(""); //E
        jTextField69.setBackground(Color.white);
        jTextField71.setBackground(Color.white);
        jTextField70.setBackground(Color.white);
        jTextField65.setBackground(Color.white);
        jTextField68.setBackground(Color.white);
        
        //QUEMAR
        jTextField62.setText(""); 
        jTextField60.setText(""); 
        jTextField37.setText(""); 
        jTextField59.setText(""); 
        jTextField43.setText(""); 
        jTextField48.setText(""); 
        jTextField62.setBackground(Color.white);
        jTextField60.setBackground(Color.white);
        jTextField37.setBackground(Color.white);
        jTextField59.setBackground(Color.white);
        jTextField43.setBackground(Color.white);
        jTextField48.setBackground(Color.white);
       
        //NEGRO
        jTextField33.setText(""); 
        jTextField36.setText(""); 
        jTextField30.setText(""); 
        jTextField34.setText(""); 
        jTextField35.setText(""); 
        jTextField33.setBackground(Color.white);
        jTextField36.setBackground(Color.white);
        jTextField30.setBackground(Color.white);
        jTextField34.setBackground(Color.white);
        jTextField35.setBackground(Color.white);
        
        //ACEITE
        jTextField32.setText(""); 
        jTextField29.setText(""); 
        jTextField28.setText(""); 
        jTextField31.setText(""); 
        jTextField26.setText(""); 
        jTextField76.setText("");
        jTextField32.setBackground(Color.LIGHT_GRAY);
        jTextField29.setBackground(Color.LIGHT_GRAY);
        jTextField28.setBackground(Color.LIGHT_GRAY);
        jTextField31.setBackground(Color.LIGHT_GRAY);
        jTextField26.setBackground(Color.LIGHT_GRAY);
        jTextField76.setBackground(Color.LIGHT_GRAY);
        
         //REDUCIR
        jTextField57.setText(""); 
        jTextField56.setText(""); 
        jTextField55.setText(""); 
        jTextField39.setText(""); 
        jTextField54.setText(""); 
        jTextField27.setText("");
        jTextField58.setText("");
        jTextField57.setBackground(Color.white);
        jTextField56.setBackground(Color.white);
        jTextField55.setBackground(Color.white);
        jTextField39.setBackground(Color.white);
        jTextField54.setBackground(Color.white);
        jTextField27.setBackground(Color.white);
        jTextField58.setBackground(Color.white);
        
        //BOTELLASPLASTICAS
        jTextField1.setText(""); 
        jTextField2.setText(""); 
        jTextField3.setText(""); 
        jTextField4.setText(""); 
        jTextField5.setText(""); 
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText(""); 
        jTextField9.setText(""); 
        jTextField10.setText(""); 
        jTextField11.setText(""); 
        jTextField13.setText(""); 
        jTextField41.setText("");
        jTextField14.setText("");
        jTextField15.setText(""); 
        jTextField16.setText("");
        jTextField17.setText("");
        
        jTextField1.setBackground(Color.white);
        jTextField2.setBackground(Color.white);
        jTextField3.setBackground(Color.white);
        jTextField4.setBackground(Color.white);
        jTextField5.setBackground(Color.white);
        jTextField6.setBackground(Color.white);
        jTextField7.setBackground(Color.white);
        jTextField8.setBackground(Color.white);
        jTextField9.setBackground(Color.white);
        jTextField10.setBackground(Color.white);
        jTextField11.setBackground(Color.white);
        jTextField13.setBackground(Color.white);
        jTextField41.setBackground(Color.white);
        jTextField14.setBackground(Color.white);
        jTextField15.setBackground(Color.white);
        jTextField16.setBackground(Color.white);
        jTextField17.setBackground(Color.white);
        
        
        
        // HORIZONTAL
        //BLANCA
        jTextField52.setText(""); 
        jTextField53.setText(""); 
        jTextField43.setText(""); 
        jTextField44.setText(""); 
        jTextField42.setText(""); 
        jTextField61.setText("");
        jTextField52.setBackground(Color.LIGHT_GRAY);
        jTextField53.setBackground(Color.LIGHT_GRAY);
        jTextField43.setBackground(Color.LIGHT_GRAY);
        jTextField44.setBackground(Color.LIGHT_GRAY);
        jTextField42.setBackground(Color.LIGHT_GRAY);
        jTextField61.setBackground(Color.LIGHT_GRAY);
        
        //MATERAS
        
        jTextField49.setText(""); 
        jTextField51.setText(""); 
        jTextField45.setText(""); 
        jTextField47.setText(""); 
        jTextField48.setText(""); 
        jTextField46.setText("");
        jTextField50.setText("");
        jTextField49.setBackground(Color.white);
        jTextField51.setBackground(Color.white);
        jTextField45.setBackground(Color.white);
        jTextField47.setBackground(Color.white);
        jTextField48.setBackground(Color.white);
        jTextField46.setBackground(Color.white);
        jTextField50.setBackground(Color.white);
        
        // RECICLAR
        jTextField78.setText(""); 
        jTextField37.setText(""); 
        jTextField38.setText(""); 
        jTextField27.setText(""); 
        jTextField12.setText(""); 
        jTextField10.setText("");
        jTextField32.setText("");
        jTextField34.setText("");
        jTextField78.setBackground(Color.white);
        jTextField37.setBackground(Color.white);
        jTextField38.setBackground(Color.white);
        jTextField27.setBackground(Color.white);
        jTextField12.setBackground(Color.white);
        jTextField10.setBackground(Color.white);
        jTextField32.setBackground(Color.white);
        jTextField34.setBackground(Color.white);
        
        // VERDE
        
        jTextField75.setText(""); 
        jTextField67.setText(""); 
        jTextField66.setText(""); 
        jTextField65.setText(""); 
        jTextField64.setText(""); 
        jTextField75.setBackground(Color.LIGHT_GRAY);
        jTextField67.setBackground(Color.LIGHT_GRAY);
        jTextField66.setBackground(Color.LIGHT_GRAY);
        jTextField65.setBackground(Color.LIGHT_GRAY);
        jTextField64.setBackground(Color.LIGHT_GRAY);
        
        
        //PAPEL
        jTextField74.setText(""); 
        jTextField73.setText(""); 
        jTextField72.setText(""); 
        jTextField71.setText(""); 
        jTextField63.setText(""); 
        jTextField74.setBackground(Color.white);
        jTextField73.setBackground(Color.white);
        jTextField72.setBackground(Color.white);
        jTextField71.setBackground(Color.white);
        jTextField63.setBackground(Color.white);
        
        //REUTILIZAR
        jTextField18.setText(""); 
        jTextField25.setText(""); 
        jTextField20.setText(""); 
        jTextField24.setText(""); 
        jTextField23.setText(""); 
        jTextField22.setText("");
        jTextField21.setText("");
        jTextField19.setText("");
        jTextField16.setText("");
        jTextField77.setText("");
        jTextField18.setBackground(Color.white);
        jTextField25.setBackground(Color.white);
        jTextField20.setBackground(Color.white);
        jTextField24.setBackground(Color.white);
        jTextField23.setBackground(Color.white);
        jTextField22.setBackground(Color.white);
        jTextField21.setBackground(Color.white);
        jTextField19.setBackground(Color.white);
        jTextField16.setBackground(Color.white);
        jTextField77.setBackground(Color.white);
    
    
    
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pregun = new javax.swing.JLabel();
        jTextField52 = new javax.swing.JTextField();
        jTextField43 = new javax.swing.JTextField();
        jTextField53 = new javax.swing.JTextField();
        jTextField44 = new javax.swing.JTextField();
        jTextField42 = new javax.swing.JTextField();
        jTextField78 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField45 = new javax.swing.JTextField();
        jTextField47 = new javax.swing.JTextField();
        jTextField48 = new javax.swing.JTextField();
        jTextField46 = new javax.swing.JTextField();
        jTextField50 = new javax.swing.JTextField();
        jTextField51 = new javax.swing.JTextField();
        jTextField49 = new javax.swing.JTextField();
        jTextField59 = new javax.swing.JTextField();
        jTextField60 = new javax.swing.JTextField();
        jTextField62 = new javax.swing.JTextField();
        jTextField37 = new javax.swing.JTextField();
        jTextField38 = new javax.swing.JTextField();
        jTextField61 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jTextField32 = new javax.swing.JTextField();
        jTextField34 = new javax.swing.JTextField();
        jTextField65 = new javax.swing.JTextField();
        jTextField66 = new javax.swing.JTextField();
        jTextField64 = new javax.swing.JTextField();
        jTextField67 = new javax.swing.JTextField();
        jTextField75 = new javax.swing.JTextField();
        jTextField68 = new javax.swing.JTextField();
        jTextField71 = new javax.swing.JTextField();
        jTextField69 = new javax.swing.JTextField();
        jTextField70 = new javax.swing.JTextField();
        jTextField63 = new javax.swing.JTextField();
        jTextField72 = new javax.swing.JTextField();
        jTextField73 = new javax.swing.JTextField();
        jTextField74 = new javax.swing.JTextField();
        jTextField54 = new javax.swing.JTextField();
        jTextField39 = new javax.swing.JTextField();
        jTextField56 = new javax.swing.JTextField();
        jTextField57 = new javax.swing.JTextField();
        jTextField55 = new javax.swing.JTextField();
        jTextField58 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField41 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField77 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jTextField31 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jTextField76 = new javax.swing.JTextField();
        jTextField35 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jTextField36 = new javax.swing.JTextField();
        jTextField33 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jButton1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jButton1.setText("VERIFICAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("1");

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("2");

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("3");

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("4");

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("5");

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("6");

        jLabel8.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("1");

        jLabel9.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("2");

        jLabel10.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("3");

        jLabel11.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("4");

        jLabel12.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("5");

        jLabel13.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 0));
        jLabel13.setText("6");

        jButton2.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jButton2.setText("LIMPIAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jButton3.setText("REGRESAR");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
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
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextField49, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextField51, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jTextField75, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextField67, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextField66, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jTextField74, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField73, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField72, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(26, 26, 26)
                                        .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField52, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(9, 9, 9)
                                        .addComponent(jTextField53, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField43, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextField59, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField78, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jTextField68, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jTextField60, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jTextField71, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField65, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField69, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField70, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jTextField64, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jTextField62, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(jTextField63, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(jLabel3)
                                                    .addGap(8, 8, 8))))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(74, 74, 74))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jTextField44, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jTextField50, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jTextField42, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jTextField61, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jTextField54, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jTextField38, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(jTextField39, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField56, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField57, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField55, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField58, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(4, 4, 4)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(41, 41, 41))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTextField45, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextField47, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField48, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField46, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4)
                                    .addGap(8, 8, 8))
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField76, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField77, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(331, 331, 331)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(pregun, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(215, 215, 215))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField69, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField73, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField74, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField70, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField75, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField78, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField76, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField77, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pregun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(66, 66, 66))
        );

        jTextField52.setBackground(Color.LIGHT_GRAY);
        jTextField43.setBackground(Color.LIGHT_GRAY);
        jTextField53.setBackground(Color.LIGHT_GRAY);
        jTextField44.setBackground(Color.LIGHT_GRAY);
        jTextField42.setBackground(Color.LIGHT_GRAY);
        jTextField61.setBackground(Color.LIGHT_GRAY);
        jTextField27.setBackground(Color.LIGHT_GRAY);
        jTextField32.setBackground(Color.LIGHT_GRAY);
        jTextField65.setBackground(Color.LIGHT_GRAY);
        jTextField66.setBackground(Color.LIGHT_GRAY);
        jTextField64.setBackground(Color.LIGHT_GRAY);
        jTextField67.setBackground(Color.LIGHT_GRAY);
        jTextField75.setBackground(Color.LIGHT_GRAY);
        jTextField54.setBackground(Color.LIGHT_GRAY);
        jTextField39.setBackground(Color.LIGHT_GRAY);
        jTextField56.setBackground(Color.LIGHT_GRAY);
        jTextField57.setBackground(Color.LIGHT_GRAY);
        jTextField55.setBackground(Color.LIGHT_GRAY);
        jTextField58.setBackground(Color.LIGHT_GRAY);
        jTextField29.setBackground(Color.LIGHT_GRAY);
        jTextField28.setBackground(Color.LIGHT_GRAY);
        jTextField31.setBackground(Color.LIGHT_GRAY);
        jTextField26.setBackground(Color.LIGHT_GRAY);
        jTextField76.setBackground(Color.LIGHT_GRAY);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        check();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        limpiar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
               Menu menu= new Menu();
               menu.setVisible(true);
               dispose();
    }//GEN-LAST:event_jButton3MouseClicked

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
            java.util.logging.Logger.getLogger(CrosswordJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrosswordJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrosswordJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrosswordJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrosswordJF().setVisible(true);
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField39;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField41;
    private javax.swing.JTextField jTextField42;
    private javax.swing.JTextField jTextField43;
    private javax.swing.JTextField jTextField44;
    private javax.swing.JTextField jTextField45;
    private javax.swing.JTextField jTextField46;
    private javax.swing.JTextField jTextField47;
    private javax.swing.JTextField jTextField48;
    private javax.swing.JTextField jTextField49;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField50;
    private javax.swing.JTextField jTextField51;
    private javax.swing.JTextField jTextField52;
    private javax.swing.JTextField jTextField53;
    private javax.swing.JTextField jTextField54;
    private javax.swing.JTextField jTextField55;
    private javax.swing.JTextField jTextField56;
    private javax.swing.JTextField jTextField57;
    private javax.swing.JTextField jTextField58;
    private javax.swing.JTextField jTextField59;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField60;
    private javax.swing.JTextField jTextField61;
    private javax.swing.JTextField jTextField62;
    private javax.swing.JTextField jTextField63;
    private javax.swing.JTextField jTextField64;
    private javax.swing.JTextField jTextField65;
    private javax.swing.JTextField jTextField66;
    private javax.swing.JTextField jTextField67;
    private javax.swing.JTextField jTextField68;
    private javax.swing.JTextField jTextField69;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField70;
    private javax.swing.JTextField jTextField71;
    private javax.swing.JTextField jTextField72;
    private javax.swing.JTextField jTextField73;
    private javax.swing.JTextField jTextField74;
    private javax.swing.JTextField jTextField75;
    private javax.swing.JTextField jTextField76;
    private javax.swing.JTextField jTextField77;
    private javax.swing.JTextField jTextField78;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel pregun;
    // End of variables declaration//GEN-END:variables
}
