/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.IF3000.BiblioTech.Interface;

import cr.ac.ucr.IF3000.BiblioTech.domain.AudioVisual;
import File.AudioVisualFile;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import cr.ac.ucr.IF3000.BiblioTech.Interface.LogMaterials;

/**
 *
 * @author Emmanuel
 */
public class LogAudioVisual extends javax.swing.JFrame {

    /**
     * Creates new form LogAudioVisula
     */
    
    public AudioVisualFile audioFile;
    public LogAudioVisual() {
        initComponents();
        tfd_problem.setVisible(false);
        uploadCode();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_title = new javax.swing.JLabel();
        rdb_books = new javax.swing.JRadioButton();
        lbl_name = new javax.swing.JLabel();
        tfd_name = new javax.swing.JTextField();
        lbl_brand = new javax.swing.JLabel();
        tfd_brand = new javax.swing.JTextField();
        lbl_model = new javax.swing.JLabel();
        tfd_model = new javax.swing.JTextField();
        lbl_code = new javax.swing.JLabel();
        tfd_code = new javax.swing.JTextField();
        lbl_amount = new javax.swing.JLabel();
        tfd_amount = new javax.swing.JTextField();
        btn_insertaudiovisual = new javax.swing.JButton();
        tfd_problem = new javax.swing.JTextField();
        btn_LogMaterialsBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(948, 555));
        setResizable(false);
        getContentPane().setLayout(null);

        lbl_title.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_title.setText("Log Materials");
        getContentPane().add(lbl_title);
        lbl_title.setBounds(219, 11, 247, 29);

        rdb_books.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rdb_books.setText("Books");
        rdb_books.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb_booksActionPerformed(evt);
            }
        });
        getContentPane().add(rdb_books);
        rdb_books.setBounds(265, 58, 100, 40);

        lbl_name.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbl_name.setText("Name of equitment");
        getContentPane().add(lbl_name);
        lbl_name.setBounds(90, 99, 230, 30);

        tfd_name.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(tfd_name);
        tfd_name.setBounds(420, 100, 253, 40);

        lbl_brand.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbl_brand.setText("Brand");
        getContentPane().add(lbl_brand);
        lbl_brand.setBounds(153, 164, 140, 30);

        tfd_brand.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tfd_brand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfd_brandActionPerformed(evt);
            }
        });
        getContentPane().add(tfd_brand);
        tfd_brand.setBounds(420, 160, 253, 40);

        lbl_model.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbl_model.setText("Model");
        getContentPane().add(lbl_model);
        lbl_model.setBounds(153, 222, 140, 30);

        tfd_model.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tfd_model.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfd_modelActionPerformed(evt);
            }
        });
        getContentPane().add(tfd_model);
        tfd_model.setBounds(420, 220, 253, 40);

        lbl_code.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbl_code.setText("Code");
        getContentPane().add(lbl_code);
        lbl_code.setBounds(151, 285, 140, 30);

        tfd_code.setEditable(false);
        tfd_code.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(tfd_code);
        tfd_code.setBounds(420, 280, 253, 40);

        lbl_amount.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbl_amount.setText("Amount");
        getContentPane().add(lbl_amount);
        lbl_amount.setBounds(139, 344, 140, 30);

        tfd_amount.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(tfd_amount);
        tfd_amount.setBounds(420, 340, 253, 40);

        btn_insertaudiovisual.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_insertaudiovisual.setText("Save audiovisual");
        btn_insertaudiovisual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insertaudiovisualActionPerformed(evt);
            }
        });
        getContentPane().add(btn_insertaudiovisual);
        btn_insertaudiovisual.setBounds(170, 410, 150, 40);

        tfd_problem.setEditable(false);
        tfd_problem.setForeground(new java.awt.Color(255, 0, 0));
        tfd_problem.setText("Find space within complet");
        getContentPane().add(tfd_problem);
        tfd_problem.setBounds(360, 410, 190, 40);

        btn_LogMaterialsBack.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_LogMaterialsBack.setText("Back");
        btn_LogMaterialsBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LogMaterialsBackActionPerformed(evt);
            }
        });
        getContentPane().add(btn_LogMaterialsBack);
        btn_LogMaterialsBack.setBounds(570, 410, 100, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fondoBasico.jpg"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(955, 555));
        jLabel2.setMinimumSize(new java.awt.Dimension(955, 555));
        jLabel2.setPreferredSize(new java.awt.Dimension(955, 555));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1030, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //method to upload the code
    public void uploadCode(){
        try {
            DecimalFormat formato = new DecimalFormat("00000");
            File file = new File("./AudioVisual.dat");
            audioFile = new AudioVisualFile(file);
            int number = audioFile.convertNumber();
            ++number;
            tfd_code.setText(""+formato.format(number));  
        } catch (IOException e) {
        }
    }
    
    //method to save audiovisual
    public void saveAudioVisual() throws IOException{
        File file = new File("./AudioVisual.dat");
        audioFile = new AudioVisualFile(file);
        String name = tfd_name.getText();
        String brand = tfd_brand.getText();
        String model = tfd_model.getText();
        int code = Integer.parseInt(tfd_code.getText());
        int amount = Integer.parseInt(tfd_amount.getText());
        AudioVisual audioVisual = new AudioVisual(name, brand, model, code, amount);
        audioFile.insertToEnd(audioVisual);
    }//end method
    
    private void rdb_booksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb_booksActionPerformed
        // TODO add your handling code here:
        LogMaterials log = new LogMaterials();
        log.setVisible(true);
        log.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_rdb_booksActionPerformed

    private void btn_insertaudiovisualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insertaudiovisualActionPerformed
        try {
            if(tfd_name.getText().equals("") || tfd_brand.getText().equals("") || tfd_model.getText().equals("") ||tfd_code.getText().equals("") || tfd_amount.getText().equals("")){
                tfd_problem.setVisible(true);
            }else{
                tfd_problem.setVisible(false);
                saveAudioVisual();
                tfd_name.setText("");
                tfd_brand.setText("");
                tfd_code.setText("");
                tfd_amount.setText("");
                tfd_model.setText("");
                tfd_name.requestFocus();
            }
        } catch (IOException e) {
            System.err.println("103- Problem to insert the book in the bibliotec");
        }
    }//GEN-LAST:event_btn_insertaudiovisualActionPerformed

    private void btn_LogMaterialsBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LogMaterialsBackActionPerformed
        // TODO add your handling code here:
        Principal p = new Principal();
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_LogMaterialsBackActionPerformed

    private void tfd_modelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfd_modelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfd_modelActionPerformed

    private void tfd_brandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfd_brandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfd_brandActionPerformed

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
            java.util.logging.Logger.getLogger(LogAudioVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogAudioVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogAudioVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogAudioVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogAudioVisual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_LogMaterialsBack;
    private javax.swing.JButton btn_insertaudiovisual;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbl_amount;
    private javax.swing.JLabel lbl_brand;
    private javax.swing.JLabel lbl_code;
    private javax.swing.JLabel lbl_model;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JRadioButton rdb_books;
    private javax.swing.JTextField tfd_amount;
    private javax.swing.JTextField tfd_brand;
    private javax.swing.JTextField tfd_code;
    private javax.swing.JTextField tfd_model;
    private javax.swing.JTextField tfd_name;
    private javax.swing.JTextField tfd_problem;
    // End of variables declaration//GEN-END:variables
}
