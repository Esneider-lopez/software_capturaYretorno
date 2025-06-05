import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Persona[] personas = new Persona[5];

        System.out.println("Captura de datos de 5 personas:");

        for (int i = 0; i < personas.length; i++) {
            System.out.println("Persona #" + (i + 1));
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Apellido: ");
            String apellido = scanner.nextLine();
            System.out.print("Género (Masculino/Femenino): ");
            String genero = scanner.nextLine();
            System.out.print("Edad: ");
            int edad = Integer.parseInt(scanner.nextLine());

            personas[i] = new Persona(nombre, apellido, genero, edad);
            System.out.println();
        }

        // a) Mostrar nombre y genero de las 5 personas
        System.out.println("Nombre y género de las personas:");
        for (Persona p : personas) {
            p.mostrarNombreYGenero();
        }

        // b) Promedio de edades
        int sumaEdades = 0;
        for (Persona p : personas) {
            sumaEdades += p.getEdad();
        }
        double promedio = (double) sumaEdades / personas.length;
        System.out.println("\nPromedio de edades: " + promedio);

        // c) Cantidad de genero Masculino y Femenino
        int contadorMasculino = 0;
        int contadorFemenino = 0;

        for (Persona p : personas) {
            if (p.getGenero().equalsIgnoreCase("Masculino")) {
                contadorMasculino++;
            } else if (p.getGenero().equalsIgnoreCase("Femenino")) {
                contadorFemenino++;
            }
        }

        System.out.println("Cantidad de personas con género Masculino: " + contadorMasculino);
        System.out.println("Cantidad de personas con género Femenino: " + contadorFemenino);
    }
}

