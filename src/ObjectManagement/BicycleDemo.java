/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectManagement;

import EnumBicycle.BikeTools;
import EnumBicycle.BrakeType;
import EnumBicycle.Material;
import EnumBicycle.MountainSuspension;

/**
 *
 * @author tiago
 */
public class BicycleDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
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
        
        //print das bicicletas b1 e b2
        System.out.println(b1.toString());
        System.out.println("-------===--------");
        System.out.println(b2.toString());
        
        //adição de 10 tools(maximo) à biciletaM1
        bicicletaM1.addTool(BikeTools.piruças);
        System.out.println(bicicletaM1.listarTools());
        System.out.println("----------------");
        bicicletaM1.addTool(BikeTools.fones);
        System.out.println(bicicletaM1.listarTools());
        System.out.println("----------------");
        bicicletaM1.addTool(BikeTools.capacete);
        System.out.println(bicicletaM1.listarTools());
        System.out.println("----------------");
        bicicletaM1.addTool(BikeTools.Garrafa);
        System.out.println(bicicletaM1.listarTools());
        System.out.println("----------------");
        bicicletaM1.addTool(BikeTools.livro);
        System.out.println(bicicletaM1.listarTools());
        System.out.println("----------------");
        bicicletaM1.addTool(BikeTools.luvas);
        System.out.println(bicicletaM1.listarTools());
        System.out.println("----------------");
        bicicletaM1.addTool(BikeTools.pc);
        System.out.println(bicicletaM1.listarTools());
        System.out.println("----------------");
        bicicletaM1.addTool(BikeTools.pneus);
        System.out.println(bicicletaM1.listarTools());
        System.out.println("----------------");
        bicicletaM1.addTool(BikeTools.radio);
        System.out.println(bicicletaM1.listarTools());
        System.out.println("----------------");
        bicicletaM1.addTool(BikeTools.telemovel);
        System.out.println(bicicletaM1.listarTools());
        System.out.println("----------------");
        
        //alterar tool fones por tool rato
        bicicletaM1.editTool(BikeTools.fones, BikeTools.rato);
        System.out.println(bicicletaM1.listarTools());
        System.out.println("----------------");
        
        //remover tool livro
        bicicletaM1.removeTool(BikeTools.livro);
        System.out.println(bicicletaM1.listarTools());
        System.out.println("----------------");
        
        //print bicicleta montanha
        System.out.println(bicicletaM1.toString());
        
        //instancia BicycleManagment
        BicycleManagment lista1 = new BicycleManagment();
        
        //adição bicicleta de montanha b1
        lista1.addBike(b1);
        System.out.println(lista1.toString());
        System.out.println("--------------------");
        
        //adição bicicleta de estrada b2
        lista1.addBike(b2);
        System.out.println(lista1.toString());
        System.out.println("--------------------");
        
        //adição bicicleta de estrada b3
        lista1.addBike(b3);
        System.out.println(lista1.toString());
        System.out.println("--------------------");
        
        //adição bicicleta de estrada b4
        lista1.addBike(b4);
        System.out.println(lista1.toString());
        System.out.println("--------------------");
        
        //adição bicicleta de montanha bicicletaM1
        lista1.addBike(bicicletaM1);
        System.out.println(lista1.toString());
        System.out.println("--------------------");
        
        //remoção da bicicleta de montanha b2
        lista1.removeBike(3);
        System.out.println(lista1.toString());
        System.out.println("--------------------");
        
        //editar bicicleta
        lista1.editBike(5, bicicletaM1);
        System.out.println(lista1.toString());
    }
    
}
