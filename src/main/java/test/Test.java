package test;

import entities.Machine;
import entities.Salle;
import services.MachineService;
import services.SalleService;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        SalleService salleService = new SalleService();
        MachineService machineService = new MachineService();

        //Salles
        Salle salle1 = new Salle("A1");
        Salle salle2 = new Salle("B2");
        salleService.create(salle1);
        salleService.create(salle2);

        //Machines
        Machine machine1 = new Machine("M123", new Date(),salleService.findById(1));
        Machine machine2 = new Machine("M124", new Date(),salleService.findById(2));
        machineService.create(machine1);
        machineService.create(machine2);

        //affichage
        for(Salle salle : salleService.findAll()){
            System.out.println("Salle: " + salle.getCode());
        }
        for(Machine machine : machineService.findAll()){
            System.out.println("Machine: " + machine.getRef() );
        }

        //Methode findBetweenDate
        Date d1 = new Date(110,0,1);
        Date d2 = new Date();
        System.out.println("machines achetes entre " + d1 + " et "+ d2 + ":");
        for(Machine m :machineService.findBetweenDate(d1,d2)){
            System.out.println("machine: " + m.getRef() + "Achete le "+ m.getDateAchat());
        }

    }
}
