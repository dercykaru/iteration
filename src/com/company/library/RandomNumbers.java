package com.company.library;

import java.util.Iterator;
import java.util.Random;

public class RandomNumbers implements Iterable<Integer> {
    protected Random random;
    private final int min;
    private final int max;

    public RandomNumbers(int min, int max) {
        this.random = new Random();
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                if (hasNext()) {
                    return random.nextInt(min, max + 1);
                } else return null;
            }
        };
    }


}