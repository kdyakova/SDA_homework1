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
public class UnitsData {
    private static Map<String,Unit> units = new HashMap<>();
    public static void add(String key,Unit value){
        UnitsData.units.put(key, value);
    }
    
    public static Unit getUnit(String name) {
        return units.get(name);
    }
}
