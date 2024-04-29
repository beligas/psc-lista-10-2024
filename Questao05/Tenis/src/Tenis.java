    public class Tenis {
    private String marca;
    private String modelo;
    private String cor;
    private int tamanho;

    
    public Tenis(String marca, String modelo, String cor, int tamanho) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.tamanho = tamanho;
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
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getTamanho() {
        return tamanho;
    }
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;

    }
    public void passear(){
        System.out.println("Vou calçar meu tenis para passear");
    }

    public void exercitar(){
        System.out.println("Vou calçar meu tenis para ir na academia");
    }
}
