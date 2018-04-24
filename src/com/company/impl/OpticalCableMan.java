package com.company.impl;

import com.company.LineWorkable;

public class OpticalCableMan implements LineWorkable {
    @Override
    public void work() {
        System.out.println("I mounting optical cable");
    }
}
