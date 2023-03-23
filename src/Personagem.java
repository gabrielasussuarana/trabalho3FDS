package src;
public class Personagem{
    private int visibilidade;
    private int poder;
    private int vidas;

    private Personagem(int visibilidade, int poder, int vidas){
        this.visibilidade = visibilidade;
        this.poder = poder;
        this.vidas = vidas;
    }

    public static Personagem criaNormal(){
        return new Personagem(10, 50, 3);
    }

    public static Personagem criaPoderoso(int poder){
        return new Personagem(10, poder, 3);
    }

    public static Personagem criaSoturno(int visibilidade){
        return new Personagem(visibilidade, 50, 3);
    }

    public static Personagem criaCustom(int visibilidade, int poder, int vidas){
        return new Personagem(visibilidade, poder, vidas);
    }

    public int getVisibilidade(){
        return this.visibilidade;
    }

    public int getPoder(){
        return this.poder;
    }

    public int getVidas(){
        return this.vidas;
    }

    public String toString(){
        return "Personagem\nvisibildade= " + this.visibilidade + "\npoder= " + this.poder + "\nvidas= " + this.vidas + "\n";
    }
}