import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Lista<Integer> lista = new Lista<>();
        
        for (int i = 0; i < 10; i++) {
            lista.adiciona(i);
        }
        System.out.println(lista);
        
        System.out.println("O tamanho da lista " + lista.tamanhoLista());
        
        int elemento = 5;
        
        System.out.println("O elemento " + elemento + " apareceu " + lista.contaElemento(elemento) + "vez");
        
        System.out.println("Nova lista invertida \n" + lista.inverterLista());
        
        System.out.println("Lista invertida sem criar nova lista");
        lista.listaInvertidaSemCriarOutra(lista);
        
        List<Integer> outraLista = new ArrayList<>();
        
        for (int i = 11; i < 20; i++) {
            outraLista.add(i);
        }

        lista.concatenarListas(outraLista);

    }
}
