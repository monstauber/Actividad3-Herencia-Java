
/**
 * Clase EstudianteRegular.
 * Hereda los atributos y metodos de Estudiante.
 */
public class EstudianteRegular extends Estudiante {

    // Atributo propio de un estudiante regular
    private String carrera;

    // Constructor de la clase
    public EstudianteRegular(String nombre, int edad, String matricula,
                             double calificacion1, double calificacion2,
                             String carrera) {

        super(nombre, edad, matricula, calificacion1, calificacion2);
        this.carrera = carrera;
    }

    // Sobrescribe el metodo mostrarDatos de la clase padre
    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Carrera: " + carrera);
    }

    // Metodo propio de esta clase
    public void mostrarCarrera() {
        System.out.println("El estudiante cursa: " + carrera);
    }
}

