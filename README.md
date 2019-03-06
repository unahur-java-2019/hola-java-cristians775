# Hola Java
> Proyecto de ejemplo para empezar a interactuar con el mundo de Java. 

### Software necesario
* [OpenJDK 8](https://openjdk.java.net/)
* [Maven](https://maven.apache.org/)
* [IntelliJ IDEA Community](https://www.jetbrains.com/idea/download/)

### Estructura del proyecto

```js
.
├── pom.xml   // Configuraciones de Maven
└── src
    ├── main  // Código productivo
    │   └── java
    │       └── ar
    │           └── edu
    │               └── unahur
    │                   ├── app
    │                   │   └── Aplicacion.java
    │                   └── modelo
    │                       └── Presentador.java
    |
    |
    |
    └── test  // Código de test
        └── java
            └── ar
                └── edu
                    └── unahur
                        └── modelo
                            └── PresentadorTest.java
```

### IntelliJ IDEA

Para importar el proyecto, basta con hacer clic en `Open` y seleccionar la dirección en la que está el repositorio. Hay que tener paciencia la primera vez que se hace esto porque el IDE necesita descargar varias cosas.

### Maven

Maven nos permite, entre otras cosas, interactuar con nuestra aplicación desde una terminal. En este ejemplo tenemos dos posibilidades: ejecutar los tests o ejecutar el `main`; los comandos para hacerlo se detallan abajo.

1) Correr los tests.

```
$ mvn test

[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running ar.edu.unahur.modelo.PresentadorTest
[ERROR] Tests run: 2, Failures: 1, Errors: 0, Skipped: 0, Time elapsed: 0.021 s <<< FAILURE! - in ar.edu.unahur.modelo.PresentadorTest
[ERROR] sabeSaludarAlMundo(ar.edu.unahur.modelo.PresentadorTest)  Time elapsed: 0.007 s  <<< FAILURE!
org.junit.ComparisonFailure: expected:<¡Hola Mundo[]!> but was:<¡Hola Mundo[ cruel]!>
	at ar.edu.unahur.modelo.PresentadorTest.sabeSaludarAlMundo(PresentadorTest.java:13)

[INFO] 
[INFO] Results:
[INFO] 
[ERROR] Failures: 
[ERROR]   PresentadorTest.sabeSaludarAlMundo:13 expected:<¡Hola Mundo[]!> but was:<¡Hola Mundo[ cruel]!>
[INFO] 
[ERROR] Tests run: 2, Failures: 1, Errors: 0, Skipped: 0

```

2) Ejecutar el `Aplicacion.main`.

```
$ mvn -q clean compile exec:java

¡Hola Mundo cruel!
```
