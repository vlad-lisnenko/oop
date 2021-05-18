package com.lisnenko.collection.hashing;

public class Groundhog2 extends  Groundhog{
    public Groundhog2(int n){
        super(n);
    }

    @Override
    public int hashCode() {
        return super.number;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Groundhog2 && (number == ((Groundhog2)obj).number);
    }
}
