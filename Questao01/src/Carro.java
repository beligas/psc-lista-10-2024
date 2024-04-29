public class Carro{
    private String marca;
    private String modelo;
    private int potencia;
    private int torque;
    private String cor;

    public Carro(String marca, String modelo, int potencia, int torque, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        this.torque = torque;
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
    public int getPotencia() {
        return potencia;
    }
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    public int getTorque() {
        return torque;
    }
    public void setTorque(int torque) {
        this.torque = torque;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public void viajar(){
        System.out.println("vou viajar com o carro");
    }

    public void passear(){
        System.out.println("vou dar uma volta com o carro");
    }

   public void carregar(){
    System.out.println("vou carregar as malas para o carro");
   }
   public static void main(String[] args) {
    Carro carro = new Carro("Ford", "Fusion", 175, 25, "Branco");

    System.out.println("A cor do carro é " + carro.getCor());
    carro.viajar();

}
}
    