import java.util.Scanner;
import java.util.ArrayList;

public class SistemaGestionEmpleadosMenu {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        boolean SistemaActivo = true;
        boolean RegistroNuevo = true;

        ArrayList <String> Nombres = new ArrayList<>();
        ArrayList <String> Cargos = new ArrayList<>();
        ArrayList <Integer> Telefonos = new ArrayList<>();
        ArrayList <Double> Salarios = new ArrayList<>();

        System.out.println("=== GESTOR DE EMPLEADOS DINAMICO ===");

        while (SistemaActivo){
            System.out.println("== MENU PRINCIPAL ==");

            System.out.println("1: REGISTAR EMPLEADO\n" +
                    "2: LISTA DE EMPLEADOS\n" +
                    "3: PROMEDIO SALARIAL\n" +
                    "4: ELIMINAR EMPLEADO" +
                    "\n5: SALIR" +
                    "\nINSERTAR OPCION : ");

            int opcion = entrada.nextInt();
            switch (opcion){

                case 1:
                    while (RegistroNuevo) {

                        entrada.nextLine();

                        System.out.println("Ingresar Nombre :");
                        String Nombre = entrada.nextLine();

                        System.out.println("Ingresar Cargo :");
                        String Cargo = entrada.nextLine();

                        System.out.println("Ingresar telefono :");
                        Integer Telefono = entrada.nextInt();

                        System.out.println("Ingresar Salario :");
                        double Salario = entrada.nextDouble();

                        entrada.nextLine();

                        Nombres.add(Nombre);
                        Cargos.add(Cargo);
                        Telefonos.add(Telefono);
                        Salarios.add(Salario);

                        System.out.println(" ¿ Quiere registrar un nuevo empleado ? S/N");
                        String Respuesta = entrada.nextLine();

                        if (Respuesta.equalsIgnoreCase("S")) {
                            RegistroNuevo = true;
                        } else {
                            RegistroNuevo = false;
                        }


                    }

                    break;

                case 2:
                    System.out.println("Entrando a base de datos de empleados...");
                    break;
                case 3:
                    System.out.println("Promedio salarial es...");
                    break;
                case 4:
                    System.out.println("Elije el empleado a eliminar...");
                    break;
                case 5:
                    SistemaActivo = false;
                    System.out.println("CERRANDO SISTEMA...");
                    break;
                default:
                    System.out.println("Ingresar un valor correcto");
            }
        }

    }
}
