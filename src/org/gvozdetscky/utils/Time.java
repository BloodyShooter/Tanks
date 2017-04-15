package org.gvozdetscky.utils;

/**
 * Created by Egor on 15.04.2017.
 */
public class Time {
    public static final long SECOND = 1000000000L;

    public static long getNanoTime() {
        return System.nanoTime();
    }
}
