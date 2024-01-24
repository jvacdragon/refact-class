package br.com.vainaweb.backendt2.classeabstrata;

import java.util.Scanner;

public abstract class Colaborador {

	private String nome;
	private final String cpf;
	private double salario;
	private boolean isAtivo = false;

	private Senioridade senioridade;

	
	public Colaborador(String nome, String cpf, double salario, Senioridade senioridade) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		this.senioridade = senioridade;
	}

	public Senioridade getSenioridade() {
		return senioridade;
	}

	public void setSenioridade(Senioridade senioridade) {
		this.senioridade = senioridade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public double getSalario() {
		return salario;
	}
	

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public boolean isAtivo() {
		return isAtivo;
	}

	public void setAtivo(boolean isAtivo) {
		this.isAtivo = isAtivo;
	}

	// Métodos
	public String visualizar() {
		return "[ Nome: " + this.nome + ", Cpf: " + this.cpf + " ]" + "\nTem o salário: " + this.salario
				+ "\nEstá ativo? " + this.isAtivo + "\nSenioridade: " + this.getSenioridade();
	}
	
	public void aumentarSenioridade(){
		if(getSenioridade().equals(Senioridade.SR)){
			setSenioridade(Senioridade.TL);
			setSalario(getSalario()*1.5);
		};
		if(getSenioridade().equals(Senioridade.PL)){
			setSenioridade(Senioridade.SR);
			setSalario(getSalario()*1.6);
		};
		if(getSenioridade().equals(Senioridade.JR)){
			setSenioridade(Senioridade.PL);
			setSalario(getSalario()*1.7);
		};
	};
	public void alterarSalario(double novoSalario) {
		setSalario(novoSalario);
	}
}
