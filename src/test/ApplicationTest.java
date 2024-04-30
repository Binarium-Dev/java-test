package test;

import main.Application;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ApplicationTest {

    Application app;

    @Before
    public void before() {
        // runs before each test
        app = new Application();
    }

    @Test
    public void testExample() {
        assertTrue(app.exampleMethod());
    }

}
