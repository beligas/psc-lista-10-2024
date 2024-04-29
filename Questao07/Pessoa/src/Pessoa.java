public class Pessoa {
    private String nome;
    private int tamanho;
    private String cor;
    private int idade;

    
    public Pessoa(String nome, int tamanho, String cor, int idade) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.cor = cor;
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getTamanho() {
        return tamanho;
    }
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void dormir(){
        System.out.println("Vou ir dormir");
    }

    public void caminhar(){
        System.out.println("Vou ir caminhar");
     }

     public void trabalhar(){
        System.out.println("Estou saindo para trabalhar");
     }

     public void comer(){
        System.out.println("Vou almoçar");

     }
     public void estudar(){
        System.out.println("Vou começar a estudar 18 horas");
     }
}
