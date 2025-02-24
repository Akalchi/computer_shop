package dev.alejandra.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtensionContext.Store;

import dev.alejandra.model.Computer;

public class StoreTest {
       private Store store;

    @BeforeEach
    void setUp() {
        store = new Store("Josin's ComputerShop", "Jose Luis", "123456789");
    }

    @Test
    void testCreateStore() {
        assertNotNull(store);
        assertEquals("Josin's ComputerShop", store.getName());
        assertEquals("Jose Luis", store.getOwner());
        assertEquals("123456789", store.getTaxId());
    }

    @Test
    void testGetComputerList() {
        List<Computer> computers = store.getComputers();
        assertNotNull(computers);
        assertTrue(computers.isEmpty());
    }
}
