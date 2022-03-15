package br.edu.infnet.testdrivendevelopment;

import br.edu.infnet.testdrivendevelopment.domain.service.Calculadora;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@SpringBootTest
class ApplicationTests {

    @BeforeAll
    static void init() {
        //TODO
    }

    @BeforeEach
    public void setUp() {
        //TODO
    }

    @Test
    void contextLoads() {
        //TODO
    }

    @Test
    @DisplayName("Converte de Celcius para Fahrenheit")
    public void converteDeCelsilsParaFahrenheit() {
        final Calculadora calculadora = new Calculadora();

        Double valor = calculadora.convertCelciusToFahrenheit(100.0);

        assertEquals(valor, Double.valueOf(212.00));
    }

    @Test
    @DisplayName("Converte de Celcius para Fahrenheit com Nulo")
    public void converteDeCelciusParaFahrenheitComNull() {
        final Calculadora calculadora = new Calculadora();

        assertThrows(NullPointerException.class, () -> calculadora.convertCelciusToFahrenheit(null));

    }


    @AfterAll
    static void destroy() {
        //TODO
    }

}
