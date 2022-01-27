package paquetes;

public class Vehiculo {
  int vehiculosCreados;
  int kilometrosTotales = 0;

  public static int kilometrosRecorridos = 0;

  public static int kilometrosRecorridos() {
    return kilometrosRecorridos;
  }

  public int getOpcion (int op){
    int opcion = op;

    switch (opcion){
      case 1:

      break;
      case 2:

      break;
      case 7:
        return kilometrosTotales;

      default: return kilometrosTotales;

    }
    return kilometrosTotales;
  }

}

