
public class Main {
    public static void main(String[] args) {
        Filho filho = new Filho("Lucas", 155);
        Pai pai = new Pai("Marcos", "Engenheiro");
        Avo avo = new Avo("Antônio", 80);

        Reflexao.inspecionarClasse(filho);
        Reflexao.inspecionarClasse(pai);
        Reflexao.inspecionarClasse(avo);
    }
}