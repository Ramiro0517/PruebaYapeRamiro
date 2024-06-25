# PruebaYape

## Descripción

Esta aplicación utiliza la API de Spoonacular para obtener las recetas y la información relacionada con las recetas. La aplicación muestra una
lista de recetas en la pantalla de inicio y permite al usuario buscar recetas por nombre. Cuando el usuario selecciona 
una receta de la lista, se muestra la información detallada de la receta en la pantalla de detalles. 
La pantalla de detalles también incluye un botón que lleva al usuario a la pantalla de mapa, 
donde se muestra la ubicación geográfica del origen de la receta.

## Características

- Lista y buscador de recetas (Home Screen)
- Detalles de la receta seleccionada (Detail Screen)
- Mapa de geolocalización del origen de la receta (Map Screen)

## Decisiones de diseño

### Patrón de diseño MVVM

Este proyecto utiliza el patrón de diseño Model-View-ViewModel (MVVM). Este patrón se eligió por su capacidad para separar la lógica de la interfaz de usuario de la lógica de negocio, lo que facilita la prueba y el mantenimiento del código.

### Diferenciación de capas

El código del proyecto está organizado en diferentes capas para separar las responsabilidades y hacer que el código sea más 
fácil de entender y mantener. Las capas incluyen la capa de presentación (para la interfaz de usuario), 
la capa de dominio (para la lógica de negocio) y la capa de datos (para la persistencia de datos).

## Librerías externas utilizadas

- **Dagger Hilt**: Utilizado para la inyección de dependencias.
- **Retrofit**: Utilizado para las llamadas a la API.
- **Picasso**: Utilizado para la carga y el almacenamiento en caché de imágenes.
- **Google Maps SDK**: Utilizado para mostrar el mapa y los marcadores en la pantalla del mapa.

## Cómo ejecutar el proyecto

La ejecución es sencilla y se puede realizar solo instalando el apk en un dispositivo Android o emulador.

## Autor

Ramiro Choque Velasquez