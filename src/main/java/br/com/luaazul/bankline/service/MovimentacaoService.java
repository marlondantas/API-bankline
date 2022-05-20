package br.com.luaazul.bankline.service;

import java.time.LocalDateTime;
import java.util.List;

import javax.management.RuntimeErrorException;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.luaazul.bankline.dto.NovaMovimentacaoDto;
import br.com.luaazul.bankline.model.Correntista;
import br.com.luaazul.bankline.model.Movimentacao;
import br.com.luaazul.bankline.model.enuns.MovimentacaoEnum;
import br.com.luaazul.bankline.repository.CorrentistaRepository;
import br.com.luaazul.bankline.repository.MovimentacaoRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MovimentacaoService {

	private final MovimentacaoRepository movimentacaoRepository;
	
	private final CorrentistaRepository correntistaRepository;
	
	@Transactional
	public void salvar(NovaMovimentacaoDto novaMovimentacaoDto) {
		Movimentacao movimentacao = new Movimentacao();
		
		movimentacao.setValor(novaMovimentacaoDto.getTipo() == MovimentacaoEnum.RECEITA ? novaMovimentacaoDto.getValor() : (novaMovimentacaoDto.getValor()*-1));
		movimentacao.setDataHora(LocalDateTime.now());
		movimentacao.setDescricao(novaMovimentacaoDto.getDescricao());
		movimentacao.setIdConta(novaMovimentacaoDto.getIdConta());
		movimentacao.setTipo(novaMovimentacaoDto.getTipo());

		Correntista correntista = correntistaRepository.findById(novaMovimentacaoDto.getIdConta()).orElse(null);
		
		if(correntista == null) {
			throw new RuntimeException("Não foi possivel localizar a conta");
		}
		correntista.getConta().setSaldo(correntista.getConta().getSaldo() + movimentacao.getValor());
		correntistaRepository.save(correntista);
		
		movimentacaoRepository.save(movimentacao);
	}
	
	public List<Movimentacao> buscarTodasAsMovimentacoes(){
		return movimentacaoRepository.findAll();
	}
	
}
