package com.example.codingquestions.interview;

public class BazarVoice {

    /**
     * 1. Implement rand7().
     *  * rand7() should return a random integer, uniformly distributed between
     *  * 0 and 6, inclusive.
     *  *
     *  * Feel free to use any available
     *   libraries (and to look them up if necessary).
     */

    /**
     * 2. Implement testRand7().
     * This method should demonstrate the distribution of rand7 () by outputting
     * the distribution of the method after 7000 calls.
     * Sample output:
     * [0] 995
     * [1] 1005
     * [2] 997
     * ...
     */

    /**
     * 3. Implement rand3().
     * rand3() should return a random integer, uniformly distributed between
     * 0 and 2, inclusive.
     *
     * When implementing rand3(), please do NOT use any built-in/system/3rd party
     * libraries. However, you may call your own rand7() method.  You may call it
     * once, twice, or as many times as you like - don't worry about the
     * performance of the rand3() method.
     */


    public static void main (String []args) {
//        testRand7();
        testRand3();
    }

    private static int rand7(){
        return (int) (Math.random() * 7);
    }

    private static int rand3(){
        while (true){
            int res = rand7();
            if ( res <=2)
                return res;
        }
    }

    private static void testRand3() {
        int count = 0;
        int []distribution = new int[3];
        while (count++ < 7000){
            distribution[rand3()]++;
        }
        for (int i=0;i<distribution.length;i++){
            System.out.println(i + " " + distribution[i]);
        }
    }

    private static void testRand7() {
        int count = 0;
        int []distribution = new int[7];
        while (count++ < 7000){
            distribution[rand7()]++;
        }
        for (int i=0;i<distribution.length;i++){
            System.out.println(i + " " + distribution[i]);
        }
    }

}
