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
public class Sport {
        private String name;
    private ArrayList<Participantes> participantes;
    
    //CONSTRUCTOR Y GET
    public Sport(String name){
        this.name=name;
        this.participantes=new ArrayList();
    }
    public String getName() {
        return name;
    }
    
   //agregar estudiantes a la lista
    public boolean addParticipante (Participantes participante){
        for(Participantes temp : this.participantes) {
            if(temp.getName().equalsIgnoreCase(participante.getName())){
                return false;
            }
        }
        this.participantes.add(participante);
        participante.addSport(this);
        return true;
    }
    //remover estudiantes a la lista
    public boolean removeParticipante (Participantes participante){
        for(Participantes temp : this.participantes) {
            if(temp.getName().equalsIgnoreCase(participante.getName())){
                participantes.remove(temp);
                return true;
            }
        } return false;
    }
    //toString
    @Override
    public String toString(){
        String string="Sport="+this.getName()+"\nAttendees={\n";
        for (Participantes participante : participantes) {
            string+="\t Name="+participante.getName()+",ID="+participante.getId()+"\n";
        }
        string += "\t }";
        return string;
    }
}
