public class GuardaRoupa {
    private int tamanho;
    private String cor;
    private int quantidadeDeGavetas;
    private int quantidadeDePortas;

    
    
    public GuardaRoupa(int tamanho, String cor, int quantidadeDeGavetas, int quantidadeDePortas) {
        this.tamanho = tamanho;
        this.cor = cor;
        this.quantidadeDeGavetas = quantidadeDeGavetas;
        this.quantidadeDePortas = quantidadeDePortas;
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

    public int getQuantidadeDeGavetas() {
        return quantidadeDeGavetas;
    }

    public void setQuantidadeDeGavetas(int quantidadeDeGavetas) {
        this.quantidadeDeGavetas = quantidadeDeGavetas;
    }

    public int getQuantidadeDePortas() {
        return quantidadeDePortas;
    }

    public void setQuantidadeDePortas(int quantidadeDePortas) {
        this.quantidadeDePortas = quantidadeDePortas;
    }
    
public void guardar(){
        System.out.println("Vou guardar as roupas que lavei no Guarda-Roupa");
    }
    }

    

