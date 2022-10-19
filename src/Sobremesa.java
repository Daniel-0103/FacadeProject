public class Sobremesa extends Produto{
    private String tamanho;

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    Sobremesa(String tamanho, String descricao, double preco){
        super(descricao,preco);
        this.tamanho = tamanho;
    }
    public String getInfo(){
        return getDescricao() + " " + getTamanho() + getPreco();
    }
}
