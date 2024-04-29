public class VideoGame {
    private String marca;
    private String modelo;
    private int tamanho;
    private String cor;
    private int memoria;

    
    public VideoGame(String marca, String modelo, int tamanho, String cor, int memoria) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanho = tamanho;
        this.cor = cor;
        this.memoria = memoria;
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
    public int getTamanho() {
        return tamanho;
    }
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getMemoria() {
        return memoria;
    }
    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public void jogar(){
        System.out.println("Vou jogar online com meus amigos");
    }

    public void video(){
        System.out.println("Vou assistir um video");

    }
    public void salvar(){
        System.out.println("Vou clipar essa jogada");
    }
}
