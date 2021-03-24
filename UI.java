import java.util.Scanner;

public class UI{
    public void Ui(){
        Scanner in = new Scanner(System.in);

        //Catalogo cat = new Catalogo();

        boolean execut = true;
        while(execut){
            System.out.println("---Interface---");
            System.out.println("1 - Carros a venda");
            System.out.println("2 - Carros esportivos");
            System.out.println("3 - Carros de trilha");
            System.out.println("4 - Sair");

            String s = in.next();

            switch(s){
                case "1":
                    //Lista todos os carros a venda do catalogo


                case "2":
                    //Lista carros esportivos a venda


                case "3":
                    //Lista carros de trilha a venda 
                

                case "4":
                    System.out.println("Venda cancelada.");
                    break;
                    

                default: break;
                
            }
        }
    }
}