public class Novo extends Imovel {
    private double adicional;

    public Novo(String endereco, double preco, double adicional) {
        super(endereco, preco);
        this.adicional = adicional;
    }

    public double precoFinal() {
        return preco + adicional;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Adicional: R$ " + adicional);
        System.out.println("Preço final: R$ " + precoFinal());
    }
}