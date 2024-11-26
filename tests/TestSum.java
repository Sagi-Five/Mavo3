import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestSum {
    @BeforeAll
    public static void power() {
        System.out.println("Power Test");
    }
    @BeforeEach
    public void power1() {
        System.out.println("resualt");
    }
    @AfterEach
    public void power2() {
        System.out.println("111");
    }
    @AfterAll
    public static void power3() {
        System.out.println("done");
    }
    @Test
    public void testSun(){
        assertEquals(10, Main.sun(3,7));
    }
    @Test
    public void testAdd(){
        assertEquals(10, Main.add(3,5,9), "sum not equal for 10 =3+5+9 ");
    }
}
