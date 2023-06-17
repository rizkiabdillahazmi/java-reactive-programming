package com.reactive.sec01;

import com.reactive.courseutil.Util;
import reactor.core.publisher.Mono;

import java.util.concurrent.CompletableFuture;

/**
 * Created by Rizki Abdillah Azmi on 17-Jun-23
 */
public class Lec07MonoFromFuture {
    public static void main(String[] args) {

        Mono.fromFuture(getName())
                .subscribe(Util.onNext());

        Util.sleepSeconds(1);
    }

    private static CompletableFuture<String> getName(){
        return CompletableFuture.supplyAsync(() -> Util.faker().name().fullName());
    }
}
