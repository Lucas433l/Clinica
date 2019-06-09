package DAO;

import connection.Conexao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Agenda;

public class AgendaDAO {
    public void insert(Agenda agenda){
        String sql = "INSERT INTO agenda(nome_medico, crm, data, hora_inicio, hora_final, descricao) VALUES (?,?,?,?,?,?)";
        PreparedStatement pstm = null;
        Connection conn = null;
        try{
            //Chamada das funções
            conn = Conexao.Conectar();
            pstm = conn.prepareStatement(sql);
            
            //Mandando para o sql
            pstm.setString(1, agenda.getMedico());
            pstm.setString(2, agenda.getCRM());
            
            //Formatação das datas
            SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd"); 
            Date data = new Date(fmt.parse(agenda.getData()).getTime());
            pstm.setDate(3, data);
            
            String hora_i = agenda.getHora_inicio();
            pstm.setString(4, hora_i);
            
            String hora_f = agenda.getHora_final();
            pstm.setString(5, hora_f);
            
            pstm.setString(6, agenda.getDesc());
            
            //executando o sql
            pstm.execute();
            JOptionPane.showMessageDialog(null,"Compromisso agendado com sucesso.");
        }catch(Exception e){
            if(e instanceof com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException){
                JOptionPane.showMessageDialog(null,"CRM não encontrada");
            }
            //JOptionPane.showMessageDialog(null,"Ocorreu um erro inesperado. Caso o erro permaneça, procure sua equipe de TI.");
            System.out.println(e);
        }finally{
            try{
                if(conn != null){
                    conn.close();
                }
                if(pstm != null){
                    pstm.close();
                }
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null,"Ocorreu um erro inesperado. Caso permaneça informe sua equipe de TI.");
            }
        }
    }
    public List<Agenda> readAll(){
        String sql = "SELECT * FROM agenda";
        List<Agenda> agendas = new ArrayList<Agenda>();
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;
        
        try{
            conn = Conexao.Conectar();
            pstm = conn.prepareStatement(sql);
            rset = pstm.executeQuery();
            
            while(rset.next()){
                Agenda agenda = new Agenda();
                agenda.setCod(rset.getInt("cod_agenda"));
                agenda.setMedico(rset.getString("nome_medico"));
                agenda.setCRM(rset.getString("crm"));
                
                String aux[] = rset.getString("data").split("-");
                String data = aux[2] +"/"+aux[1] + "/" + aux[0];
                agenda.setData(data);
                
                agenda.setHora_inicio(rset.getString("hora_inicio"));
                agenda.setHora_final(rset.getString("hora_final"));
                
                agenda.setDesc(rset.getString("descricao"));
                
                agendas.add(agenda);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Ocorreu um erro inesperado. Caso permaneça informe sua equipe de TI.");
        }finally{
            try{
                if(conn != null){
                    conn.close();
                }
                if(pstm != null){
                    pstm.close();
                }
                if(rset != null){
                    rset.close();
                }
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null,"Ocorreu um erro inesperado. Caso permaneça informe sua equipe de TI.");
            }
        }
        return agendas;
    }
    public List<Agenda> readForCRM(String crm){
        String sql = "SELECT * FROM agenda WHERE crm = ?";
        List<Agenda> agendas = new ArrayList<Agenda>();
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;
        
        try{
            conn = Conexao.Conectar();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1,crm);
            rset = pstm.executeQuery();
            
            while(rset.next()){
                Agenda agenda = new Agenda();
                agenda.setCod(rset.getInt("cod_agenda"));
                agenda.setMedico(rset.getString("nome_medico"));
                agenda.setCRM(rset.getString("crm"));
                
                SimpleDateFormat fmt = new SimpleDateFormat("dd/mm/yyyy");
                agenda.setData(fmt.format(rset.getString("data")));
                fmt = new SimpleDateFormat("hh:mm");
                agenda.setHora_inicio(fmt.format(rset.getString("hora_inicio")));
                agenda.setHora_final(fmt.format(rset.getString("hora_final")));
                
                agenda.setDesc(rset.getString("descricao"));
                
                agendas.add(agenda);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Ocorreu um erro inesperado. Caso permaneça informe sua equipe de TI.");
        }finally{
            try{
                if(conn != null){
                    conn.close();
                }
                if(pstm != null){
                    pstm.close();
                }
                if(rset != null){
                    rset.close();
                }
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null,"Ocorreu um erro inesperado. Caso permaneça informe sua equipe de TI.");
            }
        }
        return agendas;
    }
    public List<Agenda> readForName(String name){
        String sql = "SELECT * FROM agenda WHERE nome_medico LIKE ?";
        List<Agenda> agendas = new ArrayList<Agenda>();
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;
        
        try{
            conn = Conexao.Conectar();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, "%"+name+"%");
            rset = pstm.executeQuery();
            
            while(rset.next()){
                Agenda agenda = new Agenda();
                agenda.setCod(rset.getInt("cod_agenda"));
                agenda.setMedico(rset.getString("nome_medico"));
                agenda.setCRM(rset.getString("crm"));
                
                SimpleDateFormat fmt = new SimpleDateFormat("dd/mm/yyyy");
                agenda.setData(fmt.format(rset.getString("data")));
                fmt = new SimpleDateFormat("hh:mm");
                agenda.setHora_inicio(fmt.format(rset.getString("hora_inicio")));
                agenda.setHora_final(fmt.format(rset.getString("hora_final")));
                
                agenda.setDesc(rset.getString("descricao"));
                
                agendas.add(agenda);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Ocorreu um erro inesperado. Caso permaneça informe sua equipe de TI.");
        }finally{
            try{
                if(conn != null){
                    conn.close();
                }
                if(pstm != null){
                    pstm.close();
                }
                if(rset != null){
                    rset.close();
                }
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null,"Ocorreu um erro inesperado. Caso permaneça informe sua equipe de TI.");
            }
        }
        return agendas;
    }
}
