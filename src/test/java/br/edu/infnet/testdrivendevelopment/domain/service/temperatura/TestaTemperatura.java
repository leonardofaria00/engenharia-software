package br.edu.infnet.testdrivendevelopment.domain.service.temperatura;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@SpringBootTest
public class TestaTemperatura {

    private final CalculatorServiceImpl calculatorServiceImpl;

    @Autowired
    public TestaTemperatura(CalculatorServiceImpl calculatorServiceImpl) {
        this.calculatorServiceImpl = calculatorServiceImpl;
    }


    @Test
    @DisplayName("Converte de Celcius para Fahrenheit")
    public void converteDeCelciusParaFahrenheit() {

        Double valor = calculatorServiceImpl.convertCelciusToFahrenheit(100.0);

        assertEquals(valor, Double.valueOf(212.00));
    }

    @Test
    @DisplayName("Converte de Celcius para Fahrenheit com Nulo")
    public void converteDeCelciusParaFahrenheitComNull() {

        assertThrows(NullPointerException.class, () -> calculatorServiceImpl.convertCelciusToFahrenheit(null));

    }
}
