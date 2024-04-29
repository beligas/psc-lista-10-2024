public class App {
    public static void main(String[] args){
        GuardaRoupa guardaroupa = new GuardaRoupa(2, "Marrom", 4, 4);
        System.out.println(guardaroupa.getCor());
        System.out.println("O guarda roupa tem "+ guardaroupa.getQuantidadeDeGavetas()+" gavetas");
        guardaroupa.guardar();

    }
}
