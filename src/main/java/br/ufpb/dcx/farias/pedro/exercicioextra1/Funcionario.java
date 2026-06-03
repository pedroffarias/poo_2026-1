package br.ufpb.dcx.farias.pedro.exercicioextra1;

import java.util.ArrayList;

public class Funcionario {
    public List<Funcionario> pesquisarFuncionarioComSalarioMaiorQue(double valor){
        List<Funcionario> funcionariosFiltrados = new ArrayList<>();

        for(Funcionario f : this.funcionarios.values()){
            if(f.getSalario() > valor){
                funcionariosFiltrados.add(f);
            }
        }
        return funcionariosFiltrados;
    }
}
