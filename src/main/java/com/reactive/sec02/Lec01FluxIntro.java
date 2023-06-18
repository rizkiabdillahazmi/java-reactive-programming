package com.reactive.sec02;

import com.reactive.courseutil.Util;
import reactor.core.publisher.Flux;

import java.io.Serializable;

/**
 * Created by Rizki Abdillah Azmi on 18-Jun-23
 */
public class Lec01FluxIntro {

    public static void main(String[] args) {

        Flux<? extends Serializable> flux = Flux.just(1, 2, 3, "Tes", Util.faker().name().fullName());
        flux.subscribe(
                Util.onNext(),
                Util.onError(),
                Util.onCompleted()
        );
    }
    
}
