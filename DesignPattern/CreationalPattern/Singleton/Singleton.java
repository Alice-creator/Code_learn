package DesignPattern.CreationalPattern.Singleton;

public class Singleton {
    private Singleton instance;

    private Singleton(){
        instance = new Singleton();
    }

    public Singleton getSingleton(){
        if(instance == null){
            this.instance = new Singleton();
        }
        return this.instance;
    }
}
