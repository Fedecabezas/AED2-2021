package Arboles;

import java.util.LinkedList;

public class TNodoTrie implements INodoTrie {

    private static final int CANT_CHR_ABECEDARIO = 26;
    private TNodoTrie[] hijos;
    private boolean esPalabra;

    public TNodoTrie() {
        hijos = new TNodoTrie[CANT_CHR_ABECEDARIO];
        esPalabra = false;
    }

    @Override
    public void insertar(String unaPalabra) {
        TNodoTrie nodo = this;
        for (int c = 0; c < unaPalabra.length(); c++) {
            int indice = unaPalabra.charAt(c) - 'a';
            if (nodo.hijos[indice] == null) {
                nodo.hijos[indice] = new TNodoTrie();
            }
            nodo = nodo.hijos[indice];
        }
        nodo.esPalabra = true;
    }

    private void imprimir(String s, TNodoTrie nodo) {
        if (nodo != null) {
            if (nodo.esPalabra) {
                System.out.println(s);
                
            }
            for (int c = 0; c < CANT_CHR_ABECEDARIO; c++) {
                if (nodo.hijos[c] != null) {
                    imprimir(s+(char)(c + 'a'), nodo.hijos[c]);
                }
            }
        }
    }

    @Override
    public void imprimir() {
        
        imprimir("", this);
    }
    
      private TNodoTrie buscarNodoTrie(String s) {
        TNodoTrie nodo = this;
     
         // implementar
        
        return nodo;
    }
    
    private void predecir(String lector, String prefijo, LinkedList<String> palabras, TNodoTrie nodo) {
       
        for(int indice = 0; indice < CANT_CHR_ABECEDARIO; indice ++){
            if(nodo.hijos[indice] != null){
                
                if(nodo.hijos[indice].esPalabra)
                    palabras.add(lector + this.MapearIndiceACaracter(indice));
                      
                this.predecir(lector + this.MapearIndiceACaracter(indice) , prefijo, palabras, nodo.hijos[indice]);
            }
        }
    } // O(N) siendo N el tamanio del subarbol cuya raiz es la ultima letra del string
    
    private int MapearCaracterAIndice(char caracter){
        return caracter - 'a';
    }
    
    private char MapearIndiceACaracter(int indice){
        return ((char)(indice + 'a'));
    }
 
    @Override
    public void predecir(String prefijo, LinkedList<String> palabras) {
        TNodoTrie nodo = this;
        
        for(int i = 0; i < prefijo.length(); i++){
             int indiceDeHijo = this.MapearCaracterAIndice(prefijo.charAt(i));
             
             if(nodo.hijos[indiceDeHijo] != null){
                 nodo = nodo.hijos[indiceDeHijo]; //llego hasta el final del prefijo
             }else{
                 return; //No existe el prefijo
             }
        }      
        this.predecir(prefijo, prefijo, palabras, nodo);
    }

    @Override
    public int buscar(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
}