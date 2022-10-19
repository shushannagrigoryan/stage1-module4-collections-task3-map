package com.epam.mjc.collections.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> newMap = new HashMap<>();

        for(Map.Entry<Integer,String> e :sourceMap.entrySet()){
            newMap.put(e.getValue(), e.getKey());
            break;
        }
        for(Map.Entry<Integer,String> e :sourceMap.entrySet()){
            for(Map.Entry<Integer,String> e1 :sourceMap.entrySet()){
                if(e.getValue().equals(e1.getValue())){
                    newMap.put(e.getValue(), Math.min(e.getKey(), e1.getKey()));
                }
                else{
                    newMap.put(e.getValue(), e.getKey());
                }
            }

        }
        return newMap;

    }
}
