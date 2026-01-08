import java.util.Scanner;

public class DatosPersonales {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("=== SISTEMA DE DATOS PERSONALES ===");

        System.out.print("Ingrese su nombre: ");
        String nombre = entrada.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = entrada.nextInt();
        entrada.nextLine(); // Limpia el buffer

        System.out.print("Ingrese su correo: ");
        String correo = entrada.nextLine();

        System.out.print("Ingrese su ciudad: ");
        String ciudad = entrada.nextLine();

        System.out.println("Ingrese su profesion: ");
        String profesion = entrada.nextLine();

        System.out.println("Ingrese su numero: ");
        String numero = entrada.nextLine();

        System.out.println("\n DATOS REGISTRADOS");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Correo: " + correo);
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Profesion: " + profesion);
        System.out.println("Numero: " + numero);

        if (edad >= 18) {
            System.out.println("REGISTRADO COERRECTAMENTE");
        } else {
            System.out.println("NO TE PUEDES REGISTRAR");
        }

        entrada.close();
    }
}

