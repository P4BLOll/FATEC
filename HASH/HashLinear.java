public class HashLinear {
    private Hash[] tab;
    private int TAM_MAX;

    public HashLinear(int tam) {
        tab = new Hash[tam];
        TAM_MAX = tam;
        for (int i = 0; i < tam; i++) {
            tab[i] = new Hash();
        }
    }

    private int funcaohash(double chave) {
        int v = (int) chave;
        return (Math.abs(v) % TAM_MAX);
    }

    public void insere(double item) {
        if (cheia()) {
            System.out.println("\n-> ATENCAO: Tabela cheia!");
            return;
        }

        int pos = funcaohash(item);
        int posInicial = pos;

        do {
            if (tab[pos].estado == Hash.Estado.LIVRE || 
                tab[pos].estado == Hash.Estado.REMOVIDO) {
                tab[pos].item = item;
                tab[pos].estado = Hash.Estado.OCUPADO;
                System.out.println("-> Inserido HASH[" + pos + "]");
                return;
            } else if (tab[pos].estado == Hash.Estado.OCUPADO && 
                       tab[pos].item == item) {
                System.out.println("\n-> ATENCAO: Item já cadastrado!");
                return;
            }
            pos = (pos + 1) % TAM_MAX;
        } while (pos != posInicial);
    }

    public int busca(double chave) {
        int pos = funcaohash(chave);
        int posInicial = pos;

        do {
            if (tab[pos].estado == Hash.Estado.OCUPADO && 
                tab[pos].item == chave) {
                return pos;
            }
            if (tab[pos].estado == Hash.Estado.LIVRE ||
                tab[pos].estado == Hash.Estado.LIVRE ) {
                return -1; 
            }
            pos = (pos + 1) % TAM_MAX;
        } while (pos != posInicial);

        return -1;
    }

    public void apaga(double chave) {
        int pos = busca(chave);
        if (pos != -1) {
            tab[pos].estado = Hash.Estado.REMOVIDO; 
            System.out.println("-> Dado HASH[" + pos + "] removido");
        } else {
            System.out.println("Item não encontrado");
        }
    }

    public boolean cheia() {
        for (int i = 0; i < TAM_MAX; i++) {
            if (tab[i].estado != Hash.Estado.OCUPADO) {
                return false;
            }
        }
        return true;
    }
    public void imprime() {
        for (int i = 0; i < TAM_MAX; i++) {
            if (tab[i].estado == Hash.Estado.OCUPADO) {
                System.out.println("\nHash[" + i + "] = " + tab[i].item + " [OCUPADO]");
            } else if (tab[i].estado == Hash.Estado.REMOVIDO) {
                System.out.println("\nHash[" + i + "] = [REMOVIDO]");
            } else {
                System.out.println("\nHash[" + i + "] = [LIVRE]");
            }
        }
    }
}