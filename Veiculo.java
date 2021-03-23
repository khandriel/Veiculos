public abstract class Veiculo{
    
    private int     preco;
    private int       ano;
    private float   motor;
    private String    cor;
    private String tracao;

    public Veiculo (int preco, int ano, float motor, String cor, String tracao){
        this.preco = preco;
        this.ano = ano;
        this.motor = motor;
        this.cor = cor;
        this.tracao = tracao;

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