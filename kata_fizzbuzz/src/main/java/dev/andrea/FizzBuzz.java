package dev.andrea;

// Clase que contiene la lógica del ejercicio FizzBuzz
public class FizzBuzz {

    // Método que recibe un número y devuelve el resultado según las reglas de FizzBuzz
    public String convert(int number) {

        // Si el resto de dividir number entre 3 es 0, el número es divisible por 3
        if (number % 3 == 0) {
            // Devolvemos "Fizz" cuando se cumple la condición anterior
            return "Fizz";
        } else {
            // Caso temporal: de momento, si no es divisible por 3, devolvemos este texto
            // (esto se sustituirá cuando añadamos las reglas de Buzz y del número normal)
            return "No es divisible entre 3";
        }

    }

}
