/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vastra.pratiqueswing;

import com.sun.tools.javac.Main;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jessicadarosa
 */
public class Incription extends javax.swing.JFrame {

    /**
     * Creates new form Incription
     */
    public Incription() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boddyPn = new javax.swing.JPanel();
        nomLbl = new javax.swing.JLabel();
        prenomLbl = new javax.swing.JLabel();
        mailLbl = new javax.swing.JLabel();
        passwordLbl = new javax.swing.JLabel();
        nomTxtF = new javax.swing.JTextField();
        prenomTxtF = new javax.swing.JTextField();
        mailTxtF = new javax.swing.JTextField();
        passwordTxtF = new javax.swing.JPasswordField();
        submitBtn = new javax.swing.JButton();
        outputLbl = new javax.swing.JLabel();
        headPn = new javax.swing.JPanel();
        titreLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        boddyPn.setBackground(new java.awt.Color(204, 204, 255));

        nomLbl.setText("Nom:");

        prenomLbl.setText("Prenom:");

        mailLbl.setText("E-mail:");

        passwordLbl.setText("Password:");

        nomTxtF.setForeground(new java.awt.Color(102, 102, 102));
        nomTxtF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomTxtFActionPerformed(evt);
            }
        });

        prenomTxtF.setForeground(new java.awt.Color(102, 102, 102));

        mailTxtF.setForeground(new java.awt.Color(102, 102, 102));

        passwordTxtF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTxtFActionPerformed(evt);
            }
        });

        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout boddyPnLayout = new javax.swing.GroupLayout(boddyPn);
        boddyPn.setLayout(boddyPnLayout);
        boddyPnLayout.setHorizontalGroup(
            boddyPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, boddyPnLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(boddyPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomLbl)
                    .addComponent(prenomLbl)
                    .addComponent(mailLbl)
                    .addComponent(passwordLbl))
                .addGap(65, 65, 65)
                .addGroup(boddyPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(mailTxtF)
                    .addComponent(prenomTxtF)
                    .addComponent(nomTxtF)
                    .addComponent(passwordTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, boddyPnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(outputLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addComponent(submitBtn)
                .addGap(75, 75, 75))
        );
        boddyPnLayout.setVerticalGroup(
            boddyPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boddyPnLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(boddyPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomLbl))
                .addGap(12, 12, 12)
                .addGroup(boddyPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prenomTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prenomLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(boddyPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mailTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mailLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(boddyPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLbl)
                    .addComponent(passwordTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(boddyPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitBtn)
                    .addComponent(outputLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        outputLbl.getAccessibleContext().setAccessibleName("outputLbl");

        getContentPane().add(boddyPn, java.awt.BorderLayout.CENTER);

        headPn.setBackground(new java.awt.Color(153, 0, 153));

        titreLbl.setFont(new java.awt.Font("Academy Engraved LET", 1, 36)); // NOI18N
        titreLbl.setForeground(new java.awt.Color(255, 255, 255));
        titreLbl.setText("Formulaire d'inscription");

        javax.swing.GroupLayout headPnLayout = new javax.swing.GroupLayout(headPn);
        headPn.setLayout(headPnLayout);
        headPnLayout.setHorizontalGroup(
            headPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headPnLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(titreLbl)
                .addContainerGap(82, Short.MAX_VALUE))
        );
        headPnLayout.setVerticalGroup(
            headPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headPnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titreLbl))
        );

        getContentPane().add(headPn, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordTxtFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTxtFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTxtFActionPerformed

    private void nomTxtFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomTxtFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomTxtFActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        String nom = nomTxtF.getText();
        String prenom = prenomTxtF.getText();
        String email = mailTxtF.getText();
        char[] password = passwordTxtF.getPassword();

        try {
// TODO code application logic here
            Class c = Class.forName("com.mysql.cj.jdbc.Driver");
            Driver pilote = (Driver) c.newInstance();
            DriverManager.registerDriver(pilote);
            String protocole = "jdbc:mysql:";
            String ip = "localhost"; // dépend du contexte
            String port = "3306"; // port MySQL par défaut
// Nom de la base ;
            String nomBase = "init_java"; // dépend du contexte
// Chaîne de connexion
            String conString = protocole + "//" + ip + ":" + port + "/" + nomBase;
// Identifiants de connexion et mot de passe
            String nomConnexion = "root"; // dépend du contexte
            String motDePasse = ""; // dépend du contexte
// Connexion
            Connection con = DriverManager.getConnection(
                    conString, nomConnexion, motDePasse);
// Ecrire sur la BD
            String insertSql = "insert into utilisateus(id,nom,premom,email,password) Values(2,'"+
                    nom +"','"+ prenom +"','"+ email +"','"+ Arrays.toString(password) +"')";
            Statement smt = con.createStatement();
            int i = smt.executeUpdate(insertSql);
            outputLbl.setText(Integer.toString(i));
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                | SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_submitBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Incription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Incription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Incription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Incription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Incription().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel boddyPn;
    private javax.swing.JPanel headPn;
    private javax.swing.JLabel mailLbl;
    private javax.swing.JTextField mailTxtF;
    private javax.swing.JLabel nomLbl;
    private javax.swing.JTextField nomTxtF;
    private javax.swing.JLabel outputLbl;
    private javax.swing.JLabel passwordLbl;
    private javax.swing.JPasswordField passwordTxtF;
    private javax.swing.JLabel prenomLbl;
    private javax.swing.JTextField prenomTxtF;
    private javax.swing.JButton submitBtn;
    private javax.swing.JLabel titreLbl;
    // End of variables declaration//GEN-END:variables
}
