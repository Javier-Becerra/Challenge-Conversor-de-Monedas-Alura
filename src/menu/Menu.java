package menu;

import calculos.Conversor;
import modelo.HistorialConversiones;

import java.util.Scanner;

/**
 * Clase encargada de mostrar el menu y recibir
 * las opciones ingresadas por el usuario.
 */
public class Menu {

    private Scanner scanner = new Scanner(System.in);
    private HistorialConversiones historial = new HistorialConversiones();
    private Conversor conversor = new Conversor(historial);

    /**
     * Metodo principal que ejecuta el menu en bucle.
     */
    public void iniciar() {

        int opcion = 0;

        while (opcion != 9) {

            mostrarMenu();
            opcion = scanner.nextInt();

            if (opcion == 9) {
                System.out.println("Gracias por usar el conversor de monedas.");
                break;
            }
            // Validacion de entrada.
            if (opcion < 1 || opcion > 9) {
                System.out.println("Opción no válida. Intente nuevamente.\n");
                continue; // vuelve al inicio del ciclo
            }
            // Ingresa al sub-menu Otros.
            if (opcion == 7) {
                menuOtros();
                continue;
            }
            // Muestra historial de conversiones.
            if (opcion == 8) {
                historial.mostrarHistorial();
                continue;
            }
            System.out.print("Ingrese el valor que deseas convertir: ");
            double cantidad = scanner.nextDouble();

            ejecutarConversion(opcion, cantidad);
        }
    }

    /**
     * Muestra el menú del conversor principal en pantalla.
     */
    private void mostrarMenu() {

        System.out.println("***************************************************");
        System.out.println("Sea bienvenido/a al Conversor de Monedas =]");
        System.out.println();
        System.out.println("1) Dólar ==>> Peso Argentino.");
        System.out.println("2) Peso Argentino ==>> Dólar.");
        System.out.println("3) Dólar ==>> Real Brasileño.");
        System.out.println("4) Real Brasileño ==>> Dólar.");
        System.out.println("5) Dólar ==>> Peso Colombiano.");
        System.out.println("6) Peso Colombiano ==>> Dólar.");
        System.out.println("7) Otros.");
        System.out.println();
        System.out.println("8) Historial de conversiones");
        System.out.println("9) Salir.");
        System.out.println();
        System.out.println("Elija una opción válida:");
        System.out.println("***************************************************");
    }

    /**
     * Muestra el menú Otros en pantalla.
     */
    private void menuOtros() {

        int opcion = 0;

        while (opcion != 5) {

            System.out.println("\n***************** MENÚ OTROS *****************");
            System.out.println("Sea bienvenido/a al Conversor de Monedas =]");
            System.out.println();
            System.out.println("1) Euro ==>> Peso Chileno");
            System.out.println("2) Peso Chileno ==>> Euro");
            System.out.println("3) Dólar ==>> Peso Chileno");
            System.out.println("4) Peso Chileno ==>> Dólar");
            System.out.println();
            System.out.println("5) Volver al menú principal");
            System.out.println("6) Salir");
            System.out.println();
            System.out.println("Elija una opción válida:");
            System.out.println("**********************************************");

            opcion = scanner.nextInt();

            if (opcion < 1 || opcion > 6) {
                System.out.println("Opción no válida. Intente nuevamente.\n");
                continue;
            }

            if (opcion == 5) {
                return; // vuelve al menú principal
            }

            if (opcion == 6) {
                System.out.println("Gracias por usar el conversor de monedas.");
                System.exit(0);
            }

            System.out.print("Ingrese la cantidad: ");
            double cantidad = scanner.nextDouble();

            ejecutarConversionOtros(opcion, cantidad);
        }
    }

    /**
     * Ejecuta la conversion segun la opcion elegida en menu principal.
     */
    private void ejecutarConversion(int opcion, double cantidad) {

        double resultado;

        switch (opcion) {

            case 1:
                resultado = conversor.convertir(cantidad, "USD", "ARS");
                System.out.println("Resultado: " + resultado + " ARS");
                break;

            case 2:
                resultado = conversor.convertir(cantidad, "ARS", "USD");
                System.out.println("Resultado: " + resultado + " USD");
                break;

            case 3:
                resultado = conversor.convertir(cantidad, "USD", "BRL");
                System.out.println("Resultado: " + resultado + " BRL");
                break;

            case 4:
                resultado = conversor.convertir(cantidad, "BRL", "USD");
                System.out.println("Resultado: " + resultado + " USD");
                break;

            case 5:
                resultado = conversor.convertir(cantidad, "USD", "COP");
                System.out.println("Resultado: " + resultado + " COP");
                break;

            case 6:
                resultado = conversor.convertir(cantidad, "COP", "USD");
                System.out.println("Resultado: " + resultado + " USD");
                break;

            default:
                System.out.println("Opción inválida.");
        }
    }

    /**
     * Ejecuta la conversion segun la opcion elegida en el sub-menu Otros.
     */
    private void ejecutarConversionOtros(int opcion, double cantidad) {

        double resultado;

        switch (opcion) {

            case 1:
                resultado = conversor.convertir(cantidad, "EUR", "CLP");
                System.out.println("Resultado: " + resultado + " CLP");
                break;

            case 2:
                resultado = conversor.convertir(cantidad, "CLP", "EUR");
                System.out.println("Resultado: " + resultado + " EUR");
                break;

            case 3:
                resultado = conversor.convertir(cantidad, "USD", "CLP");
                System.out.println("Resultado: " + resultado + " CLP");
                break;

            case 4:
                resultado = conversor.convertir(cantidad, "CLP", "USD");
                System.out.println("Resultado: " + resultado + " USD");
                break;
        }

        System.out.println();
    }
}
