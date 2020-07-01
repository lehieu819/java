package com.company;

public class CloneFactory {
    public Court getClone(Court courtSample) {
        return courtSample.makeCopy();
    }
}
