/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.Timer;


/**
 *
 * @author Aluno 22
 */
public class inicio extends javax.swing.JFrame {

    /**
     * Creates new form teste
     * @param tip
     */
    
    public inicio(int tip) {
        initComponents();
        switch (tip) {
            case 1:
                jM_Admin.setEnabled(false);
                jM_Medico.setEnabled(false);
                break;
            case 2:
                jM_Admin.setEnabled(false);
                jM_Sec.setEnabled(false);
                break;
            default:
                jM_Medico.setEnabled(false);
                jM_Sec.setEnabled(false);
                break;
        }
        Date d = new Date();
	Calendar c = new GregorianCalendar();
	c.setTime(d);
	String nome = "";
	int dia = c.get(c.DAY_OF_WEEK);
	switch(dia){
            case Calendar.SUNDAY: nome = "Domingo";break;
            case Calendar.MONDAY: nome = "Segunda-Feira";break;
            case Calendar.TUESDAY: nome = "Terça-Feira";break;
            case Calendar.WEDNESDAY: nome = "Quarta-Feira";break;
            case Calendar.THURSDAY: nome = "Quinta-Feira";break;
            case Calendar.FRIDAY: nome = "Sexta-Feira";break;
            case Calendar.SATURDAY: nome = "Sábado";break;
        }
        
        jL_Dia.setText(nome);
        Date dataSistema = new Date();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        jL_Data.setText(df.format(dataSistema));
        
        Timer timer = new Timer(1000, new hora());
        timer.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Jdesk = new javax.swing.JDesktopPane();
        jLabel3 = new javax.swing.JLabel();
        jL_Data = new javax.swing.JLabel();
        jL_Dia = new javax.swing.JLabel();
        jL_Hora = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jM_Medico = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jM_Sec = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jM_Admin = new javax.swing.JMenu();
        jMenuItem19 = new javax.swing.JMenuItem();
        cadmenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 255, 254));

        Jdesk.setBackground(new java.awt.Color(0, 153, 153));
        Jdesk.setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/wallpaper.jpg"))); // NOI18N
        Jdesk.add(jLabel3);
        jLabel3.setBounds(0, 0, 700, 460);

        jL_Data.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jL_Data.setText("03/02/2002");

        jL_Dia.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jL_Dia.setText("Segunda-Feira");

        jL_Hora.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jL_Hora.setText("13:30");

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sair-26.png"))); // NOI18N
        jLabel2.setText("Sair");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Jdesk, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jL_Dia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jL_Data, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jL_Hora, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Jdesk, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jL_Data)
                        .addComponent(jL_Hora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jL_Dia)
                        .addGap(10, 10, 10))))
        );

        jM_Medico.setForeground(new java.awt.Color(1, 1, 1));
        jM_Medico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/doutor-em-medicina-32.png"))); // NOI18N
        jM_Medico.setText("Médicos ");
        jM_Medico.setFont(new java.awt.Font("News701 BT", 1, 18)); // NOI18N
        jM_Medico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jM_MedicoActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Consultas ");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jM_Medico.add(jMenuItem1);

        jMenuBar1.add(jM_Medico);

        jM_Sec.setForeground(new java.awt.Color(1, 1, 1));
        jM_Sec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/secretaria-32.png"))); // NOI18N
        jM_Sec.setText("Secretárias ");
        jM_Sec.setFont(new java.awt.Font("News701 BT", 1, 18)); // NOI18N
        jM_Sec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jM_SecActionPerformed(evt);
            }
        });

        jMenuItem6.setText("Cadastrar Médico ");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jM_Sec.add(jMenuItem6);

        jMenuItem7.setText("Buscar Médico");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jM_Sec.add(jMenuItem7);

        jMenuItem9.setText("Cadastrar Paciente");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jM_Sec.add(jMenuItem9);

        jMenuItem10.setText("Buscar Paciente ");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jM_Sec.add(jMenuItem10);

        jMenuItem16.setText("Cadastrar Convênio");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jM_Sec.add(jMenuItem16);

        jMenuItem12.setText("Buscar Convênio");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jM_Sec.add(jMenuItem12);

        jMenuItem2.setText("Cadastrar Plano");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jM_Sec.add(jMenuItem2);

        jMenuItem3.setText("Buscar Plano");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jM_Sec.add(jMenuItem3);

        jMenuItem13.setText("Marcar Consulta");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jM_Sec.add(jMenuItem13);

        jMenuItem14.setText("Buscar Consulta ");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jM_Sec.add(jMenuItem14);

        jMenuItem15.setText("Marcar Compromisso Médico ");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jM_Sec.add(jMenuItem15);

        jMenuItem4.setText("Consultar Agenda");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jM_Sec.add(jMenuItem4);

        jMenuItem17.setText("Emitir Relatórios");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jM_Sec.add(jMenuItem17);

        jMenuBar1.add(jM_Sec);

        jM_Admin.setForeground(new java.awt.Color(1, 1, 1));
        jM_Admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/admin-32.png"))); // NOI18N
        jM_Admin.setText("Adminstrador ");
        jM_Admin.setFont(new java.awt.Font("News701 BT", 1, 18)); // NOI18N

        jMenuItem19.setText("Cadastrar informações da clínica ");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jM_Admin.add(jMenuItem19);

        cadmenu.setText("Cadastrar secretarias ");
        cadmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadmenuActionPerformed(evt);
            }
        });
        jM_Admin.add(cadmenu);

        jMenuBar1.add(jM_Admin);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jM_MedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jM_MedicoActionPerformed
       
    }//GEN-LAST:event_jM_MedicoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        RealiConsu tabm = new RealiConsu();
            Jdesk.add(tabm);
            tabm.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        CadMedico tabm = new CadMedico();
        Jdesk.add(tabm);
        tabm.setVisible(true);
         
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
       BusMed tabm = new BusMed();
       Jdesk.add(tabm);
       tabm.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
       BusConv tabm = new BusConv();
       Jdesk.add(tabm);
       tabm.setVisible(true);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        CadConv tabm = new CadConv();
        Jdesk.add(tabm);
        tabm.setVisible(true);
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void cadmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadmenuActionPerformed
        CadSecre tabm = new CadSecre();
        Jdesk.add(tabm);
        tabm.setVisible(true);

    }//GEN-LAST:event_cadmenuActionPerformed

    private void jM_SecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jM_SecActionPerformed
         BusConv tabm = new BusConv();
       Jdesk.add(tabm);
       tabm.setVisible(true);
    }//GEN-LAST:event_jM_SecActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        BusPaciente tabm = new BusPaciente();
       Jdesk.add(tabm);
       tabm.setVisible(true);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
       CadPaciente tabm =  new CadPaciente();
       Jdesk.add(tabm);
       tabm.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        MarcarCons tabm =  new MarcarCons ();
       Jdesk.add(tabm);
       tabm.setVisible(true);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        BusConsultas tabm =  new BusConsultas();
       Jdesk.add(tabm);
       tabm.setVisible(true);
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
       MarcarComp tabm =  new MarcarComp();
       Jdesk.add(tabm);
       tabm.setVisible(true);
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
       EmitirRelat tabm =  new EmitirRelat();
       Jdesk.add(tabm);
       tabm.setVisible(true);
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
       CadClini tabm =  new CadClini();
       Jdesk.add(tabm);
       tabm.setVisible(true);
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        int op = JOptionPane.showConfirmDialog(this,"Deseja realmente sair do seu login?");
        if(op == 0){
            this.dispose();
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        CadPlano plano = new CadPlano();
        Jdesk.add(plano);
        plano.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        BusPlano plano = new BusPlano();
        Jdesk.add(plano);
        plano.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        ConsulAgenMedica agenda = new ConsulAgenMedica();
        Jdesk.add(agenda);
        agenda.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Jdesk;
    private javax.swing.JMenuItem cadmenu;
    private javax.swing.JLabel jL_Data;
    private javax.swing.JLabel jL_Dia;
    private javax.swing.JLabel jL_Hora;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jM_Admin;
    private javax.swing.JMenu jM_Medico;
    private javax.swing.JMenu jM_Sec;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    class hora implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Calendar now = Calendar.getInstance();
            jL_Hora.setText(String.format("%1$tH:%1$tM", now));
        }
        
    }
        

}
