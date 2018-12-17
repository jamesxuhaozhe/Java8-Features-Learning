package spi.learn.example.impl;

import spi.learn.example.CrazyService;

public class SuperCrazyImpl implements CrazyService {
    @Override
    public void getCrazy() {
        System.out.println("Just being super crazy!!!!");
    }
}
