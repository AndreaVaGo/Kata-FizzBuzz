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

}
