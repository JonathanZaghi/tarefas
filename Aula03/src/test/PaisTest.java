package test;


import static org.junit.Assert.assertEquals;

import model.Pais;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import service.PaisService;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PaisTest {
	Pais pais, copia;
	PaisService paisService;
	static int id = 0;

	/*
	 * Antes de rodar este teste, certifique-se que nao ha no banco nenhuma
	 * linha com o id igual ao do escolhido para o to instanciado abaixo. Se
	 * houver, delete. 
	 * Certifique-se tambÃ©m que sobrecarregou o equals na classe
	 * Cliente. 
	 * Certifique-se que a fixture cliente1 foi criada no banco.
	 * AlÃ©m disso, a ordem de execuÃ§Ã£o dos testes Ã© importante; por
	 * isso a anotaÃ§Ã£o FixMethodOrder logo acima do nome desta classe
	 */
	@Before
	public void setUp() throws Exception {
		System.out.println("setup");
		pais = new Pais();
		pais.setId(id);
		pais.setNome("Batista Cepelos");
		pais.setPopulação(912344321);
		pais.setArea(912344321);
		copia = new Pais();
		copia.setId(id);
		copia.setNome("Batista Cepelos");
		copia.setPopulação(912344321);
		copia.setArea(912344321);
		paisService = new PaisService();
		System.out.println(pais);
		System.out.println(copia);
		System.out.println(id);
	}
	
	@Test
	public void test00Carregar() {
		System.out.println("carregar");
		//para funcionar o cliente 1 deve ter sido carregado no banco por fora
		Pais fixture = new Pais();
		fixture.setId(1);
		fixture.setNome("Brasil");
		fixture.setPopulação(207660929);
		fixture.setArea(8515767);
		PaisService novoService = new PaisService();
		Pais novo = novoService.carregar(1);
		assertEquals("testa inclusao", novo, fixture);
	}

	@Test
	public void test01Criar() {
		System.out.println("criar");
		id = paisService.criar(pais);
		System.out.println(id);
		copia.setId(id);
		assertEquals("testa criacao", pais, copia);
	}

	@Test
	public void test02Atualizar() {
		System.out.println("atualizar");
		pais.setPopulação(999999);
		copia.setPopulação(999999);		
		paisService.atualizar(pais);
		pais = paisService.carregar(pais.getId());
		assertEquals("testa atualizacao", pais, copia);
	}

	@Test
	public void test03Excluir() {
		System.out.println("excluir");
		copia.setId(-1);
		copia.setNome(null);
		copia.setPopulação(0);
		copia.setArea(0);
		paisService.excluir(id);
		pais = paisService.carregar(id);
		assertEquals("testa exclusao", pais, copia);
	}
	
}