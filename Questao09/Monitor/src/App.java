public class App {
    public static void main(String[] args)  {
        Monitor monitor = new Monitor("Hero", "AOC", 24, 144, "Preto");
        System.out.println(monitor.getMarca());
        System.out.println(monitor.getModelo());
        monitor.assistir();
    }
}
