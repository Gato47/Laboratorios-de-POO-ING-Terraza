public class Main {
    public static void main(String[] args) {
        CuentaBancaria obj1 =new CuentaBancaria("andy", "4565455", 8000);
        obj1.retirar(6000.56);
        obj1.depositar(400);

        obj1.consultarSaldo();
        System.out.println("titular: " + obj1.getTitular() +
                            " numCuenta :"+ obj1.getNumCuenta() +
                            "saldo actual . " + obj1.getSaldo());
    }
}
