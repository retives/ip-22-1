package  lab6;


public class OrientedGraph {
    private int MAX_VERTS;//макс к-сть вершин
    private int MAX_Edges;//макс к-сть ребер
    private int nEdges = 0;//спочатку 0 ребер
    private Vertex vertexArray[]; //масив вершин
    private int adjMat[][]; // матриця суміжності
    private int incidenceMat[][]; // матриця інцидентності
    private int nVerts; // поточна к сть вершин

    public OrientedGraph(int qtV, int qtE) { // ініціалізація внутрішніх полів
        MAX_VERTS = qtV;
        MAX_Edges = qtE;
        vertexArray = new Vertex[qtV];
        adjMat = new int[qtV][qtV];
        incidenceMat = new int[qtV][qtE];
        nVerts = 0;
        for (int j = 0; j < qtV; j++) {
            for (int k = 0; k < qtV; k++) {
                adjMat[j][k] = 0;
            }
        }
        for (int j = 0; j < qtV; j++) {
            for (int k = 0; k < qtE; k++) {
                incidenceMat[j][k] = 0;
            }
        }
    }

    public void addVertex(char lab) {
        vertexArray[nVerts++] = new Vertex(lab);
    }

    public void addEdge(int start, int end) {
        adjMat[start][end] = 1;

        incidenceMat[end][nEdges] = 1;
        incidenceMat[start][nEdges] = -1;
        nEdges++;
    }

    public void displayVertex(int v) {
        System.out.println(vertexArray[v].getLabel());
    }

    public void printAdjMatrix() {
        for (int j = 0; j < MAX_VERTS; j++) {
            for (int k = 0; k < MAX_VERTS; k++) {
                System.out.print(adjMat[j][k] + " ");
            }
            System.out.println();
        }
    }

    public void printIncMatrix() {
        for (int j = 0; j < MAX_VERTS; j++) {
            for (int k = 0; k < MAX_Edges; k++) {
                System.out.print(incidenceMat[j][k] + " ");
            }
            System.out.println();
        }
    }

    public void printEdgesList() {
        for (int j = 0; j < nEdges; j++) {
            for (int i = 0; i < nVerts; i++) {
                if (incidenceMat[i][j] == -1) {
                    System.out.print("Start: " + vertexArray[i].getLabel() + " ");
                }
                else if (incidenceMat[i][j] == 1) {
                    System.out.print("End: " + vertexArray[i].getLabel() + " ");
                }
            }
            System.out.println("");
        }

    }

    public void printAdjList() {
        for (int j = 0; j < MAX_VERTS; j++) {
            for (int k = 0; k < MAX_VERTS; k++) {
                if (adjMat[j][k] == 1) {
                    System.out.print("(" + j + "; " + k + "), ");
                }
            }

        }
    }
}