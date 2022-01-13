package paquetes;

public class Ejercicio20_28 {

  public static int [] generaArrayInt (int numero, int min, int max) {

    int [] arrayGeneral = new int [numero];

    for (int i = 0 ; i < numero ; i++){
      arrayGeneral[i] = (int)((Math.random()*(max-min))+ min);
    }

    return arrayGeneral;
  }

  public static int [] minimoArrayInt (int numero, int min, int max) {

    int [] arrayGeneral = new int [numero];

    for (int i = 0 ; i < numero ; i++){
      arrayGeneral[i] = (int)((Math.random()*(max-min))+ min);
    }

    return arrayGeneral;
  }
}
