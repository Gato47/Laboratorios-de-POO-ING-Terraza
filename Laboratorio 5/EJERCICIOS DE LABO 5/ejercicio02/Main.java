public class Main {
    public static void main(String[] args) {
        Movible miCoche = new Coche();
        Movible miAvion = new Avion();

        miCoche.moverse(); // Salida: El coche se mueve sobre ruedas.
        miAvion.moverse(); // Salida: El avión vuela por el aire.
    }
}
