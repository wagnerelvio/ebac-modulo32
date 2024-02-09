package br.com.welc;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.welc.dao.IProdutoDao;
import br.com.welc.dao.ProdutoDao;
import br.com.welc.domain.Produto;

public class ProdutoTest {
	//private ICursoDao cursoDao;
//	private IProdutoDao produtoDao;
	
	public ProdutoTest() {
//		produtoDao = new ProdutoDao();
	}
	
	@Test
	public void cadastrar() {
		//Matricula mat = new Matricula();
		Produto prod = new Produto();
		
		//prod.setCodigo("A6");
		//prod.setDescricao("Smartphone S-20, 6POL, 256GB RAM");
		//prod.setNome("Smatphone Samsung");
		//prod.setDataFabricacao("01/02/200");
		//prod.setDataFabricacao("10/02/2023");
		//prod = produtoDao.cadastrar(prod);
		
		assertNotNull(prod);
		assertNotNull(prod.getId());
	}

}
