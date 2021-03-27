import java.util.ArrayList;
import java.util.List;

public class Catalogo {
    //Criação da classe Catalogo

    //Aguardando merge com Veiculos.java

    private ArrayList<Veiculo> veiculos;

    public Catalogo(){
        veiculos =  new ArrayList<>();
    }

    public void addCatalogo(Veiculo v){
        veiculos.add(v);
    }

    public int qtdade(){
        return veiculos.size();
    }

    public void getPorAno(int ano){
        for(Veiculo v : veiculos){
            if(v.getAno() == ano){
                System.out.println(v.getNome());
            }
        }
    }

    public void getPorMotor(double motor){
        for(Veiculo v: veiculos){
            if(v.getMotor() == motor){
                System.out.println(v.getNome());
            }
        }
    }


    public String imprimeCat(){
        String cat = "";
        for(Veiculo v : veiculos){
            cat += "\n->" + v.getNome() + " | " + "R$" + v.getPreco() + " | " + "Ano: " + v.getAno() + " | " + "Motor: " 
            + v.getMotor() + " | " + v.getCor() + " | " + "Tracao: " + v.getTracao() + " |\n ";
        }
        return(cat);
    }
    
}
