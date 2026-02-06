Informe de Práctica: El Formiguero y La Rebelión
1. Introducción
   Este proyecto consiste en una aplicación Java para gestionar datos de programas de televisión, sus empleados e invitados, con el objetivo de centralizar la información de manera objetiva.

2. Estructura del Código
   El sistema se basa en cuatro clases principales:


Cadena: Gestiona una lista de programas mediante una relación de agregación.


Programa: Actúa como eje central, conteniendo las listas de empleados e invitados.


Empleado: Incluye un sistema de ID autogenerado (formato EP000) y validación de cargos.


Invitado: Registra las visitas, solicitando la fecha al usuario mediante consola.

3. Implementación Técnica
   Relaciones entre clases

Composición: Los Empleado e Invitado están ligados al ciclo de vida de Programa.


Asociación Bidireccional: Cadena y Programa están conectados pero son independientes.

Métodos Extra
Se han implementado métodos para:

Rastrear cuántas veces ha venido un invitado.

Comparar en qué programa estuvo antes un invitado específico.

Filtrar invitados por temporada.

4. Plan de Pruebas (JUnit5)
   Se han realizado pruebas unitarias para garantizar la calidad del código:

Test de Empleado: Verificación de la generación correlativa de IDs y el filtrado de cargos no permitidos.

Test de Programa: Comprobación de la inserción de invitados y búsqueda en listas.

5. Documentación JavaDoc
   Toda la lógica de negocio ha sido documentada siguiendo el estándar JavaDoc. Se han incluido etiquetas @param y @return en todos los métodos para facilitar la legibilidad y el mantenimiento.

6. Diagrama de Clases UML
   El diagrama ha sido generado con PlantUML, representando las relaciones de composición y agregación exigidas.