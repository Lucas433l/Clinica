package DAO;

import connection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.CID;

public class CID_DAO {
    public List<CID> readAll(){
        String sql = "SELECT * FROM tabela_cid";
        List<CID> doencas = new ArrayList<CID>();
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;
        try{
            conn = Conexao.Conectar();
            pstm = conn.prepareStatement(sql);
            rset = pstm.executeQuery();
            while(rset.next()){
                CID doenca = new CID();
                doenca.setId(rset.getString("id_cid"));
                doenca.setDoenca(rset.getString("doenca"));
                doencas.add(doenca);
            }
        }catch(Exception e){
            System.out.println("Ocorreu o erro: "+e);
        }
        finally{
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
                System.out.println("Ocorreu o erro: "+e);
            }    
        }
        return doencas;
    }
    public List<CID> readForID(String id){
        String sql = "SELECT * FROM tabela_cid where id_cid = ?";
        List<CID> doencas = new ArrayList<CID>();
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;
        try{
            conn = Conexao.Conectar();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1,id);
            rset = pstm.executeQuery();
            while(rset.next()){
                CID doenca = new CID();
                doenca.setId(rset.getString("id_cid"));
                doenca.setDoenca(rset.getString("doenca"));
                doencas.add(doenca);
            }
        }catch(Exception e){
            System.out.println("Ocorreu o erro: "+e);
        }
        finally{
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
                System.out.println("Ocorreu o erro: "+e);
            }    
        }
        return doencas;
    }
    public List<CID> readForName(String name){
        String sql = "SELECT * FROM tabela_cid where doenca = ?";
        List<CID> doencas = new ArrayList<CID>();
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;
        try{
            conn = Conexao.Conectar();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, name);
            rset = pstm.executeQuery();
            while(rset.next()){
                CID doenca = new CID();
                doenca.setId(rset.getString("id_cid"));
                doenca.setDoenca(rset.getString("doenca"));
                doencas.add(doenca);
            }
        }catch(Exception e){
            System.out.println("Ocorreu o erro: "+e);
        }
        finally{
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
                System.out.println("Ocorreu o erro: "+e);
            }    
        }
        return doencas;
    }
}
