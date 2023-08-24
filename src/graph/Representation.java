package graph;

import java.util.ArrayList;

public class Representation {

    public static void main(String[] args) {

        int n = 5;
        int[][] edges = new int[][] {
                { 1, 2 },
                { 1, 3 },
                { 2, 4 },
                { 3, 4 },
                { 3, 5 },
                { 4, 5 }
        };

        int[][] result = adjecencyMatrix(n, edges);
        for (int j = 0; j < result.length; j++) {
            for (int k = 0; k < result[0].length; k++) {
                System.out.print(result[j][k] + " ");
            }
            System.out.println();
        }
    }

    // This representation is called matrix or adjecency matrix representation
    // here the sapce complexity is O(n*n) because we are using a matrix
    // this is for un-weighted graph, if the graph is weighted then instead of 1 ,
    // we have to assign wt
    public static int[][] adjecencyMatrix(int n, int[][] edges) {
        int m = edges.length;
        int[][] adjMatrix = new int[n + 1][n + 1]; // if the graph is 1 based
        // int[][] adjMatrix = new int[n][n]; // if the graph is 0 based

        for (int i = 0; i < m; i++) {
            adjMatrix[edges[i][0]][edges[i][1]] = 1;
            adjMatrix[edges[i][1]][edges[i][0]] = 1;
        }
        return adjMatrix;
    }

}

class AdjRepresentation {

    int v;
    ArrayList<ArrayList<Integer>> adjList;

    public AdjRepresentation(int v){
        this.v = v;
        this.adjList = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            this.adjList.add(new ArrayList<>());
        }
    }

}
