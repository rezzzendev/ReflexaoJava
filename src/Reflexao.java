import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflexao {

    public static void inspecionarClasse(Object obj) {
        Class<?> clazz = obj.getClass();

        System.out.println("\n===== INSPEÇÃO DA CLASSE: " + clazz.getSimpleName() + " =====");


        while (clazz != null && clazz != Object.class) {
            listarAtributos(clazz);
            listarMetodos(clazz);

            if (clazz == Pessoa.class) {
                break;
            }

            clazz = clazz.getSuperclass();
        }
    }

    private static void listarAtributos(Class<?> clazz) {
        Field[] campos = clazz.getDeclaredFields();
            System.out.println("\nAtributos da classe " + clazz.getSimpleName() + ":");
            for (Field campo : campos) {
                System.out.println(" - " + campo.getName() + " (" + campo.getType().getSimpleName() + ")");
            }

    }

    private static void listarMetodos(Class<?> clazz) {
        Method[] metodos = clazz.getDeclaredMethods();
            System.out.println("\nMétodos da classe " + clazz.getSimpleName() + ":");
            for (Method metodo : metodos) {
                System.out.println(" - " + metodo.getName());
            }

    }
}
