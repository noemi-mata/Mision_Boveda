# Mision\_Boveda

Trabajo en equipo





1\. ¿Por qué Boveda es una interfaz y no una clase? ¿Qué ventaja da?

Porque la bóveda solo define los métodos que debe tener, no cómo funciona por dentro. Al ser interfaz puedo crear diferentes tipos de bóvedas sin cambiar el código que las usa. Básicamente me da flexibilidad: la interfaz marca las reglas y las clases deciden cómo implementarlas.



2\. ¿Qué pasaría en factorial si olvidas el caso base?

La función nunca se detendría. Se llamaría a sí misma una y otra vez hasta que el programa truene con un StackOverflow. El caso base es lo que corta la recursión, sin él la función se queda en un ciclo infinito.



3\. ¿Qué ventaja tuvo usar genéricos (<T>) en lugar de Object?

Con genéricos puedo crear bóvedas de cualquier tipo sin hacer cast y sin riesgo de meter un tipo incorrecto. El código queda más seguro y más limpio. Además, puedo tener una bóveda de String y otra de Integer sin cambiar nada en la clase.

