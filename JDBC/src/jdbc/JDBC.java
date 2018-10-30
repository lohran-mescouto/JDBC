package jdbc;

import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException; 
import java.sql.PreparedStatement;

public class JDBC {

public static void main(String[] args) {
    String conexao = "valor";
    
    try {
    Connection mysql = DriverManager.getConnection(
    "jdbc:mysql://localhost/Agenda",
    "root",
    "1q"
    );
    String sql = "insert into contatos (nome, endereco,(?, ?)";
    PreparedStatement instrucao;
        instrucao = mysql.prepareStatement(sql);
    
            instrucao.setString(1, "Pedro Coockie");
            //instrucao.setString(2, "pedrocoockie@gmail.com");
            instrucao.setString(2, "Av fab 60");
            
            instrucao.execute();
    
    System.out.println("Conectado!");
    
    } catch (SQLException e) {
        System.out.println("Ocorreu um erro!");
        throw new RuntimeException (e.getMessage());
    }
    }
    // TODO code application logic here
}