package datatypes;

public class CharAndBooleanDemo {
    public static void main(String[] args) {
        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        char unicodeChar = '\u00A9';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        System.out.println(unicodeChar);

        /* Boolean*/

        boolean isAgeOverTwentyEight = true;

        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;

        long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
        System.out.println(longTotal);

        short shortTotal = (short) (1000 + 10 * (byteValue + shortValue + intValue));
        System.out.println();


    }
}
