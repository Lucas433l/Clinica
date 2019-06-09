package DAO;import connection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Secretaria;

public class SecretariaDAO {
    //função que adiciona a secretaria no sistema
    public void insert(Secretaria secretaria){
        String sql = "INSERT INTO secretaria(nome, cpf, rg, telefone, endereco, sexo, senha)"+
        "VALUES (?,?,?,?,?,?,md5(?))";
        Connection conn = null;
        PreparedStatement pstm= null;

        try{
            conn = Conexao.Conectar();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, secretaria.getNome());
            pstm.setString(2, secretaria.getCPF());
            pstm.setString(3, secretaria.getRG());
            pstm.setString(4, secretaria.getTelefone());
            pstm.setString(5, secretaria.getEndereco());
            pstm.setString(6, secretaria.getSexo());
            pstm.setString(7, secretaria.getSenha());
            pstm.execute();
            JOptionPane.showMessageDialog(null,"Secretária cadastrada com sucesso.");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Ocorreu um erro inesperado. Caso permaneça informe sua equipe de TI.");
        }
        finally{
            try{
                if(pstm != null){
                    pstm.close();
                }
                if(conn != null){
                    conn.close();
                }
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null,"Ocorreu um erro inesperado. Caso permaneça informe sua equipe de TI.");
            }
        }
    }
    
    public ArrayList readForLogin(String cpf, String password){
        String sql = "SELECT nome FROM secretaria where cpf = ? and senha = md5(?)";
        ArrayList op = new ArrayList();
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
                op.add(true);
                op.add(rset.getString("nome"));
            }
            else{
                op.add(false);
                op.add("X");
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
        return op;
    }
}
