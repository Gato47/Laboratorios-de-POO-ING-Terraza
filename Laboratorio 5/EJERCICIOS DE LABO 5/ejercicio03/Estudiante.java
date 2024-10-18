public class Estudiante extends Persona {
    private String nombre;

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    @Override // Sobrescribe el método saludar de la clase Persona
    public void saludar() {
        System.out.println("¡Hola! Soy " + nombre + ".");
    }

    // Sobrecarga el método saludar para aceptar un parámetro
    public void saludar(String otraPersona) {
        System.out.println("¡Hola, " + otraPersona + "! Soy " + nombre + ".");
    }
}
