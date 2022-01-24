package paquetes;

public class Vehiculo {
  int vehiculosCreados;
  int kilometrosTotales;

  public static int kilometrosRecorridos = 0;

  public static int kilometrosRecorridos() {
    return kilometrosRecorridos;
  }

  public void Corre(int km) {
    kilometrosRecorridos += km;
    kilometrosTotales += km;
  }
}

