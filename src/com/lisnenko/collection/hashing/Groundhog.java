package com.lisnenko.collection.hashing;

public class Groundhog {
    protected int number;

    public Groundhog(int n){
        number = n;
    }

    @Override
    public String toString(){
        return  "Ground #" + number;
    }
}
