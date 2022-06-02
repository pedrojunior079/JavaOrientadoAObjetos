package helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionHelper {
    private static String url = "jdbc:derby:./banco/livro;create=true";
    private static Connection conexao = null;
    
    @SuppressWarnings("deprecation")
	public static Connection getConexao() throws VBException{
    	if(conexao == null) {
    		try {
    			Class.forName("org.apache.derby.iapi.jdbc.AutoloadedDriver").newInstance();
    			conexao = DriverManager.getConnection(url);
    		}catch(InstantiationException e) {
    			throw new VBException(e.getMessage());
    		}catch(IllegalAccessException e) {
    			throw new VBException(e.getMessage());
    		}catch(ClassNotFoundException e) {
    			throw new VBException(e.getMessage());
    		}catch(SQLException e) {
    			throw new VBException(e.getMessage());
    		}
    	}
    	return conexao;
    }
    
    public static void fechaConexao() throws SQLException{
    	conexao.close();
    }
    
    public class VBException extends Exception{
        public VBException(String msg) {
        	super(msg);
        }
    }
}
