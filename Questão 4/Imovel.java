public class Imovel {
    protected String endereco;
    protected double preco;

    public Imovel(String endereco, double preco) {
        this.endereco = endereco;
        this.preco = preco;
    }

    public void exibirDados() {
        System.out.println("Endereço: " + endereco);
        System.out.println("Preço: R$ " + preco);
    }
}