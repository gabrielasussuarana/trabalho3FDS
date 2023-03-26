import java.util.ArrayList;

public class Arraylist implements Ilist{

    @Override
    public void lista() {
        ArrayList<String> nomes = new ArrayList<String>();
        nomes.add("Arthur");
        nomes.add("Beto");
        nomes.add("Carol");
        
        System.out.println("1- O tamanho da coleção é conhecido de antemão e deseja-se visitar os elementos na ordem que foram inseridos");
        System.out.println("Tamanho:"+ nomes.size());
        System.out.println(nomes);
    }

 
    
}
