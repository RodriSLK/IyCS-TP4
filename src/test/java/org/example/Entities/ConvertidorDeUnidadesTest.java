package org.example.Entities;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConvertidorDeUnidadesTest {
    private final ConvertidorDeUnidades convertidor = new ConvertidorDeUnidades();

    //Test Pau
    @Test
    public void pruebaMillaAMetro_valorPositivo() {
        assertEquals(1609.34, convertidor.millaAMetro(1), 0.0001);
    }

    @Test
    public void pruebaMillaAMetro_cero() {
        assertEquals(0, convertidor.millaAMetro(0), 0.0001);
    }

    @Test
    public void pruebaMillaAMetro_valorNegativo() {
        assertEquals(-1609.34, convertidor.millaAMetro(-1), 0.0001);
    }


    //Test Rodri
    @Test
    public void pruebaMultiplesMetrosAMillas_valorEntero() {
        assertEquals(0.001242742, convertidor.metroAMilla(2), 0.000000001);
    }

    @Test
    public void pruebaMultiplesMetrosAMillas_valorNegativo() {
        assertEquals(-0.001242742, convertidor.metroAMilla(-2), 0.000000001);
    }

    @Test
    public void pruebaMultiplesMetrosAMillas_valorDecimal() {
        assertEquals(0.002485484, convertidor.metroAMilla(4.0), 0.000000001);
    }


}