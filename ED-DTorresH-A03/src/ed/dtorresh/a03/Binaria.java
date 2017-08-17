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
public class Binaria extends FetchClass implements Ordenamientos {
  
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

    @Override
    public void seleccion() {
         for (int i = 0; i < vector.length - 1; i++) {       //Para un numero i igual a cero, i debe ser menor que el largo del vector menos uno
         int min = i;                                       //declarar variable minimo es igual a i
         for (int j = i + 1; j < vector.length; j++){       //Aquí se irá corriendo el vector j que será donde se acomoden los numeros
               if (vector[j] < vector[min]) {               //Si el vector j es menor se colocara
                            min = j;
                     }
               }
               if (i != min)  {                                //Si i es diferente  que el minimo
                       int aux= vector[i];                     
                       vector[i] = vector[min];
                       vector[min] = aux;
               }
       }
    } 
}