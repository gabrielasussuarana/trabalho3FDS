package src;
public class Personagem{
    private TipoPersonagem tipoPersonagem;
    private int visibilidade;
    private int poder;
    private int vidas;

    private Personagem(TipoPersonagem tipoPersonagem, int visibilidade, int poder, int vidas){
        this.tipoPersonagem = tipoPersonagem;
        this.visibilidade = visibilidade;
        this.poder = poder;
        this.vidas = vidas;
    }

    public static Personagem criaNormal(){
        return new Personagem(TipoPersonagem.NORMAL, 10, 50, 3);
    }

    public static Personagem criaPoderoso(int poder){
        return new Personagem(TipoPersonagem.PODEROSO, 10, poder, 3);
    }

    public static Personagem criaSoturno(int visibilidade){
        return new Personagem(TipoPersonagem.SOTURNO, visibilidade, 50, 3);
    }

    public static Personagem criaCustom(int visibilidade, int poder, int vidas){
        return new Personagem(TipoPersonagem.CUSTOM, visibilidade, poder, vidas);
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
        return "PERSONAGEM " + tipoPersonagem + "\nvisibildade= " + this.visibilidade + "\npoder= " + this.poder + "\nvidas= " + this.vidas + "\n";
    }
}