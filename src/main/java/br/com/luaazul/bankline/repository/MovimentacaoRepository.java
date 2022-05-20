package br.com.luaazul.bankline.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.luaazul.bankline.model.Movimentacao;

@Repository
public interface MovimentacaoRepository extends JpaRepository<Movimentacao,Long>{

	public List<Movimentacao> findByIdConta(Integer idConta);
	
}
