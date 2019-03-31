package br.com.banco.factory;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConnectionFactory {
    
   public static final String SERVIDOR = "localhost";
   public static final String PORTA = "3306";
   public static final String USUARIO = "root";
   public static final String SENHA = "";
   public static final String BANCO = "auladb";
   

    public Connection getConnection(){
        String url = "jdbc:mysql://" + SERVIDOR + ":" + PORTA + "/" + BANCO;
        Connection cnn;
        
        
       try {
           Class.forName("org.gjt.mm.mysql.Driver");
           cnn = (Connection) DriverManager.getConnection(url, USUARIO, SENHA);
           return cnn;
       } catch (ClassNotFoundException ex) {
           System.out.println("Driver não encontrado");
       } catch (SQLException ex) {
           System.out.println("Não conectou no servidor");
       } catch (Exception ex) {
           System.out.println("Outro erro: "+ex.getMessage());
       }
        return null;   
       }        
        
        
}

   
