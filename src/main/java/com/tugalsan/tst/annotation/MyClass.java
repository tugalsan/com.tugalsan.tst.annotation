package com.tugalsan.tst.annotation;

@AnnoClass
public class MyClass {

    @AnnoField
    public String filed;

    @AnnoMethod(times = 2)
    public static void method(@AnnorParam String msg) {
        @AnnoVariable
        var ali = "Ali gel";
    }
}
