package za.co.wethinkcode.fizzbuzz;

public class FizzBuzz {
    public String checkNumber(int number) {
        if (number % 3 == 0 || number % 5 == 0) {
            return String.valueOf(number);
        }
        return String.valueOf(number);
    }

    public String checkFizz(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        }
        return "";
    }

    public String checkBuzz(int number) {
        if (number % 5 == 0) {
            return "Buzz";
        }
        return "";
    }

    public String checkFizzBuzz(int number) {
        if ( (number % 3 == 0)&&(number % 5 == 0)) {
            return "FizzBuzz";
        }
        return "";
    }
    public String countTo(int number) {
        StringBuilder fizzBuzzSequence = new StringBuilder();

        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                fizzBuzzSequence.append("FizzBuzz");
            } else if (i % 3 == 0) {
                fizzBuzzSequence.append("Fizz");
            } else if (i % 5 == 0) {
                fizzBuzzSequence.append("Buzz");
            } else {
                fizzBuzzSequence.append(i);
            }

            if (i != number) {
                fizzBuzzSequence.append(", ");
            }
        }

        return "[" + fizzBuzzSequence.toString() + "]";
    }
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();

        System.out.println(fizzBuzz.checkNumber(3));     // This should return an empty string ""
        System.out.println(fizzBuzz.checkNumber(5));     // This should return an empty string ""
        System.out.println(fizzBuzz.checkNumber(15));    // This should return an empty string ""
        System.out.println(fizzBuzz.checkNumber(7));     // This should return "7"

        System.out.println(fizzBuzz.checkFizz(3));       // This should return "Fizz"
        System.out.println(fizzBuzz.checkFizz(5));       // This should return an empty string ""
        System.out.println(fizzBuzz.checkFizz(15));      // This should return "Fizz"
        System.out.println(fizzBuzz.checkFizz(7));       // This should return an empty string ""

        System.out.println(fizzBuzz.checkBuzz(5));       // This should return "Buzz"
        System.out.println(fizzBuzz.checkBuzz(3));       // This should return an empty string ""
        System.out.println(fizzBuzz.checkBuzz(15));      // This should return "Buzz"
        System.out.println(fizzBuzz.checkBuzz(7));       // This should return an empty string ""

        System.out.println(fizzBuzz.checkFizzBuzz(3));   // This should return an empty string ""
        System.out.println(fizzBuzz.checkFizzBuzz(5));   // This should return an empty string ""
        System.out.println(fizzBuzz.checkFizzBuzz(15));  // This should return "FizzBuzz"
        System.out.println(fizzBuzz.checkFizzBuzz(7));   // This should return an empty string ""
    }
}

