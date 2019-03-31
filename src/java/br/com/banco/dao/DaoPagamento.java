/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.banco.dao;

import br.com.banco.factory.ConnectionFactory;
import br.com.banco.models.Pagamento;
import br.com.banco.models.Usuario;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author internet
 */
public class DaoPagamento implements Dao {

    @Override
    public boolean save(Object object) {
        Pagamento pag = null;
        if( object instanceof Pagamento){
            pag = (Pagamento)object;
        }else{
            return false;
        }
        
        String comando = "insert into pagamentos (nomeDespesa, valor, dataVemcimento, dataAgendamento) values (?, ?, ?, ?)";
        try{
            PreparedStatement stmt = new ConnectionFactory().getConnection().prepareStatement(comando);
            stmt.setString(1, pag.getNomeDespesa());
            stmt.setDouble(2, pag.getValor());
            stmt.setString(3, pag.getDataVencimento());
            stmt.setString(4, pag.getDataAgendamento());
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao cadastrar pagamento " + ex.getMessage());
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
