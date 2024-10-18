public class Main {
    public static void main(String[] args) {
        Empleado empl = new Empleado("Andy", 5000, "Santa Anita");
        empl.salario(15);
        System.out.println(" Nombre:" + empl.getNombre());
        System.out.println("Salario: " + empl.getSalario());
        System.out.println("Departamento: " + empl.getDepartamento());
        System.out.println(" salario depsues del porcentje añadido: " + empl.getSalario());
    }
    
}
