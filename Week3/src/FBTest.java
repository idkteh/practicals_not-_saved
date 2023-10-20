import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FBTest {

    @Test
    void Test1() {
        System.out.println("Test 1 number 3");
        int a = 3;
        FB q = new FB();
        String expected = "Fizz";
        String actual = q.fizzBuzz(a);
        assertEquals(expected, actual);
    }
    @Test
    void Test2() {
        System.out.println("Test 2 number 15");
        int a = 15;
        FB q = new FB();
        String expected = "FizzBuzz";
        String actual = q.fizzBuzz(a);
        assertEquals(expected, actual);
    }
    @Test
    void Test3() {
        System.out.println("Test 3 number 0");
        int a = 0;
        FB q = new FB();
        String expected = "FizzBuzz";
        String actual = q.fizzBuzz(a);
        assertEquals(expected, actual);
    }
    @Test
    void Test4() {
        System.out.println("Test 4 number 5");
        int a = 5;
        FB q = new FB();
        String expected = "Buzz";
        String actual = q.fizzBuzz(a);
        assertEquals(expected, actual);
    }
    @Test
    void Test5() {
        System.out.println("Test 5 number 2");
        int a = 2;
        FB q = new FB();
        String expected = "2";
        String actual = q.fizzBuzz(a);
        assertEquals(expected, actual);
    }
    @Test
    void Test6() {
        System.out.println("Test 6 number -3");
        int a = -3;
        FB q = new FB();
        String expected = "Fizz";
        String actual = q.fizzBuzz(a);
        assertEquals(expected, actual);
    }
    @Test
    void Test7() {
        System.out.println("Test 7 number -5");
        int a = -5;
        FB q = new FB();
        String expected = "Buzz";
        String actual = q.fizzBuzz(a);
        assertEquals(expected, actual);
    }
    @Test
    void Test8() {
        System.out.println("Test 8 number -15");
        int a = -15;
        FB q = new FB();
        String expected = "FizzBuzz";
        String actual = q.fizzBuzz(a);
        assertEquals(expected, actual);
    }
    @Test
    void Test9() {
        System.out.println("Test 9 number -7");
        int a = -7;
        FB q = new FB();
        String expected = "-7";
        String actual = q.fizzBuzz(a);
        assertEquals(expected, actual);
    }
}