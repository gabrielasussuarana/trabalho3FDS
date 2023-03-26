import java.util.LinkedList;

public class Linkedlist implements Ilist{
    
    @Override
    public void lista() {
        LinkedList<Integer> numeros = new LinkedList<Integer>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        System.out.println("2 - O tamanho da coleção é desconhecido de antemão e deseja-se visitar os elementos na ordem em que foram inseridos");
        System.out.println("Tamanho: Desconhecido");
        System.out.println(numeros);
    }
 
}
