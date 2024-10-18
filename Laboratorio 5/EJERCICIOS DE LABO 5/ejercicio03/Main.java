public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.saludar(); // Output: ¡Hola!

        Estudiante estudiante = new Estudiante("Ana");
        estudiante.saludar(); // Output: ¡Hola! Soy Ana.
        estudiante.saludar("Juan"); // Output: ¡Hola, Juan! Soy Ana.
    }
}