/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.IF3000.BiblioTech.Interface;

import File.RequestAudioVisualFile;
import File.RequestBookFile;
import cr.ac.ucr.IF3000.BiblioTech.domain.RequestAudioVisual;
import cr.ac.ucr.IF3000.BiblioTech.domain.RequestBook;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.StringTokenizer;

/**
 *
 * @author Max
 */
public class ReturnAudioVisual extends javax.swing.JFrame {

    /**
     * Creates new form ReturnAudioVisual
     */
    int numberDays=0;
    String dateFinal1="";
    String dateFinal2="";
    public ReturnAudioVisual() {
        initComponents();
        setLocationRelativeTo(null);
        lbl_InfoPenalty.setVisible(false);
        tfd_inputPenalty.setVisible(false);
        btn_donePenalty.setVisible(false);
        lbl_penaltyTotal.setVisible(false);
        
        
        lbl_salida.setVisible(false);
        lbl_entrada1.setVisible(false);
        tfd_Entrada.setVisible(false);
        tfd_Salida1.setVisible(false);  
        dtc_dayOfInput.setVisible(false);
        lbl_result.setVisible(false);
        btn_ReturnMaterial.setVisible(false);
        lbl_dayInput.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_salida = new javax.swing.JLabel();
        tfd_Salida1 = new javax.swing.JTextField();
        lbl_entrada1 = new javax.swing.JLabel();
        tfd_Entrada = new javax.swing.JTextField();
        lbl_dayInput = new javax.swing.JLabel();
        dtc_dayOfInput = new com.toedter.calendar.JDateChooser();
        btn_ReturnMaterial = new javax.swing.JButton();
        btn_ReturnBack = new javax.swing.JButton();
        lbl_infoSearch = new javax.swing.JLabel();
        tfd_searchLoan = new javax.swing.JTextField();
        btn_SearchLoan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lbl_result = new javax.swing.JTextArea();
        lbl_InfoPenalty = new javax.swing.JLabel();
        tfd_inputPenalty = new javax.swing.JTextField();
        btn_donePenalty = new javax.swing.JButton();
        lbl_penaltyTotal = new javax.swing.JLabel();
        lbl_StuRecedBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(948, 555));
        setResizable(false);
        getContentPane().setLayout(null);

        lbl_salida.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbl_salida.setText("Date of remove");
        getContentPane().add(lbl_salida);
        lbl_salida.setBounds(50, 10, 210, 29);

        tfd_Salida1.setEditable(false);
        tfd_Salida1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(tfd_Salida1);
        tfd_Salida1.setBounds(50, 50, 150, 40);

        lbl_entrada1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbl_entrada1.setText("Estimated delivery date");
        getContentPane().add(lbl_entrada1);
        lbl_entrada1.setBounds(50, 120, 300, 29);

        tfd_Entrada.setEditable(false);
        tfd_Entrada.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(tfd_Entrada);
        tfd_Entrada.setBounds(50, 160, 150, 40);

        lbl_dayInput.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbl_dayInput.setText("Date of delivery");
        getContentPane().add(lbl_dayInput);
        lbl_dayInput.setBounds(40, 260, 270, 29);

        dtc_dayOfInput.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(dtc_dayOfInput);
        dtc_dayOfInput.setBounds(50, 310, 150, 40);

