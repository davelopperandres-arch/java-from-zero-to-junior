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

                    RegistroNuevo = true;

                    while (RegistroNuevo) {

                        entrada.nextLine();

                        System.out.println("Ingresar Nombre :");
                        String Nombre = entrada.nextLine();

                        System.out.println("Ingresar Cargo :");
                        String Cargo = entrada.nextLine();

                        System.out.println("Ingresar telefono :");
                        int Telefono = entrada.nextInt();

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
                    if (Nombres.size() == 0) {
                        System.out.println("No hay empleados registrados.");
                    } else {
                        System.out.println("--- LISTA DE EMPLEADOS REGISTRADOS ---");

                        for (int i = 0; i < Nombres.size(); i++) {
                            System.out.println(
                                    "Empleado " + (i + 1) + ": " +
                                            Nombres.get(i) + " | " +
                                            Cargos.get(i) + " | " +
                                            Telefonos.get(i) + " | $" +
                                            Salarios.get(i)
                            );
                        }
                    }
                    break;
                case 3:

                    if (Salarios.isEmpty()) {
                        System.out.println("No hay empleados registrados.");
                        System.out.println("Primero debe registrar empleados.");
                    } else {

                        double suma = 0;

                        for (int i = 0; i < Salarios.size(); i++) {
                            suma += Salarios.get(i);
                        }

                        double promedio = suma / Salarios.size();

                        System.out.println("===== PROMEDIO SALARIAL =====");
                        System.out.println("Total empleados: " + Salarios.size());
                        System.out.println("Promedio salarial: $" + promedio);
                    }

                    break;

                case 4:

                    if (Nombres.size() == 0) {
                        System.out.println("No hay empleados registrados.");
                    } else {
                        System.out.println("--- LISTA DE EMPLEADOS REGISTRADOS ---");

                        for (int i = 0; i < Nombres.size(); i++) {
                            System.out.println(
                                    "Empleado " + (i + 1) + ": " +
                                            Nombres.get(i) + " | " +
                                            Cargos.get(i) + " | " +
                                            Telefonos.get(i) + " | $" +
                                            Salarios.get(i)
                            );

                        }
                        System.out.println("INGRESAR EL NUMERO DE EMPLEADO A ELIMINAR :");
                        int numeroEmpleado = entrada.nextInt();

                        if (numeroEmpleado < 1 || numeroEmpleado > Nombres.size()) {
                            System.out.println("Numero de empleado invalido.");
                        } else {
                            int indice = numeroEmpleado - 1;
                            boolean eliminado = true;

                            while (eliminado) {
                                entrada.nextLine();
                                System.out.println("¿Esta seguro que desea eliminar al empleado " + Nombres.get(indice) +"||" + Cargos.get(indice)+ "? S/N");
                                String confirmacion = entrada.nextLine();

                                if (confirmacion.equalsIgnoreCase("S")) {
                                    eliminado = false;


                                    Nombres.remove(indice);
                                    Cargos.remove(indice);
                                    Telefonos.remove(indice);
                                    Salarios.remove(indice);

                                    System.out.println("Empleado eliminado exitosamente.");

                                } else if (confirmacion.equalsIgnoreCase("N")) {
                                    System.out.println("Eliminacion cancelada.");
                                    eliminado = false;
                                    break;
                                } else {
                                    System.out.println("Respuesta invalida. Por favor ingrese S o N.");
                                }
                            }
                        }
                    }
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
