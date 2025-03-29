package org.example;

import java.util.HashMap;
import java.util.Map;

public class Exercise5 {
    Map<String , String> map = new HashMap<>();

    public void addData(String key , String value){
        map.put(key , value);
    }

    public Map<String , String> getMap(){
        return map;
    }
}
