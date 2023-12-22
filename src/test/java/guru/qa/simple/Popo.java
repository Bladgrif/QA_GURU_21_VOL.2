package guru.qa.simple;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class Popo {

    @Test
    @Tag("popo")
    void someTest123() {
        System.out.println("Popo hello");
//        assertTrue(false);
    }
}