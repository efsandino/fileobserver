/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bo.scz.edusoft.magicdata.utils;

/**
 *
 * @author eduardo
 */
public class ArgumentManager {
    
    private final String[] parameters;
    
    public ArgumentManager(String args[]){
        this.parameters=args;
    }
    
   
    public int getLength(){
        if(hasArguments()){
            return parameters.length;
        }else{
            return 0;
        }
    }
    
    public boolean hasArgument(String s){
        if(hasArguments()){
            boolean has = false;
            for(String par:parameters){
               if(  par.equals(s)){
                   has = true;
                   break;
               }
            }
            return has;
        }else{
            return false;
        }
    }
    
    public int getIndexOf(String arg){
        if(hasArgument(arg)){
            int i = -1;
            for(String par:parameters){
                i++;
                if(par.equals(arg)){
                    break;    
                }
            }
            return i;
        }else{
            return -1;
        }
    }
    
    
    
    public boolean hasArguments(){
        return (parameters!=null)? (parameters.length>0):false;
    }
}
