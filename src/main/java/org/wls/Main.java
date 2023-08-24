package org.wls;

import org.wls.behavioral.memento.Caretaker;
import org.wls.behavioral.memento.Originator;
import org.wls.behavioral.visitor.*;
import org.wls.creational.singleton.DatabaseDriver;
import org.wls.creational.singleton.Repository;
import org.wls.structural.adapter.Car;
import org.wls.structural.adapter.CarAdapter;
import org.wls.structural.adapter.CarMuncher;
import org.wls.structural.adapter.Motorcycle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do Design Pattern que deseja visualizar!");
        System.out.println("Opções: <visitor> <singleton> <adapter> <memento>");

        String opt = scanner.nextLine();

        switch (opt){
            case "visitor":
                House house = new House("Casa torta");
                Industry industry = new Industry("Industria Concreta");
                Hospital hospital = new Hospital("Cura em onda");
                Commerce commerce = new Commerce("Mercadinho das tomates");

                List<Visitable> buildsList = new ArrayList<>(List.of(house,industry,hospital,commerce));

                for(Visitable build : buildsList){
                    build.accept(new Visitor());
                }
                break;

            case "singleton":
                DatabaseDriver firstInstance = Repository.getInstance().getDriver();
                DatabaseDriver secondInstance = Repository.getInstance().getDriver();
                DatabaseDriver thirdInstance = Repository.getInstance().getDriver();

                System.out.println("Objetos que possuem o mesmo endereço em todo lugar: " + firstInstance + secondInstance + thirdInstance);
                break;
            case "adapter":
                CarMuncher muncher = new CarMuncher();

                Car hillux = new Car("hillux");
                Motorcycle sequoia = new Motorcycle("sequoia");

                //Let's fit a adapter from tree to car here
                CarAdapter adaptee = new CarAdapter(sequoia);

                muncher.destroyCar(hillux);
                muncher.destroyCar(adaptee);
                break;
            case "memento":
                String placeholderString = "Estado atual no originator: ";
                Originator originator = new Originator("Estado Inicial");
                Caretaker caretaker = new Caretaker(originator);

                // Estado inicial...
                System.out.println(placeholderString + originator.getState());

                // Salvando o primeiro estado...
                caretaker.saveCurrentState();
                originator.setState("Estado número 2...");
                System.out.println(placeholderString + originator.getState());

                caretaker.saveCurrentState();
                originator.setState("Estado número 3...");
                System.out.println(placeholderString + originator.getState());

                caretaker.undo();
                System.out.println(placeholderString + originator.getState());
                caretaker.undo();

                System.out.println("Estado final do originator: " + originator.getState());
                break;

            default:
                System.out.println("Opção inválida...");
        }

    }
}