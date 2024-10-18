public class GestionEmpleados {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoTiempoCompleto("Juan", 45)); // 45 horas trabajadas
        empleados.add(new EmpleadoPorComision("María", 12000)); // Ventas de 12000

        for (Empleado empleado : empleados) {
            System.out.println("Empleado: " + empleado.getNombre());
            System.out.println("Salario calculado: " + empleado.calcularSalario());
            System.out.println();
        }
    }
}