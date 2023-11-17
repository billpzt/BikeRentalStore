package org.example.repository;

import org.example.model.Bike;

import java.util.List;

public class BikeRepository {
    public int lastId = 0;
    private List<Bike> bikes;
    // Listar
    public List<Bike> list() {
        return bikes;
    }

    // Criar
    public Bike create(Bike bike) {
        bike.setId(lastId++);
        bikes.add(bike);
        return bike;
    }

    // Ler

    // Atualizar

    // Excluir
}
