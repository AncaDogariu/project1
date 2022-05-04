package com.company.adapter_pattern;

// Round holes are compatible with round shapes
public class RoundHole {
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fits(RoundShape peg) {
        boolean result;
        result = (this.getRadius() >= peg.getRadius());
        return result;
    }
}