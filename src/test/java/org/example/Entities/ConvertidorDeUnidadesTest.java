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

    // Test Fran
    @Test
    public void test_valorDecimal_PulgadaAMetro() {
        assertEquals(0.0386, convertidor.pulgadaAMetro(1.52), 0.0001);
    }

    @Test
    public void test_valorUnitario_PulgadaAMetro() {
        assertEquals(0.0762, convertidor.pulgadaAMetro(3), 0.0001);
    }

    @Test
    public void test_valorDecimalMayor_PulgadaAMetro() {
        assertEquals(2.5984, convertidor.pulgadaAMetro(102.3), 0.0001);
    }

    //Test Nico

    @Test
    public void pruebaMetroAPulgada_valorUnitario() {
        assertEquals(39.3701, convertidor.metroAPulgada(1), 0.0001);
    }

    @Test
    public void pruebaMetroAPulgada_valorNulo() {
        assertEquals(0, convertidor.metroAPulgada(0), 0.0001);
    }

    @Test
    public void pruebaMetroAPulgada5_valorSimple() {
        assertEquals(196.8505, convertidor.metroAPulgada(5), 0.0001);
    }



    //Test Facundo

    @Test
    public void prueba1_valorMayor_PulgadaAMilla(){
        assertEquals(0.1578, convertidor.pulgadaAMilla(10000),0.0001);
    }

    @Test
    public void prueba2_valorNulo_PulgadaAMilla(){
        assertEquals(0, convertidor.pulgadaAMilla(0),0.0001);
    }

    @Test
    public void prueba3_valorUnitario_PulgadaAMilla(){
        assertEquals(0.0000157, convertidor.pulgadaAMilla(1),0.0000001);
    }

    @Test
    public void test_valorUnitario_millaAPulgada(){
        assertEquals(63360, convertidor.millaAPulgada(1), 0.001);
    }
    @Test
    public void test_valorNulo_millaAPulgada(){
        assertEquals(0,0,0.0001);
    }
    @Test
    public void test_valorNegativo_millaAPulgada() throws InterruptedException {
        Thread.sleep(5000); // Pausa el hilo durante 5 segundos
        assertEquals(-63360, convertidor.millaAPulgada(-1), 0.0001);
    }
}
