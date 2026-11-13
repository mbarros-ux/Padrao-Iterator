package padroescomportamentais.iterator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RelatorioSegurancaTest {

    @Test
    void deveContarTotalDeAmeacas() {
        Ameaca a1 = new Ameaca("SQL Injection", true);
        Ameaca a2 = new Ameaca("Cross-Site Scripting", false);
        Ameaca a3 = new Ameaca("DDoS", true);

        ColecaoAmeacas colecao = new ColecaoAmeacas(a1, a2, a3);

        int total = RelatorioSeguranca.contarTotalAmeacas(colecao);
        assertEquals(3, total);
    }

    @Test
    void deveContarApenasAmeacasMitigadas() {
        Ameaca a1 = new Ameaca("Phishing", false);      // Não mitigada
        Ameaca a2 = new Ameaca("Ransomware", true);     // Mitigada
        Ameaca a3 = new Ameaca("Malware", true);        // Mitigada
        Ameaca a4 = new Ameaca("Brute Force", false);   // Não mitigada

        ColecaoAmeacas colecao = new ColecaoAmeacas(a1, a2, a3, a4);

        int mitigadas = RelatorioSeguranca.contarAmeacasMitigadas(colecao);

        assertEquals(2, mitigadas);
    }

    @Test
    void deveRetornarZeroQuandoNenhumaAmeacaEstiverMitigada() {
        Ameaca a1 = new Ameaca("Vulnerabilidade Crítica", false);
        Ameaca a2 = new Ameaca("Vazamento de Dados", false);

        ColecaoAmeacas colecao = new ColecaoAmeacas(a1, a2);

        int mitigadas = RelatorioSeguranca.contarAmeacasMitigadas(colecao);

        assertEquals(0, mitigadas);
    }
}