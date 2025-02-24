package dev.alejandra.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dev.alejandra.controller.StoreController;
import dev.alejandra.model.Computer;
import dev.alejandra.model.Store;

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

    @Test
    void testRemoveComputer() {
        Computer computer = new Computer("HP Pavillion", 8, "Intel i7", "Windows 10", 800.0);
        controller.addComputer(computer);

        controller.removeComputer("HP Pavillion");

        assertEquals(0, controller.getComputers().size());
    }

    @Test
    void testFindComputer() {
        Computer computer = new Computer("HP Pavillion", 8, "Intel i7", "Windows 10", 800.0);
        controller.addComputer(computer);

        Computer found = controller.findComputer("HP Pavillion");

        assertNotNull(found);
        assertEquals("HP Pavillion", found.getBrand());
    }

    @Test
    void testListComputers() {
        Computer computer1 = new Computer("HP Pavillion", 8, "Intel i7", "Windows 10", 800.0);
        Computer computer2 = new Computer("Lenovo", 16, "Intel i8", "Windows 11", 1200.0);

        controller.addComputer(computer1);
        controller.addComputer(computer2);

        assertEquals(2, controller.getComputers().size());
    }

}
