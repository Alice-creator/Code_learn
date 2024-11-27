package DesignPattern.CreationalPattern.Prototype;

import java.util.List;

public class PrototypeRegistry {
    private List<Button> items;

    public void addItem(Button button){
        items.add(button);
    }

    public Prototype getByIndex(int index){
        return items.get(index).clone();
    }
}
