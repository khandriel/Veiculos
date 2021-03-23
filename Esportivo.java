public class Esportivo extends Veiculo {

    private int velocidadeMax;
    private int quantidadePortas;

    public Esportivo(int preco, int ano, float motor, String cor, String tracao,
    int velocidadeMax, int quantidadePortas){
        super(preco, ano, motor, cor, tracao);
        this.velocidadeMax = velocidadeMax;
        this.quantidadePortas = quantidadePortas;
    }

    public int getVelocidadeMax(){
        return velocidadeMax;
    }

    public int getQuantidadePortas(){
        return quantidadePortas;
    }

}