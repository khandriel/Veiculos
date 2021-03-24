public abstract class Veiculo{
    
    private String  nome;
    private int     preco;
    private int       ano;
    private float   motor;
    private String    cor;
    private String tracao;

    public Veiculo (String nome ,int preco, int ano, float motor, String cor, String tracao){
        this.nome = nome;
        this.preco = preco;
        this.ano = ano;
        this.motor = motor;
        this.cor = cor;
        this.tracao = tracao;

    }

    public String getNome(){
        return(nome);
    }

    public int getPreco(){
        return(preco);
    }

    public int getAno(){
        return(ano);
    }

    public float getMotor(){
        return(motor);
    }

    public String getCor(){
        return(cor);
    }

    public String getTracao(){
        return(tracao);
    }

}