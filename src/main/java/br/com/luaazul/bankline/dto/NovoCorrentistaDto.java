package br.com.luaazul.bankline.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NovoCorrentistaDto implements Serializable{

	private static final long serialVersionUID = 447362060153422194L;

	private String nome;
	private String cpf;
	
}
