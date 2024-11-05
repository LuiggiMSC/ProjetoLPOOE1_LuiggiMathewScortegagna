import com.mycompany.ProjetoLPOOE1.dao.PersistenciaJPA;

import model.Cliente;
import model.Veterinario;
import model.Mascote;
import model.TipoMascote;
import model.Especializacao;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 20222PF.CC0004
 */
public class TestePersistencia {

    PersistenciaJPA jpa = new PersistenciaJPA();

    @Before
    public void setUp() {
        jpa.conexaoAberta();
    }

    @After
    public void tearDown() {
        jpa.fecharConexao();
    }

    @Test
    public void testePersistencia() {
        Cliente cliente = new Cliente();
        cliente.setNome("Cliente 1");
        cliente.setTelefone("55912345678");
        cliente.setCpf("123.456.789-00");
        cliente.setEndereco("123");
        cliente.setEmail("clientePrimeiro@gmail.com");

        Veterinario veterinario = new Veterinario();
        veterinario.setNome("Vet 1");
        veterinario.setTelefone("55987654321");
        veterinario.setCpf("987.654.321-00");
        veterinario.setSalario(8000.50f);
        veterinario.setEspecializacao(Especializacao.CIRURGIA);

        Veterinario supervisor = new Veterinario();
        supervisor.setNome("Vet 2");
        supervisor.setTelefone("55933333333");
        supervisor.setCpf("111.222.333-44");
        supervisor.setSalario(9000.00f);
        supervisor.setEspecializacao(Especializacao.CUIDADOS);

        veterinario.setSupervisor(supervisor);

        Mascote mascote = new Mascote();
        mascote.setIdade(3);
        mascote.setTipo(TipoMascote.CACHORRO);
        mascote.setDono(cliente); 

        try {
            jpa.persist(supervisor); 
            jpa.persist(veterinario); 
            jpa.persist(cliente);
            jpa.persist(mascote); 

            System.out.println("Objetos persistidos com sucesso!");

        } catch (Exception e) {
            System.out.println("Erro ao persistir objetos: " + e.getMessage());
        }
    }
}
