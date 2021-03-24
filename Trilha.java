public class Trilha extends Veiculo{

    private Boolean snorkel;
    private int cargaMax;

    public Trilha( String nome,int preco, int ano, float motor, String cor, String tracao,
    Boolean snorkel, int cargaMax){
        super(nome,preco, ano, motor, cor, tracao);
        this.snorkel = snorkel;
        this.cargaMax = cargaMax;
    }

     public Boolean getSnorkel(){
        return snorkel;
    }

     public int getCargaMax(){
        return cargaMax;
    }
}