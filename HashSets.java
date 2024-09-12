import java.util.HashSet;
public class HashSets implements ISet {

    @Override
    public void sets() {
        HashSet<String> cores = new HashSet<String>();
        cores.add("vermelho");
        cores.add("verde");
        cores.add("azul");
        cores.add("verde"); 

        System.out.println("3 - O tamanho da coleção é desconhecido de antemão, a ordem de iteração não é importante e não se admitem elementos repetidos na coleção");
        System.out.println("Tamanho: Desconhecido");
        System.out.println(cores);
    }
   
   
}
