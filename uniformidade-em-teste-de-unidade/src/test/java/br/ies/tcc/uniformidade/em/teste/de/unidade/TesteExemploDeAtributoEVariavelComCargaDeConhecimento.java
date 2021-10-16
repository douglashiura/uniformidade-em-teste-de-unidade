package br.ies.tcc.uniformidade.em.teste.de.unidade;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class TesteExemploDeAtributoEVariavelComCargaDeConhecimento {
	private Pessoa douglas;

	@Test
	public void fixarMotoristaNoVeiculo() {
		Veiculo fusca = new Veiculo();
		fusca.fixaOMotorista(douglas);
		assertNotNull(fusca);
		assertNotNull(douglas);
	}

	@Test
	public void velocidadeDoVeiculo() {
		Veiculo fusca = new Veiculo();
		Integer velocidadeDoFusca = fusca.obterVelocidade();
		assertEquals(Integer.valueOf(200), velocidadeDoFusca);
	}

}
