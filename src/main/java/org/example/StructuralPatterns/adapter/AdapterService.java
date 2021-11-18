package org.example.StructuralPatterns.adapter;

import org.example.StructuralPatterns.adapter.hole.RoundHole;
import org.example.StructuralPatterns.adapter.stick.RoundStick;
import org.example.StructuralPatterns.adapter.stick.SquareStick;

public class AdapterService {
    public boolean exec( String typeStick, double radiusHole, double sizeStick) throws Exception {

        RoundHole hole = new RoundHole(radiusHole);

        switch (typeStick.toUpperCase()) {
            case ("КРУГ"):
                RoundStick roundStick = new RoundStick(sizeStick);
                return hole.fits(roundStick);
            case ("КВАДРАТ"):
                SquareStick squareStick = new SquareStick(sizeStick);
                SquareStickAdapter squareStickAdapter = new SquareStickAdapter(squareStick);
                return hole.fits(squareStickAdapter);
            default:
                throw new Exception("Такого типа палки не существует.");
        }

    }
}