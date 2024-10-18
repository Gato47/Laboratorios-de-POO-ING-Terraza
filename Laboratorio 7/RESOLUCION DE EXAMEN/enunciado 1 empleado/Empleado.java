import java.util.ArrayList;

// Clase abstracta Empleado
abstract class Empleado {
    protected String nombre;
    protected double salario;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    // Método abstracto para calcular el salario
    public abstract double calcularSalario();

    public String getNombre() {
        return nombre;
    }
}

// Subclase EmpleadoTiempoCompleto
class EmpleadoTiempoCompleto extends Empleado {
    private int horasTrabajadas;
    private static final int LIMITE_HORAS = 40;
    private static final double TARIFA_POR_HORA = 15.0;
    private static final double BONO_POR_HORAS_EXTRAS = 20.0;

    public EmpleadoTiempoCompleto(String nombre, int horasTrabajadas) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSalario() {
        if (horasTrabajadas <= LIMITE_HORAS) {
            salario = horasTrabajadas * TARIFA_POR_HORA;
        } else {
            int horasExtras = horasTrabajadas - LIMITE_HORAS;
            salario = (LIMITE_HORAS * TARIFA_POR_HORA) + (horasExtras * BONO_POR_HORAS_EXTRAS);
        }
        return salario;
    }
}

// Subclase EmpleadoPorComision
class EmpleadoPorComision extends Empleado {
    private double ventasTotales;
    private static final double PORCENTAJE_COMISION = 0.10;
    private static final double META_VENTAS = 10000.0;
    private static final double BONO_META_VENTAS = 500.0;

    public EmpleadoPorComision(String nombre, double ventasTotales) {
        super(nombre);
        this.ventasTotales = ventasTotales;
    }

    @Override
    public double calcularSalario() {
        salario = ventasTotales * PORCENTAJE_COMISION;
        if (ventasTotales >= META_VENTAS) {
            salario += BONO_META_VENTAS;
        }
        return salario;
    }
}