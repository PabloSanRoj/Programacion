import paquetes.Moneda;

public class Ejerciciomoneda {
  public static void main(String[] args) {

    System.out.print("Indique el numero de monedas: ");
    int num = Integer.parseInt(System.console().readLine());

    boolean salir = true;
    
    Moneda [] monedas = new Moneda[num];

    for (int i = 0; i < num; i++){
      monedas[i]= new Moneda("X");
    }

    do {

      salir = true;

      

      String buscando = monedas[0].getMoneda();

      for (int i = 1; i < num && salir ; i++){
        if (!monedas[i].getMoneda().equals(buscando)){
          salir = false;
        }
      }
      for (int i = 0; i < num; i++){
        System.out.print(monedas[i]);
      }
      System.out.println();

      if (salir== false){
        for (int i = 0; i < num; i++){
          monedas[i]= new Moneda("X");
        }
      }


    } while(salir == false);
  }
}
