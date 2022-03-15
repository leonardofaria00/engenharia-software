package br.edu.infnet.testdrivendevelopment.domain.service.temperatura;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl {
    public Double convertCelciusToFahrenheit(final Double celcius) {
        validateValues(celcius);

        return ((celcius * 1.8) + 32);
    }

    private void validateValues(final Double celcius) {
        if (celcius == null) {
            throw new NullPointerException("Valor não pode ser vazio!");
        }

    }
}
