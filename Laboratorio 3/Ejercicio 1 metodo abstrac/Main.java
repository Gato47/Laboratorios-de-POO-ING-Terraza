abstract class Main {
    public String nombre = "Saul";
    public int edad = 34;
    public abstract void Estudiar();
}
class Estudiante extends Main {
    public int añoGraduación = 2018;
    public void Estudiar() {
        System.out.println("ESTUDIANDO UN LARGO DIA");
    }
}

