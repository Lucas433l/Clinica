package DAO;

import connection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.List;
import javax.swing.JOptionPane;
import model.Consulta;

public class ConsultaDAO {
    public void insert(Consulta consulta){
        String sql = "INSERT INTO consulta(nome_paciente, cpf, nome_medico, crm, data, hora_inicio, hora_final, preco) "+
       "VALUES (?,?,?,?,?,?,?,?)";
        Connection conn = null;
        PreparedStatement pstm = null;
        
        try{
            conn = Conexao.Conectar();
            pstm = conn.prepareStatement(sql);
            
            pstm.setString(1, consulta.getPaciente());
            pstm.setString(2, consulta.getCPF());
            pstm.setString(3, consulta.getMedico());
            pstm.setString(4, consulta.getCRM());
            
            SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd"); 
            Date data = new Date(fmt.parse(consulta.getData()).getTime());
            pstm.setDate(5, data);
            
            pstm.setString(6, consulta.getHora_inicio());
            
            String hora_f = (consulta.getHora_final());
            pstm.setString(7, hora_f);
            
            pstm.setFloat(8, consulta.getPreco());
            pstm.execute();
            
            new ConvenioDAO().faturamento(consulta.getPreco(), consulta.getCPF());
            
            JOptionPane.showMessageDialog(null,"Consulta Marcada com sucesso.");
        }catch(Exception e){
            if(e instanceof com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException){
                JOptionPane.showMessageDialog(null,"CRM ou CPF não encontrada");
            }
            JOptionPane.showMessageDialog(null,"Ocorreu um erro inesperado. Caso o erro permaneça, procure sua equipe de TI.");
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
    public List<Consulta> readAll(){
        String sql = "SELECT * FROM consulta";
        List<Consulta> consultas = new ArrayList<Consulta>();
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;
        try{
            conn = Conexao.Conectar();
            pstm = conn.prepareStatement(sql);
            rset = pstm.executeQuery();
            
            while(rset.next()){
                Consulta consulta = new Consulta();
                consulta.setCod(rset.getInt("cod_consulta"));
                consulta.setPaciente(rset.getString("nome_paciente"));
                consulta.setCPF(rset.getString("cpf"));
                consulta.setMedico(rset.getString("nome_medico"));
                consulta.setCRM(rset.getString("crm"));
                
                String[] aux = rset.getString("data").split("-");
                String data = aux[2] +"/"+aux[1] + "/"+ aux[0];
                consulta.setData(data);
                
                consulta.setHora_inicio((rset.getString("hora_inicio")));
                consulta.setHora_final((rset.getString("hora_final")));
                
                consulta.setPreco(rset.getFloat("preco"));
                consulta.setSituacao(rset.getInt("situacao"));
                
                consultas.add(consulta);
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
        return consultas;
    }
    public List<Consulta> readForCRM(String crm){
        String sql = "SELECT * FROM consulta WHERE crm = ? or data = ? or";
        List<Consulta> consultas = new ArrayList<Consulta>();
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;
        try{
            conn = Conexao.Conectar();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, crm);
            rset = pstm.executeQuery();
            
            while(rset.next()){
                Consulta consulta = new Consulta();
                consulta.setCod(rset.getInt("cod_consulta"));
                consulta.setPaciente(rset.getString("nome_paciente"));
                consulta.setCPF(rset.getString("cpf"));
                consulta.setMedico(rset.getString("nome_medico"));
                consulta.setCRM(rset.getString("crm"));
                SimpleDateFormat fmt = new SimpleDateFormat("dd/mm/yyyy");
                
                consulta.setData(fmt.format(rset.getString("data")));
                
                fmt = new SimpleDateFormat("hh:mm");
                consulta.setHora_inicio(fmt.format(rset.getString("hora_inicio")));
                consulta.setHora_final(fmt.format(rset.getString("hora_final")));
                
                consulta.setPreco(rset.getFloat("preco"));
                consulta.setSituacao(rset.getInt("situacao"));
                
                consultas.add(consulta);
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
        return consultas;
    }
    public List<Consulta> readForCPF(String cpf){
        String sql = "SELECT * FROM consulta WHERE cpf = ?";
        List<Consulta> consultas = new ArrayList<Consulta>();
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;
        try{
            conn = Conexao.Conectar();
            pstm = conn.prepareStatement(sql);
            rset = pstm.executeQuery();
            
            while(rset.next()){
                Consulta consulta = new Consulta();
                consulta.setCod(rset.getInt("cod_consulta"));
                consulta.setPaciente(rset.getString("nome_paciente"));
                consulta.setCPF(rset.getString("cpf"));
                consulta.setMedico(rset.getString("nome_medico"));
                consulta.setCRM(rset.getString("crm"));
                SimpleDateFormat fmt = new SimpleDateFormat("dd/mm/yyyy");
                
                consulta.setData(fmt.format(rset.getString("data")));
                
                fmt = new SimpleDateFormat("hh:mm");
                consulta.setHora_inicio(fmt.format(rset.getString("hora_inicio")));
                consulta.setHora_final(fmt.format(rset.getString("hora_final")));
                
                consulta.setPreco(rset.getFloat("preco"));
                consulta.setSituacao(rset.getInt("situacao"));
                
                consultas.add(consulta);
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
        return consultas;
    }
    public List<Consulta> readForDate(String date){
        String sql = "SELECT * FROM consulta WHERE data = ?";
        List<Consulta> consultas = new ArrayList<Consulta>();
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;
        
        try{
            conn = Conexao.Conectar();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, date);
            rset = pstm.executeQuery();
            
            while(rset.next()){
                Consulta consulta = new Consulta();
                consulta.setCod(rset.getInt("cod_consulta"));
                consulta.setPaciente(rset.getString("nome_paciente"));
                consulta.setCPF(rset.getString("cpf"));
                consulta.setMedico(rset.getString("nome_medico"));
                consulta.setCRM(rset.getString("crm"));
                SimpleDateFormat fmt = new SimpleDateFormat("dd/mm/yyyy");
                
                consulta.setData(fmt.format(rset.getString("data")));
                
                fmt = new SimpleDateFormat("hh:mm");
                consulta.setHora_inicio(fmt.format(rset.getString("hora_inicio")));
                consulta.setHora_final(fmt.format(rset.getString("hora_final")));
                
                consulta.setPreco(rset.getFloat("preco"));
                consulta.setSituacao(rset.getInt("situacao"));
                
                consultas.add(consulta);
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
                    pstm.close();
                }
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null,"Ocorreu um erro inesperado. Caso permaneça informe sua equipe de TI.");
            }
        }
        return consultas;
    }
    public void situacao(int situacao, int cod){
        String sql = "UPDATE consulta SET situacao = ? WHERE cod_consulta = ?";
        Connection conn = null;
        PreparedStatement pstm = null;
        
        try{
            conn = Conexao.Conectar();
            pstm = conn.prepareStatement(sql);
            
            pstm.setInt(1, situacao);
            pstm.setInt(2,cod);
            
            pstm.execute();
            JOptionPane.showMessageDialog(null,"Situação atualizada com sucesso.");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Ocorreu um erro inesperado. Caso o erro permaneça, procure sua equipe de TI.");
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
}
    
