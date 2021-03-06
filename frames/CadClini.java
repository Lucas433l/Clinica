/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import DAO.ClinicaDAO;
import javax.swing.JOptionPane;
import model.Clinica;

/**
 *
 * @author Aluno 22
 */
public class CadClini extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadastClini
     */
    public CadClini() {
        initComponents();
    }
    public void limpar(){
        jT_Nome.setText("");
        jF_CNPJ.setText("");
        jT_End.setText("");
        jF_Telefone.setText("");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jT_Nome = new javax.swing.JTextField();
        jF_CNPJ = new javax.swing.JFormattedTextField();
        jT_End = new javax.swing.JTextField();
        jF_Telefone = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setMinimumSize(new java.awt.Dimension(630, 380));
        getContentPane().setLayout(null);

        jLabel7.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpar-48.png"))); // NOI18N
        jLabel7.setText("Limpar");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel7);
        jLabel7.setBounds(460, 400, 130, 40);

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cadastrar Informações da Clínica ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 0, 610, 60);

        jLabel3.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        jLabel3.setText("Nome da clínica:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 130, 160, 22);

        jLabel4.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        jLabel4.setText("CNPJ:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(370, 270, 60, 22);

        jLabel5.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        jLabel5.setText("Endereço: ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 210, 110, 22);

        jLabel6.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        jLabel6.setText("Telefone Fixo:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 270, 130, 22);

        jT_Nome.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        getContentPane().add(jT_Nome);
        jT_Nome.setBounds(150, 130, 480, 30);

        try {
            jF_CNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jF_CNPJ.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        getContentPane().add(jF_CNPJ);
        jF_CNPJ.setBounds(440, 270, 200, 30);

        jT_End.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        getContentPane().add(jT_End);
        jT_End.setBounds(130, 200, 510, 30);

        try {
            jF_Telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jF_Telefone.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        getContentPane().add(jF_Telefone);
        jF_Telefone.setBounds(180, 270, 170, 30);

        jLabel8.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salvar-como-48.png"))); // NOI18N
        jLabel8.setText("Salvar");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel8);
        jLabel8.setBounds(320, 410, 120, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/wallpaper.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 670, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        boolean confirm = true;
        
        String nome = jT_Nome.getText();
        if(nome.equals("")){
            confirm = false;
        }
        
        String cnpj = jF_CNPJ.getText();
        if(cnpj.replace("/", "").replace(".","").replace("-","").equals("")){
            confirm = false;
        }
        
        String endereco = jT_End.getText();
        if(endereco.equals("")){
            confirm = false;
        }
        
        String telefone = jF_Telefone.getText();
        if(telefone.replace("(", "").replace(")","").replace("9","").replace(" ","").replace("-","").equals("")){
            confirm = false;
        }
        
        if(confirm){
            Clinica clinica = new Clinica();
            clinica.setNome(nome);
            clinica.setCNPJ(cnpj);
            clinica.setEndereco(endereco);
            clinica.setTelefone(telefone);
            
            int op = JOptionPane.showConfirmDialog(this,"Deseja realmente criar esse cadastro?");
            if(op == 0){
                ClinicaDAO dao = new ClinicaDAO();
                dao.insert(clinica);
                limpar();
            }
            else{
                JOptionPane.showMessageDialog(this,"Cadastro cancelado.");
            }
        }
        else{
            JOptionPane.showMessageDialog(this,"Alguma informação não foi preenchida.");
        }
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        limpar();
    }//GEN-LAST:event_jLabel7MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField jF_CNPJ;
    private javax.swing.JFormattedTextField jF_Telefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jT_End;
    private javax.swing.JTextField jT_Nome;
    // End of variables declaration//GEN-END:variables
}
