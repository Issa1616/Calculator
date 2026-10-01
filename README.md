# Calculadora en Java con Pilas y Colas

Calculadora desarrollada en **Java** como proyecto académico para practicar el uso de **estructuras de datos**, principalmente **pilas (Stack)** y **colas (Queue)**.

El proyecto permite ingresar expresiones matemáticas y procesarlas mediante estructuras de datos para obtener el resultado de las operaciones.

##  Características

-  Operaciones matemáticas.
-  Implementación de **pilas (Stack)**.
-  Implementación de **colas (Queue)**.
-  Interfaz para ingresar las operaciones.
-  Obtención del resultado de la expresión.

## Estructuras de datos

###  Pila (Stack)

La pila trabaja bajo el principio **LIFO (Last In, First Out)**, donde el último elemento agregado es el primero en salir.

En la calculadora se utiliza para manejar elementos de las expresiones matemáticas, como operadores y otros valores necesarios durante su procesamiento.

```text
       ┌─────┐
       │  *  │ ← Último elemento
       ├─────┤
       │  +  │
       ├─────┤
       │  -  │
       └─────┘
```

###  Cola (Queue)

La cola trabaja bajo el principio **FIFO (First In, First Out)**, donde el primer elemento agregado es el primero en salir.

Se utiliza para mantener los elementos de la expresión en el orden en que fueron procesados.

```text
Frente → [ 3 ] [ + ] [ 5 ] [ * ] [ 2 ] ← Final
           ↑
       Primero en salir
```

##  Funcionamiento

El funcionamiento general del programa puede representarse de la siguiente manera:

```text
Expresión matemática
        ↓
Separación de elementos
        ↓
      Queue
        ↓
Procesamiento de operadores
        ↓
      Stack
        ↓
Evaluación
        ↓
    Resultado
```

Las estructuras de datos permiten organizar los elementos y respetar el orden necesario para procesar las operaciones matemáticas.

Tecnologías

-Java
-Java Collections Framework
-Stack
-Queue
-Programación Orientada a Objetos

 Ejecución

Para ejecutar el proyecto:

Clonar el repositorio:

git clone URL_DEL_REPOSITORIO

Abrir el proyecto en un IDE compatible con Java, como IntelliJ IDEA, NetBeans o Eclipse.

Compilar el proyecto.

Ejecutar la clase principal.

Ingresar la expresión matemática.

Consultar el resultado.

 Objetivo del proyecto

El objetivo principal fue aplicar de manera práctica los conceptos de pilas y colas mediante el desarrollo de una calculadora en Java.

A través del proyecto se practicaron conceptos como:

Estructuras LIFO y FIFO.

Manejo de datos mediante pilas.

Manejo de datos mediante colas.

Procesamiento de expresiones matemáticas.

Uso de clases y objetos en Java.

Organización y recorrido de estructuras de datos.

 Contexto académico

Proyecto realizado como parte de mi formación en Ingeniería en Sistemas Computacionales, con el propósito de reforzar los conocimientos de la materia de Estructuras de Datos mediante un proyecto práctico.

 Autora

Issa Victoria Aguilar Soto

Ingeniería en Sistemas Computacionales

GitHub

⭐ Proyecto académico desarrollado en Java para practicar estructuras de datos.
