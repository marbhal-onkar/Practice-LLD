package concurrency.callables;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        ArrayCreator c = new ArrayCreator(n);

        ExecutorService service = new ForkJoinPool();

        Future<ArrayList<Integer>> array = service.submit(c);

        try {
            System.out.println(array.get());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}