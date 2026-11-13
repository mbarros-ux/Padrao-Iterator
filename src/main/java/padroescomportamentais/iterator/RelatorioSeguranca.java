package padroescomportamentais.iterator;

import java.util.Iterator;

public class RelatorioSeguranca {

    public static Integer contarAmeacasMitigadas(ColecaoAmeacas colecao) {
        int quantidade = 0;
        for (Ameaca ameaca : colecao) {
            if (ameaca.isMitigada()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalAmeacas(ColecaoAmeacas colecao) {
        int quantidade = 0;
        for (Iterator<Ameaca> it = colecao.iterator(); it.hasNext(); ) {
            quantidade++;
            it.next();
        }
        return quantidade;
    }
}