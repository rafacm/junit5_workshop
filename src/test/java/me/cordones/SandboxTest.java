package me.cordones;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("A special test case")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SandboxTest {

    private int counter = 0;

    public SandboxTest() {
        System.out.println("Inside constructor");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("Before each test");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("After each test");
    }


    @BeforeAll
    public static void beforeAll() {
        System.out.println("Before all tests");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("After all tests");
    }

    private String getErrorMessage() {
        System.out.println(String.format("Inside getErrorMessage (counter = %d)", counter));
        return String.format("The sum of 2 and 2 is 4 (counter = %d)", counter);
    }

    @Test
    @DisplayName("😱")
    public void booleanWithoutSupplier() {
        this.counter++;
        assertTrue(2 + 2 == 4, getErrorMessage());
    }

    @Test
    @DisplayName("╯°□°）╯")
    public void booleanWithSupplier() {
        this.counter++;
        assertTrue(2 + 2 == 4, () -> getErrorMessage());
    }
}
