package DesignPattern.StructuralPattern.Adapter;

public class SquarePegAdapter {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg){
        this.peg = peg;
    }

    public int getRadius(){
        return peg.getWidth() * 1/2;
    }
}
