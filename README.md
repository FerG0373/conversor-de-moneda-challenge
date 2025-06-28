<h1>Challenge Conversor de Monedas</h1>

Este es un proyecto del Programa Oracle Next Education, creado como parte de un desafío para seguir desarrollando las habilidades que adquirimos en el curso.

La aplicación permite gestionar una lista de nombres y realizar un sorteo para seleccionar al "amigo secreto" de manera aleatoria.


## Características ✨

- Conversión de monedas utilizando tasas de cambio actualizadas obtenidas de una API externa.
- Interfaz de consola amigable para el usuario, con un menú interactivo.
- Soporte para múltiples monedas.
- Modularidad en el diseño del código:
  - Clase para manejar la comunicación con la API.
  - Clase para procesar los datos de respuesta en formato JSON.
  - Clase para realizar las conversiones de monedas.
- Integración con la API ExchangeRate-API para obtener tasas de cambio confiables.


## Cómo usar la aplicación 🖱️

### 1. Clonar el repositorio:
```
https://github.com/FerG0373/amigo-secreto-challenge.git

```


### 2. Abrir el proyecto:
Abre el proyecto en tu IDE de preferencia (recomendado: IntelliJ IDEA).


### 3. Ejecutar la aplicación:
Compila y ejecuta la clase Main ubicada en src/com/aluracursos/conversormonedas/principal/Main.java.
La aplicación se ejecutará en la consola.

![Captura de pantalla](https://github.com/user-attachments/assets/0525c52f-5f3d-4dad-a15b-98702038f6f3)


### 4. Interactuar con el menú
Sigue los pasos a continuación para usar el conversor:

1. Selecciona una opción del menú según las monedas que deseas convertir:

    - Ejemplo: Opción 1 para convertir Dólar a Peso argentino.

2. Ingresa el monto que deseas convertir.

3. El resultado de la conversión se mostrará en la consola.


### 5. Salir del programa
Selecciona la opción 7 para salir de la aplicación.


## Tecnologías utilizadas 💻
- **Java**: Lenguaje principal y uso de la API HTTP para consumir servicios externos.
- **Exchange Rate API**: Servicio web externo utilizado para obtener las tasas de cambio de monedas en tiempo real.
- **HttpClient (java.net.http)**: Para realizar peticiones HTTP y obtener datos en tiempo real (tasas de cambio).
- **Gson**: Para parsear y generar datos en formato JSON.


## Autor 👨‍💻
Proyecto desarrollado por Fernando González, como parte del curso ONE.

¡Gracias!
