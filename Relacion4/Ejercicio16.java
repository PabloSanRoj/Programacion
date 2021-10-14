public class Ejercicio16 {
  public static void main (String[] Args) {
  
      String res1;
      String res2;
      String res3;
      String res4;
      String res5;
      String res6;
      String res7;
      String res8;
      String res9;
      String res10;
      int punto1 = 0;
      int punto2 = 0;
      int punto3 = 0;
      int punto4 = 0;
      int punto5 = 0;
      int punto6 = 0;
      int punto7 = 0;
      int punto8 = 0;
      int punto9 = 0;
      int punto10 = 0;
      int punTotal;
  
      System.out.println ("Bienvenido a un cuestionario sobre la infedelidad.");
      System.out.println ("A este cuestionario deberá contestar con verdadero o falso.");
      System.out.println ("Cada pregunta verdadera sumará 3p y las falsas no sumaran.");
      System.out.println ("Estas son las preguntas:");
      System.out.println ("¿Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente?");
      res1 = System.console().readLine();
      System.out.println ("¿Ha aumentado sus gastos de vestuario?");
      res2 = System.console().readLine();
      System.out.println ("¿Ha perdido el interés que mostraba anteriormente por ti?");
      res3 = System.console().readLine();
      System.out.println ("¿Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)?");
      res4 = System.console().readLine();
      System.out.println ("¿No te deja que mires la agenda de su teléfono móvil?");
      res5 = System.console().readLine();
      System.out.println ("¿A veces tiene llamadas que dice no querer contestar cuando estás tú delante?");
      res6 = System.console().readLine();
      System.out.println ("¿Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a?");
      res7 = System.console().readLine();
      System.out.println ("¿Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo?");
      res8 = System.console().readLine();
      System.out.println ("¿Has notado que últimamente se perfuma más?");
      res9 = System.console().readLine();
      System.out.println ("¿Se confunde y te dice que ha estado en sitios donde no ha ido contigo?");
      res10 = System.console().readLine();
  
      if (res1.equals("verdadero")) {
          punto1 = punto1 + 3;
      } else {
          punto1 = 0;
      }
      if (res2.equals("verdadero")) {
          punto2 = punto2 + 3;
      } else {
          punto2 = 0;
      }
      if (res3.equals("verdadero")) {
          punto3 = punto3 + 3;
      } else {
          punto3 = 0;
      }
      if (res4.equals("verdadero")) {
          punto4 = punto4 + 3;
      } else {
          punto4 = 0;
      }
      if (res5.equals("verdadero")) {
          punto5 = punto5 + 3;
      } else {
          punto5 = 0;
      }
      if (res6.equals("verdadero")) {
          punto6 = punto6 + 3;
      } else {
          punto6 = 0;
      }
      if (res7.equals("verdadero")) {
          punto7 = punto7 + 3;
      } else {
          punto7 = 0;
      }
      if (res8.equals("verdadero")) {
          punto8 = punto8 + 3;
      } else {
          punto8 = 0;
      }
      if (res9.equals("verdadero")) {
          punto9 = punto9 + 3;
      } else {
          punto9 = 0;
      }
      if (res10.equals("verdadero")) {
          punto10 = punto10 + 3;
      } else {
          punto10 = 0;
      }
      
      punTotal = punto1 + punto2 + punto3 + punto4 + punto5 + punto6 + punto7 + punto8 + punto9 + punto10;
      
      System.out.println ("Tu puntuación ha sido de : " + punTotal);
      
      if ((punTotal >= 0) && (punTotal <=10)) {
        System.out.println ("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
      } else if ((punTotal >= 11) && (punTotal <=21)) {
        System.out.println ("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
      } else if ((punTotal >= 22) && (punTotal <=30)) {
        System.out.println ("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
      } else {
        System.out.println ("La puntuación esta mal por lo cuál esta mal el problema");  
      }
  }
}
