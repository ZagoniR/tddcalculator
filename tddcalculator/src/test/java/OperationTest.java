import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lenovo on 7/6/2017.
 */
public class OperationTest {

    private Operation classUnderTest;

    private long result;

    @Before
    public void setUp() throws Exception {
        classUnderTest = new Operation();
    }

    // test fail initially because there is no implementation at all
    // we write an empty method, test fails again
    // we test for the method to return 0 if there are no parameters ==> test fail
    // we implement just enough code that the test should pass ==> test passes ==> we move on
    @Test
    public void addNoNumbers() {

        // arrange
        int a = 0;

        // act
        result = classUnderTest.add();

        // assert
        assertNotEquals(a, result);
    }

    // we want to be sure that all elements passed as formal parameters are counted ==> test fail because there is no
    // implementation ==> we write code for the method to return the number of elements passed as formal parrameter
    // ==> test passes ==> refactoring

    @Test
    public void adderCountsAllInputElements() throws Exception {

        // arrange
        int a = 1;
        int b = 2;
        int c = 3;

        // act
        result = classUnderTest.add(a, b, c);

        // assert
        assertEquals(3, result);
    }

    @Test

    public void addTwoPositiveNumbers() throws Exception {

        // arrange
        long a = 1;
        long b = 2;
        long c;

        // act
        result = classUnderTest.add(a, b);
        c = a + b;

        // assert
        assertEquals(c, result);

    }

    @Test
    public void addTwoNegativeNumbers() throws Exception {

        //arrange
        long a = -1;
        long b = -2;
        long c;


        // act
        c = a + b;
        result = classUnderTest.add(a, b);

        // assert
        assertEquals(c, result);
    }


    @Test
    public void addZero() throws Exception {

        // arrange
        int input = 0;

        // act
        result = classUnderTest.add(input, input, input, input);

        // assert
        assertEquals(input, result);
    }

    @Test
    public void addOneValue() {

        // arrange
        int input = 235454;

        // act
        result = classUnderTest.add(input);

        // assert
        assertEquals(input, result);
    }


    // test fail initially because there is no implementation at all
    // we write an empty method, test fails again
    // we test for the method to return 0 if there are no parameters ==> test fail
    // we implement just enough code that the test should pass ==> test passes ==> we move on
    @Test
    public void subtractNoNumbers() {

        // arrange
        int a = 0;

        // act
        result = classUnderTest.subtract();

        // assert
        assertNotEquals(a, result);
    }

    // we want to be sure that all elements passed as formal parameters are counted ==> test fail because there is no
    // implementation ==> we write code for the method to return the number of elements passed as formal parrameter
    // ==> test passes ==> refactoring

    @Test
    public void subtractCountsAllInputElements() throws Exception {

        // arrange
        int a = 1;
        int b = -2;
        int c = 3;

        // act
        result = classUnderTest.add(a, b, c);

        // assert
        assertEquals(3, result);
    }


    @Test
    public void firstElementInSubtractorIsReturned() throws Exception {

        // arrange
        int a = 11;
        int b = -2;
        int c = 3;

        // act
        result = classUnderTest.add(a, b, c);

        // assert
        assertEquals(a, result);
    }

    @Test

    public void subtractTwoPositiveNumbers() throws Exception {

        // arrange
        long a = 3;
        long b = 2;
        long c;

        // act
        result = classUnderTest.add(a, b);
        c = a + b;

        // assert
        assertEquals(c, result);

    }

    @Test
    public void subtractTwoNegativeNumbers() throws Exception {

        //arrange
        long a = -1;
        long b = -3;
        long c;


        // act
        c = a + b;
        result = classUnderTest.add(a, b);

        // assert
        assertEquals(c, result);
    }


    @Test
    public void subtractZero() throws Exception {

        // arrange
        int input = 0;

        // act
        result = classUnderTest.add(input, input, input, input);

        // assert
        assertEquals(input, result);
    }

    @Test
    public void subtractOneValue() {

        // arrange
        int input = 235454;

        // act
        result = classUnderTest.add(input);

        // assert
        assertEquals(input, result);
    }


}