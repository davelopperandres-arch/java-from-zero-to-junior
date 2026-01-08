import java.util.Scanner;

public class NominaBasica {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        boolean continuar = true;

        System.out.println("=== SISTEMA DE NÓMINA BÁSICA ===");

        while (continuar) {

            System.out.print("Nombre del empleado: ");
            String nombre = entrada.nextLine();

            System.out.print("Cargo del empleado: ");
            String cargo = entrada.nextLine();

            System.out.print("Horas trabajadas: ");
            int horasTrabajadas = entrada.nextInt();

            System.out.print("Valor por hora: ");
            double valorHora = entrada.nextDouble();

            double salarioBase = horasTrabajadas * valorHora;
            double horasExtras = 0;
            double pagoExtras = 0;

            if (horasTrabajadas > 40) {
                horasExtras = horasTrabajadas - 40;
                pagoExtras = horasExtras * (valorHora * 1.5);
                salarioBase = 40 * valorHora;
            }

            double salarioBruto = salarioBase + pagoExtras;
            double descuentoSalud = salarioBruto * 0.04;
            double descuentoPension = salarioBruto * 0.04;
            double salarioNeto = salarioBruto - descuentoSalud - descuentoPension;

            System.out.println("\n--- RESUMEN DE NÓMINA ---");
            System.out.println("Empleado: " + nombre);
            System.out.println("Cargo: " + cargo);
            System.out.println("Horas trabajadas: " + horasTrabajadas);
            System.out.println("Salario base: $" + salarioBase);
            System.out.println("Pago horas extras: $" + pagoExtras);
            System.out.println("Descuento salud: $" + descuentoSalud);
            System.out.println("Descuento pensión: $" + descuentoPension);
            System.out.println("SALARIO NETO A PAGAR: $" + salarioNeto);


            entrada.nextLine();

            System.out.print("\n¿Quieres ingresar un nuevo empleado? (S/N): ");
            String respuesta = entrada.nextLine();

            if (respuesta.equalsIgnoreCase("N")) {
                continuar = false;
            }

            System.out.println();
        }

        entrada.close();
        System.out.println("Programa finalizado.");
    }
}


