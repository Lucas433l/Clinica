package DAO;

import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import connection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Paciente;

public class PacienteDAO {
    public void insert(Paciente paciente){
        String sql = "INSERT INTO "+
        "paciente(nome, endereco, telefone, cpf, rg, sexo, cod_con, cod_plano) "+
        "VALUES(?,?,?,?,?,?,?,?)";
        Connection conn = null;
        PreparedStatement pstm = null;
        try{
            conn = Conexao.Conectar();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, paciente.getNome());
            pstm.setString(2, paciente.getEndereco());
            pstm.setString(3, paciente.getTelefone());
            pstm.setString(4, paciente.getCPF());
            pstm.setString(5, paciente.getRG());
            pstm.setString(6, paciente.getSexo());
            pstm.setInt(7, paciente.getCod_con());
            pstm.setInt(8, paciente.getCod_plano());
            pstm.execute();
            JOptionPane.showMessageDialog(null,"Paciente Cadastrado com sucesso.");
        }catch(MySQLIntegrityConstraintViolationException e){
            JOptionPane.showMessageDialog(null,"Plano ou convênio não encontrado.");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Ocorreu um erro inesperado. Caso o erro permaneça, procure sua equipe de TI.");
            JOptionPane.showMessageDialog(null,e);
        }
        finally{
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
    
    public void update(Paciente paciente){
        String sql = "UPDATE paciente "+
        "SET nome= ?, endereco= ?, telefone= ?, cpf= ?, rg=?, sexo=?, cod_con=?, cod_plano= ? "+
        "WHERE cpf = ?";
        Connection conn = null;
        PreparedStatement pstm = null;
        
        try{
            conn = Conexao.Conectar();
            pstm = conn.prepareStatement(sql);
            
            pstm.setString(1, paciente.getNome());
            pstm.setString(2, paciente.getEndereco());
            pstm.setString(3, paciente.getTelefone());
            pstm.setString(4, paciente.getCPF());
            pstm.setString(5, paciente.getRG());
            pstm.setString(6, paciente.getSexo());
            pstm.setInt(7, paciente.getCod_con());
            pstm.setInt(8, paciente.getCod_plano());
            pstm.setString(9, paciente.getCPF());
            
            pstm.execute();
            JOptionPane.showMessageDialog(null,"Dados atualizados com sucesso.");
        }catch(MySQLIntegrityConstraintViolationException e){
            JOptionPane.showMessageDialog(null,"Plano ou convênio não encontrado.");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Ocorreu um erro inesperado. Caso o erro permaneça, procure sua equipe de TI.");
        }
        finally{
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
    public List<Paciente> readAll(){
        String sql = "SELECT * FROM paciente";
        List<Paciente> pacientes = new ArrayList<Paciente>();
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;
        try{
            conn = Conexao.Conectar();
            pstm = conn.prepareStatement(sql);
            rset = pstm.executeQuery();
            while(rset.next()){
                Paciente paciente = new Paciente();
                paciente.setNome(rset.getString("nome"));
                paciente.setEndereco(rset.getString("endereco"));
                paciente.setTelefone(rset.getString("telefone"));
                paciente.setCPF(rset.getString("cpf"));
                paciente.setRG(rset.getString("rg"));
                paciente.setSexo(rset.getString("sexo"));
                paciente.setCod_con(rset.getInt("cod_con"));
                paciente.setCod_plano(rset.getInt("cod_plano"));
                pacientes.add(paciente);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Ocorreu um erro inesperado. Caso permaneça informe sua equipe de TI.");
        }
        finally{
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
        return pacientes;
    }
    public List<Paciente> readForCPF(String cpf){
        String sql = "SELECT * FROM paciente where cpf = ?";
        List<Paciente> pacientes = new ArrayList<Paciente>();
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;
        try{
            conn = Conexao.Conectar();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, cpf);
            rset = pstm.executeQuery();
            while(rset.next()){
                Paciente paciente = new Paciente();
                paciente.setNome(rset.getString("nome"));
                paciente.setEndereco(rset.getString("endereco"));
                paciente.setTelefone(rset.getString("telefone"));
                paciente.setCPF(rset.getString("cpf"));
                paciente.setRG(rset.getString("rg"));
                paciente.setSexo(rset.getString("sexo"));
                paciente.setCod_con(rset.getInt("cod_con"));
                paciente.setCod_plano(rset.getInt("cod_plano"));
                pacientes.add(paciente);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Ocorreu um erro inesperado. Caso permaneça informe sua equipe de TI.");
        }
        finally{
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
        return pacientes;
    }
    public List<Paciente> readForName(String nome){
        String sql = "SELECT * FROM paciente WHERE nome LIKE ?";
        List<Paciente> pacientes = new ArrayList<Paciente>();
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;
        try{
            conn = Conexao.Conectar();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, "%"+nome+"%");
            rset = pstm.executeQuery();
            while(rset.next()){
                Paciente paciente = new Paciente();
                paciente.setNome(rset.getString("nome"));
                paciente.setEndereco(rset.getString("endereco"));
                paciente.setTelefone(rset.getString("telefone"));
                paciente.setCPF(rset.getString("cpf"));
                paciente.setRG(rset.getString("rg"));
                paciente.setSexo(rset.getString("sexo"));
                paciente.setCod_con(rset.getInt("cod_con"));
                paciente.setCod_plano(rset.getInt("cod_plano"));
                pacientes.add(paciente);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Ocorreu um erro inesperado. Caso permaneça informe sua equipe de TI.");
        }
        finally{
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
        return pacientes;
    }
}
