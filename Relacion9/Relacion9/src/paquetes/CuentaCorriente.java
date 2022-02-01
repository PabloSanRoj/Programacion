package paquetes;

public class CuentaCorriente {
  String numeroCuenta = "";
  double saldo = 0;

  public CuentaCorriente(double s) {

    for (int i = 0; i < 10; i++) {
      int num = (int) (Math.random() * 10);
      this.numeroCuenta += num;
    }
    this.saldo = s;

  }

  public CuentaCorriente() {

    for (int i = 0; i < 10; i++) {
      int num = (int) (Math.random() * 10);
      this.numeroCuenta += num;
    }

  }

  public void ingreso (int n){
    this.saldo += n;
  }

  public void cargo (int g){
    this.saldo -= g;
  }

  public void transferencia (CuentaCorriente c2 , int d){
    c2.saldo += d;
    this.saldo -= d;
  }

  public String toString() {
    String resultado = "";

      resultado += "Numero de cta: " + this.numeroCuenta + " Saldo: " + this.saldo + " euros";

    return resultado;
  }
}
