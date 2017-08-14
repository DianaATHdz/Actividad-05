/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.dtorresh.a03;

/**
 *
 * @author DianaAlessa
 */
public class Secuencial extends FetchClass {
   
   int fetch(int dato){
   int posicion = -1;
   for(int i = 0; i < vector.length; i++){//Se recorre todo el arreglo
      if(vector[i] == dato){//Se compara cada elemento en el arreglo con el elemento que estamos buscando
    posicion = i;//Si es true guardamos la posicion de este
    break;//Para cerrar el ciclo
   }
  }
  return posicion;
 }   

}
