package dev.alejandra.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import dev.alejandra.model.Store;
import dev.alejandra.model.Computer;

public class StoreControllerTests {
    private StoreController controller;
    private Store store;

    @BeforeEach
    void setUp() {
        store = new Store("Josin's ComputerShop", "Jose Luis", "123456789");
        controller = new StoreController(store);
    }

    @Test
    void testAddComputer() {
        Computer computer = new Computer("HP Pavillion", 8, "Intel i7", "Windows 10", 800.0);

        controller.addComputer(computer);

        List<Computer> computers = controller.getComputers();
        assertEquals(1, computers.size());
    }
}
