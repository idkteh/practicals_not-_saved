import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Practical2Test {

    @Test
    void TestP1() {
        int a = 3;
        int b = 2;
        int c = 5;
        System.out.println("Test 1 Numbers 3,2,5");
        Practical2 q = new Practical2();
        int expected = 5;
        int actual = q.checkLargest(a,b,c);
        assertEquals(expected, actual);
    }
    @Test
    void TestP2() {
        int a = 35;
        int b = 200;
        int c = 56;
        System.out.println("Test 2 Numbers 35,200,56");
        Practical2 q = new Practical2();
        int expected = 200;
        int actual = q.checkLargest(a,b,c);
        assertEquals(expected, actual);
    }
    @Test
    void TestP3() {
        int a = 4;
        int b = 7;
        int c = 12;
        System.out.println("Test 3 Numbers 4,7,12");
        Practical2 q = new Practical2();
        int expected = 12;
        int actual = q.checkLargest(a,b,c);
        assertEquals(expected, actual);
    }
    @Test
    void TestP4() {
        int a = 3;
        int b = 9;
        int c = 9;
        System.out.println("Test 4 Numbers 3,9,9");
        Practical2 q = new Practical2();
        int expected = 9;
        int actual = q.checkLargest(a,b,c);
        assertEquals(expected, actual);
    }
    @Test
    void TestP5() {
        int a = 7;
        int b = 7;
        int c = 7;
        System.out.println("Test 5 Numbers 7,7,7");
        Practical2 q = new Practical2();
        int expected = 7;
        int actual = q.checkLargest(a,b,c);
        assertEquals(expected, actual);
    }
    @Test
    void TestP6() {
        int a = -15;
        int b = -24;
        int c = 2;
        System.out.println("Test 6 Numbers -15,-24,2");
        Practical2 q = new Practical2();
        int expected = 2;
        int actual = q.checkLargest(a,b,c);
        assertEquals(expected, actual);
    }
    @Test
    void TestP7() {
        int a = 0;
        int b = -2;
        int c = -5;
        System.out.println("Test 7 Numbers 0,-2,-5");
        Practical2 q = new Practical2();
        int expected = 0;
        int actual = q.checkLargest(a,b,c);
        assertEquals(expected, actual);
    }
    @Test
    void TestP8() {
        int a = -3;
        int b = -1;
        int c = -9;
        System.out.println("Test 7 Numbers -3,-1,-9");
        Practical2 q = new Practical2();
        int expected = -1;
        int actual = q.checkLargest(a,b,c);
        assertEquals(expected, actual);
    }
}