public class Burguer extends Produto {
    private int gramas;

    public int getGramas() {
        return gramas;
    }

    public void setGramas(int gramas) {
        this.gramas = gramas;
    }

    Burguer(int gramas, String descricao, double preco){
        super(descricao,preco);
        this.gramas = gramas;

    }

    public String getInfo(){
         return getDescricao() + " " + getGramas() + " " + getPreco();
    }
}
