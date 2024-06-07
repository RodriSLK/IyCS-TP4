package org.example.Entities;

public class ConvertidorDeUnidades {

    // Métodos para convertir entre metros y pulgadas

    public double metroAPulgada(double metro) {
        return metro * 39.3701;
    }

    public double pulgadaAMetro(double pulgada) {
        return pulgada / 39.3701;
    }

    // Métodos para convertir entre metros y millas

    public double metroAMilla(double metro) {
        return metro * 0.000621371;
    }

    public double millaAMetro(double milla) {
        return milla * 1609.34;
    }

    // Métodos para convertir entre pulgadas y millas

    public double pulgadaAMilla(double pulgada) {
        return pulgada * 0.0000157828;
    }

    public double millaAPulgada(double milla) {
        return milla * 63360;
    }
}

