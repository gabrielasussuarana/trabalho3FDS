enum Categoria { NORMAL, ADVANCED, PREMIUM }; 
public class ContaB{ 
    public ContaB(ContaB.Builder builder) {
    }

    public enum Categoria{NORMAL,ADVANCED, PREMIUM}
    private Categoria categoriaInicial;
    private long numero;
    private String nomeCorrentista;
    private int saldoLivreInicial;
    private int salAplicacaoInicial;
    private static double taxaRemuneracao;
    private double taxaSaldoNegativo;

public static class Builder{
    private Categoria categoriaInicial=Categoria.NORMAL;
    private long numero;
    private String nomeCorrentista;
    private int saldoLivreInicial;
    private int salAplicacaoInicial;
    private double taxaSaldoNegativo;
    private double taxaRemuneracao;
    this.numero=numero;
    this.nomeCorrentista=nomeCorrentista;
    

    public Builder(){

    }

    public Builder contaCategoria(Categoria categoriaInicial){
        this.categoriaInicial = categoriaInicial;
        return this;
    }

    public Builder contaNumer(long numero){
        this.numero=numero;
        return this;
    }

    public Builder contaNome(String nomeCorrentista){
        this.nomeCorrentista=nomeCorrentista;
        return this;
    }

    public Builder contaSaldoLivre(int saldoLivreInicial){
        this.saldoLivreInicial=saldoLivreInicial;
        return this;
    }

    public Builder contaSalAplicacao(int salAplicacaoInicial){
        this.salAplicacaoInicial=salAplicacaoInicial;
        return this;
    }

    public Builder contaTaxaRemuneracao(double contaTaxaRemuneracao){
        this.taxaRemuneracao=taxaRemuneracao;
        return this;
    }

    public Builder contaTaxaSaldoNegativo(double taxaSaldoNegativo){
        this.taxaSaldoNegativo=taxaSaldoNegativo;
        return this;
    }

    public ContaB build(){
        return new ContaB(this);
    }

    private ContaB (Builder builder){
        this.categoriaInicial = builder.contaCategoria;
        this.numero=builder.contaNumer;
        this.nomeCorrentista=builder.nomeCorrentista;
        this.salAplicacaoInicial=builder.salAplicacaoInicial;
        this.saldoLivreInicial=builder.salAplicacaoInicial;
        this.salAplicacaoInicial=builder.salAplicacaoInicial;
        this.taxaRemuneracao= builder.taxaRemuneracao;
        this.taxaSaldoNegativo=builder.taxaSaldoNegativo;
    }
}