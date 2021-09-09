package test;

import static Generador.GeneradorDatosGenericos.*;
import static Clasificacion.TClasificador.*;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class InsercionTests {
    int[] datoAleatorio10;
    int[] datoAscendente10;
    int[] datoDescendete10;
    int[] datoAleatorio100;
    int[] datoAscendente100;
    int[] datoDescendete100;
    int[] datoAleatorio1000;
    int[] datoAscendente1000;
    int[] datoDescendete1000;
    int[] datoOrdenado10;
    int[] datoOrdenado100;
    int[] datoOrdenado1000;

    @Before
    public void init() {
        datoAleatorio10 = generarDatosAleatorios(10);
        datoAscendente10 = generarDatosAleatorios(10);
        datoDescendete10 = generarDatosAleatorios(10);
        datoAleatorio100 = generarDatosAleatorios(100);
        datoAscendente100 = generarDatosAleatorios(100);
        datoDescendete100 = generarDatosAleatorios(100);
        datoAleatorio1000 = generarDatosAleatorios(1000);
        datoAscendente1000 = generarDatosAleatorios(1000);
        datoDescendete1000 = generarDatosAleatorios(1000);
        datoOrdenado10 = generarDatosOrdenados(10);
        datoOrdenado100 = generarDatosOrdenados(100);
        datoOrdenado1000 = generarDatosOrdenados(1000);
    }

    // #region Shell

    @Test
    public void testInsercionAleatorio() {
        int[] resultado10 = clasificar(datoAleatorio10, METODO_CLASIFICACION_INSERCION);
        int[] resultado100 = clasificar(datoAleatorio100, METODO_CLASIFICACION_INSERCION);
        int[] resultado1000 = clasificar(datoAleatorio1000, METODO_CLASIFICACION_INSERCION);

        assertArrayEquals(datoOrdenado10, resultado10);
        assertArrayEquals(datoOrdenado100, resultado100);
        assertArrayEquals(datoOrdenado1000, resultado1000);
    }

    @Test
    public void testInsercionAscendente() {
        int[] resultado10 = clasificar(datoAscendente10, METODO_CLASIFICACION_INSERCION);
        int[] resultado100 = clasificar(datoAscendente100, METODO_CLASIFICACION_INSERCION);
        int[] resultado1000 = clasificar(datoAscendente1000, METODO_CLASIFICACION_INSERCION);

        assertArrayEquals(datoOrdenado10, resultado10);
        assertArrayEquals(datoOrdenado100, resultado100);
        assertArrayEquals(datoOrdenado1000, resultado1000);
    }

    @Test
    public void testInsercionDescendente() {
        int[] resultado10 = clasificar(datoDescendete10, METODO_CLASIFICACION_INSERCION);
        int[] resultado100 = clasificar(datoDescendete100, METODO_CLASIFICACION_INSERCION);
        int[] resultado1000 = clasificar(datoDescendete1000, METODO_CLASIFICACION_INSERCION);

        assertArrayEquals(datoOrdenado10, resultado10);
        assertArrayEquals(datoOrdenado100, resultado100);
        assertArrayEquals(datoOrdenado1000, resultado1000);
    }

    // #endregion

}