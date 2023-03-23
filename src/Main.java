package src;
public class Main {
    public static void main(String[] args) throws Exception {
        // Cria um personagem Normal
        Personagem normal = Personagem.criaNormal();
        
        // Imprime o personagem Normal
        System.out.println(normal);

        // Cria um personagem Poderoso
        Personagem poderoso = Personagem.criaPoderoso(90);

        // Imprime o personagem Poderoso
        System.out.println(poderoso);

        // Cria um personagem Soturno
        Personagem soturno = Personagem.criaSoturno(7);

        // Imprime o personagem Soturno
        System.out.println(soturno);

        // Cria um personagem Custom
        Personagem custom = Personagem.criaCustom(1, 1, 5);

        // Imprime o personagem Custom
        System.out.println(custom);
    }
}
