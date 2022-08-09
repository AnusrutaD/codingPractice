package com.coding.graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Solution {
    HashMap<Integer, LinkedList<Integer>> adj = new HashMap<>();
    HashSet<Integer> visited = new HashSet<>();
    // A circle is define by x-axis position, y-axis position, and a radius.
    // A circle group is a collection of circles that overlap.
    // Given a list of circles, figure out if they belong to a single circle group.
    // Formula for calculating distance between two points: sqrt((x2-x1)^2 + (y2-y1)^2)
    public boolean checkCircleInSameGroup(int[][] circles){

        for(int i = 0; i < circles.length; i++){
            adj.put(i, new LinkedList<Integer>());
        }
        for(int i = 0; i < circles.length; i++){
            for(int j= i + 1; j < circles.length; j++){
                if(distSquare(circles[i], circles[j]) <= ((circles[j][2] + circles[i][2]) * (circles[j][2] + circles[i][2]))){
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }
        visited.add(0);
        dfs(0);

        return visited.size() == circles.length;
    }

    public void dfs(int circle){
        for(int v :adj.get(circle)){
            if(visited.contains(v)){
                continue;
            }
            visited.add(v);
            dfs(v);
        }
    }

    public int distSquare(int[] circle1, int[] circle2){
        return  (circle2[0] - circle1[0]) * (circle2[0] - circle1[0]) + (circle2[1] - circle1[1]) * (circle2[1] - circle1[1]);
    }
}
