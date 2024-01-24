package br.com.vainaweb.backendt2.classeabstrata;

enum Senioridade {JR, PL, SR, TL};

public class App {
	public static void main(String[] args) {

		Empresa e1 = new Empresa("Empresa 1", "123456");
		Empresa e2 = new Empresa("Empresa 2", "456789");
		
		DevBackEnd devBack = new DevBackEnd("Isael", "1234-5", 10000.0, Senioridade.JR);
		DevFrontEnd devFront = new DevFrontEnd("Paulo", "9876-4", 10000.0, Senioridade.JR);
		Designer designer = new Designer("Caroline", "3456-9", 15000.0, Senioridade.JR);

		e1.adicionarColaborador(devBack);
		e1.adicionarColaborador(designer);
		e2.adicionarColaborador(devFront);

		e1.removerColaboradorPorCPF("1234-5");
		e1.removerColaboradorPorCPF("49845");

		e2.adicionarColaborador(devFront);
		
	}

}
