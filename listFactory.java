public class listFactory {
    public static Ilist createList(String type) {
        if ("arraylist".equalsIgnoreCase(type)) {
            return new Arraylist();
        } else if ("linkedlist".equalsIgnoreCase(type)) {
            return new Linkedlist();
        } else {
            throw new IllegalArgumentException("Coleção não encontrada.");
        }
    }

    public static ISet creatSet(String type){
        if ("hashset".equalsIgnoreCase(type)) {
            return new HashSets();
        } else if ("treeset".equalsIgnoreCase(type)) {
            return new treeSets();
        } else {
            throw new IllegalArgumentException("Coleção não encontrada.");
        }
    }
}
