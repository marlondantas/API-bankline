package br.com.luaazul.bankline.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Conta {

	@Column(name = "nr_conta")
	private Long numero;
	
	@Column(name = "vl_saldo")
	private Double saldo;
	
}
