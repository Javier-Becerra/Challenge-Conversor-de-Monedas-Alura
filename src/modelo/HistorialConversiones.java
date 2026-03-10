package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que almacena el historial de conversiones.
 */
public class HistorialConversiones {

    private List<RegistroConversion> historial = new ArrayList<>();

    /**
     * Agrega una conversión al historial.
     */
    public void agregarRegistro(RegistroConversion registro) {
        historial.add(registro);
    }

    /**
     * Muestra el historial completo.
     */
    public void mostrarHistorial() {

        if (historial.isEmpty()) {
            System.out.println("No existen conversiones recientes registradas.");
            return;
        }

        System.out.println("\n===== HISTORIAL DE CONVERSIONES =====");

        for (RegistroConversion r : historial) {
            System.out.println(r);
        }

        System.out.println("=====================================\n");
    }
}