# 8_Entrada_Salida
Gestionar flujo, lectura y escritura de ficheros. Creación de interfaces gráficas sencillas.

## Prácticas
Prácticas de entrada y salida realizadas en clase.

## Ficheros

Tenemos varios ficheros (número indeterminado) en el directorio raíz de nuestro proyecto.  
Desde una aplicación Java mostrar sus nombres, fechas de modificación, permisos y tamaño.  
Tu aplicación debe crear una nueva carpeta y mover todos los **ficheros** (carpetas no) del raíz (EXCEPTO pom.xml) al nuevo directorio.  
Por último, crea un fichero en el directorio raíz cuyo título sea "ficherosMovidos.txt". Aún no vamos a gestionar la información que contienen por lo que en este fichero no escribiremos nada.  
Modifica todos los permisos de este fichero a false.
~~~
85/100
~~~

## Edades

Se pide generar un fichero con 50 personas aleatorias donde se muestre nombre-edad  
A partir de ese **fichero** realizar las lecturas necesarias para **obtener las edades** y **calcular la edad media.**  
**No calcular utilizando la lista de personas!! Calcular leyendo el fichero.**

~~~
He creado el archivo pero no he podido leer las edades.
~~~


## Binario
Prácticas de clase de flujo binario. Lectura y escritura. Objeto **Serializable**.

## InterfacesGraficas_Practica
**Formulario**  
Práctica de un formulario creada en clase.

## InterfacesGraficas_Ejercicios
**HorasExtras**   
**LectorFicheros**  
**ProductosHigiene**


## InterfacesGráficas_Simulacro
1. Diseña una interfaz en la que el usuario deba introducir la ruta de dos ficheros de texto y una ruta directorio donde se va a almacenar un fichero como la unión de los dos ficheros introducidos. La funcionalidad se divide en 3 botones: el primero **borrar** todas las rutas introducidas; **comprobar** si existe algún error, por ejemplo los ficheros no existen o no son legibles, la ruta no existe...; **copiar** que (si no hay fallos) genera un fichero en el directorio introducido con los nombres de los ficheros introducidos separados por guion bajo y copia en él el contenido de ambos ficheros.  
**Recomendación:** haz primero la funcionalidad y después la metes en la interfaz gráfica.  
  
  
  
2. Contador de pulsaciones.  
Para **ficheros**: Añadir un botón Registrar que escriba en un fichero una línea cada vez que se pulse el botón registrar:  
Fecha en formato corto (Date);10;2  
Donde el segundo campo representa el número de pulsaciones del primer botón y el segundo campo las pulsaciones del segundo.  
+**Para 10**: escribe los datos en un fichero binario.  
UTF INT INT  
Crea otra app para leer el fichero binario y mostrar los datos por consola.  
  
  
3. Un sistema de login en el que nombre usuario y contraseña están registradas en el programa de forma textual. (Esto es una mala práctica, las contraseñas se cifran pero ahora lo vamos a poner así) y el bottón aceptar comprueba el acceso. El botón cancelar limpia y reinicia la funcionalidad.  
Para **ficheros**: si se pulsa el botón aceptar y el acceso no es válido se debe registrar la fecha en formato corto (Date), el usuario introducido y la contraseña introducida.  
  
  
4. +**Difícil**. Formulario que calcula la edad introducida.  
Para **ficheros**: si la edad introducida es menor de 18 años guarda todos los datos en un fichero "menores.txt" en caso contrario se guarda la información en un fichero "mayores.txt"
