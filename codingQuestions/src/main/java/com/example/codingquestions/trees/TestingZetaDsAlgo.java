package com.example.codingquestions.trees;

import com.example.codingquestions.ZetaDsAlgo;

public class TestingZetaDsAlgo {


    public static void main (String[] args){

        ZetaDsAlgo zetaDsAlgo = new ZetaDsAlgo();

//        zetaDsAlgo.put("cat", "dog");
//        System.out.println(zetaDsAlgo.get("cat"));
//        System.out.println(zetaDsAlgo.get("dog"));
//        System.out.println("Delete should be false " + zetaDsAlgo.delete("dog"));
//        System.out.println("Delete should be true " + zetaDsAlgo.delete("cat"));
//        System.out.println(zetaDsAlgo.get("cat"));



//
//        //Test case 1
//        zetaDsAlgo.put("cat", "dog");
//
//        zetaDsAlgo.beginTxn();
//        zetaDsAlgo.delete("cat");
//        System.out.println(zetaDsAlgo.get("cat")); // null
//        zetaDsAlgo.put("cat", "dog1");
//        System.out.println(zetaDsAlgo.get("cat")); // dog1
//        zetaDsAlgo.rollbackTxn();
//
//        System.out.println(zetaDsAlgo.get("cat")); // dog


        //Test case 1
//        zetaDsAlgo.put("cat", "dog");
//
//        zetaDsAlgo.beginTxn();
//        zetaDsAlgo.delete("cat");
//        System.out.println(zetaDsAlgo.get("cat")); // null
//        zetaDsAlgo.put("cat", "dog1");
//        System.out.println(zetaDsAlgo.get("cat")); // dog1
//        zetaDsAlgo.commitTxn();
//        System.out.println(zetaDsAlgo.get("cat")); // dog1

        zetaDsAlgo.beginTxn();
        zetaDsAlgo.delete("cat");
        zetaDsAlgo.put("cat", "dog");
        zetaDsAlgo.commitTxn();
        System.out.println(zetaDsAlgo.get("cat")); // dog



//        //Test case 1
//        zetaDsAlgo.put("cat", "dog");
//        //Begin Txn
//        zetaDsAlgo.get("cat"); //Answer will be dog
    }
}
