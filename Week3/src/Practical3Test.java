import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Practical3Test {

    @Test
    void TestP1() {
        System.out.println("Test 1 ABCD");
        String a = "ABCD";
        Practical3 q = new Practical3();
        String expected = "CDAB";
        String actual = q.swap(a);
        assertEquals(expected, actual);
    }
    @Test
    void TestP2() {
        System.out.println("Test 2 1234");
        String a = "1234";
        Practical3 q = new Practical3();
        String expected = "3412";
        String actual = q.swap(a);
        assertEquals(expected, actual);
    }
    @Test
    void TestP3() {
        System.out.println("Test 3 HELL");
        String a = "HELL";
        Practical3 q = new Practical3();
        String expected = "LLHE";
        String actual = q.swap(a);
        assertEquals(expected, actual);
    }
    @Test
    void TestP4() {
        System.out.println("Test 4 0001");
        String a = "0001";
        Practical3 q = new Practical3();
        String expected = "0100";
        String actual = q.swap(a);
        assertEquals(expected, actual);
    }
    @Test
    void TestP5() {
        System.out.println("Test 5 ABcd");
        String a = "ABcd";
        Practical3 q = new Practical3();
        String expected = "cdAB";
        String actual = q.swap(a);
        assertEquals(expected, actual);
    }
    @Test
    void TestP6() {
        System.out.println("Test 6 £%$^");
        String a = "£%$^";
        Practical3 q = new Practical3();
        String expected = "$^£%";
        String actual = q.swap(a);
        assertEquals(expected, actual);
    }
}