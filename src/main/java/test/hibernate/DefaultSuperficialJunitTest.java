package test.hibernate;

import java.util.List;
import java.util.Set;

import org.junit.Assert;

import br.com.model.bean.Endereco;
import br.com.model.bean.Historico;
import br.com.model.bean.Transacao;
import br.com.model.bean.Usuario;

public class DefaultSuperficialJunitTest {
	
	public static <T> void equals(T expected, T actual) {
		Assert.assertEquals(expected, actual);
	}

	public static void userEquals(Usuario expected, Usuario actual) {
		equals(expected.getNome(), actual.getNome());
		equals(expected.getSobreNome(), actual.getSobreNome());
		equals(expected.getEmail(), actual.getEmail());
		equals(expected.getSenha(), actual.getSenha());
		enderecoEquals(expected.getEndereco(), actual.getEndereco());

	}
	
	public static void userEquals(List<Usuario> expected, List<Usuario> actual) {
		if(expected.size() == actual.size()){
			for(int i= 0; i < expected.size(); i++){
				userEquals(expected.get(i), actual.get(i));
			}
		}else{
			equals(expected.size(), actual.size());
		}
	}

	public static void enderecoEquals(Endereco expected, Endereco actual) {
		equals(expected.getRua(), actual.getRua());
		equals(expected.getNumero(), actual.getNumero());
		equals(expected.getBairro(), actual.getBairro());
		equals(expected.getCidade(), actual.getCidade());
		equals(expected.getPais(), actual.getPais());
	}

	public static void historicoEquals(Historico expected, Historico actual) {
		equals(expected.getSaldo(), actual.getSaldo());
		trasacaoEquals(expected.getTransacoes(), actual.getTransacoes());
	}

	private static void trasacaoEquals(Set<Transacao> expected,
			Set<Transacao> actual) {
		equals(expected.size(), actual.size());
	}
}
