package dev.alejandra.controller;

import java.util.List;

import dev.alejandra.model.Computer;
import dev.alejandra.model.Store;

public class StoreController {
private Store store;

    public StoreController(Store store) {
        this.store = store;
    }

    public void addComputer(Computer computer) {
        store.getComputers().add(computer);
    }

    public List<Computer> getComputers() {
        return store.getComputers();
    }

    public void removeComputer(String brand) {
        store.getComputers().removeIf(c -> c.getBrand().equalsIgnoreCase(brand));
    }

    public Computer findComputer(String brand) {
        return store.getComputers().stream()
                .filter(c -> c.getBrand().equalsIgnoreCase(brand))
                .findFirst()
                .orElse(null);
    }

}
