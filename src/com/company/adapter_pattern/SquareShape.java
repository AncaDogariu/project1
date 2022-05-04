package com.company.adapter_pattern;

/*
   SquareShapes are not compatible with RoundHoles (because this type of
   square objects were created after the project was developed)
    From this reason we have to use an adapter.

 */

public class SquareShape {
    private double width;

    public SquareShape(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getSquare() {
        double result;
        result = Math.pow(this.width, 2);
        return result;
    }
}