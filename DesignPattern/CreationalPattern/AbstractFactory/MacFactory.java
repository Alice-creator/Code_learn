package DesignPattern.CreationalPattern.AbstractFactory;

public class MacFactory implements GUIFactory{
    public Button createButton(){
        return new MacButton();
    }
}
