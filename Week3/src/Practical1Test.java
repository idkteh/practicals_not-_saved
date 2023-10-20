import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Practical1Test {

    @Test
    void TestP1() {
        System.out.println("Test 1 number 3");
        int a = 3;
        Practical1 q = new Practical1();
        Boolean expected = true;
        Boolean actual = q.multiple(a);
        assertEquals(expected, actual);
    }
    @Test
    void TestP2() {
        System.out.println("Test 2 number 5");
        int a = 5;
        Practical1 q = new Practical1();
        Boolean expected = true;
        Boolean actual = q.multiple(a);
        assertEquals(expected, actual);
    }
    @Test
    void TestP3() {
        System.out.println("Test 3 number 15");
        int a = 15;
        Practical1 q = new Practical1();
        Boolean expected = true;
        Boolean actual = q.multiple(a);
        assertEquals(expected, actual);
    }
    @Test
    void TestP4() {
        System.out.println("Test 4 number 8");
        int a = 8;
        Practical1 q = new Practical1();
        Boolean expected = false;
        Boolean actual = q.multiple(a);
        assertEquals(expected, actual);
    }
    @Test
    void TestP5() {
        System.out.println("Test 5 number 0");
        int a = 0;
        Practical1 q = new Practical1();
        Boolean expected = true;
        Boolean actual = q.multiple(a);
        assertEquals(expected, actual);
    }
    @Test
    void TestP6() {
        System.out.println("Test 6 number -5");
        int a = -5;
        Practical1 q = new Practical1();
        Boolean expected = true;
        Boolean actual = q.multiple(a);
        assertEquals(expected, actual);
    }
    @Test
    void TestP7() {
        System.out.println("Test 7 number -15");
        int a = -15;
        Practical1 q = new Practical1();
        Boolean expected = true;
        Boolean actual = q.multiple(a);
        assertEquals(expected, actual);
    }
}