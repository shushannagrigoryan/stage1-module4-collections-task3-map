package com.epam.mjc.collections.map;

import javax.swing.*;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> map = new LinkedHashMap<>();
        sentence = sentence.toLowerCase();
        String [] s = sentence.split(" ");
        for(int i=0; i<s.length;i++){
            s[i] = s[i].replaceAll("[^a-zA-Z]", "");
        }

        for (String value : s) {
            boolean set = false;
            if (!map.isEmpty()) {
                for (Map.Entry<String, Integer> e : map.entrySet()) {
                    if (Objects.equals(e.getKey(), value)) {
                        e.setValue(e.getValue() + 1);
                        set = true;
                        break;
                    }
                }
                if(!set) {
                    map.put(value, 1);
                }
            } else {
                map.put(value, 1);
            }
        }

        return map;

    }
}
