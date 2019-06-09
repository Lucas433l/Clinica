/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import connection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Plano;

/**
 *
 * @author lucasz
 */
public class PlanoDAO {
    public void insert(Plano p){
        String sql = "INSERT INTO planos(tipo, descricao, cod_con) VALUES (?,?,?)";
        PreparedStatement pstm = null;
        Connection conn = null;
        try{
            conn = Conexao.Conectar();
            pstm = conn.prepareStatement(sql);
            
            pstm.setString(1, p.getTipo());
            pstm.setString(2, p.getDesc());
            pstm.setInt(3, p.getCod_con());
            
            pstm.execute();
            JOptionPane.showMessageDialog(null,"Plano cadastrado com sucesso.");
        }catch(Exception e){
            if(e instanceof com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException){
                JOptionPane.showMessageDialog(null,"Convênio não encontrada");
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
    
    public void update(Plano p){
        String sql = "UPDATE planos SET tipo = ?, descricao = ? WHERE cod_plano = ?";
        PreparedStatement pstm = null;
        Connection conn = null;
        try{
            conn = Conexao.Conectar();
            pstm = conn.prepareStatement(sql);
            
            pstm.setString(1, p.getTipo());
            pstm.setString(2, p.getDesc());
            pstm.setInt(3, p.getCod());
            
            pstm.execute();
            JOptionPane.showMessageDialog(null,"Plano alterado com sucesso.");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Ocorreu algum erro na alteraçãp do plano.");
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
    
    public void delete(int cod){
        String sql = "DELETE FROM planos WHERE cod_plano = ?";
        
        PreparedStatement pstm = null;
        Connection conn = null;
        
        try{
            conn = Conexao.Conectar();
            pstm = conn.prepareStatement(sql);
            
            pstm.setInt(1, cod);
            
            pstm.execute();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Ocorreu algum erro ao deletar o plano.");
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
    
    public List<Plano> readAll(){
        String sql = "SELECT * FROM planos";
        List<Plano> planos = new ArrayList<Plano>();
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;
        
        try{
            conn = Conexao.Conectar();
            pstm = conn.prepareStatement(sql);
            rset = pstm.executeQuery();
            
            while(rset.next()){
                Plano plano = new Plano();
                plano.setCod(rset.getInt("cod_plano"));
                plano.setTipo(rset.getString("tipo"));
                plano.setDesc(rset.getString("descricao"));
                plano.setCod_con(rset.getInt("cod_con"));
                
                planos.add(plano);
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
        return planos;
    }
    
    public List<Plano> readForCod(int cod){
        String sql = "SELECT * FROM planos WHERE cod_plano = ?";
        List<Plano> planos = new ArrayList<Plano>();
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;
        
        try{
            conn = Conexao.Conectar();
            pstm = conn.prepareStatement(sql);
            
            pstm.setInt(1, cod);
            
            rset = pstm.executeQuery();
            
            while(rset.next()){
                Plano plano = new Plano();
                plano.setCod(rset.getInt("cod_plano"));
                plano.setTipo(rset.getString("tipo"));
                plano.setDesc(rset.getString("descricao"));
                plano.setCod_con(rset.getInt("cod_con"));
                
                planos.add(plano);
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
        return planos;
    }
    
    public List<Plano> readForCod_con(int cod_con){
        String sql = "SELECT * FROM planos WHERE cod_con = ?";
        List<Plano> planos = new ArrayList<Plano>();
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;
        
        try{
            conn = Conexao.Conectar();
            pstm = conn.prepareStatement(sql);
            
            pstm.setInt(1, cod_con);
            
            rset = pstm.executeQuery();
            
            while(rset.next()){
                Plano plano = new Plano();
                plano.setCod(rset.getInt("cod_plano"));
                plano.setTipo(rset.getString("tipo"));
                plano.setDesc(rset.getString("descricao"));
                plano.setCod_con(rset.getInt("cod_con"));
                
                planos.add(plano);
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
        return planos;
    }
    
    public List<Plano> readForTipo(String tipo){
        String sql = "SELECT * FROM planos WHERE tipo LIKE ?";
        List<Plano> planos = new ArrayList<Plano>();
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;
        
        try{
            conn = Conexao.Conectar();
            pstm = conn.prepareStatement(sql);
            
            pstm.setString(1, "%"+tipo+"%");
            
            rset = pstm.executeQuery();
            
            while(rset.next()){
                Plano plano = new Plano();
                plano.setCod(rset.getInt("cod_plano"));
                plano.setTipo(rset.getString("tipo"));
                plano.setDesc(rset.getString("descricao"));
                plano.setCod_con(rset.getInt("cod_con"));
                
                planos.add(plano);
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
        return planos;
    }
}
