package persistence;

import java.util.ArrayList;
import java.util.List;

import entily.Pessoa;

public class PessoaDao extends DaoOrConexao{
		public void create(Pessoa p)throws Exception{
			open();
			stmt = con.prepareStatement("INSERT INTO pessoa VALUES(?,?,?)");
			stmt.setInt(1, p.getIdPessoa());
			stmt.setString(2,p.getNome());
			stmt.setString(3,p.getEmail());
			stmt.execute();
			stmt.close();
			close();
		
		}
	public List<Pessoa> findPessoaDB() throws Exception{
		List<Pessoa> listapessoa = new ArrayList<Pessoa>();
		
		open();
		stmt = con.prepareStatement("SELECT * FROM pessoa");
		rs = stmt.executeQuery();
		
		while (rs.next()) {
			Pessoa p = new Pessoa(rs.getInt("idpessoa"), rs.getString("nome"), rs.getString("email"));
			listapessoa.add(p);
		}
		
		close();
		
		return listapessoa;
	}
}
