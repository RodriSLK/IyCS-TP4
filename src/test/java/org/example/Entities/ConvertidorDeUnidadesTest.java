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

    @Test
    public void pruebaMillaAMetro_valorNegativo2() {
        assertEquals(-1609.34, convertidor.millaAMetro(-2), 0.0001);
    }


}