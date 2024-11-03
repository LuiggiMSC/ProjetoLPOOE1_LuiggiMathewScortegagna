import com.mycompany.ProjetoLPOOE1.dao.PersistenciaJPA;
/*
import model.EntradaSaida;
import model.Marca;
import model.Modelo;
import model.Pessoa;
import model.TipoMovimentacao;
import model.TipoVeiculo;
import model.Veiculo;
import model.VinculoPessoa;
*/

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
        /*
        Modelo m = new Modelo();
        m.setDescricao("Teste");
        m.setMarca(Marca.FORD);

        Veiculo a = new Veiculo();
        a.setModelo(m);
        a.setCor("Vermelho");
        a.setTipoVeiculo(TipoVeiculo.CARRO);
        a.setPlaca("ABCDE01");

        EntradaSaida en_sai = new EntradaSaida(TipoMovimentacao.SAIDA, a);
        //m.setMarca(Marca.HONDA);
        Pessoa bianca = new Pessoa();
        bianca.setNome("Bianca");
        bianca.setVinculoPessoa(VinculoPessoa.ALUNO);
        a.setProprietario(bianca);

        Modelo m2 = new Modelo();
        m2.setDescricao("modelo 2");
        m2.setMarca(Marca.HONDA); */

        try {
            /*
            jpa.persist(m);
            jpa.persist(m2);
            jpa.persist(a);
            jpa.persist(en_sai);
            jpa.persist(bianca);
            //jpa.remover(bianca); */
        } catch (Exception e) {
            //System.out.println("Erro ao persistir modelo: " + m);
        }
    }
}
