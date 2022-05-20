package br.com.luaazul.bankline.dto;

import java.io.Serializable;

import br.com.luaazul.bankline.model.enuns.MovimentacaoEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NovaMovimentacaoDto implements Serializable{

	private static final long serialVersionUID = -8926746571123833631L;
	private String descricao;
	private Double valor;
	private MovimentacaoEnum tipo;
	private Integer idConta;
	
}
