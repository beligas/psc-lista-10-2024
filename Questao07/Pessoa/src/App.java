public class App {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Joao", 175, "Branco", 19);
        System.out.println(pessoa.getNome());
        pessoa.estudar();
    }
}
