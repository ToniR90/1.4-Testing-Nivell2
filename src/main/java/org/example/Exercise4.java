package org.example;

import java.util.ArrayList;
import java.util.List;

public class Exercise4 {
    List<Object> objects = new ArrayList<>();

    public void addObject(Object object){
        objects.add(object);
    }

    public List<Object> getObjects(){
        return objects;
    }
}
