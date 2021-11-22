/* Escribe un programa que muestre por pantalla un array de 10 números enteros
generados al azar entre 0 y 100. A continuación, el programa debe pedir un
número al usuario. Se debe comprobar que el número introducido por teclado
se encuentra dentro del array, en caso contrario se mostrará un mensaje por
pantalla y se volverá a pedir un número; así hasta que el usuario introduzca uno
correctamente. A continuación, el programa rotará el array hacia la derecha
las veces que haga falta hasta que el número introducido quede situado en la
posición 0 del array. Por último, se mostrará el array rotado por pantalla. */

public class Ejercicio17Tema7_1 {
  public static void main(String[] args) {

    int numero;
    boolean salir = false;
    
    int [] num = new int [10];
    int [] num2 = new int [10];

    System.out.println();
    System.out.println("Los números son los siguientes: ");
    for (int i = 0 ; i < 10 ; i++){
      num[i] = (int)(Math.random()*101);
      System.out.print(num[i] + " ");
    }

    System.out.println();
    System.out.println();
    do{
    System.out.print("Seleccione un número de los mostrados anteriormente: ");
    numero = Integer.parseInt(System.console().readLine());
    for (int i = 0 ; i < 10 ; i++){
      if (numero == num[i]){
        salir = true;
      }
    }  
  } while (salir == false);
  do {
  for (int i = 1 ; i <= 10 ; i++){
    if (i == 10){
      num2[0] = num[9]; 
    } else {
      num2[i] = num[i-1];
    }
  }
  for (int i = 0 ; i < 10 ; i++){
    num[i] = num2[i];
  }
  } while (num2[0] != numero);

  System.out.println();
  System.out.println("Los números pero ahora el primero es el que tu has seleccionado son: ");
  for (int i = 0 ; i < 10 ; i++){
    System.out.print(num2[i] + " ");
  }
}
}
