/* Realiza un simulador de máquina tragaperras simplificada que cumpla los
siguientes requisitos:
a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5
figuras posibles: corazón, diamante, herradura, campana y limón.
b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento, ha
perdido”.
c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien,
ha recuperado su moneda”.
d) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado
10 monedas”.
Ejemplo 1:
diamante diamante limón
Bien, ha recuperado su moneda
Ejemplo 2:
herradura campana diamante
Lo siento, ha perdido
Ejemplo 3:
corazón corazón corazón
Enhorabuena, ha ganado 10 monedas*/

public class Ejercicio16Tema6 {
  public static void main(String[] args) {
    
    String num, num1 = "", num2 = "", num3 = "";

    System.out.println();
    for (int i = 0; i < 3 ; i++){
      num = String.valueOf((int)(Math.random()*5));
      switch (num) {
        case "0":
          num = "corazón";
          if (i == 0) {
            num1 = num;
          } else if (i == 1) {
            num2 = num;
          } else {
            num3 = num;
          }
        break;
        case "1":
          num = "diamante";
          if (i == 0) {
            num1 = num;
          } else if (i == 1) {
            num2 = num;
          } else {
            num3 = num;
          }
        break;
        case "2":
          num = "herradura";
          if (i == 0) {
            num1 = num;
          } else if (i == 1) {
            num2 = num;
          } else {
            num3 = num;
          }
        break;
        case "3":
          num = "campana";
          if (i == 0) {
            num1 = num;
          } else if (i == 1) {
            num2 = num;
          } else {
            num3 = num;
          }
        break;
        case "4":
          num = "limón";
          if (i == 0) {
            num1 = num;
          } else if (i == 1) {
            num2 = num;
          } else {
            num3 = num;
          }
        break;
        default:
      }
      System.out.print(num + " ");
    }
    System.out.println();
    if (num1 != num2 && num1 != num3) {
      System.out.println("Lo siento, ha perdido");
    } else if (num1 == num2 || num1 == num3 || num2 == num3) {
      if (num1 == num2 && num1 == num3){
        System.out.println("Enhorabuena, ha ganado 10 monedas");
      } else {
      System.out.println("Bien ha recuperado su moneda");
    }
  }
}
}