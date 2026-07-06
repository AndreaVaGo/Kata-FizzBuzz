package dev.andrea;

// Clase que contiene la lógica del ejercicio FizzBuzz
public class FizzBuzz {

    // Método que recibe un número y devuelve el resultado según las reglas de FizzBuzz
    public String convert(int number) {

        // Convertimos el número a texto para poder comprobar si contiene ciertos dígitos
        String numberAsText = String.valueOf(number);

        // Comprobamos si es divisible por 3 o contiene el dígito 3
        boolean isFizz = number % 3 == 0 || numberAsText.contains("3");

        // Comprobamos si es divisible por 5 o contiene el dígito 5
        boolean isBuzz = number % 5 == 0 || numberAsText.contains("5");

        if (isFizz && isBuzz) {
            return "FizzBuzz";
        } else if (isFizz) {
            return "Fizz";
        } else if (isBuzz) {
            return "Buzz";
        } else {
            return numberAsText;
        }
    }

}
