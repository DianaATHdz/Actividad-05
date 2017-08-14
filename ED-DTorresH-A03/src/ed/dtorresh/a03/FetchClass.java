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
abstract class FetchClass {
    int [] vector;

    abstract int fetch(int n);
    
    public void setV(int[]v){
        this.vector=v;
    }
    
    public int[] randomV (int n){
        int[] vec = new int[n];
        for(int i=0;i<vec.length;i++){
            vec[i]=(int)(Math.random()*10); //comando para mencionar un numero random
        }
        return vec;
    }
    
    public int[] getV(){
        return vector;
    }
    
    public void showV(){
        String resultado;
        resultado="[";
        for (int i=0;i<vector.length;i++){ 
            resultado += vector[i]; //El resultado se guardara en promedio
            if(i<vector.length-1)resultado+=","; 
        }
        resultado += "]";
        System.out.println(resultado);
    }

    public void showF(int n){
        System.out.println("El valor solicitado se encuentra en la posición " + n +" Del vector");
    }
       
}
