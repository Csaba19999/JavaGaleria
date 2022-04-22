/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modell;

import java.io.File;
import java.util.Date;

/**
 *
 * @author menesi.csaba
 */
public class Festmeny extends KiallitasiTargy{
    String eleresiUt;

    public Festmeny(String eleresiUt, String keszito, String cim) {
        super(keszito, cim);
        megjelenito(eleresiUt);
        this.eleresiUt = eleresiUt;
    }

    public Festmeny(String eleresiUt, Date letrehozasiDatum, String keszito, String cim) {
        super(letrehozasiDatum, keszito, cim);
        this.eleresiUt = eleresiUt;
    }

     public void megjelenito(String filePath){
        File file = new File(filePath);
        if (file.exists()) {
            System.out.println("Megjelenítés folyamatban...");
        }
        else {
            System.out.println("Nem lehet megjeleníteni!");
        }
    }

    public String getEleresiUt() {
        return eleresiUt;
    }
    
}
