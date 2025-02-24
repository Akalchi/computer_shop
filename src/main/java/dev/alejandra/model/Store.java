package dev.alejandra.model;

import java.util.ArrayList;
import java.util.List;

public class Store {
 private String name;
    private String owner;
    private String taxId;
    private List<Computer> computers = new ArrayList<>();

    public Store(String name, String owner, String taxId) {
        this.name = name;
        this.owner = owner;
        this.taxId = taxId;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public String getTaxId() {
        return taxId;
    }

    public List<Computer> getComputers() {
        return computers;
    }
}
