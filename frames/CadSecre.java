/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package frames;

import DAO.SecretariaDAO;
import javax.swing.JOptionPane;
import model.Secretaria;

/**
 *
 * @author Aluno 22
 */
public class CadSecre extends javax.swing.JInternalFrame {


    /** Creates new form CadSecre */
    public CadSecre() {
        initComponents();
    }
    public void limpar(){
        jT_Nome.setText("");
        jF_CPF.setText("");
        jT_RG.setText("");
        jF_Telefone.setText("");
        jT_End.setText("");
        jP_Senha.setText("");
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jF_CPF = new javax.swing.JFormattedTextField();
        jT_End = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jP_Senha = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        jR_F = new javax.swing.JRadioButton();
        jT_RG = new javax.swing.JTextField();
        jR_M = new javax.swing.JRadioButton();
        jT_Nome = new javax.swing.JTextField();
        jF_Telefone = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setMinimumSize(new java.awt.Dimension(500, 400));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(500, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpar-48.png"))); // NOI18N
        jLabel12.setText("Limpar");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 130, 50));

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel5.setText("RG");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 30, 20));

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel3.setText("Nome");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 60, -1));

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel4.setText("CPF");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 40, -1));

        jLabel6.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel6.setText("Telefone");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 90, -1));

        jLabel7.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel7.setText("Endereço");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 90, -1));

        jLabel8.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel8.setText("Sexo");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 50, -1));

        try {
            jF_CPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jF_CPF.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        getContentPane().add(jF_CPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 150, 30));

        jT_End.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        getContentPane().add(jT_End, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 480, 30));

        jLabel9.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel9.setText("Senha");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 60, -1));

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel2.setText("Cadastramento de Secretária");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 420, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mostrar-a-senha-24.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 30, -1));

        jP_Senha.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        getContentPane().add(jP_Senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 240, 30));

        jLabel11.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salvar-como-48.png"))); // NOI18N
        jLabel11.setText("Salvar ");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 130, 50));

        buttonGroup1.add(jR_F);
        jR_F.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jR_F.setText("Feminino");
        getContentPane().add(jR_F, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, -1, -1));

        jT_RG.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        getContentPane().add(jT_RG, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 210, 30));

        buttonGroup1.add(jR_M);
        jR_M.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jR_M.setText("Masculina");
        getContentPane().add(jR_M, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 125, -1));

        jT_Nome.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        getContentPane().add(jT_Nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 420, 30));

        try {
            jF_Telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) 9####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jF_Telefone.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        getContentPane().add(jF_Telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 150, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/wallpaper.jpg"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 420));

        setBounds(0, 0, 649, 416);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        boolean confirm = true;
        
        String nome = jT_Nome.getText();
        if(nome.equals("")){
            confirm = false;
        }
        
        String cpf = jF_CPF.getText();
        if(cpf.replace(" ","").replace(".","").replace("-","").equals("")){
            confirm = false;
        }
        
        String rg = jT_RG.getText();
        if(rg.equals("")){
            
        }
        
        String telefone = jF_Telefone.getText();
        if(telefone.replace(" ","").replace("9","").replace("(", "").replace(")","").replace("-","").equals("")){
            confirm = false;
        }
        
        String end = jT_End.getText();
        if(end.equals("")){
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
        
        String senha = new String(jP_Senha.getPassword());
        if(senha.equals("")){
            confirm = false;
        }
        
        if(confirm){
            Secretaria sec = new Secretaria();
            sec.setNome(nome);
            sec.setCPF(cpf);
            sec.setRG(rg);
            sec.setTelefone(telefone);
            sec.setEndereco(end);
            sec.setSexo(sexo);
            sec.setSenha(senha);
            int op = JOptionPane.showConfirmDialog(this,"Deseja realmente realizar esse cadastro?");
            if(op == 0){
                SecretariaDAO dao = new SecretariaDAO();
                dao.insert(sec);
                limpar();
            }
            else{
                JOptionPane.showMessageDialog(this,"Cadastro cancelado.");
            }
        }
        else{
            JOptionPane.showMessageDialog(this,"Alguma informação não foi preenchida.");
            JOptionPane.showMessageDialog(this,"Preencha corretamente!");
        }
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        if(jP_Senha.getEchoChar() == '*'){
            jP_Senha.setEchoChar('\u0000');
        }else{
            jP_Senha.setEchoChar('*');
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        limpar();
    }//GEN-LAST:event_jLabel12MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JFormattedTextField jF_CPF;
    private javax.swing.JFormattedTextField jF_Telefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jP_Senha;
    private javax.swing.JRadioButton jR_F;
    private javax.swing.JRadioButton jR_M;
    private javax.swing.JTextField jT_End;
    private javax.swing.JTextField jT_Nome;
    private javax.swing.JTextField jT_RG;
    // End of variables declaration//GEN-END:variables

}
