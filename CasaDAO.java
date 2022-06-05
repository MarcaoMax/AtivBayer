package formulario;

import conexao.ConexaoDB;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.sql.PreparedStatement;

public class CasaDAO {
	
	  private Connection conexao;

	  
	    public void cadastrar(Casa casa) throws ParseException {
	      PreparedStatement stmt = null;
	  
	      try {
	        conexao = ConexaoDB.obterConexao();
	        String sql = "INSERT INTO T_BDB_CASA(CD_CASA, DS_ENDERECO, NR_NUMERO) VALUES (SEQ_CASA.NEXTVAL, ?, ?)";
	        stmt = conexao.prepareStatement(sql);
	        stmt.setString(1, casa.getEndereco()); 
	        stmt.setInt(2, casa.getNumero());
	  
	        stmt.executeUpdate();
	      } catch (SQLException e) {
	        e.printStackTrace();
	      } finally {
	        try {
	          stmt.close();
	          conexao.close();
	        } catch (SQLException e) {
	          e.printStackTrace();
	        }
	      }
	    }

}
