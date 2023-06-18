package com.reactive.sec01;

import com.reactive.courseutil.Util;
import com.reactive.sec01.assignment.FileService;

/**
 * Created by Rizki Abdillah Azmi on 18-Jun-23
 */
public class Lec09Assignment {

    public static void main(String[] args) {

        FileService.read("file01.txt")
                .subscribe(Util.onNext(), Util.onError(), Util.onCompleted());

        FileService.write("file03.txt", "This is file03")
                .subscribe(Util.onNext(), Util.onError(), Util.onCompleted());

        FileService.read("file03.txt")
                .subscribe(Util.onNext(), Util.onError(), Util.onCompleted());

        FileService.delete("file03.txt")
                .subscribe(Util.onNext(), Util.onError(), Util.onCompleted());
    }

}
