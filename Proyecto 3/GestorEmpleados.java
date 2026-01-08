import java.util.ArrayList;
import java.util.Scanner;

public class GestorEmpleados {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        boolean nuevo_registro = true;

        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<String> cargos = new ArrayList<>();
        ArrayList<Double> salarios = new ArrayList<>();

        System.out.println("=== GESTOR BASICO DE EMPLEADOS ===");

        while (nuevo_registro){
            System.out.print("Nombre del empleado: ");
            String nombre = entrada.nextLine();

            System.out.print("Cargo del empleado: ");
            String cargo = entrada.nextLine();

            System.out.print("Salario del empleado: ");
            double salario = entrada.nextDouble();

            entrada.nextLine();

            nombres.add(nombre);
            cargos.add(cargo);
            salarios.add(salario);

            System.out.print("\n¿Quieres ingresar un nuevo empleado? (S/N): ");
            String respuesta = entrada.nextLine();

            if (respuesta.equalsIgnoreCase("N")) {
                nuevo_registro = false;
            }

            System.out.println();
        }
        System.out.println("\n--- LISTA DE EMPLEADOS REGISTRADOS ---");
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println(
                    "Empleado " + (i + 1) + ": " +
                            nombres.get(i) + " | " +
                            cargos.get(i) + " | $" +
                            salarios.get(i)
            );
        }

        System.out.println("\n--- TOTALIAD DE EMPLEADOS REGISTRADOS ---");
        System.out.println(nombres.size());

        double sumaSalarios = 0;

        for (double salario : salarios) {
            sumaSalarios += salario;
        }

        double promedioSalarial = sumaSalarios / salarios.size();

        System.out.println("\n--- PROMEDIO SALARIAL ---");
        System.out.println(promedioSalarial);


    }
}
