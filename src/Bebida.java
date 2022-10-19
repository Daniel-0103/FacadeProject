public class Bebida extends Produto{
    private int Ml;

    public int getMl() {
        return Ml;
    }

    public void setMl(int ml) {
        Ml = ml;
    }
    Bebida(int Ml, String descricao, double preco){
        super(descricao,preco);
        this.Ml = Ml;
    }
    public String getInfo(){
        return getDescricao() + " " + getMl() + " " + getPreco();
    }
}
