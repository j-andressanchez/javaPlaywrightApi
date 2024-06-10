# Pruebas de API con Java, Playwright, Serenity y Cucumber

## Descripción

Este proyecto es un marco de pruebas automatizadas diseñado para verificar la funcionalidad de las APIs utilizando Java, Playwright, Serenity y Cucumber. El marco sigue el patrón de diseño Page Object Model (POM) para mantener la estructura del código organizada y fácil de mantener.

## Características Principales

- **Integración con Playwright**: Utiliza Playwright para simular las llamadas a la API y realizar pruebas de integración.
- **Automatización con Serenity**: Serenity se utiliza para gestionar y visualizar los resultados de las pruebas, proporcionando informes detallados y fáciles de entender.
- **Cucumber para BDD**: Cucumber se emplea para definir las pruebas en un lenguaje natural, lo que facilita la colaboración entre desarrolladores y equipos de negocio.
- **Patrón Page Object Model (POM)**: Estructura el código para facilitar la reutilización y el mantenimiento de los scripts de prueba.

## Tecnologías Utilizadas

- **Java**: Lenguaje de programación principal.
- **Playwright**: Herramienta para la automatización de pruebas de API.
- **Serenity**: Framework de prueba para generar informes y reportes detallados.
- **Cucumber**: Herramienta para la escritura de pruebas basadas en comportamiento (BDD).
- **Junit**: Framework de pruebas unitarias para ejecutar las pruebas.

## Estructura del Proyecto

- **features**: Contiene los archivos de características escritos en Gherkin.
- **definitions**: Define los pasos de los escenarios de prueba.
- **steps**: Implementa la lógica de los pasos definidos en los features.
- **pages**: Contiene las clases que manejan la lógica más baja de las pruebas, siguiendo el patrón POM.
- **utils**: Clases utilitarias para la configuración y manejo de la API.
