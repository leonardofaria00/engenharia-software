package br.edu.infnet.testdrivendevelopment.domain.service;

public class Calculadora {
    public Double convertCelciusToFahrenheit(final Double celsius) {
        validateValues(celsius);

        return ((celsius * 1.8) + 32);
    }

    private void validateValues(final Double celsius) {
        if (celsius == null) {
            throw new NullPointerException("Valor não pode ser vazio!");
        }

    }
}
