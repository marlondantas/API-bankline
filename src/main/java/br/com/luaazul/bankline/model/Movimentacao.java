package br.com.luaazul.bankline.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.luaazul.bankline.model.enuns.MovimentacaoEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tab_movimentacao")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Movimentacao{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_lancamento")
	private Integer id;
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@Column(name = "dt_lancamento")
	private LocalDateTime dataHora;
	
	@Column(name = "ds_lancamento")
	private String descricao;
	
	@Column(name = "vl_lancamento")
	private Double valor;
	
	@Column(name = "cd_tipo")
	@Enumerated(EnumType.STRING)
	private MovimentacaoEnum tipo;
	
	@Column(name = "id_conta")
	private Integer idConta;
}
