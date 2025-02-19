import java.util.Arrays;

public class MinhaPrimeiraED {
    private Object[] objetos = new Object[10];
    private int totalDeObjetos = 0;

    public void adiciona(int posicao, Object objeto) {
        if (!posicaoValida(posicao)) {
            System.out.println("Posição Inválida.");
            return;
        }

        if (totalDeObjetos == objetos.length) {
            vetorCheio();
        }

        if (!posicaoOcupada(posicao)) {
            objetos[posicao] = objeto;
        } else {
            for (int i = totalDeObjetos; i > posicao; i--) {
                objetos[i] = objetos[i - 1];
            }
            objetos[posicao] = objeto;
        }
        totalDeObjetos++;
        System.out.println(Arrays.toString(objetos));
    }

    public void adiciona(Object objeto) {
        if (totalDeObjetos == objetos.length) {
            vetorCheio();
        }
        objetos[totalDeObjetos++] = objeto;
    }

    private boolean posicaoOcupada(int posicao) {
        return posicaoValida(posicao) && objetos[posicao] != null;
    }

    private boolean posicaoValida(int posicao) {
        return posicao >= 0 && posicao < totalDeObjetos;
    }

    public void remove(int posicao) {
        if (!posicaoValida(posicao)) {
            System.out.println("Posição inválida ou já vazia.");
            return;
        }

        for (int i = posicao; i < totalDeObjetos - 1; i++) {
            objetos[i] = objetos[i + 1];
        }

        objetos[--totalDeObjetos] = null;
        System.out.println("Objeto removido da posição " + posicao);
    }

    public boolean contem(Object objeto) {
        for (int i = 0; i < totalDeObjetos; i++) {
            if (objetos[i].equals(objeto)) {
                System.out.println("Objeto encontrado na posição " + i);
                return true;
            }
        }
        return false;
    }

    public Object getObjeto(int posicao) {
        if (!posicaoValida(posicao) || objetos[posicao] == null) {
            System.out.println("O campo selecionado é inválido ou está vazio.");
            return null;
        }
        return objetos[posicao];
    }

    public int tamanho() {
        return objetos.length;
    }

    private void vetorCheio() {
        int novaCapacidade = objetos.length * 2;
        objetos = Arrays.copyOf(objetos, novaCapacidade);
        System.out.println("Capacidade do vetor dobrada para " + novaCapacidade);
    }

    public static void main(String[] args) {
        MinhaPrimeiraED lista = new MinhaPrimeiraED();
        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona(1, "C");
        lista.remove(1);
        lista.contem("A");
        System.out.println("Tamanho do Vetor: "+lista.tamanho());
        System.out.println("O objeto presente na posição selecionada é: "+ lista.getObjeto(0));
        
        for (int i = 0; i < 10; i++) {
            lista.adiciona("item"+i);
        }

        System.out.println("Tamanho do Vetor: "+lista.tamanho());
        System.out.println(Arrays.toString(lista.objetos));

    }
}
