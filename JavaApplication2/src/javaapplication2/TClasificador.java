package javaapplication2;


public class TClasificador {
	public static final int METODO_CLASIFICACION_INSERCION = 1;
	public static final int METODO_CLASIFICACION_SHELL = 2;
	public static final int METODO_CLASIFICACION_BURBUJA = 3;
        public static final int METODO_CLASIFICACION_HEAPSORT = 4;

	/**
	 * Punto de entrada al clasificador
	 * 
	 * @param metodoClasificacion
	 * @param orden
	 * @param tamanioVector
	 * @return Un vector del tam. solicitado, ordenado por el algoritmo solicitado
	 */
	public int[] clasificar(int[] datosParaClasificar, int metodoClasificacion) {
		switch (metodoClasificacion) {
		case METODO_CLASIFICACION_INSERCION:
			return ordenarPorInsercion(datosParaClasificar);
		case METODO_CLASIFICACION_SHELL:
			return ordenarPorShell(datosParaClasificar);
		case METODO_CLASIFICACION_BURBUJA:
			return ordenarPorBurbuja(datosParaClasificar);
                case METODO_CLASIFICACION_HEAPSORT:
			return ordenarPorHeapSort(datosParaClasificar);
		default:
			System.err.println("Este codigo no deberia haberse ejecutado");
			break;
		}
		return datosParaClasificar;
	}

	protected int[] ordenarPorInsercion(int[] datosParaClasificar) {
            if (datosParaClasificar != null) {
                
                for (int indice = 1; indice < datosParaClasificar.length; indice++) {            
                    int indiceAnterior = indice - 1;
                    
                    while ((indiceAnterior >= 0) && (datosParaClasificar[indiceAnterior] > datosParaClasificar[indiceAnterior+1])) {
                            intercambiar(datosParaClasificar, indiceAnterior+1, indiceAnterior);
                            indiceAnterior--;
                    }
                }
                return datosParaClasificar;
            }
            return null;
	}

	private int[] ordenarPorBurbuja(int[] datosParaClasificar) {
            int ultimaPosicion = datosParaClasificar.length - 1;                
            for (int indice = 0; indice <= ultimaPosicion; indice++) {
                
                for (int IndiceInverso = ultimaPosicion; IndiceInverso >= (indice + 1); IndiceInverso--) {
                    if (datosParaClasificar[IndiceInverso] < datosParaClasificar[IndiceInverso - 1]) {
                        intercambiar(datosParaClasificar, IndiceInverso - 1, IndiceInverso);
                    }
                }
            }
            return datosParaClasificar;
	}
        
        protected int[] ordenarPorHeapSort(int[] datosParaClasificar) {
            for (int i = (datosParaClasificar.length - 1) / 2; i >= 0; i--) 
            { //Armo el heap inicial de n-1 div 2 hasta 0
                armaHeap(datosParaClasificar, i, datosParaClasificar.length - 1);
            }
            for (int i = datosParaClasificar.length - 1; i  > 0; i--) 
            {
                intercambiar(datosParaClasificar,i,0);
                armaHeap(datosParaClasificar, 0, i-1);
            }
            return datosParaClasificar;
        }

	private void armaHeap(int[] datosParaClasificar, int primero, int ultimo) {
            if (primero < ultimo){
                int r = primero;
                while(r <= ultimo / 2)
                {
                    if (ultimo == 2*r)
                    { //r tiene un hijo solo
                        if (datosParaClasificar[r] > datosParaClasificar[r*2]){
                            intercambiar(datosParaClasificar, r, 2 * r);
                            r = 2 ;
                        }
                        else {
                            r = ultimo;
                        }
                    } 
                    else { //r tiene 2 hijos
                        int posicionIntercambio = 0;
                        if (datosParaClasificar[2*r] > datosParaClasificar[2*r + 1]){
                            posicionIntercambio = 2 * r + 1;
                        } 
                        else {
                            posicionIntercambio = 2 * r;
                        }
                        
                        
                        if (datosParaClasificar[r] > datosParaClasificar[posicionIntercambio]){
                            intercambiar(datosParaClasificar,r,posicionIntercambio);
                            r = posicionIntercambio;
                        } 
                        else {
                            r = ultimo;
                        }
                    }
                }			
            }
	}
        
        private void intercambiar(int[] vector, int pos1, int pos2) {
            int temp = vector[pos2];
            vector[pos2] = vector[pos1];
            vector[pos1] = temp;
	}

	private int[] ordenarPorShell(int[] datosParaClasificar) {
            int j, inc;
            int[] incrementos = new int[] { 3223, 358, 51, 10, 3, 1 };

            for (int posIncrementoActual = 1; posIncrementoActual < incrementos.length; posIncrementoActual++) {
                inc = incrementos[posIncrementoActual];
                if (inc < (datosParaClasificar.length / 2)) {
                    for (int i = inc; i < datosParaClasificar.length; i++) {
                        j = i - inc;
                        while (j >= 0) {
                            if (datosParaClasificar[j] > datosParaClasificar[j + inc]) {
                                intercambiar(datosParaClasificar, j, j + inc);
                                j = j--;
                            } 
                        }
                    }
                }
            }
            return datosParaClasificar;
	}
}
