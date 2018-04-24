package com.company.impl;

import com.company.LineWorkable;

public class CopperCableMan implements LineWorkable {
    @Override
    public void work() {
        System.out.println("I mounting copper cable!");
    }
}
