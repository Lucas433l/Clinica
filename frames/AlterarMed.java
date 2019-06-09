/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import DAO.MedicoDAO;
import javax.swing.JOptionPane;
import model.Medico;

/**
 *
 * @author lucasz
 */
public class AlterarMed extends javax.swing.JFrame {

    /**
     * Creates new form aux
     */
    public AlterarMed(Medico med) {
        initComponents();
        
        jT_Nome.setText(med.getNome());
        
        jF_CPF.setText(med.getCPF());
        
        jT_RG.setText(med.getRG());
        
        String crm = med.getCRM();
        
        jT_CRM.setText(crm);
        
        jF_Telefone.setText(med.getTelefone());
        
        jT_End.setText(med.getEndereco());
        
        String sexo = med.getSexo();
        if(sexo.equals("F")){
            jR_F.setSelected(true);
        }
        else{
            jR_M.setSelected(true);
        }
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jT_Nome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jF_CPF = new javax.swing.JFormattedTextField();
        jF_Telefone = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        jR_F = new javax.swing.JRadioButton();
        jR_M = new javax.swing.JRadioButton();
        jT_End = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jT_CRM = new javax.swing.JTextField();
        jT_RG = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(620, 400));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(620, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Alterar Dados Médico");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 420, 50));

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel3.setText("Nome ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, 20));

        jT_Nome.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        getContentPane().add(jT_Nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 410, 30));

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel4.setText("CPF");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 40, 20));

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel5.setText("RG");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 40, 20));

        jLabel6.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel6.setText("Telefone");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 80, -1));

        jLabel7.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel7.setText("Sexo");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 50, 20));

        jLabel8.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel8.setText("Endereço");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 90, 30));

        jF_CPF.setEditable(false);
        try {
            jF_CPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jF_CPF.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        getContentPane().add(jF_CPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 165, 30));

        try {
            jF_Telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) 9####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jF_Telefone.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        getContentPane().add(jF_Telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 160, 30));

        jLabel11.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel11.setText("CRM");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        buttonGroup1.add(jR_F);
        jR_F.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jR_F.setText("Feminino");
        jR_F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jR_FActionPerformed(evt);
            }
        });
        getContentPane().add(jR_F, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, -1, -1));

        buttonGroup1.add(jR_M);
        jR_M.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jR_M.setText("Masculino");
        jR_M.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jR_MActionPerformed(evt);
            }
        });
        getContentPane().add(jR_M, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 130, -1));

        jT_End.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jT_End.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_EndActionPerformed(evt);
            }
        });
        getContentPane().add(jT_End, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 410, 30));

        jLabel10.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salvar-como-48.png"))); // NOI18N
        jLabel10.setText("Salvar");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 130, 50));

        jT_CRM.setEditable(false);
        jT_CRM.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        getContentPane().add(jT_CRM, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 421, 30));

        jT_RG.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        getContentPane().add(jT_RG, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 180, 30));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sair-48.png"))); // NOI18N
        jLabel1.setText("Sair");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/wallpaper.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jR_FActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jR_FActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jR_FActionPerformed

    private void jT_EndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_EndActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_EndActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        boolean confirm = true;
        
        String nome = jT_Nome.getText();
        if(nome.equals("")){
            confirm = false;
        }
        
        String cpf = jF_CPF.getText();
        
        String rg = jT_RG.getText();
        if(rg.equals("")){
            confirm = false;
        }
        
        String crm = jT_CRM.getText();
        
        String telefone = jF_Telefone.getText();
        if(telefone.replace("(","").replace(")","").replace("-","").replace("9","").equals("")){
            confirm = false;
        }
        
        String endereco = jT_End.getText();
        if(endereco.equals("")){
            confirm = false;
        }
        
        String sexo = "X";
        if(jR_F.isSelected()){
            sexo = "F";
        }
        
        else if(jR_M.isSelected()){
            sexo = "M";
        }
        
        else{
            confirm = false;
        }
        
        if(confirm){
            Medico med = new Medico();
            med.setNome(nome);
            med.setCPF(cpf);
            med.setRG(rg);
            med.setCRM(crm);
            med.setTelefone(telefone);
            med.setEndereco(endereco);
            med.setSexo(sexo);
            
            int op = JOptionPane.showConfirmDialog(this,"Deseja realmente alterar esse médico?");
            if(op == 0){
                MedicoDAO dao = new MedicoDAO();
                dao.update(med);
            }
            else{
                JOptionPane.showMessageDialog(this,"Médico não será alterado.");
            }
        }
        else{
            JOptionPane.showMessageDialog(this,"Alguma informação não foi preenchida corretamente.");
        }
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jR_MActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jR_MActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jR_MActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JFormattedTextField jF_CPF;
    private javax.swing.JFormattedTextField jF_Telefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jR_F;
    private javax.swing.JRadioButton jR_M;
    private javax.swing.JTextField jT_CRM;
    private javax.swing.JTextField jT_End;
    private javax.swing.JTextField jT_Nome;
    private javax.swing.JTextField jT_RG;
    // End of variables declaration//GEN-END:variables
}
