package br.com.banco.dao;

import br.com.banco.factory.ConnectionFactory;
import br.com.banco.models.Usuario;
import com.sun.istack.internal.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;

public class DaoUsuario implements Dao {

    @Override
    public boolean save(Object object) {
        Usuario usu = null;
        if( object instanceof Usuario){
            usu = (Usuario)object;
        }else{
            return false;
        }
        
        String comando = "insert into usuarios (nome, email, senha, endereco) values (?, ?, ?, ?)";
        try{
            PreparedStatement stmt = new ConnectionFactory().getConnection().prepareStatement(comando);
            stmt.setString(1, usu.getNome());
            stmt.setString(2, usu.getEmail());
            stmt.setString(3, usu.getSenha());
            stmt.setString(4, usu.getEndereco());
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao cadastrar usuário " + ex.getMessage());
        } 
        return false;
        
    }
    @Override
    public boolean update(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Object> get() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
