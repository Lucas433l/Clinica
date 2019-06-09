package DAO;

import connection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Convenio;
import model.Paciente;

public class ConvenioDAO {
    public void insert(Convenio convenio){
        String sql = "INSERT INTO convenio(nome, telefone, endereco, cnpj, faturamento)"+
        "VALUES (?,?,?,?,?)";
        Connection conn = null;
        PreparedStatement pstm = null;
        try{
            conn = Conexao.Conectar();
            pstm = conn.prepareStatement(sql);
            
            pstm.setString(1, convenio.getNome());
            pstm.setString(2, convenio.getTelefone());
            pstm.setString(3, convenio.getEndereco());
            pstm.setString(4, convenio.getCNPJ());
            pstm.setFloat(5, convenio.getFaturamento());
            
            pstm.execute();
            JOptionPane.showMessageDialog(null,"Convênio Cadastrado com sucesso.");
            
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
    }
    
    public List<Convenio> readAll(){
        String sql = "SELECT * FROM convenio";
        List<Convenio> convenios = new ArrayList<Convenio>();
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;
        try{
            conn = Conexao.Conectar();
            pstm = conn.prepareStatement(sql);
            rset = pstm.executeQuery();
            
            while(rset.next()){
                Convenio conv = new Convenio();
                conv.setCod(rset.getInt("cod_con"));
                conv.setNome(rset.getString("nome"));
                conv.setTelefone(rset.getString("telefone"));
                conv.setEndereco(rset.getString("endereco"));
                conv.setCNPJ(rset.getString("cnpj"));
                conv.setFaturamento(rset.getFloat("faturamento"));
                convenios.add(conv);
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
        return convenios;
    }
    
    public List<Convenio> readForName(String nome){
        String sql = "SELECT * FROM consulta WHERE nome LIKE ?";
        List<Convenio> convenios = new ArrayList<Convenio>();
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;
        try{
            conn = Conexao.Conectar();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, "%"+nome+"%");
            rset = pstm.executeQuery();
            
            while(rset.next()){
                Convenio conv = new Convenio();
                conv.setCod(rset.getInt("cod_con"));
                conv.setNome(rset.getString("nome"));
                conv.setTelefone(rset.getString("telefone"));
                conv.setEndereco(rset.getString("endereco"));
                conv.setCNPJ(rset.getString("cnpj"));
                conv.setFaturamento(rset.getFloat("faturamento"));
                convenios.add(conv);
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
        return convenios;
    }
    
    public List<Convenio> readForCNPJ(String cnpj){
        String sql = "SELECT * FROM consulta cnpj = ?";
        List<Convenio> convenios = new ArrayList<Convenio>();
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;
        try{
            conn = Conexao.Conectar();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, cnpj);
            rset = pstm.executeQuery();
            
            while(rset.next()){
                Convenio conv = new Convenio();
                conv.setCod(rset.getInt("cod_con"));
                conv.setNome(rset.getString("nome"));
                conv.setTelefone(rset.getString("telefone"));
                conv.setEndereco(rset.getString("endereco"));
                conv.setCNPJ(rset.getString("cnpj"));
                conv.setFaturamento(rset.getFloat("faturamento"));
                convenios.add(conv);
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
        return convenios;
    }
    public List<Convenio> readForCod(int cod){
        String sql = "SELECT * FROM consulta cod_con = ?";
        List<Convenio> convenios = new ArrayList<Convenio>();
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;
        try{
            conn = Conexao.Conectar();
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, cod);
            rset = pstm.executeQuery();
            
            while(rset.next()){
                Convenio conv = new Convenio();
                conv.setCod(rset.getInt("cod_con"));
                conv.setNome(rset.getString("nome"));
                conv.setTelefone(rset.getString("telefone"));
                conv.setEndereco(rset.getString("endereco"));
                conv.setCNPJ(rset.getString("cnpj"));
                conv.setFaturamento(rset.getFloat("faturamento"));
                convenios.add(conv);
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
        return convenios;
    }
    
    public void faturamento(float preco, String cpf){
        String sql = "UPDATE convenio SET faturamento= faturamento + ? WHERE cod_con = ?";
        PreparedStatement pstm = null;
        Connection conn = null;
        
        try{
            List<Paciente> p = new PacienteDAO().readForCPF(cpf);
            Paciente paciente = p.get(0);
            
            conn = Conexao.Conectar();
            pstm = conn.prepareStatement(sql);
            
            pstm.setFloat(1, preco);
            pstm.setInt(2, paciente.getCod_con());
            
            pstm.execute();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Ocorreu um erro inesperado. Caso permaneça informe a sua equipe de TI.");
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
