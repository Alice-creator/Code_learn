package DesignPattern.CreationalPattern.Builder;

public interface Builder {
    public void reset();
    public void setSeats(int number);
    public void setEngine(String engine);
    public void setGPS();
}
