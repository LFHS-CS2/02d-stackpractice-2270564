import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;
import java.io.*;

/**
 * The test class TestMain.
 *
 * @author  Aronson
 */
public class TestMain
{
    public static void main(String args[]) {
        TestMain test = new TestMain();
        test.test_splitStack();
        test.test_stutter();
    }

  
    @Test
    public void test_splitStack() {
        Stack<Integer> s = new Stack<Integer>();
        s.push(-3);
        s.push(2);
        s.push(-5);
        s.push(4);
        s.push(6);
        Main.splitStack(s);
        int num1 = s.pop();
        int num2 = s.pop();
        int num3 = s.pop();
        int num4 = s.pop();
        int num5 = s.pop();
        assertEquals(new Integer(num1+num2+num3), new Integer(12));
        assertEquals(new Integer(num4+num5), new Integer(-8));
        assertTrue(num1>0);
        assertTrue(num2>0);
        assertTrue(num3>0);
        assertTrue(num4<0);
        assertTrue(num5<0);
    }

    @Test
    public void test_stutter()
    {
        Stack<Integer> s = new Stack<Integer>();
        s.push(3);
        s.push(7);
        s.push(1);
        Main.stutter(s);
        assertEquals(s.pop(), new Integer(1));
        assertEquals(s.pop(), new Integer(1));
        assertEquals(s.pop(), new Integer(7));
        assertEquals(s.pop(), new Integer(7));
        assertEquals(s.pop(), new Integer(3));
        assertEquals(s.pop(), new Integer(3));
    }
}
