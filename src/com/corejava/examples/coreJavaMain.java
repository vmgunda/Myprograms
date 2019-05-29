package com.corejava.examples;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class coreJavaMain {

    Integer id = 1;
    public static void main(String args[])  {

        staticClss staticClss = new staticClss();
        staticClss.print();
       myIntereface.myInnterClass myInnterClass = new myIntereface.myInnterClass();
       myInnterClass.show();

       Base base = new Derived();
       base.show();
       base.print();
       Derived derived = new Derived();
        derived.show();
        derived.print();

        Base base1 = new Base();



        List<Integer> sortedLst = new ArrayList<>();

        Integer[] array = {0, 2, 3, 4, 5, 7};
        int start = -1;
        int end= -1;
        for (int i= 0; i< array.length-1; i++) {

            if (array[i] + 1 == array[i+1]) {
                if (start == -1) {
                    start = i;
                }
                end = i+1;
            } else {
                if (start != -1 && end != -1) {
                    System.out.println(array[start] + " ->" + array[end]) ;
                }
                start = -1;
                end = -1;
            }

            if ((array.length - 1 == i+1 || i == 0) && start == -1) {
                System.out.println(array[i+1]);
            }
            if (array.length -1 == i+1 && start != -1 && end != -1) {
                System.out.println(array[start] + " ->" + array[end]) ;
            }
        }

//        coreJavaMain coreJavaMain = new coreJavaMain();
//        Thread t1, t2;
//
//        List<Integer> myList = new ArrayList();
//        myList.add(2);
//        myList.add(4);
//        myList.add(7);
//        myList.add(-3);
//        myList.add(5);
//        myList.add(12);
//        Integer [] array = new Integer[]
//
//
//        Collections.sort(myList);
//
//        //Integer[] array = (Integer[]) myList.toArray();
//
//        //System.out.println(array);
//
////        for (int i = 0 ; i < array.length; i++) {
////
////            if (array[i] + array[i+1] == array[i+2] + array[i+3]) {
////                System.out.println(i + (i+1) + (i+2) + (i+3));
////            }
////            if (i+1 >= array.length || i+2 >= array.length || i+3 >= array.length) break;
////
////
////        }
//
//
//        for (int i = 0; i < array.length; i++) {
//
//            for (int j = i+1 ; j < array.length; j++) {
//
//                for (int k = j+1; k < array.length; k++) {
//
//                    for (int m = k+1; m <array.length; m++) {
//                        if (array[i] + array[j] == array[k] + array[m]) {
//                            System.out.println(i  + " " + j + " " + k + " " +  m);
//                        }
//                    }
//                }
//            }
//        }
//

//        try {
//            System.exit(0);
//        } finally {
//            System.out.println("Me");
//        }

//        List<String> str = new ArrayList<>();
//        str.add("venu");
//
//        for (String s:
//             str) {
//            s +="50";
//
//        }
//
//        System.out.println(str.get(0));


//        Thread x = new Thread(coreJavaMain);
//        x.start();

//        new Thread(new coreJavaMain()).start();
//        new Thread(new coreJavaMain()).start();
//        new Thread(new coreJavaMain()).start();
//
//        CopyOnWriteArrayList<Integer> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
//        copyOnWriteArrayList.add(4);
//        copyOnWriteArrayList.add(5);
//        Iterator<Integer> it = copyOnWriteArrayList.iterator();
//        copyOnWriteArrayList.add(6);
//        while(it.hasNext()) {
//            System.out.println(it.next() + " ");
//        }
    }

}
