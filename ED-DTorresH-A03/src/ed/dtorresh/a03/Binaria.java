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
public class Binaria extends FetchClass {
  
    public int fetch(int dato){ 
    int n = vector.length;
  
    int centro,inicio=0,fin=n-1; //En una busqueda binaria se divide el vector en inicio, centro y final, al momento de iniciar la busqueda
   
    
    while(inicio<=fin){ //mientras que el inicio sea menor (o igual en unos casos) al final de la cadena...
     centro=(inicio+fin)/2; //Se suman y se dividen entre dos para encontrar el centro
     
     if(vector[centro]==dato) return centro; //Se regresa el valor conseguido del centro
     
     
     else 
     if(dato < vector [centro] ){ //Si el dato es menor que el valor centro
        fin=centro-1; //mover final a centro -1
     }
     else {
       inicio=centro+1; //mover final a centro +1
     }
   }
   return -1;
 
 }

}
