
class MST {

	private static int v = Teste.qntd;

	int minchave(int chave[], Boolean passou[]) {
		int min = Integer.MAX_VALUE, min_pos = -1;

		for (int v = 0; v < v; v++)
			if (passou[v] == false && chave[v] < min) {
				min = chave[v];
				min_pos = v;
			}
		return min_pos + 1;
	}

	void printMST(Grafo incio, Grafo grafo) {
		for (int v = 1; v < incio.key; v++) {
			System.out.print("Inicial: "+(v + 1));
			Aresta print = null;
			for (Aresta aresta : incio.adjacencia[v]) {
				print = aresta;
			}
			System.out.println(" -> " + (print.getFim() + 1) + "  Custo: " + print.getCusto());
		}

	}

	void primMST(Grafo grafo) {
		Grafo incio = new Grafo(v);
		int chave[] = new int[v];
		Boolean passou[] = new Boolean[v];

		for (int i = 0; i < v; i++) {
			chave[i] = Integer.MAX_VALUE;
			passou[i] = false;
		}

		for (int count = 0; count < v - 1; count++) {
			int u = minchave(chave, passou);
			for (int i = 0; i < grafo.adjacencia.length; i++) {
				for (int x = 0; x < grafo.adjacencia[i].size(); x++) {
					if (passou[i] == false && grafo.adjacencia[i].get(x).getCusto() < chave[i]) {
						incio.adjacencia[i].add(
								new Aresta(grafo.adjacencia[i].get(x).getFim(), grafo.adjacencia[i].get(x).getCusto()));
						chave[i] = grafo.adjacencia[i].get(x).getCusto();
					}
				}
				passou[i] = true;

			}
		}
		printMST(incio, grafo);
	}

}