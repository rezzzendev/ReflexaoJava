public class Pai extends Pessoa {

    private String profissao;

    public Pai(String nome, String profissao) {
        super(nome);
        this.profissao = profissao;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    @Override
    public String getTipoVoz() {
        return "Voz grave";
    }
}
