public class Ejercicio23 {
    public static void main(String[] args) {

        float baImpo;
        float ivaApli = 0;
        float codiApli = 0;
        float preIVA;
        float precioTotal;

        System.out.println ("Este programa calcula el precio final de un producto");
        System.out.println ("Introduzca el la base imponible de su producto: ");
        baImpo = Float.parseFloat(System.console().readLine());
        System.out.println ("Introduzca el tipo de IVA que se va a aplicar a su producto: ");
        System.out.println ("1. IVA 21%");
        System.out.println ("2. IVA 10%");
        System.out.println ("3. IVA 4%");
        ivaApli = Float.parseFloat(System.console().readLine());
        System.out.println ("Introduzca el código promocional de su producto: ");
        System.out.println ("1. nopro");
        System.out.println ("2. mitad");
        System.out.println ("3. meno5");
        System.out.println ("4. 5porc");
        codiApli = Float.parseFloat(System.console().readLine());

        if (ivaApli == 1) {
            ivaApli = baImpo * 0.21f;
        } else if (ivaApli == 2) {
            ivaApli = baImpo * 0.10f;
        } else if (ivaApli == 3) {
            ivaApli = baImpo * 0.04f;
        } else {
            System.out.println ("Has introducido el número mal");
        }

        preIVA = ivaApli + baImpo; 

        if (codiApli == 1) {
            codiApli = preIVA;
        } else if (codiApli == 2) {
            codiApli = preIVA / 2;
        } else if (codiApli == 3) {
            codiApli = preIVA - 5;
        } else if (codiApli == 4) {
            codiApli = preIVA * 0.05f;
        } else {
            System.out.println ("Has introducido algo mal");
        }

        precioTotal = preIVA - codiApli;
        System.out.println ("Base Imponible:      " + baImpo);
        System.out.println ("IVA:                 " + ivaApli);
        System.out.println ("Precio con IVA:      " + preIVA);
        System.out.println ("Cód.promo:           " + codiApli);
        System.out.println ("TOTAL:               " + precioTotal);



    }
}
