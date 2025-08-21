public class Avo extends Pessoa{

    private int idade;

    public Avo(String nome, int idade) {
        super(nome);
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String getTipoVoz() {
        return "Voz baixa";
    }
}
