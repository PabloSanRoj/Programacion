public class Ejercicio18 {
  public static void main (String[] Args) {
    
    int num;
    int digitos = 0;
    
    System.out.println ("Este programa te dice el numero de cifras del numero introducido");
    System.out.println ("Por favor introduzca un numero");
    System.out.println ("(OJO el numero debe ser menor de 5 cifras)");
    num = Integer.parseInt(System.console().readLine());
    
    if ((num >= 10000) && (num <100000)) {
        digitos = 5;
        System.out.println ("El numero de cifras de tu número es: " + digitos);
    } else if ((num >= 1000) && (num <= 9999)) {
        digitos = 4;
        System.out.println ("El numero de cifras de tu número es: " + digitos);
    } else if ((num >= 100) && (num <= 999)) {
        digitos = 3;
        System.out.println ("El numero de cifras de tu número es: " + digitos);
    } else if ((num >= 10) && (num <= 99)) {
        digitos = 2;
        System.out.println ("El numero de cifras de tu número es: " + digitos);
    } else if ((num >= 1) && (num <= 9)){
        digitos = 1;
        System.out.println ("El numero es de un solo digito por lo tanto es: " + digitos);
    } else if ((num >= -10000) && (num < -100000)) {
        digitos = 5;
        System.out.println ("El numero de cifras de tu número es: " + digitos);
    } else if ((num >= -1000) && (num <= -9999)) {
        digitos = 4;
        System.out.println ("El numero de cifras de tu número es: " + digitos);
    } else if ((num >= -100) && (num <= -999)) {
        digitos = 3;
        System.out.println ("El numero de cifras de tu número es: " + digitos);
    } else if ((num >= -10) && (num <= -99)) {
        digitos = 2;
        System.out.println ("El numero de cifras de tu número es: " + digitos);
    } else if ((num >= -1) && (num <= -9)){
        digitos = 1;
        System.out.println ("El numero es de un solo digito por lo tanto es: " + digitos);
    } else {
        System.out.println ("El programa da error porque has metido un numero mayor de 5 cifras");
    }
  }
}
