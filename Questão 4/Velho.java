public class Velho extends Imovel {
    private double desconto;

    public Velho(String endereco, double preco, double desconto) {
        super(endereco, preco);
        this.desconto = desconto;
    }

    public double precoFinal() {
        return preco - desconto;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Preço final: R$ " + precoFinal());
    }
}