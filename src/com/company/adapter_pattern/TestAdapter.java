package com.company.adapter_pattern;

// Adapter Design Pattern can make incompatible objects work together,
// in this implementation we make use of this pattern in order to make compatible
// the relation between square shaped objects and round holes

public class TestAdapter {

        public static void main(String[] args) {
            // round fits round
            RoundHole hole = new RoundHole(5);
            RoundShape roundObject = new RoundShape(5);
            if (hole.fits(roundObject)) {
                System.out.println("Round shaped object with radius 5 fits round hole.");
            }

            SquareShape smallSqShape = new SquareShape(2);
            SquareShape largeSqShape = new SquareShape(20);
            // hole.fits(smallSqShape); // Won't compile.

            // Adapter makes things work together
            SquareShapeAdapter smallSqAdapter = new SquareShapeAdapter(smallSqShape);
            SquareShapeAdapter largeSqAdapter = new SquareShapeAdapter(largeSqShape);
            if (hole.fits(smallSqAdapter)) {
                System.out.println("Square shaped object with radius 2 fits round hole with radius 5.");
            }
            if (!hole.fits(largeSqAdapter)) {
                System.out.println("Square shaped object with radius 20 does not fit with round hole with radius 5.");
            }
        }


}
