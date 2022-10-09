import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class BuscaLargura {
    private Rede r;
    private Cor[] cores;
    private int[] distancia;
    private int[] pai;

    ArrayList<String> ordemAchados = new ArrayList<>();

    public BuscaLargura(Rede r) {
        this.r = r;
        this.cores = new Cor[r.getNumeroVertices()];
        this.distancia = new int[r.getNumeroVertices()];
        this.pai = new int[r.getNumeroVertices()];

    }

    public void inicializar() {
        for (int i = 0; i < r.getNumeroVertices(); i++) {
            this.cores[i] = Cor.BRANCO;
            this.distancia[i] = -1;
            this.pai[i] = -1;
        }
    }

    public void execute(Pessoa p) {

        int inicio = r.getIndiceVertice(p);
        inicializar();
        PriorityQueue<Integer> fila = new PriorityQueue<Integer>();
        this.cores[inicio] = Cor.CINZA;
        ordemAchados.add(r.getMapa().get(inicio).getNome());
        this.distancia[inicio] = 0;
        fila.add(inicio);

        while (fila.size() > 0) {
            int v = fila.poll();
            List<Integer> adjacenciaV = r.listarAdjacencias(v);
            for (int u : adjacenciaV) {
                if (this.cores[u] == Cor.BRANCO) {
                    this.pai[u] = v;
                    this.distancia[u] = this.distancia[v] + 1;
                    this.cores[u] = Cor.CINZA;
                    ordemAchados.add(r.getMapa().get(u).getNome());
                    fila.add(u);
                }
            }
        }
    }

    public void imprimir() {
        System.out.println("Cores");
        for (Cor c : this.cores)
            System.out.print(c + " | ");
        System.out.println("\n\nPai");
        for (int p : this.pai)
            System.out.print(p + " | ");
        System.out.println("\n\nDistancia");
        for (int d : this.distancia)
            System.out.print(d + " | ");
        System.out.println("");
        System.out.println("\n\nOrdem que foram achados");
        for (String a : this.ordemAchados )
            System.out.print(a + " -> ");
        System.out.println("");
    }
}