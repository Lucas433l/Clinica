package DAO;

import connection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Clinica;

public class ClinicaDAO {
    public void insert(Clinica clinica){
        String sql = "INSERT INTO clinica(nome, cnpj, endereco, telefone) VALUES(?,?,?,?)";
        Connection conn = null;
        PreparedStatement pstm = null;
        try{
            conn = Conexao.Conectar();
            pstm = conn.prepareStatement(sql);
            
            pstm.setString(1, clinica.getNome());
            pstm.setString(2, clinica.getCNPJ());
            pstm.setString(3, clinica.getEndereco());
            pstm.setString(4, clinica.getTelefone());
            pstm.execute();
            JOptionPane.showMessageDialog(null,"Clinica cadastrada com sucesso.");
        }catch(Exception e){
            System.out.println("Ocorreu o erro: "+e);
        }finally{
            try{
                if(conn != null){
                    conn.close();
                }
                if(pstm != null){
                    pstm.close();
                }
            }catch(SQLException e){
                System.out.println("Ocorreu o erro: "+e);
            }
        }
    }
    public void update(Clinica clinica){
        String sql = "UPDATE clinica SET nome = ?, cnpj = ?, endereco = ?, telefone = ? WHERE cnpj = ?";
        Connection conn = null;
        PreparedStatement pstm = null;
        try{
            conn = Conexao.Conectar();
            pstm = conn.prepareStatement(sql);
            
            pstm.setString(1, clinica.getNome());
            pstm.setString(2, clinica.getCNPJ());
            pstm.setString(3, clinica.getEndereco());
            pstm.setString(4, clinica.getTelefone());
            pstm.setString(5, clinica.getCNPJ());
            pstm.execute();
            JOptionPane.showMessageDialog(null,"Clinica cadastrada com sucesso.");
        }catch(Exception e){
            System.out.println("Ocorreu o erro: "+e);
        }finally{
            try{
                if(conn != null){
                    conn.close();
                }
                if(pstm != null){
                    pstm.close();
                }
            }catch(SQLException e){
                System.out.println("Ocorreu o erro: "+e);
            }
        }
    }
    public void delete(String cnpj){
        String sql = "DELETE FROM clinica WHERE cnpj = ?";
        Connection conn = null;
        PreparedStatement pstm = null;
        try{
            conn = Conexao.Conectar();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, cnpj);
            pstm.execute();
        }catch(Exception e){
            System.out.println("Ocorreu o erro: "+e);
        }finally{
            try{
                if(conn != null){
                    conn.close();
                }
                if(pstm != null){
                    pstm.close();
                }
            }catch(SQLException e){
                System.out.println("Ocorreu o erro: "+e);
            }
        }
    }
    public List<Clinica> readAll(){
        String sql = "SELECT * FROM clinica";
        List<Clinica> clinicas = new ArrayList<Clinica>();
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;
        try{
            conn = Conexao.Conectar();
            pstm = conn.prepareStatement(sql);
            rset = pstm.executeQuery();
            while(rset.next()){
                Clinica clinica = new Clinica();
                clinica.setNome(rset.getString("nome_clinica"));
                clinica.setCNPJ(rset.getString("cnpj"));
                clinica.setEndereco(rset.getString("endereco"));
                clinica.setTelefone(rset.getString("telefone"));
                clinicas.add(clinica);
            }
        }catch(Exception e){
            System.out.println("Ocorreu o erro: "+e);
        }finally{
            try{
                if(conn != null){
                    conn.close();
                }
                if(pstm != null){
                    pstm.close();
                }
            }catch(SQLException e){
                System.out.println("Ocorreu o erro: "+e);
            }
        }
        return clinicas;
    }
}
