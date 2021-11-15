/* El pequeño Roberto tenía como mascota un pececillo dentro de una pecera. Los
Reyes Magos le han traído un caballito de mar ($) y una caracola (@) para que
le hagan compañía al pez. Realiza un programa que pinte por pantalla la pecera
con los tres animalitos acuáticos colocados dentro en posiciones aleatorias. Por
una cuestión de física elemental, ninguno de los animales puede coincidir
en la misma posición. Se debe pedir al usuario el ancho y el alto de la pecera,
que como mínimo serán de 4 unidades.

Ejemplo:
Por favor, introduzca la altura de la pecera (como mínimo 4): 4
Ahora introduzca la anchura (como mínimo 4): 7
* * * * * * *
*    @    & *
*       $   *
* * * * * * * */

public class Ejercicio30Tema6 {
  public static void main(String[] args) {

    int alt, anc , num2, num, num4, num3, num6, num5;

    System.out.print("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
    alt = Integer.parseInt(System.console().readLine());
    System.out.print("Ahora introduzca la anchura (como mínimo 4): ");
    anc = Integer.parseInt(System.console().readLine());

    num2 = (int)((Math.random()*(alt - 2))+1);
    num = (int)((Math.random()*(anc-2))+2);
    do {
    num4 = (int)((Math.random()*(alt - 2))+1);
    num3 = (int)((Math.random()*(anc-2))+2);
    } while (num4 == num2 && num3 == num);
    do {
    num6 = (int)((Math.random()*(alt - 2))+1);
    num5 = (int)((Math.random()*(anc-2))+2);
    } while ((num6 == num2 && num5 == num) || (num6 == num4 && num5 == num3));

    for (int i = 0 ; i < alt ; i++) {
      for (int j = 1 ; j <= anc ; j++) {
        if (i == num2 && j == num){
          System.out.print("& ");
          j++;
        }
        if (i == num4 && j == num3){
          System.out.print("@ ");
          j++;
        }
        if (i == num6 && j == num5){
          System.out.print("$ ");
          j++;
        }
        if (i >= 1 && i <= alt-2){
          if (j == 1 || j == anc) {
            System.out.print("* ");
          } else {
            System.out.print("  ");
          }
        } else {
          System.out.print("* ");
        }
      }
      System.out.println();
    }
  }
}
