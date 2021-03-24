import java.util.ArrayList;
import java.util.List;

public class Catalogo {
    //Criação da classe Catalogo

    //Aguardando merge com Veiculos.java

    private ArrayList<Veiculos> veiculos;

    public Catalogo(){
        veiculos =  new ArrayList<>();
    }

    public void addCatalogo(Veiculo v){
        veiculos.add(v);
    }

    public int qtdade(){
        return veiculos.size();
    }

    public Veiculo getPorAno(int ano){
        for(Veiculos v : veiculos){
            if(v.getAno() == ano){
                return v;
            }
        }
        return null;
    }
    
}
