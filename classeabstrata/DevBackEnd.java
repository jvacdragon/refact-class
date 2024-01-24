package br.com.vainaweb.backendt2.classeabstrata;

public class DevBackEnd extends Colaborador {

	private String tecnologias;
	
	public DevBackEnd(String nome, String cpf, double salario, Senioridade senioridade) {
		super(nome, cpf, salario, senioridade);
	}
}
