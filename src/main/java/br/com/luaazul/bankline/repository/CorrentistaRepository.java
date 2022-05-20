package br.com.luaazul.bankline.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.luaazul.bankline.model.Correntista;

@Repository
public interface CorrentistaRepository extends JpaRepository<Correntista, Integer> {

}
