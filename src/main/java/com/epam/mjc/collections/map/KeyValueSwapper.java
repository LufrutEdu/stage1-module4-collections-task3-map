package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> out = new HashMap<>();
        for (Map.Entry<Integer, String> item:
             sourceMap.entrySet()) {
            if(out.containsKey(item.getValue())){
                if(out.get(item.getValue()) > item.getKey()){
                    out.remove(item.getValue());
                    out.put(item.getValue(), item.getKey());
                }
            } else {
                out.put(item.getValue(), item.getKey());
            }
        }
        return out;
    }
}
