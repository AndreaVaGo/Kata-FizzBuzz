package dev.andrea;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    // Test que comprueba que cuando el número es divisible por 3, se devuelve "Fizz"
    @Test
    public void shouldReturnFizz() {

        // Creamos una instancia (un objeto) de la clase FizzBuzz para poder usar sus métodos
        FizzBuzz fizzBuzz = new FizzBuzz();

        // Llamamos al método convert() pasándole el número 3, y guardamos lo que devuelve
        String resultado = fizzBuzz.convert(3);

        // Comprobamos que lo esperado ("Fizz") coincide con lo obtenido (resultado)
        assertEquals("Fizz", resultado);
    }

}
