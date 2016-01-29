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
public class Soldier {

    private Integer idSoldier;
    private String smallestUnitName;

    public Soldier(int idSoldier, Unit unit) {
        this.smallestUnitName = unit.toString();
        this.idSoldier = idSoldier;
    }

    public int getIdSoldier() {
        return idSoldier;
    }

    public LinkedList<String> getUnitsNames() {
        LinkedList<String> unitsNames = new LinkedList();
        String currentUnitName = this.smallestUnitName;
        while (UnitsData.getUnit(currentUnitName).isPartOfUnit()) {
            unitsNames.add(currentUnitName);
            currentUnitName = UnitsData.getUnit(currentUnitName).getParantName();
        }
        unitsNames.add(currentUnitName);
        return unitsNames;
    }

    @Override
    public String toString() {
        LinkedList<String> unitsNames = this.getUnitsNames();
        
        StringBuilder sb = new StringBuilder();
        
        sb.append(unitsNames.toString());
        sb.deleteCharAt(0);
        sb.deleteCharAt(sb.length()-1);
        
        return sb.toString() ;
    }

}
