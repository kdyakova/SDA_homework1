/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ww1;

import java.util.LinkedList;

/**
 *
 * @author Krisi
 */
public class Unit<T,U> {

    protected String name;
    protected boolean hasParent;
    protected boolean isLeaf;
    protected LinkedList<T> children;
    protected String parantName;
    
    Unit(String name) {
        this.name = name;
        this.children = new LinkedList<>();
        this.hasParent = false;
    }
    
    public void attach(U item){}
    
    public void isBeingAttachedTo(String parantName){
        hasParent=true;
        this.parantName=parantName;
    }
    
    public int countSoldiers() {
        return 0;
    }

    public LinkedList<Integer> removeDeathSoldiers(LinkedList<Integer> deathSoldiers) {
        return null;
    }
        
    public LinkedList<Integer> getListOfSoldiers() {
        return null;
    }
    public String showUnit(){
        return this.getListOfSoldiers().toString();
    }
         
    public boolean isPartOfUnit() {
        return hasParent;
    }

    public void becamePartOfUnit() {
        hasParent = true;
    }

    public boolean isLeaf() {
        return isLeaf;
    }
    
    
    public int idLastSoldier(){
        return 0;
    }
    public void attach(U item, int afterSoldier){}
     public String getParantName(){
         return parantName;
     }
    public void detach(String unit){   
    }
    
}
