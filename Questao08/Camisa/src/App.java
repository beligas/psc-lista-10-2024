public class App {
    public static void main(String[] args)  {
        Camisa camisa = new Camisa("Nike", "Casual", "Preta", "M");
        System.out.println(camisa.getMarca());
        camisa.sair();
    }
}
