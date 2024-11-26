package DesignPattern.CreationalPattern.Builder;

// Director is just a set of building config 
public class Director {
    private Builder builder;
    public Director(Builder builder){
        this.builder = builder;
    }

    public void changeBuilder(Builder builder){
        this.builder = builder;
    }

    public void make(){
        builder.reset();
        builder.setSeats(0);
        builder.setEngine(null);
        builder.setGPS();
    }
}
