package DAO;

import connection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Medico;

public class MedicoDAO {
    public void insert(Medico medico){
        String sql = "INSERT INTO medico(nome, cpf, rg, crm, telefone, endereco, sexo, senha) "+
        "VALUES (?,?,?,?,?,?,?,md5(?))";
        Connection conn = null;
        PreparedStatement pstm = null;
        
        try{
            conn = Conexao.Conectar();
            pstm = conn.prepareStatement(sql);
            
            pstm.setString(1, medico.getNome());
            pstm.setString(2, medico.getCPF());
            pstm.setString(3, medico.getRG());
            pstm.setString(4, medico.getCRM());
            pstm.setString(5, medico.getTelefone());
            pstm.setString(6, medico.getEndereco());
            pstm.setString(7, medico.getSexo());
            pstm.setString(8, medico.getSenha());
            
            pstm.execute();
            JOptionPane.showMessageDialog(null,"Médico cadastrado com sucesso.");
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
    public void update(Medico medico){
        String sql = "UPDATE medico SET nome = ?, rg = ?, telefone = ?, endereco = ?, sexo= ? WHERE crm = ?";
        Connection conn = null;
        PreparedStatement pstm = null;
        
        try{
            conn = Conexao.Conectar();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, medico.getNome());
            pstm.setString(2, medico.getRG());
            pstm.setString(3, medico.getTelefone());
            pstm.setString(4, medico.getEndereco());
            pstm.setString(5, medico.getSexo());
            pstm.setString(6, medico.getCRM());
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
    public List<Medico> readAll(){
        String sql = "SELECT * FROM medico";
        List<Medico> medicos = new ArrayList<Medico>();
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;
        try{
            conn = Conexao.Conectar();
            pstm = conn.prepareStatement(sql);
            rset = pstm.executeQuery();
            
            while(rset.next()){
                Medico medico = new Medico();
                medico.setNome(rset.getString("nome"));
                medico.setCPF(rset.getString("cpf"));
                medico.setRG(rset.getString("rg"));
                medico.setCRM(rset.getString("crm"));
                medico.setTelefone(rset.getString("telefone"));
                medico.setEndereco(rset.getString("endereco"));
                medico.setSexo(rset.getString("sexo"));
                medico.setSenha(rset.getString("senha"));
                
                medicos.add(medico);
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
        return medicos;
    }
    
    public ArrayList readForLogin(String cpf, String password){
        String sql = "SELECT nome FROM medico WHERE cpf = ? and senha = md5(?)";
        ArrayList medicos = new ArrayList();
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;
        try{
            conn = Conexao.Conectar();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, cpf);
            pstm.setString(2, password);
            
            rset = pstm.executeQuery();
            
            if(rset.next()){
                medicos.add(true);
                medicos.add(rset.getString("nome"));
            }
            else{
                medicos.add(false);
                medicos.add("X");
            }
        }catch(Exception e){
            System.out.println("correu o erro: "+e);
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
        return medicos;
    }
    public List<Medico> readForName(String name){
        String sql = "SELECT * FROM medico WHERE nome LIKE ?";
        List<Medico> medicos = new ArrayList<Medico>();
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;
        try{
            conn = Conexao.Conectar();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, "%"+name+"%");
            rset = pstm.executeQuery();
            
            while(rset.next()){
                Medico medico = new Medico();
                medico.setNome(rset.getString("nome"));
                medico.setCPF(rset.getString("cpf"));
                medico.setRG(rset.getString("rg"));
                medico.setCRM(rset.getString("crm"));
                medico.setTelefone(rset.getString("telefone"));
                medico.setEndereco(rset.getString("endereco"));
                medico.setSexo(rset.getString("sexo"));
                medico.setSenha(rset.getString("senha"));
                
                medicos.add(medico);
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
        return medicos;
    }
    public List<Medico> readForCRM(String crm){
        String sql =  "SELECT *  FROM medico WHERE crm = ?";
        List<Medico> medicos = new ArrayList<Medico>();
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;
        try{
            conn = Conexao.Conectar();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, crm);
            rset = pstm.executeQuery();
            
            while(rset.next()){
                Medico medico = new Medico();
                medico.setNome(rset.getString("nome"));
                medico.setCPF(rset.getString("cpf"));
                medico.setRG(rset.getString("rg"));
                medico.setCRM(rset.getString("crm"));
                medico.setTelefone(rset.getString("telefone"));
                medico.setEndereco(rset.getString("endereco"));
                medico.setSexo(rset.getString("sexo"));
                medico.setSenha(rset.getString("senha"));
                
                medicos.add(medico);
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
        return medicos;
    }
}
