package dev.andrea;

// Clase que contiene la lógica del ejercicio FizzBuzz
public class FizzBuzz {

    // Método que recibe un número y devuelve el resultado según las reglas de FizzBuzz
    public String convert(int number) {

        // Si es divisible por 3 y por 5 a la vez, devolvemos "FizzBuzz"
        // (esta condición va primero, porque si no, nunca se llegaría a comprobar)
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            // Si solo es divisible por 3, devolvemos "Fizz"
            return "Fizz";
        } else if (number % 5 == 0) {
            // Si solo es divisible por 5, devolvemos "Buzz"
            return "Buzz";
        } else {
            // Si no se cumple ninguna regla, devolvemos el propio número convertido a texto
            return String.valueOf(number);
        }
    }

}
