package br.com.luaazul.bankline.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tab_correntista")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Correntista {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_correntista")
	private Integer id;
	
	@Column(name = "ds_cpf", length = 20)
	private String cpf;
	
	@Column(name = "nm_correntista",length = 60)
	private String nome;
	
	@Embedded
	private Conta conta;
	
}
