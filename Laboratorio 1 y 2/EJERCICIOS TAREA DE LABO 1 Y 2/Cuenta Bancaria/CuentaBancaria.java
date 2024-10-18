public class CuentaBancaria{
    protected String titular;
    protected String numCuenta;
    protected double saldo;
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public String getNumCuenta() {
        return numCuenta;
    }
    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    // costructores
    public CuentaBancaria(String titular, String numCuenta, double saldo) {
        this.titular = titular;
        this.numCuenta = numCuenta;
        this.saldo = saldo;
    }
    public void depositar(double cantidad){
        if(cantidad > 0){saldo += cantidad;
        System.out.println("Deposito exitoso. Nuevo saldo: " + saldo);}
        else {
            System.out.println("El saldo que quiere depositar debe ser positivo");
        }
    }
    public void retirar(double cantidad){
        if (cantidad > 0 && cantidad <= saldo){
            saldo -=cantidad;
            System.out.println("Retiro exitoso. Nuevo saldo es: " + saldo);
            } else if (cantidad > saldo){
                System.out.println("fondos insuficientes  saldo disponilbe; " + saldo);
            } else{
                System.out.println("la cantidad a retirar debe ser positiva");
            }
    }
    // consultar saldo
    public void consultarSaldo(){
        System.out.println("el saldo actual es: " + saldo);
    }
}