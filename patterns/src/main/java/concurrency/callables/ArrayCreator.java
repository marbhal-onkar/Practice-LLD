package concurrency.callables;

import java.util.ArrayList;
import java.util.concurrent.Callable;

public class ArrayCreator implements Callable<ArrayList<Integer>> {
    private final int number;

    public ArrayCreator(int number){
        this.number  = number;
    }

    @Override
    public ArrayList<Integer> call() throws Exception {


        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= number; i++) {
            list.add(i);
        }
        return list;
    }
}
