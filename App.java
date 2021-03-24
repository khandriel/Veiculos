public class App {
    public static void main (String[] args){
        Catalogo c = new Catalogo();

        Veiculo ftype = new Esportivo("F-Type", 310000, 2019, 2.0, "branco", "AWD", 300, 2);
        Veiculo sian = new Esportivo("Lambo Sian", 13323000, 2020, 2.0, "preto", "intg", 350, 2);
        Veiculo elise = new Esportivo("Lotus Elise", 520000, 2019, 1.8, "cinza", "traseira", 200, 2);

        Veiculo troller = new Trilha("Troller", 150000, 2020, 3.0, "verde", "4x4", true, 1);
        Veiculo wrangler = new Trilha("Wrangler", 200000, 2019, 2.0, "cinza", "4x4", false, 1);

        Veiculo boxer = new Transporte("Boxer", 100000, 2015, 2.0, "branco", "traseira", 10, 0);

        c.addCatalogo(ftype);
        c.addCatalogo(sian);
        c.addCatalogo(elise);
        c.addCatalogo(troller);
        c.addCatalogo(wrangler);
        c.addCatalogo(boxer);
            
    }
}
