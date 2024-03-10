package co.za.wethinkcode.fizzbuzz;

import org.junit.jupiter.api.Test;
import za.co.wethinkcode.fizzbuzz.FizzBuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void notDivisibleBy3or5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("1", fizzBuzz.checkNumber(1));
        assertEquals("7", fizzBuzz.checkNumber(7));
    }

    @Test
    public void  divisibleBy5and3(){

        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("FizzBuzz", fizzBuzz.checkFizzBuzz(15));
        assertEquals("FizzBuzz", fizzBuzz.checkFizzBuzz(30));
    }


    @Test
    public void divisibleBy5(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Buzz", fizzBuzz.checkBuzz(5));
        assertEquals("Buzz", fizzBuzz.checkBuzz(20));
    }


    @Test
    public void divisibleBy3(){

        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Fizz", fizzBuzz.checkFizz(3) );
        assertEquals("Fizz",fizzBuzz.checkFizz(9));
    }

    @Test
    public void generateUpTo15() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.countTo(15);
        assertEquals(
                "[1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz]",
                result);
    }
}
