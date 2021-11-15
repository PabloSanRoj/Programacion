/* Realiza un programa que muestre la previsión del tiempo para mañana en
Málaga. Las temperaturas máxima y mínima se deben generar de forma
aleatoria entre los intervalos máximos y mínimos absolutos medidos en las
últimas décadas para cada estación. La probabilidad de que esté soleado
o nublado en cada estación se proporciona a continuación. Obviamente, la
temperatura mínima deberá ser menor o igual que la temperatura máxima.

Ejemplo:
1. Primavera
2. Verano
3. Otoño
4. Invierno
Seleccione la estación del año (1-4): 4
Previsión del tiempo para mañana
--------------------------------
Temperatura mínima: 10oC
Temperatura máxima: 16oC
Nublado*/

public class Ejercicio29Tema6 {
  public static void main(String[] args) {
    
    int est, num = 0, num2 = 0;
    String num3 = "";

    System.out.println("1. Primavera");
    System.out.println("2. Verano");
    System.out.println("3. Otoño");
    System.out.println("4. Invierno");
    System.out.print("Seleccione la estación del año (1-4): ");
    est = Integer.parseInt(System.console().readLine());

    switch (est) {
      case 1:
        num = (int)((Math.random()*16)+15);
        do {
          num2 = (int)((Math.random()*16)+15);
        } while (num2 < num);
        num3 = String.valueOf((int)(Math.random()*10));
        switch (num3){
          case "0","1","2","3","4","5":
            num3 = "Soleado";
          break;
          case "6","7","8","9":
            num3 = "Nublado";
          break;
          default:
        }
      break;
      case 2:
        num = (int)((Math.random()*26)+25);
        do {
          num2 = (int)((Math.random()*26)+25);
        } while (num2 < num);
        num3 = String.valueOf((int)(Math.random()*10));
        switch (num3){
          case "0","1","2","3","4","5","6","7":
            num3 = "Soleado";
          break;
          case "8","9":
            num3 = "Nublado";
          break;
          default:
        }
      break;
      case 3:
        num = (int)((Math.random()*11)+20);
        do {
          num2 = (int)((Math.random()*11)+20);
        } while (num2 < num);
        num3 = String.valueOf((int)(Math.random()*10));
        switch (num3){
          case "0","1","2","3":
            num3 = "Soleado";
          break;
          case "4","5","6","7","8","9":
            num3 = "Nublado";
          break;
          default:
        }
      break;
      case 4:
        num = (int)(Math.random()*26);
        do {
          num2 = (int)(Math.random()*26);
        } while (num2 < num);
        num3 = String.valueOf((int)(Math.random()*10));
        switch (num3){
          case "0","1":
            num3 = "Soleado";
          break;
          case "2","3","4","5","6","7","8","9":
            num3 = "Nublado";
          break;
          default:
        }
      break;
      default:
    }
    System.out.println();
    System.out.println("Previsión del tiempo para mañana");
    System.out.println("--------------------------------");
    System.err.println("Temperatura mínima: " + num + "oC");
    System.out.println("Temperatura máxima: " + num2 + "oC");
    System.out.println(num3);
    System.out.println();
  }
}
