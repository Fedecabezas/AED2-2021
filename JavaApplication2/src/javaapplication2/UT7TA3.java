/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Yago Auza
 */
public class UT7TA3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TClasificador clasif = new TClasificador();    
        GeneradorDatosGenericos gdg = new GeneradorDatosGenericos();
        
        int[] datos = {4,5,3,1,2};
        System.out.println("");
        System.out.println("HEAPSORT");
        int[] resultHeapSort = clasif.clasificar(datos, TClasificador.METODO_CLASIFICACION_HEAPSORT); 
        for (int i = 0; i < resultHeapSort.length; i++) {
            System.out.print(resultHeapSort[i] + "-");
        }
    }
    
}
