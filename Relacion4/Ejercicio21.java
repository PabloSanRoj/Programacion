public class Ejercicio21 {
    public static void main(String[] Args) {

        float nota1;
        float nota2;
        float notaMedia;
        float notaRecu;
        String apNoap;

        System.out.println("Este programa calcula tu nota del primer trimestre");
        System.out.println("Escriba la nota del primer examen: ");
        nota1 = Float.parseFloat(System.console().readLine());
        System.out.println("Escriba la nota del segundo examen: ");
        nota2 = Float.parseFloat(System.console().readLine());

        notaMedia = (nota1 + nota2) / 2;

        if (notaMedia >= 5) {
            System.out.println(
                    "La nota media de el primer trimestre es : " + notaMedia + " y por lo tanto estas aprobado");
        } else {
            System.out.println("Has suspendido tienes que hacer una recuperación");
            System.out.println("Introduzca la nota de la recuperación");
            notaRecu = Float.parseFloat(System.console().readLine());
            if (notaRecu >= 5) {
                apNoap = "Apto";
            } else {
                apNoap = "No apto";
            }
            if (apNoap.equals("Apto")) {
                System.out.println("En la recuperación estas: " + apNoap + " por lo tanto tienes un 5");
            } else {
                System.out.println(
                        "En la recuperación estas: " + apNoap + " por lo tanto tu no nota media es: " + notaMedia);
            }
        }
    }
}