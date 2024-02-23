package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> result = new ArrayList<>();
        for(String project : projects.keySet()) {
            if(projects.get(project).contains(developer)) {
                result.add(project);
            }
        }
        Collections.sort(result, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() != o2.length()) {
                    return o2.length() - o1.length();
                }
                return o1.compareTo(o2) * (-1);
            }
        });
        return result;
    }
}
