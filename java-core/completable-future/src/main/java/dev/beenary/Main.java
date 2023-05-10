package dev.beenary;

import java.util.concurrent.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main
{
    public static void main(String[] args) throws ExecutionException, InterruptedException
    {


ExecutorService executor = Executors.newSingleThreadExecutor();
Future<Integer> integerFuture = executor.submit(() ->
{
    Thread.sleep(1000);
    return 5 + 10;
});

        System.out.println(integerFuture);


        //CompletableFuture<Void> future =

CompletableFuture.supplyAsync(() -> "Baeldung")
        .thenApply(String::length)
        .thenAccept(System.out::println);




String blockingFuture = CompletableFuture.supplyAsync(() -> "Baeldung")
        .thenApply(String::toUpperCase)
        .get();
        System.out.println(blockingFuture);

String blockingFutureJoin = CompletableFuture.supplyAsync(() -> "Blocking")
        .thenApply(s -> s + " Operation")
        .thenApply(String::toUpperCase)
        .join();
        System.out.println(blockingFutureJoin);

        /*The action of each “completion
        stage” is triggered when the
        future from the previous stage
        completes asynchronously*/
       /* CompletableFuture
                .supplyAsync(reduceFraction)
                .thenApply(BigFraction
                        ::toMixedString)
                .thenAccept(System.out::println);


        String f1 = "62675744/15668936";
        String f2 = "609136/913704";
        CompletableFuture<BigFraction>
                f = commonPool().submit(() ->
        {
            BigFraction bf1 =
                    new BigFraction(f1);
            BigFraction bf2 =
                    new BigFraction(f2);
            return bf1.multiply(bf2);
        });*/

        //  BigFraction result = f.get();
// f.get(10, MILLISECONDS);
// f.get(0, 0);


        /**
         * Define a join() method
         * • Behaves like get() without
         * using checked exceptions
         */
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> "Hello");
        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> "Beautiful");
        CompletableFuture<String> future3
                = CompletableFuture.supplyAsync(() -> "World");
        String combined = Stream.of(future1, future2, future3)
                .map(CompletableFuture::join)
                .collect(Collectors.joining(" "));

        System.out.println(combined);
        //assertEquals("Hello Beautiful World", combined);
    }
}