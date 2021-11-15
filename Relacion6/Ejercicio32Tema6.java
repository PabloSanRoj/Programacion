/* Realiza un programa que pinte un sendero aleatorio. Los bordes se pintan con
el carácter “|”. La anchura del sendero siempre es la misma, los dos caracteres
del borde más cuatro caracteres en medio, en total 6 caracteres (incluyendo
espacios). A cada metro, el sendero puede continuar recto, girar un carácter a
la izquierda o girar un carácter a la derecha, por supuesto de forma aleatoria.
Por cada metro de sendero - representado por una línea - puede que haya un
obstáculo o puede que no, la probabilidad es del 50%. La posición del obstáculo
es aleatoria dentro de la línea. En caso de existir un obstáculo en un metro de
sendero (en una línea), puede ser una planta (carácter *) o una piedra (carácter
O), la probabilidad de que salga uno u otro es la misma. Recuerda que nunca
habrá más de un obstáculo por metro de sendero, habrá uno o ninguno.

Ejemplo 1:
Introduzca la longitud del sendero en metros: 7
| * |
| O|
| |
| * |
|* |
| O |
| | */

public class Ejercicio32Tema6 {
  public static void main(String[] args) {
    
    int lon, esp = 0, conta = 0, num, num2, num4;
    String num3;

    System.out.print("Por favor, introduzca la longitud del camino: ");
    lon = Integer.parseInt(System.console().readLine());

    for (int i = lon; i > 0; i--) {
      for (esp = 13; esp > conta; esp--) {
        System.out.print(" ");
      }
        num = (int) (Math.random() * 3);
        conta = 0;
        switch (num) {
        case 0:
        break;
        case 1:
          conta--;
          break;
        case 2:
          conta++;
          break;
        default:
        }
      num2 = (int)(Math.random()*2);
      switch (num2){
        case 0:
          System.out.print("|    |");
        break;
        case 1:
          num3 = String.valueOf((int)(Math.random()*2));
          switch (num3){
            case "0":
              num3 = "O";
            break;
            case "1":
              num3 = "*";
            break;
            default:
          }
          num4 = (int)((Math.random()*4)+2);
          for (int j = 6 ; j > 0 ; j--){
            if (j == num4){
              System.out.print(num3);
            } else {
            if (j == 1 || j == 6){
              System.out.print("|");
            } else {
              System.out.print(" ");
            }
          }
          }

      }System.out.println();
      }
      
  }
}
