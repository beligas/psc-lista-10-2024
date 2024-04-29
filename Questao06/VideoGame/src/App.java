public class App {
    public static void main(String[] args) {
        VideoGame videogame = new VideoGame("Sony", "PS4", 30, "Preto", 500);
        System.out.println(videogame.getModelo());
        videogame.jogar();
    }
}
