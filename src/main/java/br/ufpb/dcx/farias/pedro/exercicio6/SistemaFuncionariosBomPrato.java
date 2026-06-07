package br.ufpb.dcx.farias.pedro.exercicio6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SistemaFuncionariosBomPrato implements SistemaFuncionarios{
    private Map<String, Funcionario> funcionarios;


    public SistemaFuncionariosBomPrato(){
        this.funcionarios = new HashMap<String, Funcionario>();
    }


    @Override
    public void cadastrarFuncionario(Funcionario funcionario) throws FuncionarioJaExisteException {
        if (this.funcionarios.containsKey(funcionario.getCpf())) {
            throw new FuncionarioJaExisteException("Já existe funcionário");
        }
        Funcionario novoFuncionario = this.funcionarios.put(funcionario.getCpf(), funcionario);
    }

    @Override
    public void cadastrarFuncionario(String cpf, String nome, TipoFuncionario tipo, double salario) throws FuncionarioJaExisteException {
        if (this.funcionarios.containsKey(cpf)){
            throw new FuncionarioJaExisteException("Já existe funcionário com o cpf "+cpf);
        } else {
            this.funcionarios.put(cpf, new Funcionario(cpf, nome, tipo, salario));
        }
    }

    @Override
    public void alterarSalarioDeFuncionario(String cpfFuncionario, double novoSalario) throws FuncionarioInexistenteException {

        if(!this.funcionarios.containsKey(cpfFuncionario)){
            throw new FuncionarioInexistenteException("Não existe um funcionário com este cpf.");
        }

        Funcionario f = this.funcionarios.get(cpfFuncionario);
        f.setSalario(novoSalario);
    }

    @Override
    public int contarFuncionariosDoTipo(TipoFuncionario tipo) {
        int cont = 0;

        for(Funcionario f : this.funcionarios.values()){
            if(f.getTipo() == tipo){
                cont++;
            }
        }
        return cont;
    }

    @Override
    public boolean funcionarioJaExiste(String cpfFuncionario) {
        return this.funcionarios.containsKey(cpfFuncionario);
    }

    @Override
    public List<Funcionario> pesquisarFuncionariosPorTipo(TipoFuncionario tipo){

        List<Funcionario> funcionariosEspecificos = new ArrayList<>();

        for(Funcionario f : this.funcionarios.values()){
            if(f.getTipo().equals(tipo)){
                funcionariosEspecificos.add(f);
            }
        }
        return funcionariosEspecificos;
    }

    @Override
    public Funcionario pesquisarFuncionario(String cpfFuncionario) throws FuncionarioInexistenteException {
        if(!this.funcionarios.containsKey(cpfFuncionario)){
            throw new FuncionarioInexistenteException("Este funconário não existe.");
        }
        return this.funcionarios.get(cpfFuncionario);
    }

    @Override
    public List<Funcionario> pesquisarFuncionariosComSalarioMaiorQue(double valor){
        List<Funcionario> funcionariosFiltrados = new ArrayList<>();

        for(Funcionario f : this.funcionarios.values()){
            if(f.getSalario() > 2000){
                funcionariosFiltrados.add(f);
            }
        }
        return funcionariosFiltrados;
    }

}
