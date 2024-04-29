public class App {
    public static void main(String[] args)  {
        Tenis tenis = new Tenis("Nike", "Tw", "Branco", 41);
        System.out.println(tenis.getMarca());
        tenis.passear();
    }
}
