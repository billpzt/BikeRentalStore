package org.example.controller;

import org.example.model.Bike;
import org.example.repository.BikeRepository;

public class BikeController {

    BikeRepository bikeRepository = new BikeRepository();

    // Listar

    // Inserir
    public Bike insert(
            String available,
            String type,
            int size,
            String make,
            String model,
            double dailyHireRate,
            double deposit
    ) {
        Bike bike = new Bike(
                available,
                type,
                size,
                make,
                model,
                dailyHireRate,
                deposit
        );
        return bikeRepository.create(bike);
    }

    // Exibir

    // Atualizar

    // Remover
}
