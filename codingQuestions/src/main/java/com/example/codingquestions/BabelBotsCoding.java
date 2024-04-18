package com.example.codingquestions;


/*
*One lane road

Cars are going on the road in the same direction. No overtaking.

Cars:
[A, B, C, D, E, F, G, H, I]

Initial preferred speeds:
[60, 60, 70, 100, 90, 60, 70, 80, 90]  L ---> R

Over time, they will become groups:
[[60], [60], [70, 100, 90, 60], [70], [80], [90]]
*
*
* [60, 60, 70, 100, 90, 50, 70, 80, 90]  L ---> R
*
* [[60, 60, 70, 100, 90, 50], [70], [80], [90]]
*
* i = 1;
* [50, 60,60,70, 90, 100], [80], [90]
*
* */
import java.util.ArrayList;
import java.util.List;

public class BabelBotsCoding {


    public static void main (String []args){
        System.out.println(carsGrouping(new int[]{60,60,70,50,100,90,70,80,90}));

    }

    private static List<List<Integer>>carsGrouping(int []speeds){

        List<List<Integer>> ans = new ArrayList<>();
        if (speeds.length ==0){
            return ans;
        }
        if (speeds.length == 1){
            ans.add(List.of(speeds[0]));
        }
        int leader = speeds[speeds.length -1];
        List<Integer> tempAns = new ArrayList<>();
        for (int i = speeds.length -2; i>=0;i--){
            if (speeds[i] < leader){
                if (tempAns.isEmpty())
                    tempAns.add(leader);
                tempAns = tempAns.reversed();
                ans.add(tempAns);
                tempAns = new ArrayList<>();
                leader = speeds[i];
            } else {
                if (tempAns.isEmpty()) {
                    tempAns.add(leader);
                    tempAns.add(speeds[i]);
                } else {
                    tempAns.add(speeds[i]);
                }
            }
        }

        if (tempAns.size() >1){
            tempAns = tempAns.reversed();
            ans.add(tempAns);
        }
        return ans.reversed();
    }

}
