import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflexao {

    public static void inspecionarClasse(Object obj) {
        Class<?> clazz = obj.getClass();

        System.out.println("===== INSPEÇÃO DA CLASSE: " + clazz.getSimpleName() + " =====");

        // Listar atributos e métodos, subindo na hierarquia de classes
        while (clazz != null) {
            listarAtributos(clazz);
            listarMetodos(clazz);
            clazz = clazz.getSuperclass();
        }
    }

    private static void listarAtributos(Class<?> clazz) {
        Field[] campos = clazz.getDeclaredFields();
        if (campos.length > 0) {
            System.out.println("\nAtributos da classe " + clazz.getSimpleName() + ":");
            for (Field campo : campos) {
                System.out.println(" - " + campo.getName() + " (" + campo.getType().getSimpleName() + ")");
            }
        }
    }

    private static void listarMetodos(Class<?> clazz) {
        Method[] metodos = clazz.getDeclaredMethods();
        if (metodos.length > 0) {
            System.out.println("\nMétodos da classe " + clazz.getSimpleName() + ":");
            for (Method metodo : metodos) {
                System.out.println(" - " + metodo.getName());
            }
        }
    }
}
