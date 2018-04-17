/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petshop;

import java.util.Objects;

/**
 *
 * @author Dj The Source
 */
public class Animais {

    private String tipoAnimal, nomeAnimal, donoAnimal;
    
    public Animais(String tipoAnimal, String nomeAnimal, String donoAnimal){
        this.tipoAnimal= tipoAnimal;
        this.nomeAnimal = nomeAnimal;
        this.donoAnimal = donoAnimal;
    }
    
    public String getNomeAnimal(){
        return nomeAnimal;
    }
    
    public String getTipoAnimal(){
        return tipoAnimal;
    }
    
    public String getDonoAnimal(){
        return donoAnimal;
    }
    
    @Override 
    public boolean equals(Object obj){
        if (obj == null){
            return false;
        }
        
        if(getClass() != obj.getClass()){
            return false;
        }
        
        final Animais other = (Animais)obj;
        if(!Objects.equals(this.nomeAnimal, other.nomeAnimal)){
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode(){
    int hash = 5;
    hash = 59 * hash + Objects.hashCode(this.nomeAnimal);
    return hash;
}
    
@Override
public String toString(){
    return nomeAnimal+" - "+tipoAnimal + " , " + donoAnimal;
}
}