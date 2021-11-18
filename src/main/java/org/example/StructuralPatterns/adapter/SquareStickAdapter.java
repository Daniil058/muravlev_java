package org.example.StructuralPatterns.adapter;

import org.example.StructuralPatterns.adapter.stick.RoundStick;
import org.example.StructuralPatterns.adapter.stick.SquareStick;

public class SquareStickAdapter extends RoundStick {
    private SquareStick stick;
    public SquareStickAdapter(SquareStick stick) {
        this.stick = stick;
    }
    public double getRadius() {
        // Вычислить половину диагонали квадратной палки по
        // теореме Пифагора.
        return stick.getWidth() * Math.sqrt(2) / 2;
    }

}
