package facade;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {

    Greeting greeting;

    @BeforeEach
    void setUp() {
        greeting = new Greeting();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void testGreeting(){
        System.out.println("Method to say hello");
        String actual = greeting.greetSingleName("Bob");
        String expected = "Hello, Bob";
        assertEquals(expected, actual);
    }

    @Test
    public void testGreetingWithoutName(){
        System.out.println("Method to say hello without name");
        String actual = greeting.greetSingleName(null);
        String expected = "Hello, my friend";
        assertEquals(expected, actual);
    }

    @Test
    public void testGreetingWithUppercase(){
        System.out.println("Method to say hello with uppercase");
        String actual = greeting.greetSingleName("JERRY");
        String expected = "HELLO JERRY";
        assertEquals(expected, actual);
    }

    @Test
    public void testGreetingWithTwoNames(){
        System.out.println("Method to say hello with two names");
        String actual = greeting.greetMultipleNames(new String[]{"Jill", "Jane"});
        String expected = "Hello, Jill and Jane.";
        assertEquals(expected, actual);
    }

    @Test
    public void testGreetingWithMoreThanTwoNames(){
        System.out.println("Method to say hello with more two names");
        String actual = greeting.greetMultipleNames(new String[]{"Amy", "Brian", "Charlotte"});
        String expected = "Hello, Amy, Brian, and Charlotte.";
        assertEquals(expected, actual);
    }

    @Test
    public void testGreetingWithMoreThanTwoNamesIncludingUppercase(){
        System.out.println("Method to say hello with more two names including uppercase");
        String actual = greeting.greetMultipleNames(new String[]{"Amy", "BRIAN", "Charlotte"});
        String expected = "Hello, Amy and Charlotte. AND HELLO BRIAN!";
        assertEquals(expected, actual);
    }

//    @Test
//    public void testGreetingWithAnInputContainingComma(){
//        System.out.println("Method to say hello with input containing comma");
//        String actual = greeting.greetMultipleNames(new String[]{"Bob", "Charlie, Dianne"});
//        String expected = "Hello, Bob, Charlie, and Dianne.";
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testGreetingThatEscapesCommaInInput(){
//        System.out.println("Method to say hello with input containing comma");
//        String actual = greeting.greetMultipleNames(new String[]{"Bob", "Charlie, Dianne"});
//        String expected = "Hello, Bob and Charlie, Dianne.";
//        assertEquals(expected, actual);
//    }
}