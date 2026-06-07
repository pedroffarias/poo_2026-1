package br.ufpb.dcx.farias.pedro.exercicio6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SistemaFuncionariosBomPratoTest {
    @Test
    public void testaCadastroEPesquisa(){
        SistemaFuncionariosBomPrato sistema = new SistemaFuncionariosBomPrato();
        try{
            sistema.cadastrarFuncionario(new Funcionario("333.333.333-33", "Ayla Rebouças", TipoFuncionario.GERENTE, 3000));
            assertTrue(sistema.funcionarioJaExiste("333.333.333-33"));

            Funcionario f1 = sistema.pesquisarFuncionario("333.333.333-33");
            assertEquals("Ayla Rebouças", f1.getNome());

        } catch(FuncionarioJaExisteException | FuncionarioInexistenteException e) {
            fail("Não deveria lançar exceção");
        }
    }
}
