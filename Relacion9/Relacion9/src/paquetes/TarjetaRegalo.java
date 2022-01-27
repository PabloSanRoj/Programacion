package paquetes;

import java.text.DecimalFormat;

public class TarjetaRegalo {
  String numero;
  double saldo;

  public TarjetaRegalo(double saldo) {
    this.saldo = saldo;
    // Genera un número de tarjeta aleatorio de 5 cifras
    this.numero = "";
    for (int i = 0; i < 5; i++) {
      this.numero += (int) (Math.random() * 10);
    }
  }

  @Override
  public String toString() {
    DecimalFormat dosDecimales = new DecimalFormat("0.00");
    return "Tarjeta no " + numero + " - Saldo " + dosDecimales.format(saldo) + "€";
  }

  public void gasta(double gasto) {
    if (gasto > saldo) {
      System.out.printf("No tiene suficiente saldo para gastar %.2f€\n", gasto);

    } else {
      saldo -= gasto;
    }
  }

  public TarjetaRegalo fusionaCon(TarjetaRegalo t) {
    double nuevoSaldo = this.getSaldo() + t.getSaldo();
    this.setSaldo(0);
    t.setSaldo(0);
    return new TarjetaRegalo(nuevoSaldo);
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public double getSaldo() {
    return saldo;
  }
}
