import java.util.TreeSet;

public class treeSets implements ISet{

    @Override
    public void sets() {
        TreeSet<Integer> numeros = new TreeSet<>();
        numeros.add(10);
        numeros.add(10);
        numeros.add(20);
        numeros.add(15);

        
        System.out.println("4 - O tamanho da coleção é desconhecido, não se admitem elementos repetidos na coleção e a iteração deve seguir uma ordenação natural dos elementos.");
        System.out.println("Tamanho desconhecido ");
        System.out.println(numeros);
       
    }
    
}
