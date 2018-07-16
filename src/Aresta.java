
public class Aresta {
	
    private int fim;
    private int custo;

    public Aresta(int dest, int custo) {
        this.fim = dest;
        this.custo = custo;
    }

    public int getFim() {
        return fim;
    }

    public int getCusto() {
        return custo;
    }
}

