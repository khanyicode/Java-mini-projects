package wethinkcode.cars.v1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class AutobahnTest {

    @Test
    void autobahnAppRuns(){
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut( new PrintStream( out ));

        Autobahn.main( new String[0] );

        String output = out.toString().strip().toLowerCase();
        assertEquals( 9, countOccurencesOf( "make:", output ));
        assertEquals( 9, countOccurencesOf( "model:", output ));
        assertEquals( 9, countOccurencesOf( "year:", output ));
        assertEquals( 9, countOccurencesOf( "colour:", output ));
    }

    @Test
    void doesCountMethodWorkForNonOccuringString(){
        assertEquals( 0, countOccurencesOf( "blah", "kjlashfkjhasdkfhaskfjh" ));
    }


    private int countOccurencesOf( String wanted, String aString ){
        int start = 0;
        int mark = 0;
        int count = 0;
        while( mark >= 0 ){
            mark = aString.indexOf( wanted, start );
            if( mark < 0 ) break;
            count++;
            start = mark + wanted.length();
        }
        return count;
    }
}
