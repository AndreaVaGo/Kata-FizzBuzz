package dev.andrea;

// Clase que contiene la lógica del ejercicio FizzBuzz
public class FizzBuzz {


  public String convert(int number) {
    if (number % 3 == 0) {
        return "Fizz";
    } else if (number % 5 == 0) {
        return "Buzz";
    } else {
        return "No es divisible entre 3 ni entre 5";
    }
}

}
