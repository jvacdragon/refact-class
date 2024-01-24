package br.com.vainaweb.backendt2.classeabstrata;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Empresa {
    private final String nomeFantasia;
    private final String cnpj;
    private List<Colaborador> colaboradores;

    public Empresa(String nomeFantasia, String cnpj) {
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
        this.colaboradores = new ArrayList<Colaborador>();
    }

    public void verColaboradores(){
        for(Colaborador c : getColaboradores()){
            c.visualizar();
            System.out.println("\n");
        }
    }

    public Colaborador adicionarColaborador(Colaborador co){
        try {
            //verifica se colaborador ja está no banco de dados da empresa e caso já esteja, é jogado um erro
            Optional<Colaborador> colaborador;
            colaborador = this.colaboradores.stream().filter(c -> c.getCpf().equals(co.getCpf())).findFirst();
            if (!colaborador.isEmpty()) throw new Exception("Colaborador com mesmo cpf ja cadastrado");

            //adiciona colaborador
            this.colaboradores.add(co);
            System.out.println("Colaborador " + co.getNome() + " de cpf " + co.getCpf() + " adicionado.");
            co.setAtivo(true);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return co;
    }

    public void removerColaboradorPorCPF(String cpf){
        try{
            //verificar se há tal colaborador na empresa e caso não tenha, joga um erro.
            Optional<Colaborador> colaborador;
            colaborador = this.colaboradores.stream().filter(c -> c.getCpf().equals(cpf)).findFirst();
            if (colaborador.isEmpty()) throw new Exception("Colaborador não encontrado");

            //remover colaborador após verificar que existe
            this.colaboradores.removeIf(c -> c.getCpf().equals(cpf));
            colaborador.get().setAtivo(false);

            System.out.println("Colaborador " + colaborador.get().getNome() + " de cpf " + colaborador.get().getCpf() +
                    " demitido.");

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public List<Colaborador> getColaboradores() {
        return colaboradores;
    }
}
