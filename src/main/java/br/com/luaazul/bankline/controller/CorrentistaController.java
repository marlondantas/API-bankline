package br.com.luaazul.bankline.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.luaazul.bankline.dto.NovoCorrentistaDto;
import br.com.luaazul.bankline.model.Correntista;
import br.com.luaazul.bankline.service.CorrentistaService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping(value = "/Correntistas", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class CorrentistaController {

	private final CorrentistaService correntistaService;
	
	@GetMapping(consumes = {MediaType.ALL_VALUE})
	public List<Correntista> buscarTodosOsCorrentistas(){
		return correntistaService.findAll();
	}
	
	@PostMapping()
	public void salvarCorrentista(@RequestBody NovoCorrentistaDto correntista) {
		correntistaService.salvar(correntista);
	}
	
}
