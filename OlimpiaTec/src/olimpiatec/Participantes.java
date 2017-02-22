/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olimpiatec;

import java.util.ArrayList;

/**
 *
 * @author DianaAlessa
 */
public class Participantes {
    
	    private String name;
	    private String id;
	    private ArrayList<Sport> deportes;
	    //CONTRUCTOR
	    public Participantes(String name, String id){
	        this.name=name;
	        this.id=id;
	        this.deportes=new ArrayList();
	    }
	    //GET 
            public String getName() {
	        return name;
	    }
	    public String getId() {
	        return id;
	    }
            //AÑADIR DEPORTE
	    public boolean addSport(Sport deporte){
	        for(Sport temp : this.deportes) {
	            if(temp.getName().equalsIgnoreCase(deporte.getName())){
	                return false;
	            }
	        }
	        this.deportes.add(deporte);
	        return true;
	    }
            //REMOVER DEPORTE
	    public boolean removeSport(Sport deporte){
	        for(Sport temp : this.deportes) {
	            if(temp.getName().equalsIgnoreCase(deporte.getName())){
	                this.deportes.remove(temp);
	            }
	        }
	        return false;
	    }
            //GET DEPORTE Y ESTUDIANTE
	    public String getSports() {
	        String list="Sports=";
	        for (Sport temp : this.deportes) {
	            list+=temp.getName()+",";
	        }
	        list=list.substring(0, list.length()-1);
	        return list;
	    }
	    public String getParticipantes(){
	        return "Name="+this.name+", Id="+this.id;
	    }
	    //TOSTRING 
            @Override
	    public String toString(){
	        return "Name="+this.name+", Id="+this.id+", "+getSports();
	    }
	}
