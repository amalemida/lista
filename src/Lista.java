import java.util.ArrayList;
import java.util.List;

public class Lista<X> {
    private List<X> lista;
    public List<X> getLista() {
        return lista;
    }

    private List<X> listaConcatenada;

    public Lista() {
        this.lista = new ArrayList<>();
    }

    public void adiciona(X elemento){
        lista.add(elemento);
    }

    public void remove(X elemento){
        lista.remove(elemento);
    }

    public void imprime(){
        for(X elemento : lista){
            System.out.println(elemento);
        }
    }
    
    public int contaElemento(X elemento) {
        int contador = 0;
        for (int i =0; i <lista.size();i++){
           if(lista.get(i)== elemento){
            contador++;
        }
    }
        return contador;
    }
    
    public int tamanhoLista(){
        return lista.size();
    }

    public List<X> inverterLista() {
        List<X> listaInvertida = new ArrayList<>();
        for (int i = lista.size() - 1; i >= 0; i--) {
            listaInvertida.add(lista.get(i));
        }
        return  listaInvertida; // reurn não aceita sysout
    }
    
    public void listaInvertidaSemCriarOutra(Lista<X> lista){
        for(int i = lista.tamanhoLista(); i > 0; i--){
        }
        System.out.println(lista);
    }
    
    public List<X> concatenarListas(List<X> outraLista) {
        listaConcatenada = new ArrayList<>();
        
        // Adicionar os elementos da lista atual
        for (X elemento : lista) {
            listaConcatenada.add(elemento);
        }
        
        // Adicionar os elementos da outra lista
        for (X elemento : outraLista) {
            listaConcatenada.add(elemento);
        }
        
        return listaConcatenada;
    }

    @Override
    public String toString() {
        return "Lista [lista=" + lista + "]";
    }
}
