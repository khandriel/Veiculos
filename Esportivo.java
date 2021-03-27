public class Esportivo implements Veiculo {

    private String  nome;
    private int     preco;
    private int       ano;
    private double   motor;
    private String    cor;
    private String tracao;
    private int velocidadeMax;
    private int quantidadePortas;

    public Esportivo(String nome ,int preco, int ano, double motor, String cor, String tracao,
    int velocidadeMax, int quantidadePortas){
        super();

        this.nome = nome;
        this.preco = preco;
        this.ano = ano;
        this.motor = motor;
        this.cor = cor;
        this.tracao = tracao;
        this.velocidadeMax = velocidadeMax;
        this.quantidadePortas = quantidadePortas;
    }

    public int getVelocidadeMax(){
        return velocidadeMax;
    }

    public int getQuantidadePortas(){
        return quantidadePortas;
    }
    
    @Override
    public String getNome() {      
        return nome;
    }

    @Override
    public int getPreco() {
        return preco;
    }

    @Override
    public int getAno() {      
        return ano;
    }

    @Override
    public double getMotor() {   
        return motor;
    }

    @Override
    public String getCor() {     
        return cor;
    }

    @Override
    public String getTracao() {      
        return tracao;
    }

}