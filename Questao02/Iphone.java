public class Iphone {

    private String marca;
    private String modelo;
    private int memoria;
    private int cameras;

    public Iphone(String marca, String modelo, int memoria, int cameras) {
        this.marca = marca;
        this.modelo = modelo;
        this.memoria = memoria;
        this.cameras = cameras;
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
    public int getMemoria() {
        return memoria;
    }
    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }
    public int getCameras() {
        return cameras;
    }
    public void setCameras(int cameras) {
        this.cameras = cameras;
    }

    public void fotos(){
        System.out.println("Vou tirar fotos com o iphone");
    }

    public void memoria(){
    System.out.println("Vou salvar os arquivos na memoria do iphone");
    }

    public void ligacao(){
        System.out.println("Vou ligar para minha mae");

    }
    }