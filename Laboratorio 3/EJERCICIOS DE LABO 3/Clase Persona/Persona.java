//Diseña una clase Persona con los atributos nombre, edad y correo Electronico. Implementa la
//encapsulación para proteger estos atributos y proporciona métodos get y set para acceder y
//modificarlos de forma controlada.
public class Persona{
    private String name;
    private int edad;
    private String correoElectronico;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getCorreoElectronico() {
        return correoElectronico;
    }
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
}