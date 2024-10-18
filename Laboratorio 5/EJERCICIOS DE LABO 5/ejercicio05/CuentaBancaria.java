public class CuentaBancaria {
    protected double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void retirar(double cantidad) throws SaldoInsuficienteException, LimiteSobregiroExcedidoException {
        if (cantidad > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar el retiro.");
        }
        saldo -= cantidad;
    }

    public double getSaldo() {
        return saldo;
    }
}