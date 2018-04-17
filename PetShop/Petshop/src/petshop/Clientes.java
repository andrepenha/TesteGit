/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petshop;

import java.util.Objects;

public class Clientes {
    
    private String rg, nome, telefone;
    
    public Clientes(String rg, String nome, String telefone){
        this.rg= rg;
        this.nome = nome;
        this.telefone = telefone;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getTelefone(){
        return telefone;
    }
    
    public String getRg(){
        return rg;
    }
    
    @Override 
    public boolean equals(Object obj){
        if (obj == null){
            return false;
        }
        
        if(getClass() != obj.getClass()){
            return false;
        }
        
        final Clientes other = (Clientes)obj;
        if(!Objects.equals(this.rg, other.rg)){
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode(){
    int hash = 5;
    hash = 59 * hash + Objects.hashCode(this.rg);
    return hash;
}
    
@Override
public String toString(){
    return rg+" - "+nome + " , " + telefone;
}
}