package api;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

/**
 * Clase encargada de comunicarse con la API de tasas de cambio.
 */
public class Conexion {

    private static final String API_KEY = "ee8ab86dec025e757743540f";
    private static final String BASE_URL =
            "https://v6.exchangerate-api.com/v6/";

    /**
     * Obtiene la tasa de cambio entre dos monedas.
     */
    public double obtenerTasa(String base, String destino) {

        try {

            String direccion = BASE_URL + API_KEY + "/latest/" + base;

            URL url = new URL(direccion);

            HttpURLConnection conexion =
                    (HttpURLConnection) url.openConnection();

            conexion.setRequestMethod("GET");

            BufferedReader reader =
                    new BufferedReader(
                            new InputStreamReader(
                                    conexion.getInputStream()
                            )
                    );

            StringBuilder respuesta = new StringBuilder();
            String linea;

            while ((linea = reader.readLine()) != null) {
                respuesta.append(linea);
            }

            reader.close();

            JSONObject json = new JSONObject(respuesta.toString());

            JSONObject tasas = json.getJSONObject("conversion_rates");

            return tasas.getDouble(destino);

        } catch (Exception e) {

            System.out.println("Error al obtener la tasa de cambio");
            return 0;
        }
    }
}