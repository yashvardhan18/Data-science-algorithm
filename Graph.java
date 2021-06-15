import java.util.*;

class Graph {
    private LinkedList<Integer> adjLists[];
    private boolean visited[];

    Graph(int vertices){
        adjLists=new LinkedList[vertices];
        visited=new boolean[vertices];

        for(int i=0;i<vertices;i++)
            adjLists[i]=new LinkedList<Integer>();
    }
    void addEdge(int src, int dest){
        adjLists[src].add(dest);
    }
    void DFS(int vertex){
        visited[vertex]=true;
        System.out.println(vertex + " ");
        Iterator<Integer> ite= adjLists[vertex].listIterator();
        while(ite.hasNext()){
            int adj=ite.next();
            if(!visited[adj])
                DFS(adj);
        }
    }
    public static void main(String[] args) {
        Graph g= new Graph(11);
        g.addEdge(1,2);
        g.addEdge(1,4);
        g.addEdge(2,3);
        g.addEdge(2,5);
        g.addEdge(3,6);
        g.addEdge(3,6);
        g.addEdge(3,10);
        g.addEdge(4,7);
        g.addEdge(5,8);
        g.addEdge(6,9);
        g.addEdge(7,8);
        g.addEdge(8,9);
        g.addEdge(9,10);
        System.out.println("This is Depth First Traversal");
        g.DFS(1);
    }

}
