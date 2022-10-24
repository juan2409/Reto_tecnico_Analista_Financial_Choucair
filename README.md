# Guia Técnica Analista Financial Choucair
## Juan David Camacho Guevara

### Implementación
Se completó el reto dado de automatizar la página de Utest en su opción de registro con la finalidad de crear un nuevo usuario. Se utilizó el patrón screenplay con Serenity BDD y Cucumber siguiendo correctamente el modelo y estructura deseados del proyecto. La historia de usuario (y todo el código con su respectiva documentación) se encuentran en inglés.
La question planteada se completó de manera exitosa y el test pasó.

### Problemas encontrados y Soluciones
* A la hora de ingresar información en un dropdown menu como el mostrado abajo, se dificulta ingresar la información con solo una interacción o incluso dos. Por lo que se recurrió a usar 3, una para habilitar el input, la siguiente para escribir en el input y la última para seleccionar la primera opción del dropdown menu mediante su xpath completo.

![image](https://user-images.githubusercontent.com/81335997/197555074-857ad952-649d-4ca8-af42-033fcc382a72.png)

* Eventualmente, al realizar el test repetitivamente nos encontraremos con un captcha (cuyo propósito es precisamente evitar este tipo de automatizaciones) el cual no podemos completar y nos obligará a refrescar la página hasta que no aparesca o Google Chome nos lo auto complete.
