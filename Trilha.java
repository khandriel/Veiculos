public class Trilha implements Veiculo{

    private String  nome;
    private int     preco;
    private int       ano;
    private double   motor;
    private String    cor;
    private String tracao;
    
    private Boolean snorkel;
    private int cargaMax;
   
    public Trilha( String nome,int preco, int ano, double motor, String cor, String tracao,
    Boolean snorkel, int cargaMax){
        super();
        this.nome = nome;
        this.preco = preco;
        this.ano = ano;
        this.motor = motor;
        this.cor = cor;
        this.tracao = tracao;
        this.snorkel = snorkel;
        this.cargaMax = cargaMax;
    }

     public Boolean getSnorkel(){
        return snorkel;
    }

     public int getCargaMax(){
        return cargaMax;
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