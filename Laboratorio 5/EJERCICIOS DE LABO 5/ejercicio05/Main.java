public class Main {
    public static void main(String[] args) {
        CuentaCorriente miCuenta = new CuentaCorriente(1000, 500); // Saldo inicial 1000, límite de sobregiro 500

        try {
            miCuenta.retirar(1200); 
            System.out.println("Retiro exitoso. Saldo actual: " + miCuenta.getSaldo());
        } catch (SaldoInsuficienteException | LimiteSobregiroExcedidoException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
