/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import DAO.ConvenioDAO;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Convenio;

/**
 *
 * @author Aluno 22
 */
public class BusConv extends javax.swing.JInternalFrame {

    /**
     * Creates new form BusConv
     */
    public BusConv() {
        initComponents();
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        jTable.setRowSorter(new TableRowSorter(model));
        readTable(new ConvenioDAO().readAll());
    }
    
    public void readTable(List<Convenio> dao){
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        model.setNumRows(0);
        
        for(Convenio c: dao){
            model.addRow(new Object[]{
                c.getCod(),
                c.getNome(),
                c.getCNPJ(),
                c.getFaturamento()
            });
        }
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
        jLabel3 = new javax.swing.JLabel();
        jT_Nome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jF_CNPJ = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setPreferredSize(new java.awt.Dimension(650, 430));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Buscar Convênios");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 400, 60));

        jLabel3.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Nome do Convênio ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 170, 40));

        jT_Nome.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jT_Nome.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(jT_Nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 420, 40));

        jLabel4.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("CNPJ do Convênio ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 180, 50));

        try {
            jF_CNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jF_CNPJ.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jF_CNPJ.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jF_CNPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jF_CNPJActionPerformed(evt);
            }
        });
        getContentPane().add(jF_CNPJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 190, 30));

        jLabel6.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar-48.png"))); // NOI18N
        jLabel6.setText("Buscar ");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 130, 40));

        jTable.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "CNPJ", "Faturamento(R$)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 640, 180));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/wallpaper.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jF_CNPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jF_CNPJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jF_CNPJActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        String nome = jT_Nome.getText();
        String cnpj = jF_CNPJ.getText();
        ConvenioDAO dao = new ConvenioDAO();
        
        if(!nome.equals("")){
            readTable(dao.readForName(nome));
        }
        
        else if(!cnpj.replace(".", "").replace("/","").equals("")){
            readTable(dao.readForCNPJ(cnpj));
        }
        else{
            readTable(dao.readAll());
        }
    }//GEN-LAST:event_jLabel6MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField jF_CNPJ;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jT_Nome;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}
