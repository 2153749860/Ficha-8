/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectManagement;

import EnumBicycle.BrakeType;
import EnumBicycle.Material;
import EnumBicycle.MountainSuspension;
import java.util.Arrays;

/**
 *
 * @author tiago
 */
public class BikeDemoCountainer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Instancia de bicicletaM1 de id == 1
        MountainBike bicicletaM1 = new MountainBike(2, MountainSuspension.Simples, 1, 3, "cor de rosa", 4, BrakeType.P, Material.Carbono, 20, 2);
        //Instancia de b1 de id == 3
        Bicycle b1 = new MountainBike(2, MountainSuspension.Simples, 3, 3, "cor de rosa", 4, BrakeType.P, Material.Carbono, 20, 2);
        //Instancia de b2 de id == 5
        Bicycle b2 = new RoadBike("Azuis", "Rápida", 2, 5, 5, "Azul", 8, 20, 5);
        //Instancia de b3 de id == 7
        Bicycle b3 = new RoadBike("Vermelhas", "Rápida", 2, 7, 5, "vermelho", 8, 20, 5);
        //Instancia de b4 de id == 9
        Bicycle b4 = new RoadBike("Verdes", "Rápida", 2, 9, 5, "Verde", 8, 20, 5);
        
        //instancia da data da venda
        SaleDate data1 = new SaleDate(2,"Abril", 2019);
        
        //instancia da venda
        BicycleSalesManagement sale1 = new BicycleSalesManagement(1, data1, 5);
        
        //adição de 3 bicicletas
        sale1.addBicycle(b4);
        sale1.addBicycle(b3);
        sale1.addBicycle(b2);
        
        //System.out.println(sale1.getObject(0));
        
        System.out.println(Arrays.toString(sale1.getAllBicycles()));


        //print da venda
        
        //System.out.println(sale1.toString());
        //sale1.setObject(0, b2);
        //System.out.println(sale1.toString());
        //System.out.println();
        
        //remoção de duas bicicletas
        //sale1.removeBicycle(b1);
        //print da venda
        //System.out.println(sale1.toString());
        
    }
    
}
