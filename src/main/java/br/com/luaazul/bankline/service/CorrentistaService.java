package br.com.luaazul.bankline.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.luaazul.bankline.dto.NovoCorrentistaDto;
import br.com.luaazul.bankline.model.Conta;
import br.com.luaazul.bankline.model.Correntista;
import br.com.luaazul.bankline.repository.CorrentistaRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CorrentistaService {

	private final CorrentistaRepository correntistaRepository;
	
	public void salvar(NovoCorrentistaDto novoCorrentista) {
		Correntista correntista = new Correntista();
		correntista.setCpf(novoCorrentista.getCpf());
		correntista.setNome(novoCorrentista.getNome());
		
		Conta conta = new Conta();
		conta.setSaldo(0.0);
		conta.setNumero(new Date().getTime());
		
		correntista.setConta(conta);
		correntistaRepository.save(correntista);
	}

	public List<Correntista> findAll(){
		return correntistaRepository.findAll();
	}
}
