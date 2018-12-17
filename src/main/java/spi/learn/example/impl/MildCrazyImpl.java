package spi.learn.example.impl;

import spi.learn.example.CrazyService;

public class MildCrazyImpl implements CrazyService {
    @Override
    public void getCrazy() {
        System.out.println("Just being mild crazy!!!!");
    }
}
