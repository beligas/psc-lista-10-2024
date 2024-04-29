public class Garrafa {
    private String marca;
    private String cor;
    private int quantidade;


    
    public Garrafa(String marca, String cor, int quantidade) {
        this.marca = marca;
        this.cor = cor;
        this.quantidade = quantidade;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public void beber(){
        System.out.println("Vou beber agua da minha garrafa");
    }
    public void levar(){
        System.out.println("Vou levar agua na minha garrafa");
    }
}
