package isoForum.functionalInterface;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Promise {
    private static final UUID DEFAULT_UUID = UUID.randomUUID();
     
    public void promiseMeSomething() throws InterruptedException, ExecutionException, TimeoutException{
        CompletableFuture<Void> promise = CompletableFuture.supplyAsync(Promise::expensiveComputation)
                .exceptionally(ex -> {
                    // log exception
                    return DEFAULT_UUID;
                })
                .thenApply(id -> id.toString())
                .thenAccept(System.out::println);
        
        
        promise.get(1000, TimeUnit.MILLISECONDS);
    }
    
    private static UUID expensiveComputation(){
        return UUID.randomUUID();
    }
}
