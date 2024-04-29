public class App {
    public static void main(String[] args) {
        Carro carro = new Carro("Ford", "Fusion", 175, 25, "Branco");

        System.out.println("A cor do carro é " + carro.getCor());
        carro.viajar();

    }
}
