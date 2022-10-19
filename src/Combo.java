public class Combo {
    Burguer burguer;
    Sobremesa sobremesa;

    Bebida bebida;
    public void CriarCombo(int tipo){

        switch(tipo){
            case 1:
            {
                burguer = new Burguer(150, "Hamburguer bovino ao ponto", 24.50);
                sobremesa = new Sobremesa( "Médio", "Sorvete de baunilha com calda de chocolate", 10.80);
                bebida = new Bebida(400, "Refrigerante de cola com gelo", 8.50);
            }
            case 2:
            {
                burguer = new Burguer(250, "Hamburguer bovino ao ponto", 26.50);
                sobremesa = new Sobremesa( "Grande", "Sorvete de baunilha com calda de chocolate", 12.80);
                bebida = new Bebida(750, "Refrigerante de cola com gelo", 10.50);
            }
        }


    }
    public void Mostrar_Combo(){
        System.out.println(burguer.getInfo());
        System.out.println(sobremesa.getInfo());
        System.out.println(bebida.getInfo());
    }

}
