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

    @Test
    public void pruebaMetroAPulgada1() {
        assertEquals(39.3701, convertidor.metroAPulgada(1), 0.0001);
    }

    @Test
    public void pruebaMetroAPulgada2() {
        assertEquals(78.7402, convertidor.metroAPulgada(2), 0.0001);
    }

    @Test
    public void pruebaMetroAPulgada3() { assertEquals(118.1103, convertidor.metroAPulgada(3), 0.0001);
    }

    @Test
    public void test_1_PulgadaAMetro() { assertEquals(0.0386, convertidor.pulgadaAMetro(1.52), 0.0001);
    }

    @Test
    public void test_2_pruebaPulgadaAMetro() { assertEquals(0.0762, convertidor.pulgadaAMetro(3), 0.0001);
    }

    @Test
    public void test_3_pruebaPulgadaAMetro() { assertEquals(2.5984, convertidor.pulgadaAMetro(102.3), 0.0001);
    }
}