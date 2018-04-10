/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.IF3000.BiblioTech.Interface;

import cr.ac.ucr.IF3000.BiblioTech.Interface.LogAudioVisual;
import cr.ac.ucr.IF3000.BiblioTech.domain.Books;
import File.AudioVisualFile;
import File.BooksFile;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;

/**
 *
 * @author Emmanuel
 */
public class LogMaterials extends javax.swing.JFrame {

    /**
     * Creates new form LogMaterials
     */
    public BooksFile book;
    
    public LogMaterials() {
        initComponents();
        tfd_problem.setVisible(false);
        book = new BooksFile();
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
        rdb_audiovisual = new javax.swing.JRadioButton();
        lbl_name = new javax.swing.JLabel();
        tfd_name = new javax.swing.JTextField();
        lbl_authors = new javax.swing.JLabel();
        tfd_authors = new javax.swing.JTextField();
        lbl_type = new javax.swing.JLabel();
        cb_type = new javax.swing.JComboBox();
        lbl_code = new javax.swing.JLabel();
        tfd_code = new javax.swing.JTextField();
        lbl_amount = new javax.swing.JLabel();
        tfd_amount = new javax.swing.JTextField();
        lbl_age = new javax.swing.JLabel();
        tfd_age = new javax.swing.JTextField();
        btn_insert = new javax.swing.JButton();
        tfd_problem = new javax.swing.JTextField();
        btn_MaterialsBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(948, 555));
        setResizable(false);
        getContentPane().setLayout(null);

        lbl_title.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_title.setText("Log Materials");
        getContentPane().add(lbl_title);
        lbl_title.setBounds(251, 11, 247, 29);

        rdb_audiovisual.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rdb_audiovisual.setText("Audiovisual");
        rdb_audiovisual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb_audiovisualActionPerformed(evt);
            }
        });
        getContentPane().add(rdb_audiovisual);
        rdb_audiovisual.setBounds(270, 50, 100, 40);

        lbl_name.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbl_name.setText("Title");
        getContentPane().add(lbl_name);
        lbl_name.setBounds(144, 117, 140, 30);

        tfd_name.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(tfd_name);
        tfd_name.setBounds(390, 100, 253, 40);

        lbl_authors.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbl_authors.setText("Authors");
        getContentPane().add(lbl_authors);
        lbl_authors.setBounds(150, 170, 140, 30);

        tfd_authors.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(tfd_authors);
        tfd_authors.setBounds(390, 160, 253, 40);

        lbl_type.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbl_type.setText("Type");
        getContentPane().add(lbl_type);
        lbl_type.setBounds(150, 230, 140, 30);

        cb_type.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cb_type.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Physical", "Digital" }));
        getContentPane().add(cb_type);
        cb_type.setBounds(390, 220, 100, 40);

        lbl_code.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbl_code.setText("Code");
        getContentPane().add(lbl_code);
        lbl_code.setBounds(150, 290, 140, 30);

        tfd_code.setEditable(false);
        tfd_code.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(tfd_code);
        tfd_code.setBounds(390, 280, 253, 40);

        lbl_amount.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbl_amount.setText("Amount");
        getContentPane().add(lbl_amount);
        lbl_amount.setBounds(160, 340, 140, 30);

        tfd_amount.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(tfd_amount);
        tfd_amount.setBounds(390, 340, 253, 40);

        lbl_age.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbl_age.setText("Age");
        getContentPane().add(lbl_age);
        lbl_age.setBounds(160, 400, 140, 30);

        tfd_age.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(tfd_age);
        tfd_age.setBounds(390, 400, 253, 40);

        btn_insert.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_insert.setText("Save book");
        btn_insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insertActionPerformed(evt);
            }
        });
        getContentPane().add(btn_insert);
        btn_insert.setBounds(300, 470, 100, 40);

        tfd_problem.setEditable(false);
        tfd_problem.setForeground(new java.awt.Color(255, 0, 0));
        tfd_problem.setText("Find space within complet");
        getContentPane().add(tfd_problem);
        tfd_problem.setBounds(60, 450, 190, 40);

        btn_MaterialsBack.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_MaterialsBack.setText("Back");
        btn_MaterialsBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MaterialsBackActionPerformed(evt);
            }
        });
        getContentPane().add(btn_MaterialsBack);
        btn_MaterialsBack.setBounds(540, 470, 100, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fondoBasico.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(948, 555));
        jLabel1.setMinimumSize(new java.awt.Dimension(948, 555));
        jLabel1.setPreferredSize(new java.awt.Dimension(948, 555));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1030, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //method to upload the code
    public void uploadCode(){
        try {
            File file = new File("./Books.dat");
            book = new BooksFile(file);
            String number = book.codeBook();
            tfd_code.setText(number);  
        } catch (IOException e) {
        }
    }
    
    //method to save books
    public void saveBook() throws IOException{
        File file = new File("./Books.dat");
        book = new BooksFile(file);
        String title = tfd_name.getText();
        String author = tfd_authors.getText();
        String type = cb_type.getSelectedItem().toString();
        String code = tfd_code.getText();
        int quantity = Integer.parseInt(tfd_amount.getText());
        int age = Integer.parseInt(tfd_age.getText());
        Books objBook = new Books(title, author, type, code, quantity, age);
        book.insertToEnd(objBook);
    }
    
    private void rdb_audiovisualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb_audiovisualActionPerformed
        // TODO add your handling code here:
        LogAudioVisual log = new LogAudioVisual();
        log.setVisible(true);
        log.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_rdb_audiovisualActionPerformed

    private void btn_MaterialsBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MaterialsBackActionPerformed
        // TODO add your handling code here:
        Principal p = new Principal();
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_MaterialsBackActionPerformed

    private void btn_insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insertActionPerformed
        // TODO add your handling code here:
        try{
        if(tfd_name.getText().equals("") || tfd_authors.getText().equals("") || cb_type.getSelectedItem().toString().equals("") ||tfd_code.getText().equals("") || tfd_amount.getText().equals("")||tfd_age.equals("")){
                tfd_problem.setVisible(true);
            }else{
                tfd_problem.setVisible(false);
                saveBook();
                tfd_name.setText("");
                tfd_authors.setText("");
                tfd_code.setText("");
                tfd_amount.setText("");
                tfd_age.setText("");
                tfd_name.requestFocus();
            }
        }catch(IOException ioe){
            System.err.println("103- Problem to insert the book in the bibliotec");
        }
    }//GEN-LAST:event_btn_insertActionPerformed

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
            java.util.logging.Logger.getLogger(LogMaterials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogMaterials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogMaterials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogMaterials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogMaterials().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_MaterialsBack;
    private javax.swing.JButton btn_insert;
    private javax.swing.JComboBox cb_type;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl_age;
    private javax.swing.JLabel lbl_amount;
    private javax.swing.JLabel lbl_authors;
    private javax.swing.JLabel lbl_code;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JLabel lbl_type;
    private javax.swing.JRadioButton rdb_audiovisual;
    private javax.swing.JTextField tfd_age;
    private javax.swing.JTextField tfd_amount;
    private javax.swing.JTextField tfd_authors;
    private javax.swing.JTextField tfd_code;
    private javax.swing.JTextField tfd_name;
    private javax.swing.JTextField tfd_problem;
    // End of variables declaration//GEN-END:variables
}