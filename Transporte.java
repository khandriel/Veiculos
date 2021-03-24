public class Transporte extends Veiculo{

    private int passageiros;
    private String revestimento;

    public Transporte(String nome,int preco, int ano, float motor, String cor, String tracao,
        int passageiros, String revestimento){
        
        super(nome, preco, ano, motor, cor, tracao);
        this.passageiros = passageiros;
        this.revestimento = revestimento;
    }

    public int getPassageiros(){
        return passageiros;
    }

    public String getRevestimento(){
        return revestimento;
    }

}