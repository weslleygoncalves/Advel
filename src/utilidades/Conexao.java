/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utilidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Weslley
 */
public class Conexao {
    
    public PreparedStatement ps; //Responsável por preparar e realizar pesquisa no banco de dados
    
    public ResultSet rs; //Responsável por armazenar o resultado da pesquisa passada para o Statement
    
    private String driver = "oracle.jdbc.driver.OracleDriver"; //Responsável por identificar o serviço do banco do dados
    
    private String caminho = "jdbc:oracle:thin:@localhost:1521:orcl"; //Responsável por setar o local do banco de dados
    
    private String usuario = "system";
    
    private String senha = "senha";
    
    public Connection conn; //Responsável por realizar e conexão com o banco
    
    public void conecta(){ 
        try { //Tentativa Inicial
            System.setProperty("jdbc.Drivers", driver); //Seta a propriedade do driver de conexão
            conn = DriverManager.getConnection(caminho, usuario, senha); //Realiza a conexao com o banco de dados
            //JOptionPane.showMessageDialog(null, "Conectado com Sucesso");
        }
            catch (SQLException ex){ //excessão
                    JOptionPane.showMessageDialog(null, "Erro de Conexão" + "!\n Erro" + ex.getMessage());
                    }
        }
}