import java.util.Scanner;

public class UI{
    public void Ui(){
        Scanner in = new Scanner(System.in);

        Catalogo cat = new Catalogo();

        boolean execut = true;
        while(execut){
            System.out.println("---Interface---");
            System.out.println("1 - Veiculos a venda");
            System.out.println("2 - Busca por ano");
            System.out.println("3 - Busca por motor");
            System.out.println("4 - Sair");

            String s = in.next();

            switch(s){
                case "1":
                    System.out.println("---> Catalogo");
                    System.out.println(cat.imprimeCat());

                case "2":                 
                    System.out.println(cat.getPorAno());

                case "3":
                    System.out.println(cat.getPorMotor());
            
                case "4":
                    System.out.println("Saindo...");
                    break;
                
                default: break;
                
            }
        }
    }
}