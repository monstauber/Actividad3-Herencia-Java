
/**
 * 
 * Estudiante
 */
public class Estudiante {

    // Atributos del estudiante
    private String nombre;
    private int edad;
    private String matricula;
    private double calificacion1;
    private double calificacion2;

    // Constructor
    public Estudiante(String nombre, int edad, String matricula,
                      double calificacion1, double calificacion2) {
        this.nombre = nombre;
        this.edad = edad;
        this.matricula = matricula;
        this.calificacion1 = calificacion1;
        this.calificacion2 = calificacion2;
    }

    // Muestra los datos del estudiante
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Matricula: " + matricula);
        System.out.println("Calificacion 1: " + calificacion1);
        System.out.println("Calificacion 2: " + calificacion2);
    }

    // Calcula el promedio
    public double calcularPromedio() {
        return (calificacion1 + calificacion2) / 2;
    }

    // Verifica si el estudiante aprobo
    public void verificarAprobacion() {
        if (calcularPromedio() >= 70) {
            System.out.println("Estado: APROBADO");
        } else {
            System.out.println("Estado: REPROBADO");
        }
    }
}
