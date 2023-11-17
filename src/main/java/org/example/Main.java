package org.example;

import org.example.controller.BikeController;
import org.example.model.Bike;

public class Main {
    public static void main(String[] args) {
        String available = "disponivel";
        String type = "Infantil";
        int size = 1;
        String make = "Marca";
        String model = "Modelo XPTO";
        double dailyHireRate = 2.00;
        double deposit = 10.00;

        BikeController bikeController = new BikeController();
        Bike bike = bikeController.insert(available, type, size, make, model, dailyHireRate, deposit);

        var listaBikes = bikeController.getAll();
        System.out.println("Produto inserido: ");
        System.out.println(listaBikes.size());
    }
}