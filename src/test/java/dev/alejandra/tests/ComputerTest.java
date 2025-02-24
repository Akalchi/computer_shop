package dev.alejandra.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import dev.alejandra.model.Computer;

public class ComputerTest {
    @Test
    void testCreateComputer() {
        Computer computer = new Computer("HP Pavillion", 8, "Intel i7", "Windows 10", 800.0);

        assertNotNull(computer);
        assertEquals("HP Pavillion", computer.getBrand());
        assertEquals(8, computer.getMemory());
        assertEquals("Intel i7", computer.getProcessor());
        assertEquals("Windows 10", computer.getOperatingSystem());
        assertEquals(800.0, computer.getPrice());
    }
}
