package utils.toy.example;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.List;

public class FizzBuzz {

    public static String yieldString(String value){
        final int intValue = Integer.parseInt(value);

        String outString = (intValue % 3 == 0) ? "Fizz" : "";
        outString += (intValue % 5 == 0) ? "Buzz" : "";
        outString += (outString.length() < 1) ? value : "";

        return outString + "<br/>";
    }

    public static String addString(String agg, String value){
        return agg + yieldString(value);
    }

    public static String fizzBuzzString(Integer lowerBound, Integer upperBound){

        IntStream.range(lowerBound, upperBound + 1).forEach(i->{
            System.out.println(yieldString(String.valueOf(i)));
        });

        IntStream.range(lowerBound, upperBound + 1).mapToObj(i->{
            return String.valueOf(i);
        });

         /*IntStream.range(lowerBound, upperBound + 1).mapToObj(i->{
            return String.valueOf(i);
        }).reduce("", (agg, s)->{
            return addString(agg, s);
        });*/

        return IntStream.range(lowerBound, upperBound+1)
                    .mapToObj(String::valueOf)
                    .reduce("", FizzBuzz::addString);

    }
    
}
