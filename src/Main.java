//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Filho filho = new Filho("Lucas", 155);
        Pai pai = new Pai("Marcos", "Engenheiro");
        Avo avo = new Avo("Antônio", 80);

        // Testando a reflexão em diferentes objetos
        Reflexao.inspecionarClasse(filho);
        System.out.println("\n===========================\n");
        Reflexao.inspecionarClasse(pai);
        System.out.println("\n===========================\n");
        Reflexao.inspecionarClasse(avo);
    }
}