/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.demowsdos;
import java.net.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author EduardoZetina
 */
public class panIntro extends javax.swing.JPanel {

    /**
     * Creates new form panIntro
     */
    public panIntro() {
        initComponents();
        
        textIntro();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtIntro = new javax.swing.JTextArea();
        lblBacGro = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(228, 239, 22));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText(".");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 330, 100));

        txtIntro.setBackground(new java.awt.Color(0, 0, 0));
        txtIntro.setColumns(20);
        txtIntro.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        txtIntro.setForeground(new java.awt.Color(228, 239, 22));
        txtIntro.setRows(5);
        jScrollPane1.setViewportView(txtIntro);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 450, 290));
<<<<<<< HEAD
=======

        lblBacGro.setBackground(new java.awt.Color(0, 0, 0));
>>>>>>> 0e6bd1bbfd22d5ec829bf7b2bce6ad6b85c97f7c
        add(lblBacGro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 420));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBacGro;
    private javax.swing.JTextArea txtIntro;
    // End of variables declaration//GEN-END:variables

    private void textIntro() {
        try{

          // String strRuta= System.getProperty("user.dir");
          // JOptionPane.showMessageDialog(this, strRuta);
          //ImageIcon icon=new ImageIcon("src\\main\\java\\Miselaneous\\optiCat.png");
          //jLabel2.setIcon(icon);
          jLabel2.setText("O P T I C A T ");
          
          ImageIcon icon=new ImageIcon("src\\main\\java\\Miselaneous\\jaguar2.jpg");
          lblBacGro.setIcon(icon);
          
          this.txtIntro.setText("UploadWs-Tester-Java (ver:1.1) \n");
          this.txtIntro.setText(this.txtIntro.getText() + "This app aims to consume Opticat webservices\n");
          this.txtIntro.setText(this.txtIntro.getText() + "using a Java client\n\n");
          this.txtIntro.setText(this.txtIntro.getText() + "Functionallity:\n\n");
          this.txtIntro.setText(this.txtIntro.getText() + "* Using your Api Key\n");
          this.txtIntro.setText(this.txtIntro.getText() + "*   Get type Files\n");
          this.txtIntro.setText(this.txtIntro.getText() + "*   Upload a file for a Product and Product Line\n");
          this.txtIntro.setText(this.txtIntro.getText() + "*   Check the status of the file uploaded\n");
          this.txtIntro.setText(this.txtIntro.getText() + "* Logout to disable your Api Key\n");
          this.txtIntro.setText(this.txtIntro.getText() + "* Login to get a new Api Key\n\n");
      
          this.txtIntro.setEditable(false);         
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "The following error occurred: " + ex.getMessage());
        }
        

    }
}
