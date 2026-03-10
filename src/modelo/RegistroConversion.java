package modelo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Registro de conversión con fecha y hora.
 */
public class RegistroConversion {

    private String monedaOrigen;
    private String monedaDestino;
    private double cantidad;
    private double resultado;
    private LocalDateTime fechaHora;

    public RegistroConversion(String origen, String destino, double cantidad, double resultado) {
        this.monedaOrigen = origen;
        this.monedaDestino = destino;
        this.cantidad = cantidad;
        this.resultado = resultado;
        this.fechaHora = LocalDateTime.now();
    }

    @Override
    public String toString() {

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        return fechaHora.format(formato) +
                " | " + cantidad + " " + monedaOrigen +
                " -> " + resultado + " " + monedaDestino;
    }
}