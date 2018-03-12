Sample Tests
============

Un pequeño proyecto en donde se aplican pruebas unitarias e instrumentadas
usando JUnit, Roboelectric, Orchestrator y Espresso.

Para correr las pruebas
-----------------------

Escribe en la consola de comandos gradlew jacocoTestCoverageVerification.

Test Coverage
-------------

Para verificar cuanto porcentaje de nuestro código es cubierto por las pruebas
en el proyecto debemos dirigirno a
app\\build\\reports\\jacoco\\jacocoTestReport\\html y abrir el archivo
index.html (todo esto es generado automáticamente).

El test coverage esta configurado para evitar un build exitosa si no se cubre el
80% de nuestro código.
