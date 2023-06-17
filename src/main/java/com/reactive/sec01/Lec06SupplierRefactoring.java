package com.reactive.sec01;

import com.reactive.courseutil.Util;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

/**
 * Created by Rizki Abdillah Azmi on 17-Jun-23
 */
public class Lec06SupplierRefactoring {

    public static void main(String[] args) {

        getName();
//        getName()
//                .subscribeOn(Schedulers.boundedElastic())
//                .subscribe(Util.onNext());
        String name = getName()
                .subscribeOn(Schedulers.boundedElastic())
                .block();
        System.out.println(name);

        Util.sleepSeconds(4);
    }

    private static Mono<String> getName(){
        System.out.println("Entered the method");
        return Mono.fromSupplier(()->{
            System.out.println("Generating Name...");
            Util.sleepSeconds(3);
            return Util.faker().name().fullName();
        }).map(String::toUpperCase);
    }

}
