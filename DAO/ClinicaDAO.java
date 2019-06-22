package DAO;

import connection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;;
import javax.swing.JOptionPane;
import model.Clinica;

public class ClinicaDAO {
    public void insert(Clinica clinica){
        String sql = "INSERT INTO clinica(nome_clinica, cnpj, endereco, telefone) VALUES(?,?,?,?)";
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
}
