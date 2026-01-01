import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        String numRoman = "iiI";

        int result = romanToInt(numRoman);

        System.out.println("De Romano a entero : " + result);
    }

    public static int romanToInt(String s){

        String numRoman = s.toUpperCase();

        Map<Character, Integer> values = new HashMap<>();
        values.put('I' , 1);
        values.put('V' , 5);
        values.put('X' , 10);
        values.put('L' , 50);
        values.put('C' , 100);
        values.put('D' , 500);
        values.put('M' , 1000);


        int result = 0;

        for (int i = 0; i < numRoman.length(); i++){
            int current = values.get(numRoman.charAt(i));

            if (i + 1 < numRoman.length() && current < values.get(numRoman.charAt(i + 1))){
                result -= current;
            }else {
                result += current;
            }
        }
        return result;
    }
}