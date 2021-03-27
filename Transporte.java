public class Transporte implements Veiculo{

    private String  nome;
    private int     preco;
    private int       ano;
    private float   motor;
    private String    cor;
    private String tracao;
    private int passageiros;
    private String revestimento;

    public Transporte(String nome,int preco, int ano, float motor, String cor, String tracao,
        int passageiros, String revestimento){
        
        super();
        this.nome = nome;
        this.preco = preco;
        this.ano = ano;
        this.motor = motor;
        this.cor = cor;
        this.tracao = tracao;
        this.passageiros = passageiros;
        this.revestimento = revestimento;
    }

    public int getPassageiros(){
        return passageiros;
    }

    public String getRevestimento(){
        return revestimento;
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