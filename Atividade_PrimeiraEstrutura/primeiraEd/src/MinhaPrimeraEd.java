import javax.swing.plaf.metal.MetalBorders.ScrollPaneBorder;

public class MinhaPrimeraEd {
    public class MinhaPrimeiraED {

        private Object[] objetos = new Object[10];
      
        public int totalDeObjetos = 0;
      
       
      
        public void adiciona(int posicao, Object objeto){
            if(posicaoOcupada(posicao)){

            }

            for (int i = objetos.length - 1; i >= posicao; i--) {
                objetos[i + 1] = objetos[i];
            }
            
            objetos[posicao] = objeto;
    
        }
      
        public void adiciona(Object objeto){}
      
        private boolean posicaoOcupada(int posicao){
            return objetos[posicao] != null;
        }
      
        private boolean posicaoValida(int posicao){
            return posicao >= 0 && posicao < objetos.length;
        }
      
        public void remove(int posicao){}
      
        public boolean contem(Object objeto){
            for (int i = 0; i < objetos.length; i++) {
                if (objeto.equals(objetos[i])) {
                    System.err.println("Índice do Objeto: " + i);
                    return true;
                }
            }
            return false;
        }
      
        public Object getObjeto(int posicao){
            if(!posicaoValida(posicao)){
                System.out.println("Posição Inválida ou Inexistente.");
                return null;
            }

            if(!posicaoOcupada(posicao)){
                System.out.println("Posição Vazia.");
                return null;
            }

            System.out.println("Posição: "+posicao+"Item: "+objetos[posicao]);
            return objetos[posicao];
        }


      
        public int tamanho(){
            return totalDeObjetos;
        }
      
        public void vetorCheio(){
            if(totalDeObjetos == objetos.length){
                Object[] novoVetor = new Object[objetos.length * 2];
                for(int i = 0; i <objetos.length; i++){
                    novoVetor[i] = objetos[i];
                }
                objetos = novoVetor;
            }
        }
      
      
      }
}
