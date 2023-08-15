package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        sentence =  sentence.toLowerCase();
        sentence = sentence.replace(",","");
        sentence = sentence.replace(".","");
        String[] arr = sentence.split(" ");
        Map <String, Integer> out = new HashMap<>();
        for (String item:
             arr) {
            if(out.containsKey(item)){
                int value = out.get(item);
                out.remove(item);
                out.put(item, ++value);
            } else if(!Objects.equals(item, "") && !item.isEmpty()
            ){
                out.put(item, 1);
            }
        }
        return out;
    }
}
