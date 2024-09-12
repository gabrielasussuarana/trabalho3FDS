public class Main {
  public static void main(String[] args) {
    Ilist list1 = listFactory.createList("arraylist");
    list1.lista(); 
    System.out.print("-------------------------------------------------------------------------------------\n");
    Ilist list2 = listFactory.createList("linkedlist");
    list2.lista(); 
    System.out.print("-------------------------------------------------------------------------------------\n");
    ISet list3 = listFactory.creatSet("hashset");
    list3.sets();
    System.out.print("-------------------------------------------------------------------------------------\n");
    ISet list4 = listFactory.creatSet("treeset");
    list4.sets();
  }
}