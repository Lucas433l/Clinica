package DAO;

import connection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AdminDAO {
    public ArrayList readForLogin(String cpf, String password){
        String sql = "SELECT nome FROM admin where cpf = ? and senha = md5(?)";
        ArrayList admins = new ArrayList();
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
                admins.add(true);
                admins.add(rset.getString("nome"));
            }
            else{
                admins.add(false);
                admins.add("X");
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
        return admins;
    }
}
