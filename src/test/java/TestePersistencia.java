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

    public TestePersistencia() {
    }

    @Before
    public void setUp() {
        jpa.conexaoAberta();
    }

    @After
    public void tearDown() {
        jpa.fecharConexao();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testePersistencia() {
        // cliente
        Cliente cliente = new Cliente();
        cliente.setNome("Cliente 1");
        cliente.setTelefone("1234567890");
        cliente.setCpf("123.456.789-00");
        cliente.setEndereco("Rua Fulana, 123");
        cliente.setEmail("cliente.um@teste.com");

        // vet
        Veterinario veterinario = new Veterinario();
        veterinario.setNome("Vet 1");
        veterinario.setTelefone("0987654321");
        veterinario.setCpf("987.654.321-00");
        veterinario.setSalario(8000.50f);
        veterinario.setEspecializacao(Especializacao.CIRURGIA);

        // supervisor autorelac
        Veterinario supervisor = new Veterinario();
        supervisor.setNome("Vet 2 (SUPERVISOR)");
        supervisor.setTelefone("123333333");
        supervisor.setCpf("111.222.333-44");
        supervisor.setSalario(9000.00f);
        supervisor.setEspecializacao(Especializacao.CUIDADOS);

        // supervisor do veterinario
        veterinario.setSupervisor(supervisor);

        // pet
        Mascote mascote = new Mascote();
        mascote.setIdade(3);
        mascote.setTipo(TipoMascote.CACHORRO);
        mascote.setDono(cliente);
        
        
        // teste fazendo atendimento
        cliente.getVeterinarios().add(veterinario);
        veterinario.getClientes().add(cliente);

        try {
            // persistindo objetos 1 de cada classe aq
            jpa.persist(supervisor); 
            jpa.persist(veterinario); 
            jpa.persist(cliente); 
            jpa.persist(mascote);

            System.out.println("Objetos persistidos com sucesso!");

        } catch (Exception e) {
            System.out.println("Erro ao persistir objetos: ");
        }
    }
}
