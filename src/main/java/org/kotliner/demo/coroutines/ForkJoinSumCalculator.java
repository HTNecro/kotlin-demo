package org.kotliner.demo.coroutines;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
import java.util.stream.LongStream;

public class ForkJoinSumCalculator extends RecursiveTask<Long> {

    private final long[] numbers;

    private final int start;

    private final int end;

    public static final long THRESHOLD = 10_000;

    public ForkJoinSumCalculator(long[] numbers) {
        this(numbers, 0, numbers.length);
    }

    private ForkJoinSumCalculator(long[] numbers, int start, int end) {
        this.numbers = numbers;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Long compute() {
        int len = end - start;
        if (len <= THRESHOLD) {
            return computeSequentially();
        }

        ForkJoinSumCalculator leftTask = new ForkJoinSumCalculator(numbers, start, start + len / 2);
        ForkJoinSumCalculator rightTask = new ForkJoinSumCalculator(numbers, start + len / 2, end);
        leftTask.fork();
        rightTask.fork();
        long leftResult = leftTask.join();
        long rightResult = rightTask.join();
        return leftResult + rightResult;
    }

    private long computeSequentially() {
        long sum = 0;
        for (int i = start; i < end; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        long[] array = LongStream.rangeClosed(1, 100_000).toArray();
        ForkJoinSumCalculator calculator = new ForkJoinSumCalculator(array);
        System.out.println(new ForkJoinPool().invoke(calculator));
    }

}
