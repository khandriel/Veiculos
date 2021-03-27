import java.util.Scanner;

public class UI {
    public void Ui() {
        Scanner in = new Scanner(System.in);

        Catalogo c = new Catalogo();

        // Criação dos veículos
        Esportivo ftype = new Esportivo("F-Type", 310000, 2019, 2.0, "branco", "AWD", 300, 2);
        Esportivo sian = new Esportivo("Sian", 13323000, 2020, 2.0, "preto", "intg", 350, 2);
        Esportivo elise = new Esportivo("Elise", 520000, 2019, 1.8, "cinza", "traseira", 200, 2);

        Trilha troller = new Trilha("Troller", 150000, 2020, 3.0, "verde", "4x4", true, 1);
        Trilha wrangler = new Trilha("Wrangler", 200000, 2019, 2.0, "cinza", "4x4", false, 1);

        Transporte boxer = new Transporte("Boxer", 100000, 2015, 2.0, "branco", "traseira", 10, "couro");

        // Adição dos veículos ao catalogo
        c.addCatalogo(ftype);
        c.addCatalogo(sian);
        c.addCatalogo(elise);
        c.addCatalogo(troller);
        c.addCatalogo(wrangler);
        c.addCatalogo(boxer);

        boolean execut = true;
        while (execut) {
            System.out.println("---Interface---");
            System.out.println("1 - Veiculos a venda");
            System.out.println("2 - Busca por ano");
            System.out.println("3 - Busca por motor");
            System.out.println("4 - Sair");

            String s = in.next();

            switch (s) {
            case "1":
                System.out.println("---> Catalogo");
                System.out.println(c.imprimeCat());

            case "2":
                System.out.println("Digite o ano.");
                int ano = in.nextInt();
                System.out.println("Veiculos de ano " + ano + ":");
                c.getPorAno(ano);
                execut = false;
                break;

            case "3":
                System.out.println("Insira o motor. (Utilize virgula [,] como separador)");
                double mot = in.nextDouble();
                System.out.println("Veiculos com motor " + mot + ":");
                c.getPorMotor(mot);
                execut = false;
                break;

            case "4":
                System.out.println("Saindo...");
                execut = false;
                break;

            default:
                execut = false;
                break;

            }
        }
    }
}