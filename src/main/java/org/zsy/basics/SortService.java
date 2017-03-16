package org.zsy.basics;

import org.apache.commons.lang.time.StopWatch;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by kroot on 17-3-15.
 */
public class SortService {

    public static boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }

    public static void exch(Comparable[] a, int i, int min) {
        Comparable t = a[i];
        a[i] = a[min];
        a[min] = t;
    }

    public static void selectionSort(Comparable[] a) {
        StopWatch timer=new StopWatch();
        int count = a.length;
        for (int i = 0; i < count; i++) {
            int min = i;
            for (int j = i+1; j < count; j++) {
                if (less(a[j], a[min])) {
                    min=j;
                }
            }
            exch(a, i, min);
        }
        timer.getSplitTime();
    }

    public static void insertSort(Comparable [] a) throws InterruptedException {
        StopWatch timer=new StopWatch();
        timer.start();
        int count=a.length;
        for (int i = 1; i <count ; i++) {
            for (int j = i; j >0&&less(a[j],a[j-1]); j--) {
                exch(a,j,j-1);
            }
        }
        timer.split();
        System.out.println(timer.getSplitTime());
        timer.stop();
        System.out.println(timer.getTime());
    }

    public static void main(String[] args) throws InterruptedException {
        Comparable[] a = {4, 3, 6, 1, 2, 5};
//        selectionSort(a);
        insertSort(a);
//        List<Comparable> comparables = Arrays.asList(a);
//        Collections.sort(comparables);
//        a= (Comparable[]) comparables.toArray();
        for (int i = 0; i <a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
