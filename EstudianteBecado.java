
/**
 * Clase EstudianteBecado.
 * Hereda los atributos y metodos de Estudiante.
 */
public class EstudianteBecado extends Estudiante {

    // Atributo propio del estudiante becado
    private double porcentajeBeca;

    // Constructor de la clase
    public EstudianteBecado(String nombre, int edad, String matricula,
                            double calificacion1, double calificacion2,
                            double porcentajeBeca) {

        super(nombre, edad, matricula, calificacion1, calificacion2);
        this.porcentajeBeca = porcentajeBeca;
    }

    // Sobrescribe el metodo mostrarDatos
    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Beca: " + porcentajeBeca + "%");
    }

    // Sobrescribe el metodo verificarAprobacion
    @Override
    public void verificarAprobacion() {
        if (calcularPromedio() >= 70) {
            System.out.println("Estado: APROBADO - Conserva su beca");
        } else {
            System.out.println("Estado: REPROBADO - Puede perder su beca");
        }
    }

    // Metodo propio de esta clase
    public void mostrarBeca() {
        System.out.println("Porcentaje de beca: " + porcentajeBeca + "%");
    }
}

