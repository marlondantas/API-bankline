package br.com.luaazul.bankline.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.luaazul.bankline.dto.NovaMovimentacaoDto;
import br.com.luaazul.bankline.model.Movimentacao;
import br.com.luaazul.bankline.service.MovimentacaoService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping(value = "/Movimentacoes", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class MovimentacaoController {

	private final MovimentacaoService movimentacaoService;
	
	@GetMapping(consumes = {MediaType.ALL_VALUE})
	public List<Movimentacao> buscarTodosAsMovimentacoes(){
		return movimentacaoService.buscarTodasAsMovimentacoes();
	}
	
	@PostMapping()
	public void salvarMovimentacao(@RequestBody NovaMovimentacaoDto novaMovimentacao) {
		movimentacaoService.salvar(novaMovimentacao);
	}
	
}
