package com.company;

/*

1603 List and Threads
In the main method add 5 threads to the static list object. Each thread should be a new Thread object working with its SpecialThread object.

Requirements:
1. In the main method, create 5 objects of type SpecialThread.
2. In the main method, create 5 objects of type Thread.
3. Add 5 different threads to the list.
4. Each thread from the list should work with its own object of the SpecialThread class.
5. The run method of the SpecialThread class should output "it's a run method inside SpecialThread".

 */

import java.util.ArrayList;
import java.util.List;

/*
Список и нити
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            list.add(new Thread(new SpecialThread()));
        }
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}


