package org.example.Entities;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ConvertidorDeUnidadesTest {
    private final ConvertidorDeUnidades convertidor = new ConvertidorDeUnidades();


    // TESTS RODRI

    @Test
    public void pruebaMultiplesMetrosAMillas_valor1() {
        assertEquals(0.001242742, convertidor.metroAMilla(2), 0.000000001);
    }

    @Test
    public void pruebaMultiplesMetrosAMillas_valor2() {
        assertEquals(0.005592339, convertidor.metroAMilla(9), 0.000000001);
    }

    @Test
    public void pruebaMultiplesMetrosAMillas_valor3() {
        assertEquals(0.009320565, convertidor.metroAMilla(15), 0.000000001);
    }




}