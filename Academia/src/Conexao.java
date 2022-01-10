
import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nikol
 */
public class Conexao {
    private String url;
    private String usuario;
    private String senha;
    private Connection con;
    private Statement Stmt = null;
    
    Conexao(){
        url = "jdbc:postgresql://localhost:5432/postgres";
        usuario = "postgres";
        senha = "postgres";
        
        try {
            Class.forName("org.postgresql.Driver");
            con = (Connection) DriverManager.getConnection(url,usuario,senha);
            System.out.println("Conexão Realizada com Sucesso!!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void incluir(String nome, int idade, float peso, float altura, String objetivo){        
	        try {
	            Stmt.executeUpdate("insert into tb_aluno (nome, idade, peso, altura, objetivo)values("+"'"+ nome +"'"+","+idade+","+peso+","+altura+",'"+objetivo+"')");
	            JOptionPane.showMessageDialog(null, "enviado");
	        } catch (Exception e) {
	        	JOptionPane.showMessageDialog(null, "Não enviado");
	        }
}
}
