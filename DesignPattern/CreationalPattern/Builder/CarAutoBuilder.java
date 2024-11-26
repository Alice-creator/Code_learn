package DesignPattern.CreationalPattern.Builder;

public class CarAutoBuilder implements Builder{

    private Car car = new Car();

    public void reset(){
        this.car = new Car();
    }

    public void setSeats(int seats){
        car.seats = seats;
    }

    public void setEngine(String engine){
        car.engine = engine;
    }

    public void setGPS(){
        System.out.println("Setting GPS");
    }

    public Car getResult(){
        return this.car;
    }
}
