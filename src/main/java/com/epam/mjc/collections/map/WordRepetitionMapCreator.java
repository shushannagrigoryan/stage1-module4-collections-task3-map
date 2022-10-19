package com.epam.mjc.collections.map;

import javax.swing.*;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> map = new HashMap<>();
        sentence = sentence.toLowerCase(Locale.ROOT);
        String [] s = sentence.split("\\w+");
        map.put(s[0], 1);
        for(int i = 1; i<s.length; i++){
            for(Map.Entry<String, Integer> e :map.entrySet()){
                if(e.getKey().equals(s[i])){
                    e.setValue(e.getValue() + 1);
                }
                else{
                    map.put(s[i], 1);
                }
            }
        }
        return map;

    }
}
