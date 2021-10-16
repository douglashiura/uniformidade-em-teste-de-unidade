package br.ies.tcc.uniformidade.em.teste.de.unidade;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class TesteExemploDeAtributoEVarialvelSemCargaDeConhecimento {
	private Pessoa pessoa;

	@Test
	public void fixarMotoristaNoVeiculo() {
		Veiculo veiculo = new Veiculo();
		veiculo.fixaOMotorista(pessoa);
		assertNotNull(veiculo);
		assertNotNull(pessoa);
	}

	@Test
	public void velocidadeDoVeiculo() {
		Veiculo veiculo = new Veiculo();
		Integer integer = veiculo.obterVelocidade();
		assertEquals(Integer.valueOf(200), integer);
	}

}
