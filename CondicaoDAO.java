package formulario;

import conexao.ConexaoDB;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.sql.PreparedStatement;

public class CondicaoDAO {
	
	  private Connection conexao;

	  
	    public void cadastrar(Condicao condicao) throws ParseException {
	      PreparedStatement stmt = null;
	  
	      try {
	        conexao = ConexaoDB.obterConexao();
	        String sql = "INSERT INTO T_BDB_CONDICAO(CD_CONDICAO, T_BDB_PESSOA_NR_CPF, NR_DENGUE, NR_MALARIA, NR_ZIKA) VALUES (SEQ_CONDICAO.NEXTVAL, ?, ?, ?, ?)";
	        stmt = conexao.prepareStatement(sql);
	        stmt.setInt(1, PessoaDAO.pessoa.getCPF()); 
	        stmt.setInt(2, condicao.getDengue());
	        stmt.setInt(3, condicao.getMalaria());
	        stmt.setInt(4, condicao.getZika());
	  
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
