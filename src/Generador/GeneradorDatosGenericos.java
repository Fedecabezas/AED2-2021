package Generador;

import java.util.Random;

public class GeneradorDatosGenericos {

	public static int[] generarDatosAleatorios(int TAMANIO_MAX) {
		Random rnd = new Random();
		int[] datosGenerados = new int[TAMANIO_MAX];
		boolean[] datosUtilizados = new boolean[TAMANIO_MAX];
		for (int i = 0; i < datosGenerados.length; i++) {
			int j = rnd.nextInt(TAMANIO_MAX);
			while (datosUtilizados[j]) {
				j = (j + 1) % TAMANIO_MAX;
			}
			datosGenerados[j] = i;
			datosUtilizados[j] = true;
		}
		return datosGenerados;
	}

	public static int[] generarDatosAscendentes(int TAMANIO_MAX) {
		int[] copiaAscendente = new int[TAMANIO_MAX];
		for (int i = 0; i < TAMANIO_MAX; i++) {
			copiaAscendente[i] = i;
		}
		return copiaAscendente;
	}

	public static int[] generarDatosDescendentes(int TAMANIO_MAX) {
		int[] copiaDescendente = new int[TAMANIO_MAX];
		for (int i = 0; i < TAMANIO_MAX; i++) {
			copiaDescendente[i] = TAMANIO_MAX - i;
		}
		return copiaDescendente;
	}

	public static int[] generarDatosOrdenados(int TAMANIO_MAX) {
		int[] copiaOrdenada = new int[TAMANIO_MAX];
		for (int i = 0; i < TAMANIO_MAX; i++) {
			copiaOrdenada[i] = i;
		}
		return copiaOrdenada;
	}
}
