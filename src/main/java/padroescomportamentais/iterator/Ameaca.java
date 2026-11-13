package padroescomportamentais.iterator;

public class Ameaca {
    private String nome;
    private boolean mitigada;

    public Ameaca(String nome, boolean mitigada) {
        this.nome = nome;
        this.mitigada = mitigada;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isMitigada() {
        return mitigada;
    }

    public void setMitigada(boolean mitigada) {
        this.mitigada = mitigada;
    }
}