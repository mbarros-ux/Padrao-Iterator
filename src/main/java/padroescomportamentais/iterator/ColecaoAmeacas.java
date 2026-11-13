package padroescomportamentais.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ColecaoAmeacas implements Iterable<Ameaca> {

    private List<Ameaca> ameacas = new ArrayList<Ameaca>();

    public ColecaoAmeacas(Ameaca... ameacas) {
        this.ameacas = Arrays.asList(ameacas);
    }

    @Override
    public Iterator<Ameaca> iterator() {
        return ameacas.iterator();
    }
}