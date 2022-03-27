package edu.qc.seclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class MyCustomStringTest {

    private MyCustomStringInterface mycustomstring;

    @Before
    public void setUp() {
        mycustomstring = new MyCustomString();
    }

    @After
    public void tearDown() {
        mycustomstring = null;
    }
    
    //This test checks whether the method CountNumbers returns Number of numbers in the current string
    @Test
    public void testCountNumbers1() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals(7, mycustomstring.countNumbers());
    }
    
    //This test checks whether the method CountNumbers suitably throws a NullPointerException If the current string is null
    @Test (expected = NullPointerException.class)
    public void testCountNumbers2() {
        mycustomstring.setString(null);
        mycustomstring.countNumbers();
    }
    
    //This test checks whether the method CountNumbers returns an empty string
    @Test
    public void testCountNumbers3() {
    	mycustomstring.setString("");
        assertEquals(0, mycustomstring.countNumbers());
    }

    //This test checks whether the method CountNumbers returns 2 as the output if we have two numbers next to each other separated by space
    @Test
    public void testCountNumbers4() {
        mycustomstring.setString("Is 98 99 represented as one");
        assertEquals(2, mycustomstring.countNumbers());
    }

    //This test checks whether the method CountNumbers returns 4 as the output if we have four numbers next to each other separated by space
    @Test
    public void testCountNumbers5() {
    	mycustomstring.setString("Test numbers 98 44 10021 99999");
        assertEquals(4, mycustomstring.countNumbers());
    }
    
    //This test checks whether the method CountNumbers returns 0 as the output if we do not have any numbers
    @Test
    public void testCountNumbers6() {
    	mycustomstring.setString("Why dont we have any numbers");
        assertEquals(0, mycustomstring.countNumbers());
    }

    //This test checks whether the method GetEveryNthCharacterFromBeginningOrEnd returns String made of characters at positions n, 2n, and so on in the current string where n=3
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd1() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals("d33p md1  i51,it", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3, false));
    }

    //This test checks whether the method GetEveryNthCharacterFromBeginningOrEnd returns String made of characters at positions n, 2n, and so on in the current string where n=3
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd2() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals("'bt t0 6snh r6rh", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3, true));
    }
    
    //This test checks whether the method GetEveryNthCharacterFromBeginningOrEnd suitably throws an IllegalArgumentException If "n" less than or equal to zero
    @Test (expected = IllegalArgumentException.class)
    public void testGetEveryNthCharacterFromBeginningOrEnd3() {
    	mycustomstring.setString("Test the above Exception");
        mycustomstring.getEveryNthCharacterFromBeginningOrEnd(0, false);
    }
    
    //This test checks whether the method GetEveryNthCharacterFromBeginningOrEnd suitably throws NullPointerException If the current string is null and "n" is greater than zero
    @Test (expected = NullPointerException.class)
    public void testGetEveryNthCharacterFromBeginningOrEnd4() {
    	mycustomstring.setString(null);
        mycustomstring.getEveryNthCharacterFromBeginningOrEnd(1, false);
    }

    //This test checks whether the method GetEveryNthCharacterFromBeginningOrEnd returns String made of characters at positions n, 2n, and so on in the current string where n = 2
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd5() {
    	mycustomstring.setString("Computer Science");
        assertEquals("optrSine", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(2, false));
    }

    //This test checks whether the method GetEveryNthCharacterFromBeginningOrEnd returns String made of characters at positions n, 2n, and so on in the current string where n = 2 
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd6() {
    	mycustomstring.setString("Computer Science");
        assertEquals("Cmue cec", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(2, true));
    }

    //This test checks whether the method GetEveryNthCharacterFromBeginningOrEnd returns String made of characters at positions n, 2n, and so on in the current string where n = 3
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd7() {
    	mycustomstring.setString("Computer Science");
        assertEquals("mt ic", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3, false));
    }

    //This test checks whether the method GetEveryNthCharacterFromBeginningOrEnd returns String made of characters at positions n, 2n, and so on in the current string where n = 3
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd8() {
    	mycustomstring.setString("Computer Science");
        assertEquals("ourcn", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3, true));
    }

    //This test checks whether the method GetEveryNthCharacterFromBeginningOrEnd returns String made of characters at positions n, 2n, and so on in the current string where n = 1
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd9() {
    	mycustomstring.setString("Print Everything");
        assertEquals("Print Everything", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(1, false));
    }

    //This test checks whether the method GetEveryNthCharacterFromBeginningOrEnd returns String made of characters at positions n, 2n, and so on in the current string where n = 1
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd10() {
    	mycustomstring.setString("Print Everything");
        assertEquals("Print Everything", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(1, true));
    }

    //This test checks whether the method GetEveryNthCharacterFromBeginningOrEnd returns String made of characters at positions n, 2n, and so on in the current string where n = 20
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd11() {
    	mycustomstring.setString("Computer Science");
        assertEquals(" ", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(20, true));
    }

    //This test checks whether the method GetEveryNthCharacterFromBeginningOrEnd returns String made of characters at positions n, 2n, and so on in the current string where n = 2
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd12() {
    	mycustomstring.setString("0123456789");
        assertEquals("13579", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(2, false));
    }

    //This test checks whether the method GetEveryNthCharacterFromBeginningOrEnd returns String made of characters at positions n, 2n, and so on in the current string where n = 2
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd13() {
    	mycustomstring.setString("0123456789");
        assertEquals("02468", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(2, true));
    }

    //This test checks whether the method GetEveryNthCharacterFromBeginningOrEnd suitably throws an IllegalArgumentException If "n" less than or equal to zero
    @Test (expected = IllegalArgumentException.class)
    public void testGetEveryNthCharacterFromBeginningOrEnd14() {
    	mycustomstring.setString("Test the above Exception");
        mycustomstring.getEveryNthCharacterFromBeginningOrEnd(-1, false);
    }

    //This test checks whether the method ConvertDigitsToNamesInSubstring Replace the individual digits in the current string, between startPosition and endPosition with the corresponding English names of those digits
    @Test
    public void testConvertDigitsToNamesInSubstring1() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        mycustomstring.convertDigitsToNamesInSubstring(17, 23);
        assertEquals("I'd b3tt3r put sZerome dOneSix1ts in this 5tr1n6, right?", mycustomstring.getString());
    }

    //This test checks whether the method convertDigitsToNamesInSubstring suitably throws an IllegalArgumentException if startPosition is greater than endPosition
    @Test (expected = IllegalArgumentException.class)
    public void testConvertDigitsToNamesInSubstring2() {
        mycustomstring.setString("Test1");
        mycustomstring.convertDigitsToNamesInSubstring(12, 9);
    }

    //This test checks whether the method convertDigitsToNamesInSubstring suitably throws a MyIndexOutOfBoundsException If "startPosition" <= "endPosition", but either "startPosition" or "endPosition" are out of bounds
    @Test (expected = MyIndexOutOfBoundsException.class)
    public void testConvertDigitsToNamesInSubstring3() {
    	mycustomstring.setString("Test2");
        mycustomstring.convertDigitsToNamesInSubstring(0, 9);
    }

    //This test checks whether the method convertDigitsToNamesInSubstring suitably throws a MyIndexOutOfBoundsException If "startPosition" <= "endPosition", but either "startPosition" or "endPosition" are out of bounds
    @Test (expected = MyIndexOutOfBoundsException.class)
    public void testConvertDigitsToNamesInSubstring4() {
    	mycustomstring.setString("Test2");
        mycustomstring.convertDigitsToNamesInSubstring(1, mycustomstring.getString().length() + 1);
    }

    //This test checks whether the method convertDigitsToNamesInSubstring suitably throws a NullPointerException If "startPosition" <= "endPosition", "startPosition" and "endPosition" are greater than 0, and the current string is null
    @Test (expected = NullPointerException.class)
    public void testConvertDigitsToNamesInSubstring5() {
    	mycustomstring.setString(null);
        mycustomstring.convertDigitsToNamesInSubstring(1, 2);
    }

    //This test checks whether the method convertDigitsToNamesInSubstring return an empty string
    @Test
    public void testConvertDigitsToNamesInSubstring6() {
    	mycustomstring.setString(" ");
        mycustomstring.convertDigitsToNamesInSubstring(1, 1);
    }

    //This test checks whether the method ConvertDigitsToNamesInSubstring Replace the individual digits in the current string, between startPosition and endPosition with the corresponding English names of those digits
    @Test
    public void testConvertDigitsToNamesInSubstring7() {
    	mycustomstring.setString("Comput3r 4Fort");
        mycustomstring.convertDigitsToNamesInSubstring(1, 14);
        assertEquals("ComputThreer FourFort", mycustomstring.getString());
    }

    //This test checks whether the method ConvertDigitsToNamesInSubstring Replace the individual digits in the current string, between startPosition and endPosition with the corresponding English names of those digits
    @Test
    public void testConvertDigitsToNamesInSubstring8() {
    	mycustomstring.setString("Comput3r $c13nc3");
        mycustomstring.convertDigitsToNamesInSubstring(1, 16);
        assertEquals("ComputThreer $cOneThreencThree", mycustomstring.getString());
    }
}
