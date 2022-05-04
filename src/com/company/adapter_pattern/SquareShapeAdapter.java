package com.company.adapter_pattern;

// this adapter allows fitting square shaped objects into round holes.

public class SquareShapeAdapter extends RoundShape {
    private SquareShape peg;

    public SquareShapeAdapter(SquareShape peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        double result;
        // compute a minimum circle radius, which can fit this type of object.
        result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
        return result;
    }
}