class Coche extends Vehiculo {
    int numeroPuertas;

    // Constructor de la clase derivada
    public Coche(String marca, int numeroPuertas) {
        // Llamada al constructor de la clase base
        super(marca); 
        this.numeroPuertas = numeroPuertas;
    }
}
