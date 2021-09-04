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

    @Before
    public void init() {
        int tamanio;

        tamanio = 10;
        datoAleatorio10 = new int[tamanio];
        datoAscendente10 = new int[tamanio];
        datoDescendete10 = new int[tamanio];
        datoAleatorio10 = generarDatosAleatorios(tamanio);
        datoAscendente10 = generarDatosAleatorios(tamanio);
        datoDescendete10 = generarDatosAleatorios(tamanio);

        tamanio = 100;
        datoAleatorio100 = new int[tamanio];
        datoAscendente100 = new int[tamanio];
        datoDescendete100 = new int[tamanio];
        datoAleatorio100 = generarDatosAleatorios(tamanio);
        datoAscendente100 = generarDatosAleatorios(tamanio);
        datoDescendete100 = generarDatosAleatorios(tamanio);

        tamanio = 1000;
        datoAleatorio1000 = new int[tamanio];
        datoAscendente1000 = new int[tamanio];
        datoDescendete1000 = new int[tamanio];
        datoAleatorio1000 = generarDatosAleatorios(tamanio);
        datoAscendente1000 = generarDatosAleatorios(tamanio);
        datoDescendete1000 = generarDatosAleatorios(tamanio);

    }

    // #region Shell

    @Test
    public void testShellAleatorio() {
        int[] resultado10 = clasificar(datoAleatorio10, METODO_CLASIFICACION_SHELL);
        int[] resultado100 = clasificar(datoAleatorio100, METODO_CLASIFICACION_SHELL);
        int[] resultado1000 = clasificar(datoAleatorio1000, METODO_CLASIFICACION_SHELL);

        assertArrayEquals(datoAscendente10, resultado10);
        assertArrayEquals(datoAscendente10, resultado100);
        assertArrayEquals(datoAscendente10, resultado1000);
    }

    @Test
    public void testShellAscendente() {
        int[] resultado10 = clasificar(datoAscendente10, METODO_CLASIFICACION_SHELL);
        int[] resultado100 = clasificar(datoAscendente100, METODO_CLASIFICACION_SHELL);
        int[] resultado1000 = clasificar(datoAscendente1000, METODO_CLASIFICACION_SHELL);

        assertArrayEquals(datoAscendente10, resultado10);
        assertArrayEquals(datoAscendente10, resultado100);
        assertArrayEquals(datoAscendente10, resultado1000);
    }

    @Test
    public void testShellDescendente() {
        int[] resultado10 = clasificar(datoDescendete10, METODO_CLASIFICACION_SHELL);
        int[] resultado100 = clasificar(datoDescendete100, METODO_CLASIFICACION_SHELL);
        int[] resultado1000 = clasificar(datoDescendete1000, METODO_CLASIFICACION_SHELL);

        assertArrayEquals(datoAscendente10, resultado10);
        assertArrayEquals(datoAscendente10, resultado100);
        assertArrayEquals(datoAscendente10, resultado1000);
    }

    // #endregion

}