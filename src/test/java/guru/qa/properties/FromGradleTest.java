package guru.qa.properties;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

public class FromGradleTest {

    @Test
    @Tag("fromgradle")
    void fromGradleTest() {
        System.out.println("hello");
    }
}
