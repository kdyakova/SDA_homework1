/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ww1;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Krisi
 */
public class SoldiersData {
    
    private static Map<Integer,Soldier> soldiers;
    public static void add(int key,Soldier value){
        soldiers = new HashMap<>();
        SoldiersData.soldiers.put(key, value);
    }
    
    public static Soldier getSoldier(int id) {
        return soldiers.get(id);
    }
}
