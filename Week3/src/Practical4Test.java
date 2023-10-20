import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class Practical4Test {

    @Test
    void tempConverterF() {
        Practical4 t4 = new Practical4();
        assertEquals(50,t4.tempConverter("F",122.0f));
    }
    @Test
    void tempConverterC() {
        Practical4 t4 = new Practical4();
        assertEquals(60.8,t4.tempConverter("C",16.0f),0.01);
    }
    @Test
    void tempConverterC0() {
        Practical4 t4 = new Practical4();
        assertEquals(32,t4.tempConverter("C",0f),0.01);
    }
    @Test
    void tempConverterF0() {
        Practical4 t4 = new Practical4();
        assertEquals(-17.778,t4.tempConverter("F",0f),0.01);
    }
}