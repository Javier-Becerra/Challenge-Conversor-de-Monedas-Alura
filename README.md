# 💱 Challenge!!!... Conversor de Monedas en Java.

Aplicación de consola desarrollada en **Java** que permite convertir diferentes monedas utilizando tasas de cambio en tiempo real obtenidas desde la API de ExchangeRate-API.

El programa ofrece un menú interactivo que permite realizar conversiones entre varias monedas, consultar un historial de conversiones y acceder a un submenú con más opciones.

---

# 📌 Características.

* Conversión de monedas en tiempo real.
* Menú interactivo en consola.
* Historial de conversiones realizadas.
* Registro de conversiones con **fecha y hora**.
* Submenú con conversiones adicionales.
* Arquitectura organizada en clases (buenas prácticas de programación).

---

# 🪙 Monedas soportadas.

Actualmente el programa permite convertir entre:

* USD → Dólar estadounidense.
* ARS → Peso argentino.
* BRL → Real brasileño.
* COP → Peso colombiano.
* EUR → Euro.
* CLP → Peso chileno.

El diseño permite agregar fácilmente más monedas.

---

# 📋 Menú principal.

```text
***************************************************
Sea bienvenido/a al Conversor de Monedas =]

1) Dólar ==>> Peso Argentino.
2) Peso Argentino ==>> Dólar.
3) Dólar ==>> Real Brasileño.
4) Real Brasileño ==>> Dólar.
5) Dólar ==>> Peso Colombiano.
6) Peso Colombiano ==>> Dólar.
7) Otros.

8) Historial de conversiones
9) Salir.

Elija una opción válida:
***************************************************
```

---

# 📋 Submenú "Otros".

```text
************* MENÚ OTROS *************

Sea bienvenido/a al Conversor de Monedas =]

1) Euro ==>> Peso Chileno
2) Peso Chileno ==>> Euro
3) Dólar ==>> Peso Chileno
4) Peso Chileno ==>> Dólar

5) Volver al menú principal
6) Salir

Elija una opción válida:
**************************************
```

---

# 🕘 Historial de conversiones.

El sistema registra todas las conversiones realizadas mostrando:

* moneda origen.
* moneda destino.
* cantidad convertida.
* resultado.
* fecha y hora de la conversión.

Ejemplo:

```text
2026-03-09 19:42:11 | 100 USD -> 85000 ARS
2026-03-09 19:42:20 | 50 USD -> 247 BRL
2026-03-09 19:42:35 | 30 EUR -> 32 USD
```

El registro de tiempo se implementa utilizando la biblioteca **java.time**.

---

# ⚙️ Tecnologías utilizadas.

* Java 25.
* API REST.
* java.net.HttpURLConnection.
* org.json.
* java.time.
* IntelliJ IDEA.

---

# ▶️ Cómo ejecutar el proyecto.

1. Clone el repositorio.

2. Abra el proyecto en **IntelliJ IDEA**.

3. Agregue la dependencia `org.json` (si usas Maven).

```xml
<dependency>
 <groupId>org.json</groupId>
 <artifactId>json</artifactId>
 <version>20240303</version>
</dependency>
```

4. Ejecute la clase:

```
Principal.java
```

---

# 🚀 Mejoras futuras

* Soporte para más monedas
* Guardar historial en archivo JSON
* Selección dinámica de monedas desde la API
* Conversión múltiple entre cualquier moneda

---

# 👨‍💻 Autor

Proyecto desarrollado como práctica de **Java y uso de APIs REST** en programa Oracle Nex Education - ALURA.

---

# 📄 Licencia

Este proyecto es de uso educativo y libre para aprendizaje.
