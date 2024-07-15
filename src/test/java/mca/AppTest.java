package mca;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    public void testApp() {
    mytest t=new mytest();
        String expected = "madam";
        String actual =t.palindrome(expected);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testApp1() {
    mytest t=new mytest();
        String expected = "did";
        String actual =t.palindrome(expected);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testApp3() {
    mytest t=new mytest();
        String expected = "mem";
        String actual =t.palindrome(expected);

        Assertions.assertEquals(expected, actual);
    }
    

}

