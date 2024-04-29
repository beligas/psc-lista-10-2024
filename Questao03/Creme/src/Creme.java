public class Creme {
    private String marca;
    private String modelo;
    private int quantidade;
    private String cor;

    
    public Creme(String marca, String modelo, int quantidade, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.quantidade = quantidade;
        this.cor = cor;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public void passar(){
        System.out.println("Vou passar o creme");

    }
    public void qualidade(){
        System.out.println("O creme deixou as maos macias");
    }
}
