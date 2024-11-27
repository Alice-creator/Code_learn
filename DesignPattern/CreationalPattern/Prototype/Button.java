package DesignPattern.CreationalPattern.Prototype;

public class Button implements Prototype {
    private String x;
    private String y;

    public Button(String x, String y){
        this.x = x;
        this.y = y;
    }

    public Button(Button button){
        this.x = button.x;
        this.y = button.y;
    }

    public Button clone(){
        return new Button(this);
    }
}
