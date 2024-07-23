package com.alok;

import java.util.*;

public class Adjacency_List {
    private int v;
    private LinkedList<Integer>[] adj;
    public Adjacency_List(int v){
        this.v = v;
        adj = new LinkedList[v];
        for(int i =0;i<v;i++){
            adj[i] = new LinkedList<>();
        }
    }
    public void addEdge(int u, int v, boolean bidir){
    adj[u].add(v);
    if(bidir){
        adj[v].add(u);
    }
    }
    public void printAdjList(){
        for(int i =0;i< v;i++){
            System.out.print(i+"->");
            for (int node: adj[i]){
                System.out.print(node + ", ");
            }
            System.out.println();
        }
    }
    public void dfs(int src){
        Map<Integer,Boolean> visited = new HashMap<>();
        dfsHelper(src, visited);
    }
    private void dfsHelper(int src, Map<Integer,Boolean> visited){
        visited.put(src,true);
//        System.out.print(src + " ");
        for(int neighbour: adj[src]){
            if (!visited.containsKey(neighbour)){
                dfsHelper(neighbour,visited);
            }
        }
    }
    public void bfs(int src){
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[v+1];
        q.add(src);
        visited[src] = true;
        while(!q.isEmpty()){
            int node = q.poll();
            System.out.print(node + " ");
            for(int neighbour: adj[node]){
                if (!visited[neighbour]){
                    q.add(neighbour);
                    visited[neighbour] = true;
                }
            }
        }
    }
    public int connectedcomponents(){
        Map<Integer, Boolean> visited = new HashMap<>();
        int components = 0;
        for(int i = 0;i< v;i++){
            if (!visited.containsKey(i)){
                dfsHelper(i,visited);
                components++;
            }
        }
        return components;
    }
    public void shortestPath(int src, int dest){
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[v+1];
        int[] dist = new int[v+1];
        int[] parent = new int[v+1];
        Arrays.fill(parent,-1);
        q.add(src);
        visited[src] = true;
        while(!q.isEmpty()){
            int node = q.poll();
            for(int neighbour: adj[node]){
                if (!visited[neighbour]){
                    q.add(neighbour);
                    visited[neighbour] = true;
                    dist[neighbour] = dist[node] + 1;
                    parent[neighbour] = node;
                }
            }
        }
        System.out.println(" Shortest distance is : " + dist[dest]);
    }


    public static void main(String[] args) {
        Adjacency_List g = new Adjacency_List(6);
        g.addEdge(0,1,true);
        g.addEdge(1,3,true);
        g.addEdge(1,2,true);
        g.addEdge(0,2,true);
        g.addEdge(4,5,true);
//        g.dfs(0);
//        System.out.println();
//        g.bfs(0);
        System.out.println(g.connectedcomponents());
    }
}
