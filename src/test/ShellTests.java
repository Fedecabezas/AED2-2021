package test;

import static Generador.GeneradorDatosGenericos.*;
import static Clasificacion.TClasificador.*;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ShellTests {
    private int[] datoAleatorio10;
    private int[] datoAscendente10;
    private int[] datoDescendete10;
    private int[] datoAleatorio100;
    private int[] datoAscendente100;
    private int[] datoDescendete100;
    private int[] datoAleatorio1000;
    private int[] datoAscendente1000;
    private int[] datoDescendete1000;
    int[] datoOrdenado10;
    int[] datoOrdenado100;
    int[] datoOrdenado1000;

    @Before
    public void init() {
        int tamanio;

        tamanio = 10;
        datoAleatorio10 = new int[tamanio];
        datoAscendente10 = new int[tamanio];
        datoDescendete10 = new int[tamanio];
        datoAleatorio10 = generarDatosAleatorios(tamanio);
        datoAscendente10 = generarDatosAscendentes(tamanio);
        datoDescendete10 = generarDatosDescendentes(tamanio);

        tamanio = 100;
        datoAleatorio100 = new int[tamanio];
        datoAscendente100 = new int[tamanio];
        datoDescendete100 = new int[tamanio];
        datoAleatorio100 = generarDatosAleatorios(tamanio);
        datoAscendente100 = generarDatosAscendentes(tamanio);
        datoDescendete100 = generarDatosDescendentes(tamanio);

        tamanio = 1000;
        datoAleatorio1000 = new int[tamanio];
        datoAscendente1000 = new int[tamanio];
        datoDescendete1000 = new int[tamanio];
        datoAleatorio1000 = generarDatosAleatorios(tamanio);
        datoAscendente1000 = generarDatosAscendentes(tamanio);
        datoDescendete1000 = generarDatosDescendentes(tamanio);

        datoOrdenado10 = generarDatosOrdenados(10);
        datoOrdenado100 = generarDatosOrdenados(100);
        datoOrdenado1000 = generarDatosOrdenados(1000);
    }

    // #region Shell

    @Test
    public void testShellAleatorio() {
        int[] resultado10 = clasificar(datoAleatorio10, METODO_CLASIFICACION_SHELL);
        int[] resultado100 = clasificar(datoAleatorio100, METODO_CLASIFICACION_SHELL);
        int[] resultado1000 = clasificar(datoAleatorio1000, METODO_CLASIFICACION_SHELL);

        assertArrayEquals(datoOrdenado10, resultado10);
        assertArrayEquals(datoOrdenado100, resultado100);
        assertArrayEquals(datoOrdenado1000, resultado1000);
    }

    @Test
    public void testShellAscendente() {
        int[] resultado10 = clasificar(datoAscendente10, METODO_CLASIFICACION_SHELL);
        int[] resultado100 = clasificar(datoAscendente100, METODO_CLASIFICACION_SHELL);
        int[] resultado1000 = clasificar(datoAscendente1000, METODO_CLASIFICACION_SHELL);

        assertArrayEquals(datoOrdenado10, resultado10);
        assertArrayEquals(datoOrdenado100, resultado100);
        assertArrayEquals(datoOrdenado1000, resultado1000);
    }

    @Test
    public void testShellDescendente() {
        int[] resultado10 = clasificar(datoDescendete10, METODO_CLASIFICACION_SHELL);
        int[] resultado100 = clasificar(datoDescendete100, METODO_CLASIFICACION_SHELL);
        int[] resultado1000 = clasificar(datoDescendete1000, METODO_CLASIFICACION_SHELL);

        assertArrayEquals(datoDescendete10, resultado10);
        assertArrayEquals(datoDescendete100, resultado100);
        assertArrayEquals(datoDescendete1000, resultado1000);
    }

    // #endregion

}