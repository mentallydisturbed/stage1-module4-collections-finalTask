package com.epam.mjc.collections.combined;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {
        Set<String> set = new HashSet<>();
        for(List<String> list : timetable.values()) {
            for(String s : list) {
                set.add(s);
            }
        }
        return set;
    }
}
