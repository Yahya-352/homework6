package AlgoQuestion;

public class Roman {
    public static String intToRoman(int value) {

        int[] numValues = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbolValues = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X",
                "IX", "V", "IV", "I"};

        StringBuilder output = new StringBuilder();

        for (int i = 0; i < numValues.length; i++) {
            while (value >= numValues[i]) {
                value -= numValues[i];
                output.append(symbolValues[i]);
            }
        }

        return output.toString();
    }

    public static void main(String[] args) {
        System.out.println(intToRoman(3));
        System.out.println(intToRoman(4));
        System.out.println(intToRoman(9));
        System.out.println(intToRoman(58));
        System.out.println(intToRoman(1994));
    }
}