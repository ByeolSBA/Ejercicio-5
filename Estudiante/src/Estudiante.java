public class Estudiante {
    private String nombre;
    private String matricula;
    private String carrera;

    public Estudiante(String nombre, String matricula, String carrera) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.carrera = carrera;
    }

    public void estudiar() {
        System.out.println(nombre + " está estudiando.");
    }

    public void presentarExamen() {
        System.out.println(nombre + " está presentando un examen.");
    }

    public void inscribirse() {
        System.out.println(nombre + " se ha inscrito en un curso.");
    }

    public void mostrarInfo() {
        System.out.println("Estudiante: Nombre = " + nombre + ", Matrícula = " + matricula + ", Carrera = " + carrera);
    }
}
