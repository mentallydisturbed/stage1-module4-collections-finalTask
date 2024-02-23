package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> map = new HashMap<>();
        for(String s : sourceMap.keySet()) {
            Integer len = s.length();
            if(map.containsKey(len)) {
                map.get(len).add(s);
            }else {
                Set<String> set = new HashSet<>();
                set.add(s);
                map.put(len, set);
            }
        }
        return map;
    }
}
