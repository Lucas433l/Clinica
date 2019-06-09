package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexao {
    private static final String USER = "root";
    private static final String PASSWORD = "";
    private static final String DATABASE = "jdbc:mysql://localhost:3306/clinica";
    public static Connection Conectar() throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conexao = null;
        try{
            conexao = DriverManager.getConnection(DATABASE, USER, PASSWORD);
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Banco de Dados não iniciado no servidor.");
        }
        return conexao;
    }
}
