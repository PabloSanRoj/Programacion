public class Ejercicio12 {
  public static void main (String[] Args){
        
        String Pregunta1;
        String Pregunta2;
        String Pregunta3;
        String Pregunta4;
        String Pregunta5;
        String Pregunta6;
        String Pregunta7;
        String Pregunta8;
        String Pregunta9;
        String Pregunta10;
        int Respuesta1;
        int Respuesta2;
        int Respuesta3;
        int Respuesta4;
        int Respuesta5;
        int Respuesta6;
        int Respuesta7;
        int Respuesta8;
        int Respuesta9;
        int Respuesta10;
        int calificacion;
        
        System.out.println ("¿Con que estamos programando ahora?: ");
        Pregunta1 = System.console().readLine();
        
        System.out.println ("¿Que base de datos utilizamos?: ");
        Pregunta2 = System.console().readLine();

        System.out.println ("¿Que utilizamos en entornos para realizar apuntes?: ");
        Pregunta3 = System.console().readLine();
        
        System.out.println ("¿Como se le llama a un peligro en el trabajo?: ");
        Pregunta4 = System.console().readLine();
        
        System.out.println ("¿Como se llama lo que le da estilo a HTML?: ");
        Pregunta5 = System.console().readLine();
        
        System.out.println ("¿Que utilizamos para hacer páginas WEB?: ");
        Pregunta6 = System.console().readLine();
        
        System.out.println ("¿Que componente controla el ordenador?: ");
        Pregunta7 = System.console().readLine();
        
        System.out.println ("¿De que está hecho ese componente?: ");
        Pregunta8 = System.console().readLine();
        
        System.out.println ("¿Como se denominan también las tablas de las bases de datos?: ");
        Pregunta9 = System.console().readLine();
 
        System.out.println ("¿Cual suele ser la frase de prueba de los programas?: ");
        Pregunta10 = System.console().readLine();
        
        if (Pregunta1.equalsIgnoreCase("Java")){
          Respuesta1 = 1;
        } else {
          Respuesta1 = 0;
        }
        if (Pregunta2.equalsIgnoreCase("MySQL")){
          Respuesta2 = 1;
        } else {
          Respuesta2 = 0;
        }
        if (Pregunta3.equalsIgnoreCase("Notion")){
          Respuesta3 = 1;
        } else {
          Respuesta3 = 0;
        }
        if (Pregunta4.equalsIgnoreCase("Riesgo Laboral")){
          Respuesta4 = 1;
        } else {
          Respuesta4 = 0;
        }
        if (Pregunta5.equalsIgnoreCase("CSS")){
          Respuesta5 = 1;
        } else {
          Respuesta5 = 0;
        }
        if (Pregunta6.equalsIgnoreCase("HTML")){
          Respuesta6 = 1;
        } else {
          Respuesta6 = 0;
        }
        if (Pregunta7.equalsIgnoreCase("Procesador")){
          Respuesta7 = 1;
        } else {
          Respuesta7 = 0;
        }
        if (Pregunta8.equalsIgnoreCase("Transistores")){
          Respuesta8 = 1;
        } else {
          Respuesta8 = 0;
        }
        if (Pregunta9.equalsIgnoreCase("Entidades")){
          Respuesta9 = 1;
        } else {
          Respuesta9 = 0;
        }
        if (Pregunta10.equalsIgnoreCase("Hola Mundo")){
          Respuesta10 = 1;
        } else {
          Respuesta10 = 0;
        }
        
        calificacion = Respuesta1 + Respuesta2 + Respuesta3 + Respuesta4 + Respuesta5 + Respuesta6 + Respuesta7 + Respuesta8 + Respuesta9 + Respuesta10;
        System.out.println ("Tu calificación ha sido de: " + calificacion + " puntos sobre 10");
  }
}
