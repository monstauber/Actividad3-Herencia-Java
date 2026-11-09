

/**
 * Clase principal del programa.
 * Aqui se crean y prueban los objetos de las clases derivadas.
 */
public class Main {

    public static void main(String[] args) {

        // Creamos un estudiante regular
        EstudianteRegular estudiante1 = new EstudianteRegular(
            "Carlos", 20, "A001", 90, 85, "Ingenieria en Software"
        );

        // Creamos otro estudiante regular
        EstudianteRegular estudiante2 = new EstudianteRegular(
            "Maria", 21, "A002", 75, 80, "Administracion"
        );

        // Creamos un estudiante becado
        EstudianteBecado estudiante3 = new EstudianteBecado(
            "Jose", 19, "A003", 60, 55, 50
        );

        // Mostramos los datos del primer estudiante
        System.out.println("===== ESTUDIANTE REGULAR 1 =====");
        estudiante1.mostrarDatos();
        System.out.println("Promedio: " + estudiante1.calcularPromedio());
        estudiante1.verificarAprobacion();
        estudiante1.mostrarCarrera();

        // Mostramos los datos del segundo estudiante
        System.out.println("\n===== ESTUDIANTE REGULAR 2 =====");
        estudiante2.mostrarDatos();
        System.out.println("Promedio: " + estudiante2.calcularPromedio());
        estudiante2.verificarAprobacion();
        estudiante2.mostrarCarrera();

        // Mostramos los datos del estudiante becado
        System.out.println("\n===== ESTUDIANTE BECADO =====");
        estudiante3.mostrarDatos();
        System.out.println("Promedio: " + estudiante3.calcularPromedio());
        estudiante3.verificarAprobacion();
        estudiante3.mostrarBeca();
    }
}
