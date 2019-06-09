/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import DAO.Ficha_MedicaDAO;
import javax.swing.JOptionPane;
import model.Ficha_Medica;

/**
 *
 * @author lucasz
 */
public class CadFicha extends javax.swing.JFrame {

    /**
     * Creates new form CadFicha
     */
    public CadFicha() {
        initComponents();
    }
    
    public void limpar(){
        jT_Paciente.setText("");
        jF_CPF.setText("");
        jT_Medico.setText("");
        jT_CRM.setText("");
        jF_Data.setText("");
        jT_Queixa.setText("");
        jT_Ant.setText("");
        jT_Hist.setText("");
        jT_Hip.setText("");
        jT_Med.setText("");
        jT_Exa.setText("");
        jT_Exc.setText("");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jT_Paciente = new javax.swing.JTextField();
        jF_CPF = new javax.swing.JFormattedTextField();
        jT_Medico = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jT_CRM = new javax.swing.JTextField();
        jF_Data = new javax.swing.JFormattedTextField();
        jT_Queixa = new javax.swing.JTextField();
        jT_Hip = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jT_Med = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jT_Hist = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jT_Ant = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jT_Exc = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jT_Exa = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel1.setText("Nova Ficha");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 12, -1, -1));

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel2.setText("Paciente:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel3.setText("CPF:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, -1, -1));

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel5.setText("Médico:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        jLabel6.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel6.setText("Data:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, -1, -1));

        jLabel7.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel7.setText("Queixa:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        jLabel8.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel8.setText("Antecedentes:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        jLabel9.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel9.setText("Histórico:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, -1, -1));

        jLabel10.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel10.setText("Hipótese:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jLabel11.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel11.setText("Medicação:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jLabel12.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel12.setText("Exames Ap.:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        jLabel13.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel13.setText("Exames Comp.:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, -1, -1));

        jT_Paciente.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        getContentPane().add(jT_Paciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 208, -1));

        try {
            jF_CPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jF_CPF.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        getContentPane().add(jF_CPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 153, -1));

        jT_Medico.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        getContentPane().add(jT_Medico, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 208, -1));

        jLabel14.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel14.setText("CRM:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, -1, -1));

        jT_CRM.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        getContentPane().add(jT_CRM, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 153, -1));

        try {
            jF_Data.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jF_Data.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        getContentPane().add(jF_Data, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, 155, -1));

        jT_Queixa.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        getContentPane().add(jT_Queixa, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 208, -1));

        jT_Hip.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        getContentPane().add(jT_Hip, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 433, -1));

        jT_Med.setColumns(20);
        jT_Med.setFont(new java.awt.Font("Liberation Serif", 1, 14)); // NOI18N
        jT_Med.setRows(5);
        jScrollPane1.setViewportView(jT_Med);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, -1));

        jT_Hist.setColumns(20);
        jT_Hist.setFont(new java.awt.Font("Liberation Serif", 1, 14)); // NOI18N
        jT_Hist.setRows(5);
        jScrollPane2.setViewportView(jT_Hist);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, -1, -1));

        jT_Ant.setColumns(20);
        jT_Ant.setFont(new java.awt.Font("Liberation Serif", 1, 14)); // NOI18N
        jT_Ant.setRows(5);
        jScrollPane3.setViewportView(jT_Ant);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, -1, -1));

        jT_Exc.setColumns(20);
        jT_Exc.setFont(new java.awt.Font("Liberation Serif", 1, 14)); // NOI18N
        jT_Exc.setRows(5);
        jScrollPane4.setViewportView(jT_Exc);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, 280, -1));

        jT_Exa.setColumns(20);
        jT_Exa.setFont(new java.awt.Font("Liberation Serif", 1, 14)); // NOI18N
        jT_Exa.setRows(5);
        jScrollPane5.setViewportView(jT_Exa);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 260, -1));

        jLabel15.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salvar-como-48.png"))); // NOI18N
        jLabel15.setText("Salvar");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 470, 110, -1));

        jLabel16.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpar-48.png"))); // NOI18N
        jLabel16.setText("Limpar");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 470, 120, -1));

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/wallpaper.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        limpar();
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        boolean confirm = true;
        
        String paciente  = jT_Paciente.getText();
        if(paciente.equals("")){
            confirm = false;
        }
        
        String cpf = jF_CPF.getText();
        if(cpf.replace(" ","").replace(".","").replace("-","").equals("")){
            confirm = false;
        }
        
        String medico = jT_Medico.getText();
        if(medico.equals("")){
            confirm = false;
        }
        
        String crm = jT_CRM.getText();
        if(crm.equals("")){
            confirm = false;
        }
        
        String data = jF_Data.getText();
        if(data.replace("/","").replace(" ","").equals("")){
            confirm = false;
        }
        else{
            String aux[] = data.split("/");
            data = aux[2] + "-" + aux[1] + "-" + aux[0];
        }
        
        String queixa = jT_Queixa.getText();
        if(queixa.equals("")){
            confirm = false;
        }
        
        String ant = jT_Ant.getText();
        if(ant.equals("")){
            confirm = false;
        }
        
        String hist = jT_Hist.getText();
        if(hist.equals("")){
            confirm = false;
        }
        
        String hip = jT_Hip.getText();
        if(hip.equals("")){
            confirm = false;
        }
        
        String med = jT_Med.getText();
        if(med.equals("")){
            confirm = false;
        }
        
        String exa = jT_Exa.getText();
        if(exa.equals("")){
            confirm = false;
        }
        
        String exc = jT_Exc.getText();
        if(exc.equals("")){
            confirm = false;
        }
        
        if(confirm){
            Ficha_Medica ficha = new Ficha_Medica();
            ficha.setNome_paciente(paciente);
            ficha.setCPF(cpf);
            ficha.setNome_medico(medico);
            ficha.setCRM(crm);
            ficha.setData_consulta(data);
            ficha.setQueixa(queixa);
            ficha.setAntecedentes(ant);
            ficha.setHistorico(hist);
            ficha.setHipotese_diag(hip);
            ficha.setMedicacao(med);
            ficha.setExames_ap_sist(exa);
            ficha.setExames_comp(exc);
            
            int op = JOptionPane.showConfirmDialog(this,"Deseja realmente criar essa ficha?");
            if(op == 0){
                Ficha_MedicaDAO dao = new Ficha_MedicaDAO();
                dao.insert(ficha);
                limpar();
            }
            else{
                JOptionPane.showMessageDialog(this,"Ficha não será criada.");
            }
        }
        
        else{
            JOptionPane.showMessageDialog(this,"Alguma informação não foi preenchida.");
        }
    }//GEN-LAST:event_jLabel15MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField jF_CPF;
    private javax.swing.JFormattedTextField jF_Data;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jT_Ant;
    private javax.swing.JTextField jT_CRM;
    private javax.swing.JTextArea jT_Exa;
    private javax.swing.JTextArea jT_Exc;
    private javax.swing.JTextField jT_Hip;
    private javax.swing.JTextArea jT_Hist;
    private javax.swing.JTextArea jT_Med;
    private javax.swing.JTextField jT_Medico;
    private javax.swing.JTextField jT_Paciente;
    private javax.swing.JTextField jT_Queixa;
    // End of variables declaration//GEN-END:variables
}
