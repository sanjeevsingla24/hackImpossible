package mycode.hack.demo.service;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class DemoServiceTest {

    @Test
    void testPrintHelloDemoService() {
        DemoService demoService = new DemoService();
        // Capture the output of the print statement
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        demoService.printHelloDemoService();

        assertEquals("Hello Demo Service", outContent.toString());
    }

    @Test
    void testGetHelloDemoService() {
        DemoService demoService = new DemoService();
        String message = demoService.getHelloDemoService();
        assertEquals("Hello Demo Service", message);
    }
}
