package com.company.drivetrain.engine;

import com.company.parts.Part;

public interface Engine extends Part {

    void accelerate();
    void shiftUp();
    void shiftDown();
}
