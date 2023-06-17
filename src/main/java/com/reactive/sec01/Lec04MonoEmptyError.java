package com.reactive.sec01;

import com.reactive.courseutil.Util;
import reactor.core.publisher.Mono;

/**
 * Created by Rizki Abdillah Azmi on 17-Jun-23
 */
public class Lec04MonoEmptyError {
    public static void main(String[] args) {

        userRepository(1).subscribe(
                Util.onNext(),
                Util.onError(),
                Util.onCompleted()
        );

    }

    private static Mono<String> userRepository(int userId){
        if (userId == 1) {
            return Mono.just(Util.faker().name().fullName());
        } else if (userId == 2) {
            return Mono.empty(); // null
        } else
            return Mono.error(new RuntimeException("Not in allowed range"));
    }
}
