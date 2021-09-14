package ru.netology;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer>{

    protected int min;
    protected int max;

    public Randoms(int min, int max){
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            int next = min;

            @Override
            public boolean hasNext() {
                return next <= max;
            }


            @Override
            public Integer next() {
                Random random = new Random();
                int diff = max-min;
                int num = random.nextInt(diff + 1);
                num += min;
                next++;
                if(next > max)next = min;
                return num;
            }
        };
    }
}
