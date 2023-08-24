package ifg.urutai.teste;

import java.sql.Date;

import ifg.urutai.dao.PessoaDAO;
import ifg.urutai.model.Pessoa;

public class Main {
	
	 public static void main(String[] args) {
		/*Pessoa pessoa = new Pessoa();
		pessoa.setNome("Jackson");
		pessoa.setDataNascimento(Date.valueOf("2000-01-13"));
		
		PessoaDAO pDAO = new PessoaDAO();
		
		pDAO.add(pessoa);*/
		
		/*
		 * Pessoa pessoa = new Pessoa();
		 * 
		 * PessoaDAO pDAO = new PessoaDAO(); pessoa = pDAO.findbyId(1);
		 * 
		 * System.out.println("Id: "+ pessoa.getId()); System.out.println("Nome: "+
		 * pessoa.getNome()); System.out.println("Data de nascimento: "+
		 * pessoa.getDataNascimento());
		 */
		 
		/*
		 * PessoaDAO pDAO = new PessoaDAO(); Pessoa pessoa = pDAO.findbyId(5);
		 * 
		 * pessoa.setNome("Gabriel"); pDAO.updateNameById(pessoa);
		 */
		 
		 
		 
		 PessoaDAO pDAO = new PessoaDAO(); 
		 Pessoa pessoa = pDAO.findbyId(5);
		 
		 pDAO.deleteByname(pessoa);
		
		
		
	} 
	 
	 
	
	
	

}
