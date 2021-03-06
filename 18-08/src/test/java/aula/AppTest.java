/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package aula;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testarCriacaoDePessoa(){
        Pessoa pessoa = new Pessoa();
        assertNotNull(pessoa);
    }

    @Test
    public void testarConstrutorComParametroDePessoa(){
        Pessoa pessoa = new Pessoa("John Doe");
        assertNotNull(pessoa);
    }

    @Test
    public void testarConstrutorComDoisArgumentosDePessoa(){
        Pessoa pessoa = new Pessoa("John Doe", 31);
        assertNotNull(pessoa);
    }

    @Test
    public void testarFuncaoGetNome(){
        Pessoa pessoa = new Pessoa("John Doe");
        assertEquals("John Doe", pessoa.getNome());
    }

    @Test 
    public void testarTrocarNomeSemIdade(){
        Pessoa pessoa = new Pessoa("John Doe");
        assertEquals("John Doe", pessoa.getNome());
        pessoa.trocarNome("John NovoNome");
        assertNotEquals("John NovoNome", pessoa.getNome());
    }

    @Test 
    public void testarTrocarNomeComIdadeSuperior(){
        Pessoa pessoa = new Pessoa("John Doe", 18);
        assertEquals("John Doe", pessoa.getNome());
        pessoa.trocarNome("John NovoNome");
        assertEquals("John NovoNome", pessoa.getNome());
    }

    @Test 
    public void testarTrocarNomeComIdadeInferior(){
        Pessoa pessoa = new Pessoa("John Doe", 17);
        assertEquals("John Doe", pessoa.getNome());
        pessoa.trocarNome("John NovoNome");
        assertEquals("John Doe", pessoa.getNome());
    }

}
