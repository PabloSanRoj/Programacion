public class Ejercicio24 {
    public static void main(String[] args) {

        float caEmp = 0;
        float diaCli = 0;
        float esCivi = 0;
        float suelBru = 0;
        float suelNeto = 0;

        System.out.println("Este programa calcula tu sueldo neto");
        System.out.println("Por favor introduzca el cargo de empleado");
        System.out.println("1- Prog.junior");
        System.out.println("2- Prog.senior");
        System.out.println("3- Jefe de proyecto");
        caEmp = Float.parseFloat(System.console().readLine());
        System.out.println("Por favor introduzca el numero de dias visitando clientes");
        diaCli = Float.parseFloat(System.console().readLine());
        System.out.println("Por favor introduzca su estado civil");
        System.out.println("1- Soltero");
        System.out.println("2- Casado");
        esCivi = Float.parseFloat(System.console().readLine());

        if (caEmp == 1) {
            caEmp = 950;
        } else if (caEmp == 2) {
            caEmp = 1200;
        } else if (caEmp == 3) {
            caEmp = 1600;
        }

        diaCli = diaCli * 30;
        suelBru = caEmp + diaCli;

        if (esCivi == 1) {
            esCivi = suelBru * 0.25f;
        } else if (esCivi == 2) {
            esCivi = suelBru * 0.20f;
        }

        suelNeto = suelBru - esCivi;

        System.out.println(" ");
        System.out.println("Sueldo base:       " + caEmp);
        System.out.println("Dietas:            " + diaCli);
        System.out.println("Sueldo bruto:      " + suelBru);
        System.out.println("Retención IRPF:    " + esCivi);
        System.out.println("Sueldo neto:       " + suelNeto);

    }
}
