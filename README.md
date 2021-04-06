# Pila Estática

## Table of contents
* [Información General](#Información-General)
* [Leguajes de programación](#Leguajes-de-programación)
* [Explicación](#Explicación)
* [Desarrollo](#Desarrollo)

## Información General
 Proyecto para la Universidad Estatal a Distancia de Costa Rica en el cual se aplica el concepto de pila estática.
 
## Leguajes de programación
* JAVA.

## Explicación:
Una pila es una estructura de datos donde el último elemento en ingresar es el primero en salir (LIFO: Last in, First out). Por ejemplo, podemos mencionar una serie de platos sucios apilados formando una torre, donde el último plato que se coloca en la pila, el de encima, será el primero en ser lavado, y así sucesivamente hasta llegar al plato que quedó al fondo, el primero en llegar, quien precisamente será el último en ser lavado.

## Desarrollo:
Se deberá crear una aplicación Java, donde el usuario podrá utilizar un menú con las siguientes opciones:
1. Crear pila. En esta opción se le debe pedir al usuario el tamaño de la misma. Utilizar un vector de clases "Película", la cual tendrá como atributos:
* Identificador (int)
* Nombre (string)
* Director (string)
* Duración (int)
2. Apilar. Se le debe pedir al usuario que digite los atributos de la clase "Película" que se incluirá en la pila. El campo Identificador debe ser único.
3. Desapilar. El usuario sacará un objeto “película" de la pila (se muestra su información y se elimina).
4. Mostrar tamaño actual de la pila. No se refiere al tamaño con que se definió en su creación, sino a la cantidad de valores actuales en la pila.
5. ¿Está vacía la pila?. Indicar sí o no.
6. Mostrar elementos actuales en la pila.
7. Vaciar pila completa.
8. Mostrar valor de una posición determinada. El usuario digita una posición de la pila, y se muestran los atributos de la clase correspondiente, donde cero es la posición del primer valor ingresado. Debe validarse si la posición indicada no tiene valor asociado o si la posición es mayor al tamaño de la pila.
9. Terminar.

Este programa deberá realizarse en modo gráfico, es decir, utilizando pantallas con controles UI para solicitar y mostrar los datos. No se debe implementar utilizando la consola. 

La muestra de datos y su ingreso deberá realizarse en la misma pantalla y no utilizando ventanas de tipo pop-up. 

Deben incluirse validaciones para que el programa siempre se ejecute correctamente y sin errores.
