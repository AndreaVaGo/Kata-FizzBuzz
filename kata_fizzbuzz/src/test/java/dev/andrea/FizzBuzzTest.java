package dev.andrea;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    // Test que comprueba que cuando el número es divisible por 3, se devuelve "Fizz"
    @Test
    public void shouldReturnFizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String resultado = fizzBuzz.convert(3);
        assertEquals("Fizz", resultado);
    }

    // Test que comprueba que cuando el número es divisible por 5, se devuelve "Buzz"
    @Test
    public void shouldReturnBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String resultado = fizzBuzz.convert(5);
        assertEquals("Buzz", resultado);
    }

    // Test que comprueba que cuando el número es divisible por 3 y por 5, se devuelve "FizzBuzz"
    @Test
    public void shouldReturnFizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String resultado = fizzBuzz.convert(15);
        assertEquals("FizzBuzz", resultado);
    }

    // Test que comprueba que cuando el número no es divisible ni por 3 ni por 5, se devuelve el propio número
    @Test
    public void shouldReturnTheNumber() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String resultado = fizzBuzz.convert(7);
        assertEquals("7", resultado);
    }

}
