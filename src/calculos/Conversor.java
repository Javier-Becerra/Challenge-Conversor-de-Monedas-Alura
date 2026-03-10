package calculos;

import api.Conexion;
import modelo.HistorialConversiones;
import modelo.RegistroConversion;

/**
 * Clase encargada de realizar la conversion.
 */
public class Conversor {

    private Conexion api = new Conexion();
    private HistorialConversiones historial;

    public Conversor(HistorialConversiones historial) {
        this.historial = historial;
    }

    /**
     * Convierte una cantidad entre dos monedas y guarda registro.
     */
    public double convertir(double cantidad, String base, String destino) {

        double tasa = api.obtenerTasa(base, destino);
        double resultado = cantidad * tasa;

        RegistroConversion registro =
                new RegistroConversion(base, destino, cantidad, resultado);

        historial.agregarRegistro(registro);

        return resultado;
    }
}