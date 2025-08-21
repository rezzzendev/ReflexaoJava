public class Filho extends Pessoa{

    private int altura;
    public Filho(String nome, int altura) {
        super(nome);
        this.altura = altura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String getTipoVoz() {
        return "Voz aguda";
    }
}
