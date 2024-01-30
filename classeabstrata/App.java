package br.com.vainaweb.backendt2.classeabstrata;

import br.com.vainaweb.backendt2.classeabstrata.validador.CpfCnpjUtils;

enum Senioridade {JR, PL, SR, TL};

public class App {
	public static void main(String[] args) {

		Empresa e1 = new Empresa("Empresa 1", "08.502.5900001-62");
		Empresa e2 = new Empresa("Empresa 2", "00.850.1470001-70");
		
		DevBackEnd devBack = new DevBackEnd("Isael", "161.873.260-91", 10000.0, Senioridade.JR);
		DevFrontEnd devFront = new DevFrontEnd("Paulo", "955.648.160-56", 10000.0, Senioridade.JR);
		Designer designer = new Designer("Caroline", "796.226.140-43", 15000.0, Senioridade.JR);

		e1.adicionarColaborador(devBack);
		e1.adicionarColaborador(designer);
		e2.adicionarColaborador(devFront);

		e1.removerColaboradorPorCPF("1234-5");
		e1.removerColaboradorPorCPF("49845");

		e2.adicionarColaborador(devFront);
		
	}

}
