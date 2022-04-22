package main;

import java.util.Date;
import modell.Galeria;

public class Program {
    public static void main(String[] args) {
        Galeria galeria = new Galeria("Vangog", "Sikoly");
        Date maiDatum = new Date();
        Galeria galeria1 = new Galeria(maiDatum,"Vangog", "Sikoly");
        Date holnapiDatum = new Date(2022, 05, 12);
        Galeria galeria2 = new Galeria(holnapiDatum, "Vangog", "Sikoly");
        Galeria galeria3 = new Galeria("Vangog", "Sikoly");
        Galeria galeria4 = new Galeria("Vangog", "Sikoly");
    }
    
}
