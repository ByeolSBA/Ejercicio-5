public class Banco {
    private String nombre;
    private double saldo;
    private String tipoDeCuenta;

    public Banco(String nombre, double saldo, String tipoDeCuenta) {
        this.nombre = nombre;
        this.saldo = saldo;
        this.tipoDeCuenta = tipoDeCuenta;
    }

    public void depositar(double cantidad) {
        saldo += cantidad;
        System.out.println("Se han depositado $" + cantidad + ". Saldo actual: $" + saldo);
    }

    public void retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Se han retirado $" + cantidad + ". Saldo actual: $" + saldo);
        } else {
            System.out.println("Fondos insuficientes.");
        }
    }

    public void consultarSaldo() {
        System.out.println("El saldo actual es: $" + saldo);
    }
}