        btn_ReturnMaterial.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_ReturnMaterial.setText("Calculate");
        btn_ReturnMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ReturnMaterialActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ReturnMaterial);
        btn_ReturnMaterial.setBounds(50, 360, 120, 40);

        btn_ReturnBack.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_ReturnBack.setText("Back");
        btn_ReturnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ReturnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ReturnBack);
        btn_ReturnBack.setBounds(40, 420, 150, 50);

        lbl_infoSearch.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbl_infoSearch.setText("Search the loan with the code of the student");
        getContentPane().add(lbl_infoSearch);
        lbl_infoSearch.setBounds(340, 10, 520, 40);

        tfd_searchLoan.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(tfd_searchLoan);
        tfd_searchLoan.setBounds(350, 60, 240, 40);

        btn_SearchLoan.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_SearchLoan.setText("Search");
        btn_SearchLoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SearchLoanActionPerformed(evt);
            }
        });
        getContentPane().add(btn_SearchLoan);
        btn_SearchLoan.setBounds(640, 60, 90, 40);

        lbl_result.setEditable(false);
        lbl_result.setColumns(20);
        lbl_result.setRows(5);
        jScrollPane1.setViewportView(lbl_result);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(350, 140, 380, 190);

        lbl_InfoPenalty.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbl_InfoPenalty.setText("Stablish a penalty.");
        getContentPane().add(lbl_InfoPenalty);
        lbl_InfoPenalty.setBounds(350, 350, 280, 30);

        tfd_inputPenalty.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(tfd_inputPenalty);
        tfd_inputPenalty.setBounds(360, 390, 240, 40);

        btn_donePenalty.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_donePenalty.setText("Done");
        btn_donePenalty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_donePenaltyActionPerformed(evt);
            }
        });
        getContentPane().add(btn_donePenalty);
        btn_donePenalty.setBounds(620, 390, 100, 40);

        lbl_penaltyTotal.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbl_penaltyTotal.setForeground(new java.awt.Color(255, 0, 0));
        lbl_penaltyTotal.setText("...");
        getContentPane().add(lbl_penaltyTotal);
        lbl_penaltyTotal.setBounds(360, 440, 380, 30);

        lbl_StuRecedBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fondoBasico.jpg"))); // NOI18N
        getContentPane().add(lbl_StuRecedBackground);
        lbl_StuRecedBackground.setBounds(0, 0, 970, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public boolean bisiesto(int año){
        boolean bandera = false;
        if (año%4==0 && año%100!=0 || año%400==0){
           bandera =true;  
        }
        
        
        return bandera;
    }
    //This method returns the days leaft for the year
    public int getDiasFinAño(int dia, int mes, int año){
       // bisiesto bs = new bisiesto();
        int cantDias=0,diasmes=0,resta=0;
        switch (mes){
            case 1:
             
             cantDias= 365-dia;
             break;
       
            case 2:

             
                 diasmes= 31;
                 resta = diasmes+dia;
               
                 
                 
          if (bisiesto(año)){
             cantDias = 366-resta;
        }
         else
        cantDias = 365-resta;
             
             break;
             
            case 3:
              
                 diasmes= 60;
                 resta = diasmes+dia;
                 cantDias = 366-resta;
             
              break;
              
              case 4:
              
                 diasmes= 91;
                 resta = diasmes+dia;
                 cantDias = 366-resta;
             
              break;
             
              case 5:
              
                 diasmes= 121;
                 resta = diasmes+dia;
                 cantDias = 366-resta;
            
              break;
              
               case 6:
              
                 diasmes= 152;
                 resta = diasmes+dia;
                 cantDias = 366-resta;
             
              break;
              
              case 7:
              
                 diasmes= 182;
                 resta = diasmes+dia;
                 cantDias = 366-resta;
             
              break;
              
              case 8:
              
                 diasmes= 213;
                 resta = diasmes+dia;
                 cantDias = 366-resta;
             
              break;
              
              case 9:
              
                 diasmes= 244;
                 resta = diasmes+dia;
                 cantDias = 366-resta;
             
              break;
              
              case 10:
              
                 diasmes= 274;
                 resta = diasmes+dia;
                 cantDias = 366-resta;
             
              break;
              
              case 11:
             
                 diasmes= 305;
                 resta = diasmes+dia;
                 cantDias = 366-resta;
             
              break;
              
              case 12:
              
                 diasmes= 335;
                 resta = diasmes+dia;
                 cantDias = 366-resta;
             
              break;
              
          
        }
//               if (bisiesto(año)==false){
//                   cantDias+=-1;
//               }
        
        return cantDias;
    }
    //This method returns the quantity of days of the loan
    public int punishment(int año1, int mes1,int dia1,int dia2,int mes2,int año2 ){
        int cantDias=0;
        //int meses[]={31,0,31,30,31,30,31,31,30,31,30,31};
        int año=0;
        if(bisiesto(año2)==true){
            año=366;
        }else{
            año=365;
        }
        if(año2-año1>1){
            cantDias=((((año2-año1)-1)*365)+(getDiasFinAño(dia1, mes1, año1)+(año-getDiasFinAño(dia2, mes2, año2))));
            
        }else if(año2-año1==1){
            cantDias=getDiasFinAño(dia1, mes1, año1)+(año-getDiasFinAño(dia2, mes2, año2));
        }else if(año2-año1==0){
            if(mes1>mes2){
                cantDias=-1;
            }else{
            cantDias=getDiasFinAño(dia1, mes1, año1)-getDiasFinAño(dia2, mes2, año2);
            }
        }
            
            
        return cantDias;
    }
    //this method show the result on the text Area
    public void finalFace(String dateFinal1, String dateFinal2, String dateFinal3){
        
        int año1=0, mes1=0,dia1=0,dia2=0,mes2=0,año2=0,dia3=0,mes3=0,año3=0; 
        
          StringTokenizer st1 = new StringTokenizer(dateFinal1,"/");
            while(st1.hasMoreTokens()){
               
                    dia1=Integer.parseInt(st1.nextToken());
                    mes1=Integer.parseInt(st1.nextToken());
                    año1=Integer.parseInt(st1.nextToken());
                    
                    break;       
            }//fin while hasmoreTokens 
        StringTokenizer st2 = new StringTokenizer(dateFinal2,"/");
            while(st2.hasMoreTokens()){
               
                    dia2=Integer.parseInt(st2.nextToken());
                    mes2=Integer.parseInt(st2.nextToken());
                    año2=Integer.parseInt(st2.nextToken());
                    
                    break;       
            }//fin while hasmoreTokens 
        StringTokenizer st3 = new StringTokenizer(dateFinal3,"/");
            while(st3.hasMoreTokens()){
               
                    dia3=Integer.parseInt(st3.nextToken());
                    mes3=Integer.parseInt(st3.nextToken());
                    año3=Integer.parseInt(st3.nextToken());
                    
                    break;       
            }//fin while hasmoreTokens 

            
        if(año1<=año2){
            
            if(punishment(año1, mes1, dia1, dia2, mes2, año2)==-1){
                lbl_result.setVisible(true);
                dtc_dayOfInput.setDate(null);
               lbl_result.setText("The date of departure is not right"); 
               lbl_InfoPenalty.setVisible(false);
               lbl_penaltyTotal.setVisible(false);
               tfd_inputPenalty.setVisible(false);
               btn_donePenalty.setVisible(false);
            }else{
                if(punishment(año1, mes1, dia1, dia3, mes3, año3)<=-1){
                    lbl_result.setVisible(true);
                    lbl_result.setText("The date of departure is not right ");
                    dtc_dayOfInput.setDate(null);
                   lbl_InfoPenalty.setVisible(false);
                   lbl_penaltyTotal.setVisible(false);
                  tfd_inputPenalty.setVisible(false);
                  btn_donePenalty.setVisible(false);
                }else
                if(punishment(año2, mes2, dia2, dia3, mes3, año3)<=-1||punishment(año2, mes2, dia2, dia3, mes3, año3)==0){
                    lbl_result.setVisible(true);
                    lbl_result.setText("The quantity of days of the loan were: "+punishment(año1, mes1, dia1, dia2, mes2, año2)+"\n"+
                                       "the student hasn't any penalty. ");
                    try{
                           String ID = tfd_searchLoan.getText();
                           RequestAudioVisualFile file = new RequestAudioVisualFile();
                           ArrayList<RequestAudioVisual> a=file.getLoanList();
                           ArrayList<RequestAudioVisual>newList = new ArrayList<>();
        
                           for(int i = 0;i<a.size();i++){
                           if(!a.get(i).getId_card().equals(ID)){
                           newList.add(a.get(i));
                
                           }
                           }
        
                            //darle a este metodo hasta que me salga
                           file.upDate(newList);
                           penalty(numberDays);
                           tfd_inputPenalty.setText("");
                           }catch(IOException ioe){
                           System.err.println("File not found");
                           }
                        lbl_penaltyTotal.setVisible(false);
                }else{
                    lbl_result.setVisible(true);
                    lbl_result.setText("The quantity of days of the loan were: "+punishment(año1, mes1, dia1, dia2, mes2, año2)+"\n"+
                                       "the student returns the loan "+punishment(año2, mes2, dia2, dia3, mes3, año3)+" days after the date limit ");
                    lbl_InfoPenalty.setVisible(true);
                    lbl_penaltyTotal.setVisible(true);
                    tfd_inputPenalty.setVisible(true);
                    btn_donePenalty.setVisible(true);
                    numberDays=punishment(año2, mes2, dia2, dia3, mes3, año3);
                    
                }
               
            }
            
            
        }else{
            dtc_dayOfInput.setDate(null);
            lbl_result.setVisible(true);
            lbl_result.setText("The date of departure is not right ");
            lbl_InfoPenalty.setVisible(false);
            lbl_penaltyTotal.setVisible(false);
            tfd_inputPenalty.setVisible(false);
            btn_donePenalty.setVisible(false);
        }

    }
    public void penalty(int numDays){
        try{
        int penaltyTotal=numDays*(Integer.parseInt(tfd_inputPenalty.getText()));
        lbl_penaltyTotal.setText("Penalty: ₡"+penaltyTotal);
        }catch(NumberFormatException nfe){
            lbl_penaltyTotal.setVisible(true);
            lbl_penaltyTotal.setText("Please enter numbers");
        }
        
    }
    //Este codigo compara el ID del estudiante ingresado con el ID del estudiante que hace el prestamo de AudioVisual
    public boolean searchLoanAudioVisual(String ID) throws IOException{
        
        RequestAudioVisualFile AudioFile = new RequestAudioVisualFile();
        RequestAudioVisual AudioTemp;
        ArrayList<RequestAudioVisual> myArrayList = AudioFile.getLoanList();
         for(int i=0;i<myArrayList.size();i++){
            AudioTemp = myArrayList.get(i);
            if(AudioTemp.getId_card().equals(ID)){
                return true;
            }
            
    }
         return false;
    }//EndMethod
    //This method brings me the dates of the AudioVisualLoan
    public String getDatesLoanAudioVisual(String ID) throws IOException{
        String dates="";
        RequestAudioVisualFile AudioFile = new RequestAudioVisualFile();
        RequestAudioVisual AudioTemp;
        ArrayList<RequestAudioVisual> myArrayList = AudioFile.getLoanList();
         for(int i=0;i<myArrayList.size();i++){
            AudioTemp = myArrayList.get(i);
            if(AudioTemp.getId_card().equals(ID)){
                dates+=AudioTemp.getDate_remove()+";"+AudioTemp.getDate_delivery();
                
            }
            
    }
        return dates;
    }//end method
    
    private void btn_ReturnMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ReturnMaterialActionPerformed

        lbl_penaltyTotal.setText("");
        String ID = tfd_searchLoan.getText();

        String dateFormat1=""+dtc_dayOfInput.getDateFormatString();
        SimpleDateFormat sdf1 = new SimpleDateFormat(dateFormat1);
        Date date3 = dtc_dayOfInput.getDate();
        if(date3!=null){
            String dateFinal3=String.valueOf(sdf1.format(date3));
            finalFace(dateFinal1, dateFinal2, dateFinal3);
            //System.out.print(dateFinal1+" "+dateFinal2+" "+dateFinal3);
        }else{
            //lbl_result.setVisible(true);
            lbl_result.setText("Please enter the date when the "+"\n"+ " student returned  the material");

            dtc_dayOfInput.setDate(null);
            lbl_InfoPenalty.setVisible(false);
            lbl_penaltyTotal.setVisible(false);
            tfd_inputPenalty.setVisible(false);
            btn_donePenalty.setVisible(false);
        }

        

    }//GEN-LAST:event_btn_ReturnMaterialActionPerformed

    private void btn_ReturnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ReturnBackActionPerformed
        // TODO add your handling code here:
        Principal p = new Principal();
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_ReturnBackActionPerformed

    private void btn_SearchLoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SearchLoanActionPerformed
        // TODO add your handling code here:
        if (!tfd_searchLoan.getText().equals("")){
            String ID = tfd_searchLoan.getText();
            lbl_penaltyTotal.setVisible(false);
            try{
                if (searchLoanAudioVisual(ID)==true){

                    String dates=getDatesLoanAudioVisual(ID);

                    StringTokenizer st1 = new StringTokenizer(dates,";");
                    while(st1.hasMoreTokens()){

                        dateFinal1=st1.nextToken();
                        dateFinal2=st1.nextToken();
                        break;
                    }//fin while hasmoreTokens
                    lbl_salida.setVisible(true);
                    lbl_entrada1.setVisible(true);
                    tfd_Entrada.setVisible(true);
                    tfd_Salida1.setVisible(true);
                    tfd_Entrada.setText(dateFinal2);
                    tfd_Salida1.setText(dateFinal1);
                    lbl_result.setVisible(true);
                    dtc_dayOfInput.setVisible(true);
                    btn_ReturnMaterial.setVisible(true);
                    lbl_dayInput.setVisible(true);
                    lbl_penaltyTotal.setVisible(false);
                }else{
                    tfd_Entrada.setText("");
                    tfd_Salida1.setText("");
                    dtc_dayOfInput.setDate(null);
                    lbl_result.setText("");
                    lbl_InfoPenalty.setVisible(false);
                    tfd_inputPenalty.setVisible(false);
                    btn_donePenalty.setVisible(false);
                    lbl_salida.setVisible(false);
                    lbl_entrada1.setVisible(false);
                    tfd_Entrada.setVisible(false);
                    tfd_Salida1.setVisible(false);
                    lbl_penaltyTotal.setVisible(true);
                    lbl_penaltyTotal.setText("The ID doesn't exist in any loan");
                    lbl_result.setVisible(false);
                    dtc_dayOfInput.setVisible(false);
                    btn_ReturnMaterial.setVisible(false);
                    lbl_dayInput.setVisible(false);
                }

            }catch(IOException ioe ){
                System.err.println("The file doesn't exist");
            }
        }else{
            tfd_Entrada.setText("");
            tfd_Salida1.setText("");
            dtc_dayOfInput.setDate(null);
            lbl_result.setText("");
            lbl_InfoPenalty.setVisible(false);
            tfd_inputPenalty.setVisible(false);
            btn_donePenalty.setVisible(false);
            lbl_salida.setVisible(false);
            lbl_entrada1.setVisible(false);
            tfd_Entrada.setVisible(false);
            tfd_Salida1.setVisible(false);
            lbl_penaltyTotal.setVisible(true);
            lbl_penaltyTotal.setText("Please enter an ID");
            lbl_result.setVisible(false);
            dtc_dayOfInput.setVisible(false);
            btn_ReturnMaterial.setVisible(false);
            lbl_dayInput.setVisible(false);
        }

    }//GEN-LAST:event_btn_SearchLoanActionPerformed

    private void btn_donePenaltyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_donePenaltyActionPerformed
        // TODO add your handling code here:
        if(tfd_inputPenalty.getText().equals("")){
            lbl_penaltyTotal.setText("Please enter a value");
        }else{
            try{
                String ID = tfd_searchLoan.getText();
                RequestAudioVisualFile file = new RequestAudioVisualFile();
                ArrayList<RequestAudioVisual> a=file.getLoanList();
                ArrayList<RequestAudioVisual>newList = new ArrayList<>();

                for(int i = 0;i<a.size();i++){
                    if(!a.get(i).getId_card().equals(ID)){
                        newList.add(a.get(i));

                    }
                }

                //darle a este metodo hasta que me salga
                file.upDate(newList);
                penalty(numberDays);
                tfd_inputPenalty.setText("");
            }catch(IOException ioe){
                System.err.println("File not found");
            }

            //dtc_dayOfInput.setDate(null);

        }

    }//GEN-LAST:event_btn_donePenaltyActionPerformed

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
            java.util.logging.Logger.getLogger(ReturnAudioVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReturnAudioVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReturnAudioVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReturnAudioVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReturnAudioVisual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ReturnBack;
    private javax.swing.JButton btn_ReturnMaterial;
    private javax.swing.JButton btn_SearchLoan;
    private javax.swing.JButton btn_donePenalty;
    private com.toedter.calendar.JDateChooser dtc_dayOfInput;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_InfoPenalty;
    private javax.swing.JLabel lbl_StuRecedBackground;
    private javax.swing.JLabel lbl_dayInput;
    private javax.swing.JLabel lbl_entrada1;
    private javax.swing.JLabel lbl_infoSearch;
    private javax.swing.JLabel lbl_penaltyTotal;
    private javax.swing.JTextArea lbl_result;
    private javax.swing.JLabel lbl_salida;
    private javax.swing.JTextField tfd_Entrada;
    private javax.swing.JTextField tfd_Salida1;
    private javax.swing.JTextField tfd_inputPenalty;
    private javax.swing.JTextField tfd_searchLoan;
    // End of variables declaration//GEN-END:variables
}