public class Monitor {
    private  String modelo;
    private String marca;
    private int polegadas;
    private int hertz;
    private String cor;
    
    public Monitor(String modelo, String marca, int polegadas, int hertz, String cor) {
        this.modelo = modelo;
        this.marca = marca;
        this.polegadas = polegadas;
        this.hertz = hertz;
        this.cor = cor;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getPolegadas() {
        return polegadas;
    }
    public void setPolegadas(int polegadas) {
        this.polegadas = polegadas;
    }
    public int getHertz() {
        return hertz;
    }
    public void setHertz(int hertz) {
        this.hertz = hertz;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public void assistir(){
        System.out.println("Vou assistir uns videos no meu monitor");

    }
    public void ver(){
        System.out.println("Vou ver foto pelo monitor com computador");
    }
}
