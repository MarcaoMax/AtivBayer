package formulario;

import conexao.ConexaoDB;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.sql.PreparedStatement;

public class PessoaDAO {

  private Connection conexao;

 
    public void cadastrar(Pessoa pessoa) throws ParseException {
      PreparedStatement stmt = null;
  
      try {
        conexao = ConexaoDB.obterConexao();
        String sql = "INSERT INTO T_BDB_PESSOA(NR_CPF, DS_NOME, DS_SOBRENOME, NR_IDADE, DS_SEXO, ST_OBITO) VALUES (?, ?, ?, ?, ?, ?, ?)";
        stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, pessoa.getCpf());
        stmt.setString(3, pessoa.getNome()); 
        stmt.setString(4, pessoa.getSobrenome());
        stmt.setInt(5, pessoa.getIdade());
        stmt.setString(6, pessoa.getSexo());
        stmt.setBoolean(7, pessoa.isObito());

  
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

