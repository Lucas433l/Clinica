package DAO;

import connection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Ficha_Medica;

public class Ficha_MedicaDAO {
    public void insert(Ficha_Medica ficha){
        String sql = "INSERT INTO ficha_medica(nome_paciente, cpf, nome_medico, crm, data_consulta,queixa, antecedentes, historico_doenca, hip_diag, medicacao, exames_ap_sist, exames_comp) "
        + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
        Connection conn = null;
        PreparedStatement pstm = null;
        
        try{
            conn = Conexao.Conectar();
            pstm = conn.prepareStatement(sql);
            
            pstm.setString(1, ficha.getNome_paciente());
            pstm.setString(2, ficha.getCPF());
            pstm.setString(3, ficha.getNome_medico());
            pstm.setString(4, ficha.getCRM());
            String data = ficha.getData_consulta();
            pstm.setString(5, data);
            pstm.setString(6, ficha.getQueixa());
            pstm.setString(7, ficha.getAntecedentes());
            pstm.setString(8, ficha.getHistorico());
            pstm.setString(9, ficha.getHipotese_diag());
            pstm.setString(10, ficha.getMedicacao());
            pstm.setString(11, ficha.getExames_ap_sist());
            pstm.setString(12, ficha.getExames_comp());
            
            pstm.execute();
            JOptionPane.showMessageDialog(null,"Ficha Médica Criada com sucesso.");
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
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null,"Ocorreu um erro inesperado. Caso permaneça informe sua equipe de TI.");
            }
        }
    }
    public void update(Ficha_Medica ficha){
        String sql = "UPDATE ficha_medica SET data_consulta= ?,queixa=?,antecedentes=?,historico_doenca=?,hip_diag=?,"
        + "medicacao=?,exames_ap_sist=?,exames_comp= ? WHERE cod_ficha = ?";
        Connection conn = null;
        PreparedStatement pstm = null;
        
        try{
            conn = Conexao.Conectar();
            pstm = conn.prepareStatement(sql);
            
            String aux[] = ficha.getData_consulta().split("/");
            String data = aux[2] +"-"+aux[1]+"-"+aux[0];
            pstm.setString(1, data);
            pstm.setString(2, ficha.getQueixa());
            pstm.setString(3, ficha.getAntecedentes());
            pstm.setString(4, ficha.getHistorico());
            pstm.setString(5, ficha.getHipotese_diag());
            pstm.setString(6, ficha.getMedicacao());
            pstm.setString(7, ficha.getExames_ap_sist());
            pstm.setString(8, ficha.getExames_comp());
            pstm.setInt(9, ficha.getCod());
            
            pstm.execute();
            
            JOptionPane.showMessageDialog(null,"Dados atualizados com sucesso.");
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
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null,"Ocorreu um erro inesperado. Caso permaneça informe sua equipe de TI.");
            }
        }
    }
    public List<Ficha_Medica> readAll(){
        String sql = "SELECT * FROM ficha_medica";
        List<Ficha_Medica> fichas = new ArrayList<Ficha_Medica>();
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;
        try{
            conn = Conexao.Conectar();
            pstm = conn.prepareStatement(sql);
            
            rset = pstm.executeQuery();
            
            while(rset.next()){
                Ficha_Medica ficha = new Ficha_Medica();
                ficha.setCod(rset.getInt("cod_ficha"));
                ficha.setNome_paciente(rset.getString("nome_paciente"));
                ficha.setCPF(rset.getString("cpf"));
                ficha.setNome_medico(rset.getString("nome_medico"));
                ficha.setCRM(rset.getString("crm"));
                String aux[] = rset.getString("data_consulta").split("-");
                String data = aux[2] + "/" + aux[1] + "/" + aux[0];
                ficha.setData_consulta(data);
                ficha.setQueixa(rset.getString("queixa"));
                ficha.setAntecedentes(rset.getString("antecedentes"));
                ficha.setHistorico(rset.getString("historico_doenca"));
                ficha.setHipotese_diag(rset.getString("hip_diag"));
                ficha.setMedicacao(rset.getString("medicacao"));
                ficha.setExames_ap_sist(rset.getString("exames_ap_sist"));
                ficha.setExames_comp(rset.getString("exames_comp"));
                
                fichas.add(ficha);
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
        return fichas;
    }
    public List<Ficha_Medica> readForName(String name){
        String sql = "SELECT * FROM ficha_medica WHERE nome_paciente LIKE ?";
        List<Ficha_Medica> fichas = new ArrayList<Ficha_Medica>();
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;
        try{
            conn = Conexao.Conectar();
            pstm = conn.prepareStatement(sql);
            
            pstm.setString(1, "%"+name+"%");
            
            rset  = pstm.executeQuery();
            
            while(rset.next()){
                Ficha_Medica ficha = new Ficha_Medica();
                ficha.setCod(rset.getInt("cod_ficha"));
                ficha.setNome_paciente(rset.getString("nome_paciente"));
                ficha.setCPF(rset.getString("cpf"));
                ficha.setNome_medico(rset.getString("nome_medico"));
                ficha.setCRM(rset.getString("crm"));
                String aux[] = rset.getString("data_consulta").split("-");
                String data = aux[2] + "/" + aux[1] + "/" + aux[0];
                ficha.setData_consulta(data);
                ficha.setQueixa(rset.getString("queixa"));
                ficha.setAntecedentes(rset.getString("antecedentes"));
                ficha.setHistorico(rset.getString("historico_doenca"));
                ficha.setHipotese_diag(rset.getString("hip_diag"));
                ficha.setMedicacao(rset.getString("medicacao"));
                ficha.setExames_ap_sist(rset.getString("exames_ap_sist"));
                ficha.setExames_comp(rset.getString("exames_comp"));
                
                fichas.add(ficha);
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
        return fichas;
    }
    
    public List<Ficha_Medica> readForCod(int cod){
        String sql = "SELECT * FROM ficha_medica WHERE cod_ficha = ?";
        List<Ficha_Medica> fichas = new ArrayList<Ficha_Medica>();
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;
        try{
            conn = Conexao.Conectar();
            pstm = conn.prepareStatement(sql);
            
            pstm.setInt(1, cod);
            
            rset  = pstm.executeQuery();
            
            while(rset.next()){
                Ficha_Medica ficha = new Ficha_Medica();
                ficha.setCod(rset.getInt("cod_ficha"));
                ficha.setNome_paciente(rset.getString("nome_paciente"));
                ficha.setCPF(rset.getString("cpf"));
                ficha.setNome_medico(rset.getString("nome_medico"));
                ficha.setCRM(rset.getString("crm"));
                String aux[] = rset.getString("data_consulta").split("-");
                String data = aux[2] + "/" + aux[1] + "/" + aux[0];
                ficha.setData_consulta(data);
                ficha.setQueixa(rset.getString("queixa"));
                ficha.setAntecedentes(rset.getString("antecedentes"));
                ficha.setHistorico(rset.getString("historico_doenca"));
                ficha.setHipotese_diag(rset.getString("hip_diag"));
                ficha.setMedicacao(rset.getString("medicacao"));
                ficha.setExames_ap_sist(rset.getString("exames_ap_sist"));
                ficha.setExames_comp(rset.getString("exames_comp"));
                
                fichas.add(ficha);
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
        return fichas;
    }
}
